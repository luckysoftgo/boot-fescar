package com.application.base.storage.entity;

import com.application.base.common.BaseEntity;

/**
* FescarStorage实体
* @author 孤狼
*/
public class FescarStorage extends BaseEntity {

	private static final long serialVersionUID = 1L;
	/**
	* 表名
	*/
	public static final String TABLE_NAME = "fescar_storage";

	/**商品编号*/
	private String  goodsCode ;
	/**商品编号 对应的静态变量值*/
	public static final String FIELD_GOODS_CODE = "goodsCode";
	/**商品数量*/
	private Integer  goodsCount ;
	/**商品数量 对应的静态变量值*/
	public static final String FIELD_GOODS_COUNT = "goodsCount";

	public FescarStorage () {
		super();
	}

	public FescarStorage (String goodsCode ,Integer goodsCount ) {
		super();
		this.goodsCode = goodsCode;
		this.goodsCount = goodsCount;
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
}
