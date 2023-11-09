#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import ${package}.interfaces.request.SearchSysMenuPageRequest;
import ${package}.interfaces.response.SearchSysMenuPageResponse;
import ${package}.service.SysMenuService;
import ${package}.interfaces.facade.SysMenuFacade;
import javax.annotation.Resource;
import io.swagger.annotations.Api;
import ${package}.common.page.Page;
import ${package}.common.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangPengFei
 * @description 菜单权限Controller
 */
@Api(tags = "菜单权限管理")
@RestController
@RequestMapping("/fei/menu")
public class SysMenuController implements SysMenuFacade {

    @Resource
    private SysMenuService sysMenuService;

    @Override
    @ApiOperation("查询菜单权限列表")
    @PostMapping("/searchSysMenuPage")
    public Result<Page<SearchSysMenuPageResponse>> searchSysMenuPage(@RequestBody SearchSysMenuPageRequest request) {
        return sysMenuService.searchSysMenuPage(request);
    }
}
