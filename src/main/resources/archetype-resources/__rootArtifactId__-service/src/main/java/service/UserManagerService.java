#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.interfaces.request.GetSysUserRequest;
import ${package}.interfaces.request.ModifySysUserPasswordRequest;
import ${package}.interfaces.request.SearchSysUserPageRequest;
import ${package}.interfaces.response.SearchSysUserPageResponse;
import ${package}.interfaces.response.UserInfoResponse;

/**
 * @author ZhangPengFei
 * @description
 */
public interface UserManagerService {
    Result<UserInfoResponse> getSysUser(GetSysUserRequest request);

    Result<Boolean> modifySysUserPassword(ModifySysUserPasswordRequest request);

    Result<Page<SearchSysUserPageResponse>> searchSysUserPage(SearchSysUserPageRequest request);
}
