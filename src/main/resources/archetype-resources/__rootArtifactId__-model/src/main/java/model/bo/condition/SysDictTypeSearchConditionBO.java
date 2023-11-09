#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.bo.condition;

import lombok.Data;
import ${package}.model.bo.SysDictTypeBO;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description 字典类型查询条件
 */
@Data
public class SysDictTypeSearchConditionBO extends SysDictTypeBO {

    /**
     * 字典主键
     */
    private List<Long> dictIds;
}
