#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.request;

import ${package}.common.page.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * @author ZhangPengFei
 * @description 字典类型request
 */
@Data
@ApiModel("字典类型request")
public class SearchSysDictTypePageRequest extends PageRequest implements Serializable {

    @ApiModelProperty("字典主键集合")
    private List<Long> dictIds;

}
