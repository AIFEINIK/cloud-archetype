#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/** created by leihong.pan at 2019/11/21 15:34 */
package ${package}.common.result;

public interface ResultAble {

    <T> Result<T> toResult();

    <T> Result<T> toResult(Object... args);

}
