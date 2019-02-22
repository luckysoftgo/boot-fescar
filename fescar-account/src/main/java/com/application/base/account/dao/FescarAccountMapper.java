package com.application.base.account.dao;

import com.application.base.account.entity.FescarAccount;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
*@desc FescarAccount表相关DAO基础接口.
*@author 孤狼.
*/
@Repository
public interface FescarAccountMapper {

    /**
    * 添加对象。
    * @param fescarAccount
    * @return
    * @throws Exception
    */
    int saveFescarAccount(FescarAccount fescarAccount) throws Exception;

    /**
    * 批量添加对象。
    * @param fescarAccounts
    * @return
    * @throws Exception
    */
    boolean saveFescarAccounts(List<FescarAccount> fescarAccounts) throws Exception;

    /**
    * 修改对象
    * @param fescarAccount
    * @return
    * @throws Exception
    */
    int updateFescarAccount(FescarAccount fescarAccount) throws Exception;

    /**
    * 删除对象
    * @param fescarAccount
    * @return
    * @throws Exception
    */
    int deleteFescarAccount(FescarAccount fescarAccount) throws Exception;

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    * @throws Exception
    */
    FescarAccount queryFescarAccount(Map<String, Object> param) throws Exception;

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    * @throws Exception
    */
    List<FescarAccount> queryFescarAccounts(Map<String, Object> param) throws Exception;

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
    List<FescarAccount> queryPageFescarAccounts(Map<String, Object> param) throws Exception;

}
