#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.mapper;

import ${package}.dao.entity.SysMenu;
import ${package}.model.bo.condition.SysMenuSearchConditionBO;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description
 */
public interface MenuMapper {
    List<SysMenu> searchSysMenus(SysMenuSearchConditionBO condition);
}
