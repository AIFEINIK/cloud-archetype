#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.interfaces.facade;

import ${package}.common.page.Page;
import ${package}.common.result.Result;
import ${package}.interfaces.request.SearchSysDictTypePageRequest;
import ${package}.interfaces.response.SearchSysDictTypePageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ZhangPengFei
 * @description 字典类型接口
 */
public interface SysDictTypeFacade {

    /**
    * 查询字典类型列表
    * @param request 请求参数
    * @return 分页结果
    */
    @PostMapping("/searchSysDictTypePage")
    Result<Page<SearchSysDictTypePageResponse>> searchSysDictTypePage(@RequestBody SearchSysDictTypePageRequest request);
}
