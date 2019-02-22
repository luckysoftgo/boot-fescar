package com.application.base.storage.service.impl;

import java.util.List;
import java.util.Map;

import com.application.base.common.page.Pagination;
import com.application.base.common.exception.CommonException;
import com.application.base.common.BaseCommonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.base.storage.entity.FescarStorage;
import com.application.base.storage.dao.FescarStorageMapper;
import com.application.base.storage.service.FescarStorageService;


/**
 * @desc FescarStorageService接口实现
 * @author admin
 */
@Service("fescarStorageService")
public class FescarStorageServiceImpl implements FescarStorageService {

	@Autowired
	private FescarStorageMapper fescarStorageMapper;

	/**
	* 添加对象。
	* @param fescarStorage
	* @return
	*/
	@Override
	public int saveFescarStorage(FescarStorage fescarStorage){
		try {
			return fescarStorageMapper.saveFescarStorage(fescarStorage);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.ADD_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.ADD_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 修改对象
	* @param fescarStorage
	* @return
	*/
	@Override
	public int updateFescarStorage(FescarStorage fescarStorage){
		try {
			return fescarStorageMapper.updateFescarStorage(fescarStorage);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.UPDATE_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.UPDATE_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 删除对象
	* @param fescarStorage
	* @return
	*/
	@Override
	public int deleteFescarStorage(FescarStorage fescarStorage){
		try {
			return fescarStorageMapper.deleteFescarStorage(fescarStorage);
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
	public FescarStorage queryFescarStorage(Map<String, Object> param){
		try {
			return fescarStorageMapper.queryFescarStorage(param);
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
	public List<FescarStorage> queryFescarStorages(Map<String, Object> param){
		try {
			return fescarStorageMapper.queryFescarStorages(param);
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
	public List<FescarStorage> queryPageFescarStorages(Map<String, Object> param){
		try {
			return fescarStorageMapper.queryPageFescarStorages(param);
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
			return fescarStorageMapper.totalCount(param);
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
	public Pagination<FescarStorage> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize){
		int count = 0;
		List<FescarStorage> list = queryPageFescarStorages(param);
		// 如果list为空则没有必须再查询总条数
		if (list != null && list.size() > 0) {
			count = totalCount(param);
		}
		Pagination<FescarStorage> pageResult = new Pagination<FescarStorage>(list, pageNo, pageSize);
		// 如果总条数为零则不需要设置初始化数值
		if (count > 0) {
			pageResult.setRowCount(count);
		}
		return pageResult;
	}
}
