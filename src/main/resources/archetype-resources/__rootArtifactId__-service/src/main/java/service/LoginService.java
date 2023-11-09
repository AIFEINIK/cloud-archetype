#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.common.result.Result;
import ${package}.interfaces.request.LoginRequest;
import ${package}.interfaces.response.GetRouterResponse;
import ${package}.interfaces.response.GetUserInfoResponse;
import ${package}.interfaces.response.LoginResponse;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description 登录
 */
public interface LoginService {
    Result<LoginResponse> login(LoginRequest request);

    Result<GetUserInfoResponse> getUserInfo();

    Result<List<GetRouterResponse>> getRouters();
}
