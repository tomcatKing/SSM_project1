package com.wx.service;

import com.wx.pojo.Food;
import com.wx.result.JsonResult;

public interface IFoodService {

	public JsonResult list(String keyword,int pageNum,int pageSize);

	public JsonResult detail(Integer food_id);

	public JsonResult add(Food food);

	public JsonResult update(Food food);

}
