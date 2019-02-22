package com.application.base.account.service;

import com.application.base.account.entity.FescarAccount;
import com.application.base.common.page.Pagination;
import java.util.List;
import java.util.Map;


/**
*@desc FescarAccount表相关Service基础接口.
*@author admin
*/
public interface FescarAccountService {

    /**
    * 添加对象。
    * @param fescarAccount
    * @return
    */
    int saveFescarAccount(FescarAccount fescarAccount);

    /**
    * 修改对象
    * @param fescarAccount
    * @return
    */
    int updateFescarAccount(FescarAccount fescarAccount);

    /**
    * 删除对象
    * @param fescarAccount
    * @return
    */
    int deleteFescarAccount(FescarAccount fescarAccount);

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    */
    FescarAccount queryFescarAccount(Map<String, Object> param);

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    */
    List<FescarAccount> queryFescarAccounts(Map<String, Object> param);

    /**
    * 分頁查询满足条件的列表
    * @param param
    * @return
    */
    List<FescarAccount> queryPageFescarAccounts(Map<String, Object> param);

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
    Pagination<FescarAccount> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize);

}
