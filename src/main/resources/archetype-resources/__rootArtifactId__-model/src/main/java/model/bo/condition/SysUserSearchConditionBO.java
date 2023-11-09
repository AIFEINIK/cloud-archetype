#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.bo.condition;

import lombok.Data;

import java.util.Date;

/**
 * @author ZhangPengFei
 * @description
 */
@Data
public class SysUserSearchConditionBO {

    private String userName;
    private Date beginCreateTime;
    private Date endCreateTime;
}
