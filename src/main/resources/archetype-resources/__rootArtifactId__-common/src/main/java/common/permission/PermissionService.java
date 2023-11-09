#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.permission;

import ${package}.common.entity.LoginUser;
import ${package}.common.utils.SecurityUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author ZhangPengFei
 * @description
 */
@Service("ss")
public class PermissionService {

    /** 所有权限标识 */
    private static final String ALL_PERMISSION = "*:*:*";

    public boolean auth(String permission) {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        if (Objects.isNull(loginUser) || CollectionUtils.isEmpty(loginUser.getPermissions())) {
            return false;
        }
        return loginUser.getPermissions().contains(ALL_PERMISSION) || loginUser.getPermissions().contains(permission);
    }
}
