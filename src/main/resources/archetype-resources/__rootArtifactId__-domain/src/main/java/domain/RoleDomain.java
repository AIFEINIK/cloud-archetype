#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import ${package}.common.page.PageRequest;
import ${package}.common.utils.BeanUtils;
import ${package}.dao.mapper.RoleMapper;
import ${package}.model.bo.SysRoleBO;
import ${package}.model.bo.condition.SysRoleSearchConditionBO;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangPengFei
 * @description 角色
 */
@Component
public class RoleDomain {

    @Resource
    private RoleMapper roleMapper;

    public List<SysRoleBO> searchSysUsers(SysRoleSearchConditionBO condition, PageRequest page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), false);
        return BeanUtils.batchTransform(SysRoleBO.class, roleMapper.searchSysRoles(condition), BeanUtils.TransformEnumType.VALUE_TO_ENUM);
    }
}
