#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.bo.condition;

import lombok.Data;

/**
 * @author ZhangPengFei
 * @description
 */
@Data
public class SysMenuSearchConditionBO {

    private Long userId;
    private Boolean menuTree;
}
