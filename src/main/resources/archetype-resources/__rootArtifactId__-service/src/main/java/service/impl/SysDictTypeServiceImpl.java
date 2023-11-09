#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import java.util.List;
import javax.annotation.Resource;
import ${package}.domain.SysDictTypeDomain;
import ${package}.interfaces.request.SearchSysDictTypePageRequest;
import ${package}.interfaces.response.SearchSysDictTypePageResponse;
import ${package}.model.bo.SysDictTypeBO;
import ${package}.model.bo.condition.SysDictTypeSearchConditionBO;
import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.common.page.PageRequest;
import ${package}.service.SysDictTypeService;
import org.springframework.stereotype.Service;
import static ${package}.common.utils.BeanUtils.*;

/**
 * @author ZhangPengFei
 * @description 字典类型Service业务层处理
 */
@Service
public class SysDictTypeServiceImpl implements SysDictTypeService {

    @Resource
    private SysDictTypeDomain sysDictTypeDomain;

    /**
     * 查询字典类型列表
     *
     * @param request 查询参数
     * @return 字典类型分页
     */
    @Override
    public Result<Page<SearchSysDictTypePageResponse>> searchSysDictTypePage(SearchSysDictTypePageRequest request) {
        SysDictTypeSearchConditionBO searchCondition = transform(SysDictTypeSearchConditionBO.class,
                request, true, TransformEnumType.NAME_TO_ENUM);

        int count = sysDictTypeDomain.searchSysDictTypeCount(searchCondition);
        if (count == 0) {
            return Result.success(Page.emptyPage());
        }

        List<SysDictTypeBO> sysDictTypes = sysDictTypeDomain.searchSysDictTypeWithCondition(searchCondition,
                PageRequest.of(request.getPageNum(), request.getPageSize()));
        return new Result<>(Page.of(count, batchTransform(SearchSysDictTypePageResponse.class,
                    sysDictTypes, true, TransformEnumType.ENUM_TO_NAME)));
    }
}
