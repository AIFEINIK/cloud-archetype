#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.facade;


import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.interfaces.request.GetSysUserRequest;
import ${package}.interfaces.request.ModifySysUserPasswordRequest;
import ${package}.interfaces.request.SearchSysUserPageRequest;
import ${package}.interfaces.response.SearchSysUserPageResponse;
import ${package}.interfaces.response.UserInfoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ZhangPengFei
 * @description
 */
public interface UserManagerFacade {

    @GetMapping("getSysUser")
    Result<UserInfoResponse> getSysUser(@RequestBody GetSysUserRequest getUserInfoRequest);

    @PostMapping("modifySysUserPassword")
    Result<Boolean> modifySysUserPassword(@RequestBody ModifySysUserPasswordRequest request);

    @PostMapping("searchSysUserPage")
    Result<Page<SearchSysUserPageResponse>> searchSysUserPage(@RequestBody SearchSysUserPageRequest request);
}
