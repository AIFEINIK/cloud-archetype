#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.cache.localcache;

import ${package}.common.entity.LoginUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @author ZhangPengFei
 * @description
 */
@Component
public class LoginUserCache extends LocalCache<String, LoginUser> {

    @Value("${symbol_dollar}{token.expireTime}")
    private int expireTime;

    @Override
    protected long getExpire() {
        return expireTime;
    }

    @Override
    protected TimeUnit timeUnit() {
        return TimeUnit.MINUTES;
    }
}
