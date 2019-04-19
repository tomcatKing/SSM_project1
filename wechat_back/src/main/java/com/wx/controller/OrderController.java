package com.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wx.result.JsonResult;
import com.wx.service.IOrderService;

@RestController
@RequestMapping("/manage/order")
public class OrderController {
	@Autowired
	private IOrderService iOrderService;
	
	@RequestMapping("/list")
	public JsonResult list(
			@RequestParam(value="keyword",defaultValue="",required=false)String keyword,
			@RequestParam(value="pageNum",defaultValue="1",required=false) int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize) {
		return iOrderService.list(keyword,pageNum,pageSize);
	}
	
	@RequestMapping("/detail")
	public JsonResult detail(Long order_no) {
		return iOrderService.detail(order_no);
	}
}
