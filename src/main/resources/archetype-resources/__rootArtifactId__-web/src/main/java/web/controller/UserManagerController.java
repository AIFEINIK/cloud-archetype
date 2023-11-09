#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.interfaces.facade.UserManagerFacade;
import ${package}.interfaces.request.GetSysUserRequest;
import ${package}.interfaces.request.ModifySysUserPasswordRequest;
import ${package}.interfaces.request.SearchSysUserPageRequest;
import ${package}.interfaces.response.SearchSysUserPageResponse;
import ${package}.interfaces.response.UserInfoResponse;
import ${package}.service.UserManagerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author ZhangPengFei
 * @description
 */
@RestController
@RequestMapping("/sysUser")
public class UserManagerController implements UserManagerFacade {

    @Resource
    private UserManagerService userManagerService;

    @Override
    public Result<UserInfoResponse> getSysUser(@RequestBody GetSysUserRequest request) {
        return userManagerService.getSysUser(request);
    }

    @Override
    public Result<Page<SearchSysUserPageResponse>> searchSysUserPage(@RequestBody SearchSysUserPageRequest request) {
        return userManagerService.searchSysUserPage(request);
    }

    @Override
    public Result<Boolean> modifySysUserPassword(@RequestBody ModifySysUserPasswordRequest request) {
        return userManagerService.modifySysUserPassword(request);
    }
}
