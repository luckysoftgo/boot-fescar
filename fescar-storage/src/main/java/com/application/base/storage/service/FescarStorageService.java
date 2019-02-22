package com.application.base.storage.service;

import com.application.base.storage.entity.FescarStorage;
import com.application.base.common.page.Pagination;
import java.util.List;
import java.util.Map;


/**
*@desc FescarStorage表相关Service基础接口.
*@author admin
*/
public interface FescarStorageService {

    /**
    * 添加对象。
    * @param fescarStorage
    * @return
    */
    int saveFescarStorage(FescarStorage fescarStorage);

    /**
    * 修改对象
    * @param fescarStorage
    * @return
    */
    int updateFescarStorage(FescarStorage fescarStorage);

    /**
    * 删除对象
    * @param fescarStorage
    * @return
    */
    int deleteFescarStorage(FescarStorage fescarStorage);

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    */
    FescarStorage queryFescarStorage(Map<String, Object> param);

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    */
    List<FescarStorage> queryFescarStorages(Map<String, Object> param);

    /**
    * 分頁查询满足条件的列表
    * @param param
    * @return
    */
    List<FescarStorage> queryPageFescarStorages(Map<String, Object> param);

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
    Pagination<FescarStorage> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize);

}
