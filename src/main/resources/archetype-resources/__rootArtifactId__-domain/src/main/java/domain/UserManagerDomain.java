#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import ${package}.common.page.PageRequest;
import ${package}.common.utils.BeanUtils;
import ${package}.dao.entity.SysUser;
import ${package}.dao.mapper.UserManagerMapper;
import ${package}.model.bo.SysUserBO;
import ${package}.model.bo.condition.SysUserSearchConditionBO;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangPengFei
 * @description
 */
@Component
public class UserManagerDomain {

    @Resource
    private UserManagerMapper userManagerMapper;

    public SysUserBO getSysUser(String userName) {
        SysUser sysUser = userManagerMapper.getSysUserByUserName(userName);
        return BeanUtils.transform(SysUserBO.class, sysUser, true, BeanUtils.TransformEnumType.VALUE_TO_ENUM);
    }

    public void updateSysUser(SysUserBO sysUser) {
        userManagerMapper.updateSysUser(BeanUtils.transform(SysUser.class, sysUser, BeanUtils.TransformEnumType.ENUM_TO_VALUE));
    }

    public int getSysUserCount(SysUserSearchConditionBO condition) {
        return userManagerMapper.getSysUserCount(condition);
    }

    public List<SysUserBO> searchSysUsers(SysUserSearchConditionBO condition, PageRequest page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), false);
        return BeanUtils.batchTransform(SysUserBO.class, userManagerMapper.searchSysUsers(condition), BeanUtils.TransformEnumType.VALUE_TO_ENUM);
    }
}
