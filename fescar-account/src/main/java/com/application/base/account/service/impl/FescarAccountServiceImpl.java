package com.application.base.account.service.impl;

import java.util.List;
import java.util.Map;

import com.application.base.common.page.Pagination;
import com.application.base.common.exception.CommonException;
import com.application.base.common.BaseCommonMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import com.application.base.account.entity.FescarAccount;
import com.application.base.account.dao.FescarAccountMapper;
import com.application.base.account.service.FescarAccountService;
import org.springframework.stereotype.Service;


/**
 * @desc FescarAccountService接口实现
 * @author admin
 */

@com.alibaba.dubbo.config.annotation.Service(version = "${dubbo.provider.version}",
		application = "${dubbo.application.id}",
		protocol = "${dubbo.protocol.id}",
		registry = "${dubbo.registry.id}")
/*
@Service("fescarAccountService")
*/
public class FescarAccountServiceImpl implements FescarAccountService {

	@Autowired
	private FescarAccountMapper fescarAccountMapper;

	/**
	* 添加对象。
	* @param fescarAccount
	* @return
	*/
	@Override
	public int saveFescarAccount(FescarAccount fescarAccount){
		try {
			return fescarAccountMapper.saveFescarAccount(fescarAccount);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.ADD_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.ADD_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 修改对象
	* @param fescarAccount
	* @return
	*/
	@Override
	public int updateFescarAccount(FescarAccount fescarAccount){
		try {
			return fescarAccountMapper.updateFescarAccount(fescarAccount);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.UPDATE_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.UPDATE_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 删除对象
	* @param fescarAccount
	* @return
	*/
	@Override
	public int deleteFescarAccount(FescarAccount fescarAccount){
		try {
			return fescarAccountMapper.deleteFescarAccount(fescarAccount);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.DELETE_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.DELETE_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 根据唯一条件查询
	* @param param
	* @return
	*/
	@Override
	public FescarAccount queryFescarAccount(Map<String, Object> param){
		try {
			return fescarAccountMapper.queryFescarAccount(param);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.SELECT_DATA_FROM_DB_FAIL_MSG.getCode(),BaseCommonMsg.SELECT_DATA_FROM_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 查询满足条件的列表
	* @param param
	* @return
	*/
	@Override
	public List<FescarAccount> queryFescarAccounts(Map<String, Object> param){
		try {
			return fescarAccountMapper.queryFescarAccounts(param);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.SELECT_DATA_FROM_DB_FAIL_MSG.getCode(),BaseCommonMsg.SELECT_DATA_FROM_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 分頁查询满足条件的列表
	* @param param
	* @return
	*/
    @Override
	public List<FescarAccount> queryPageFescarAccounts(Map<String, Object> param){
		try {
			return fescarAccountMapper.queryPageFescarAccounts(param);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.SELECT_DATA_FROM_DB_FAIL_MSG.getCode(),BaseCommonMsg.SELECT_DATA_FROM_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 按照条件查询总条数
	* @param param
	* @return
	*/
	@Override
	public Integer totalCount(Map<String, Object> param){
		try {
			return fescarAccountMapper.totalCount(param);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.QUERY_TOTAL_DATA_FAIL_MSG.getCode(),BaseCommonMsg.QUERY_TOTAL_DATA_FAIL_MSG.getMsg());
		}
	}


	/**
	* 分页查询
	* @param param
	  @param pageNo
      @param pageSize
	* @return
	*/
	@Override
	public Pagination<FescarAccount> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize){
		int count = 0;
		List<FescarAccount> list = queryPageFescarAccounts(param);
		// 如果list为空则没有必须再查询总条数
		if (list != null && list.size() > 0) {
			count = totalCount(param);
		}
		Pagination<FescarAccount> pageResult = new Pagination<FescarAccount>(list, pageNo, pageSize);
		// 如果总条数为零则不需要设置初始化数值
		if (count > 0) {
			pageResult.setRowCount(count);
		}
		return pageResult;
	}
}
