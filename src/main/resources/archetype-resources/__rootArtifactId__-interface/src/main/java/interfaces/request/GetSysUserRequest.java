#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhangPengFei
 * @description
 */
@Data
public class GetSysUserRequest implements Serializable {

    private String userName;
}
