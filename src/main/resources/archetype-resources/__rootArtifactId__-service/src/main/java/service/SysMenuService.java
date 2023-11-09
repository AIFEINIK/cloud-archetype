#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.interfaces.request.SearchSysMenuPageRequest;
import ${package}.interfaces.response.SearchSysMenuPageResponse;
import ${package}.common.page.Page;
import ${package}.common.result.Result;

/**
 * @author ZhangPengFei
 * @description 菜单权限Service接口
 */
public interface SysMenuService {

    /**
     * 查询菜单权限列表
     * 
     * @param request 查询参数
     * @return 菜单权限分页
     */
    Result<Page<SearchSysMenuPageResponse>> searchSysMenuPage(SearchSysMenuPageRequest request);
}
