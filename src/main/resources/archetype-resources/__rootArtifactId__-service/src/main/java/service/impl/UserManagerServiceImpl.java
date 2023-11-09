#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.common.entity.LoginUser;
import ${package}.common.enums.ReturnStatusEnum;
import ${package}.common.page.Page;
import ${package}.common.page.PageRequest;
import ${package}.common.result.Result;
import ${package}.common.utils.BeanUtils;
import ${package}.common.utils.SecurityUtils;
import ${package}.domain.UserManagerDomain;
import ${package}.interfaces.request.GetSysUserRequest;
import ${package}.interfaces.request.ModifySysUserPasswordRequest;
import ${package}.interfaces.request.SearchSysUserPageRequest;
import ${package}.interfaces.response.SearchSysUserPageResponse;
import ${package}.interfaces.response.UserInfoResponse;
import ${package}.model.bo.SysUserBO;
import ${package}.model.bo.condition.SysUserSearchConditionBO;
import ${package}.service.UserManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author ZhangPengFei
 * @description
 */
@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Resource
    private UserManagerDomain userManagerDomain;

    @Override
    public Result<UserInfoResponse> getSysUser(GetSysUserRequest request) {
        SysUserBO userInfo = userManagerDomain.getSysUser(request.getUserName());
        return new Result<>(BeanUtils.transform(UserInfoResponse.class, userInfo, true, BeanUtils.TransformEnumType.ENUM_TO_NAME));
    }

    @Override
    public Result<Page<SearchSysUserPageResponse>> searchSysUserPage(SearchSysUserPageRequest request) {
        SysUserSearchConditionBO userSearchCondition = BeanUtils.transform(SysUserSearchConditionBO.class, request, true, BeanUtils.TransformEnumType.NAME_TO_ENUM);
        int count = userManagerDomain.getSysUserCount(userSearchCondition);
        if (count == 0) {
            return new Result<>(new Page<>(Collections.emptyList()));
        }
        List<SysUserBO> sysUsers = userManagerDomain.searchSysUsers(userSearchCondition, PageRequest.of(request.getPageNum(), request.getPageSize()));
        return new Result<>(new Page<>(count, BeanUtils.batchTransform(SearchSysUserPageResponse.class, sysUsers, true, BeanUtils.TransformEnumType.ENUM_TO_NAME)));
    }

    @Override
    public Result modifySysUserPassword(ModifySysUserPasswordRequest request) {
        if (Objects.equals(request.getOldPassword(), request.getNewPassword())) {
            return ReturnStatusEnum.SYS_USER_OLD_PWD_INVALID.toResult();
        }

        LoginUser loginUser = SecurityUtils.getLoginUser();
        SysUserBO sysUser = userManagerDomain.getSysUser(loginUser.getUserName());
        if (!SecurityUtils.matchesPassword(request.getOldPassword(), sysUser.getPassword())) {
            return ReturnStatusEnum.SYS_USER_NEW_PWD_INVALID.toResult();
        }

        SysUserBO updateUser = new SysUserBO();
        updateUser.setUserId(sysUser.getUserId());
        updateUser.setPassword(SecurityUtils.encryptPassword(request.getNewPassword()));
        userManagerDomain.updateSysUser(updateUser);
        return new Result<>();
    }
}
