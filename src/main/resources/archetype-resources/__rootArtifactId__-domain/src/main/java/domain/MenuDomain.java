#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import ${package}.common.page.PageRequest;
import ${package}.common.utils.BeanUtils;
import ${package}.dao.mapper.MenuMapper;
import ${package}.model.bo.SysMenuBO;
import ${package}.model.bo.condition.SysMenuSearchConditionBO;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangPengFei
 * @description 权限
 */
@Component
public class MenuDomain {

    @Resource
    private MenuMapper menuMapper;

    public List<SysMenuBO> searchSysMenus(SysMenuSearchConditionBO condition, PageRequest page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), false);
        return BeanUtils.batchTransform(SysMenuBO.class, menuMapper.searchSysMenus(condition), BeanUtils.TransformEnumType.VALUE_TO_ENUM);
    }
}
