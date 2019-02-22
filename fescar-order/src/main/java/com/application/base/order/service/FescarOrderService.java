package com.application.base.order.service;

import com.application.base.order.entity.FescarOrder;
import com.application.base.common.page.Pagination;
import java.util.List;
import java.util.Map;


/**
*@desc FescarOrder表相关Service基础接口.
*@author admin
*/
public interface FescarOrderService {

    /**
    * 添加对象。
    * @param fescarOrder
    * @return
    */
    int saveFescarOrder(FescarOrder fescarOrder);

    /**
    * 修改对象
    * @param fescarOrder
    * @return
    */
    int updateFescarOrder(FescarOrder fescarOrder);

    /**
    * 删除对象
    * @param fescarOrder
    * @return
    */
    int deleteFescarOrder(FescarOrder fescarOrder);

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    */
    FescarOrder queryFescarOrder(Map<String, Object> param);

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    */
    List<FescarOrder> queryFescarOrders(Map<String, Object> param);

    /**
    * 分頁查询满足条件的列表
    * @param param
    * @return
    */
    List<FescarOrder> queryPageFescarOrders(Map<String, Object> param);

    /**
    * 按照条件查询总条数
    * @param param
    * @return
    */
    Integer totalCount(Map<String, Object> param);

    /**
    * 分页查询
    *@param param
    *@param pageNo
    *@param pageSize
    * @return
    */
    Pagination<FescarOrder> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize);

}
