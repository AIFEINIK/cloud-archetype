#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.facade;

import ${package}.common.result.Result;
import ${package}.interfaces.request.LoginRequest;
import ${package}.interfaces.response.GetRouterResponse;
import ${package}.interfaces.response.GetUserInfoResponse;
import ${package}.interfaces.response.LoginResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description 登录
 */
public interface LoginFacade {

    @PostMapping("login")
    Result<LoginResponse> login(@RequestBody LoginRequest request);

    @GetMapping("getUserInfo")
    Result<GetUserInfoResponse> getUserInfo();

    @GetMapping("getRouters")
    Result<List<GetRouterResponse>> getRouters();
}
