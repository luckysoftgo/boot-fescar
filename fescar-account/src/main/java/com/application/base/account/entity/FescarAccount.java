package com.application.base.account.entity;


import com.application.base.common.BaseEntity;

/**
* FescarAccount实体
* @author 孤狼
*/
public class FescarAccount extends BaseEntity {

	private static final long serialVersionUID = 1L;
	/**
	* 表名
	*/
	public static final String TABLE_NAME = "fescar_account";

	/**用户的主键id*/
	private String  userId ;
	/**用户的主键id 对应的静态变量值*/
	public static final String FIELD_USER_ID = "userId";
	/**账户金额*/
	private Integer  accountAmount ;
	/**账户金额 对应的静态变量值*/
	public static final String FIELD_ACCOUNT_AMOUNT = "accountAmount";

	public FescarAccount () {
		super();
	}

	public FescarAccount (String userId ,Integer accountAmount ) {
		super();
		this.userId = userId;
		this.accountAmount = accountAmount;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getAccountAmount() {
		return accountAmount;
	}
	public void setAccountAmount(Integer accountAmount) {
		this.accountAmount = accountAmount;
	}
}
