#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.interfaces.request.SearchSysMenuPageRequest;
import ${package}.interfaces.response.SearchSysMenuPageResponse;
import ${package}.model.bo.SysMenuBO;
import ${package}.service.SysMenuService;
import ${package}.service.support.PermissionSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static ${package}.common.utils.BeanUtils.TransformEnumType;
import static ${package}.common.utils.BeanUtils.batchTransform;

/**
 * @author ZhangPengFei
 * @description 菜单权限Service业务层处理
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Resource
    private PermissionSupport permissionSupport;

    /**
     * 查询菜单权限列表
     *
     * @param request 查询参数
     * @return 菜单权限分页
     */
    @Override
    public Result<Page<SearchSysMenuPageResponse>> searchSysMenuPage(SearchSysMenuPageRequest request) {
        List<SysMenuBO> sysMenus = permissionSupport.getSysMenusByUserId(request.getUserId());
        return new Result<>(Page.of(sysMenus.size(), batchTransform(SearchSysMenuPageResponse.class,
                    sysMenus, true, TransformEnumType.ENUM_TO_NAME)));
    }
}
