#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.mapper;

import ${package}.dao.entity.SysUser;
import ${package}.model.bo.condition.SysUserSearchConditionBO;

import java.util.List;

/**
 * @author ZhangPengFei
 * @description
 */
public interface UserManagerMapper {
    SysUser getSysUserByUserName(String userName);

    void updateSysUser(SysUser sysUser);

    int getSysUserCount(SysUserSearchConditionBO condition);

    List<SysUser> searchSysUsers(SysUserSearchConditionBO condition);
}
