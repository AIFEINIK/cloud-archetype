#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import ${package}.common.result.Result;
import ${package}.interfaces.facade.LoginFacade;
import ${package}.interfaces.request.LoginRequest;
import ${package}.interfaces.response.GetRouterResponse;
import ${package}.interfaces.response.GetUserInfoResponse;
import ${package}.interfaces.response.LoginResponse;
import ${package}.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangPengFei
 * @description
 */
@RestController
@Api("登录")
public class LoginController implements LoginFacade {

    @Resource
    private LoginService loginService;

    @Override
    @ApiOperation("登录")
    public Result<LoginResponse> login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }

    @Override
    @ApiOperation("获取用户信息")
    public Result<GetUserInfoResponse> getUserInfo() {
        return loginService.getUserInfo();
    }

    @Override
    public Result<List<GetRouterResponse>> getRouters() {
        return loginService.getRouters();
    }
}
