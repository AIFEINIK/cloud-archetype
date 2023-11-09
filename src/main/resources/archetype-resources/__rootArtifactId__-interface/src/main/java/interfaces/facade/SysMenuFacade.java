#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.facade;

import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.interfaces.request.SearchSysMenuPageRequest;
import ${package}.interfaces.response.SearchSysMenuPageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ZhangPengFei
 * @description 菜单权限接口
 */
public interface SysMenuFacade {

    /**
    * 查询菜单权限列表
    * @param request 请求参数
    * @return 分页结果
    */
    @PostMapping("/searchSysMenuPage")
    Result<Page<SearchSysMenuPageResponse>> searchSysMenuPage(@RequestBody SearchSysMenuPageRequest request);
}
