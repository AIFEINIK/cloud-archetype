#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.mapper;

import ${package}.dao.entity.SysRole;
import ${package}.model.bo.condition.SysRoleSearchConditionBO;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description
 */
public interface RoleMapper {
    List<SysRole> searchSysRoles(SysRoleSearchConditionBO condition);
}
