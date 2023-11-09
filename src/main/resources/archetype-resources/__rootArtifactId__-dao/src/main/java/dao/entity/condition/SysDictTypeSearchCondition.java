#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.entity.condition;

import lombok.Data;
import ${package}.dao.entity.SysDictType;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description 字典类型查询条件
 */
@Data
public class SysDictTypeSearchCondition extends SysDictType {

    /**
     * 字典主键
     */
    private List<Long> dictIds;
}
