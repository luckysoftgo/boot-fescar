package com.application.base.order.service.impl;

import java.util.List;
import java.util.Map;

import com.application.base.common.page.Pagination;
import com.application.base.common.exception.CommonException;
import com.application.base.common.BaseCommonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.base.order.entity.FescarOrder;
import com.application.base.order.dao.FescarOrderMapper;
import com.application.base.order.service.FescarOrderService;


/**
 * @desc FescarOrderService接口实现
 * @author admin
 */
@Service("fescarOrderService")
public class FescarOrderServiceImpl implements FescarOrderService {

	@Autowired
	private FescarOrderMapper fescarOrderMapper;

	/**
	* 添加对象。
	* @param fescarOrder
	* @return
	*/
	@Override
	public int saveFescarOrder(FescarOrder fescarOrder){
		try {
			return fescarOrderMapper.saveFescarOrder(fescarOrder);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.ADD_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.ADD_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 修改对象
	* @param fescarOrder
	* @return
	*/
	@Override
	public int updateFescarOrder(FescarOrder fescarOrder){
		try {
			return fescarOrderMapper.updateFescarOrder(fescarOrder);
		}catch (Exception ex){
			throw new CommonException(BaseCommonMsg.UPDATE_DATA_TO_DB_FAIL_MSG.getCode(),BaseCommonMsg.UPDATE_DATA_TO_DB_FAIL_MSG.getMsg());
		}
	}

	/**
	* 删除对象
	* @param fescarOrder
	* @return
	*/
	@Override
	public int deleteFescarOrder(FescarOrder fescarOrder){
		try {
			return fescarOrderMapper.deleteFescarOrder(fescarOrder);
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
	public FescarOrder queryFescarOrder(Map<String, Object> param){
		try {
			return fescarOrderMapper.queryFescarOrder(param);
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
	public List<FescarOrder> queryFescarOrders(Map<String, Object> param){
		try {
			return fescarOrderMapper.queryFescarOrders(param);
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
	public List<FescarOrder> queryPageFescarOrders(Map<String, Object> param){
		try {
			return fescarOrderMapper.queryPageFescarOrders(param);
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
			return fescarOrderMapper.totalCount(param);
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
	public Pagination<FescarOrder> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize){
		int count = 0;
		List<FescarOrder> list = queryPageFescarOrders(param);
		// 如果list为空则没有必须再查询总条数
		if (list != null && list.size() > 0) {
			count = totalCount(param);
		}
		Pagination<FescarOrder> pageResult = new Pagination<FescarOrder>(list, pageNo, pageSize);
		// 如果总条数为零则不需要设置初始化数值
		if (count > 0) {
			pageResult.setRowCount(count);
		}
		return pageResult;
	}
}
