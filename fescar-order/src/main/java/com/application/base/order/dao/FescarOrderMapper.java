package com.application.base.order.dao;

import com.application.base.order.entity.FescarOrder;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
*@desc FescarOrder表相关DAO基础接口.
*@author 孤狼.
*/
@Repository
public interface FescarOrderMapper {

    /**
    * 添加对象。
    * @param fescarOrder
    * @return
    * @throws Exception
    */
    int saveFescarOrder(FescarOrder fescarOrder) throws Exception;

    /**
    * 批量添加对象。
    * @param fescarOrders
    * @return
    * @throws Exception
    */
    boolean saveFescarOrders(List<FescarOrder> fescarOrders) throws Exception;

    /**
    * 修改对象
    * @param fescarOrder
    * @return
    * @throws Exception
    */
    int updateFescarOrder(FescarOrder fescarOrder) throws Exception;

    /**
    * 删除对象
    * @param fescarOrder
    * @return
    * @throws Exception
    */
    int deleteFescarOrder(FescarOrder fescarOrder) throws Exception;

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    * @throws Exception
    */
    FescarOrder queryFescarOrder(Map<String, Object> param) throws Exception;

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    * @throws Exception
    */
    List<FescarOrder> queryFescarOrders(Map<String, Object> param) throws Exception;

    /**
    * 按照条件查询总条数
    * @param param
    * @return
    * @throws Exception
    */
    Integer totalCount(Map<String, Object> param) throws Exception;

    /**
    * 分頁查询满足条件的列表
    * @param param
    * @return
    * @throws Exception
    */
    List<FescarOrder> queryPageFescarOrders(Map<String, Object> param) throws Exception;

}
