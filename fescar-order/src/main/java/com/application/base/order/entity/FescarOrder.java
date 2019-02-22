package com.application.base.order.entity;

import com.application.base.common.BaseEntity;

/**
* FescarOrder实体
* @author 孤狼
*/
public class FescarOrder extends BaseEntity {

	private static final long serialVersionUID = 1L;
	/**
	* 表名
	*/
	public static final String TABLE_NAME = "fescar_order";

	/**用户的主键id*/
	private String  userId ;
	/**用户的主键id 对应的静态变量值*/
	public static final String FIELD_USER_ID = "userId";
	/**商品编号*/
	private String  goodsCode ;
	/**商品编号 对应的静态变量值*/
	public static final String FIELD_GOODS_CODE = "goodsCode";
	/**商品数量*/
	private Integer  goodsCount ;
	/**商品数量 对应的静态变量值*/
	public static final String FIELD_GOODS_COUNT = "goodsCount";
	/**订单金额*/
	private Integer  orderAmount ;
	/**订单金额 对应的静态变量值*/
	public static final String FIELD_ORDER_AMOUNT = "orderAmount";

	public FescarOrder () {
		super();
	}

	public FescarOrder (String userId ,String goodsCode ,Integer goodsCount ,Integer orderAmount ) {
		super();
		this.userId = userId;
		this.goodsCode = goodsCode;
		this.goodsCount = goodsCount;
		this.orderAmount = orderAmount;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public Integer getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}
	public Integer getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}
}
