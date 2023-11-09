#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author ZhangPengFei
 * @description
 */
@Data
public class ModifySysUserPasswordRequest implements Serializable {

    @NotBlank(message = "请出入旧密码")
    private String oldPassword;

    @NotBlank(message = "请出入新的密码")
    private String newPassword;
}
