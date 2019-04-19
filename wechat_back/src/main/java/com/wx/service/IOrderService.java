package com.wx.service;

import com.wx.result.JsonResult;

public interface IOrderService {

	JsonResult list(String keyword,int pageNum,int pageSize);

	JsonResult detail(Long order_no);

}
