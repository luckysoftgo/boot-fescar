package com.application.base.account.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.application.base.account.entity.FescarAccount;
import com.application.base.account.service.FescarAccountService;
import com.application.base.common.json.JsonConvertUtils;
import com.application.base.common.result.ResultDataVO;
import com.application.base.common.result.ResultInfo;
import com.application.base.common.web.BaseCommController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.application.base.common.BaseCommonMsg.*;

/**
 * @Author: 孤狼
 * @desc:
 */
@RestController
@RequestMapping("/account")
public class FescarAccountController extends BaseCommController {
	
	@Reference(version = "${dubbo.provider.version}",
			application = "${dubbo.application.id}")
	private FescarAccountService fescarAccountService;
	
	/*
	 *正常的调用情况.
	@Autowired
	private FescarAccountService fescarAccountService;
	*/
	
	@RequestMapping(value="/queryAccountById",method = { RequestMethod.GET,RequestMethod.POST}, produces = "application/json;charset=UTF-8")
	public ResultDataVO queryAccountById(@RequestBody Map<String,Object> param) {
		FescarAccount account= fescarAccountService.queryFescarAccount(param);
		ResultInfo info = new ResultInfo("OK",SYSTEM_SUCCESS_MSG.getCode()+"", SYSTEM_SUCCESS_MSG.getMsg());
	    return new ResultDataVO(info,account);
	}
	
}
