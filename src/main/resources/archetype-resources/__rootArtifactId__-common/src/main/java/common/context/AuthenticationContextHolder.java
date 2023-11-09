#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.context;

import org.springframework.security.core.Authentication;

/**
 * @author ZhangPengFei
 * @description 身份验证信息
 */
public class AuthenticationContextHolder {

    private static final ThreadLocal<Authentication> contextHolder = new ThreadLocal<>();

    public static Authentication getContext() {
        return contextHolder.get();
    }

    public static void setContext(Authentication authentication) {
        contextHolder.set(authentication);
    }

    public static void clear() {
        contextHolder.remove();
    }
}
