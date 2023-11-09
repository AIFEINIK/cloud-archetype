#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.interfaces.request.SearchSysDictTypePageRequest;
import ${package}.interfaces.response.SearchSysDictTypePageResponse;
import ${package}.common.page.Page;
import ${package}.common.result.Result;

/**
 * @author ZhangPengFei
 * @description 字典类型Service接口
 */
public interface SysDictTypeService {

    /**
     * 查询字典类型列表
     * 
     * @param request 查询参数
     * @return 字典类型分页
     */
    Result<Page<SearchSysDictTypePageResponse>> searchSysDictTypePage(SearchSysDictTypePageRequest request);
}
