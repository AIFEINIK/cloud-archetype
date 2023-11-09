#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.request;

import ${package}.common.page.PageRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhangPengFei
 * @description
 */
@Data
public class SearchSysUserPageRequest extends PageRequest implements Serializable {

    private String account;
    private Long beginCreateTime;
    private Long endCreateTime;
}
