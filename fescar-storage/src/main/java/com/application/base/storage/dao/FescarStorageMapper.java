package com.application.base.storage.dao;

import com.application.base.storage.entity.FescarStorage;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
*@desc FescarStorage表相关DAO基础接口.
*@author 孤狼.
*/
@Repository
public interface FescarStorageMapper {

    /**
    * 添加对象。
    * @param fescarStorage
    * @return
    * @throws Exception
    */
    int saveFescarStorage(FescarStorage fescarStorage) throws Exception;

    /**
    * 批量添加对象。
    * @param fescarStorages
    * @return
    * @throws Exception
    */
    boolean saveFescarStorages(List<FescarStorage> fescarStorages) throws Exception;

    /**
    * 修改对象
    * @param fescarStorage
    * @return
    * @throws Exception
    */
    int updateFescarStorage(FescarStorage fescarStorage) throws Exception;

    /**
    * 删除对象
    * @param fescarStorage
    * @return
    * @throws Exception
    */
    int deleteFescarStorage(FescarStorage fescarStorage) throws Exception;

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    * @throws Exception
    */
    FescarStorage queryFescarStorage(Map<String, Object> param) throws Exception;

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    * @throws Exception
    */
    List<FescarStorage> queryFescarStorages(Map<String, Object> param) throws Exception;

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
    List<FescarStorage> queryPageFescarStorages(Map<String, Object> param) throws Exception;

}
