package com.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wx.pojo.Food;
import com.wx.result.JsonResult;
import com.wx.service.IFoodService;

@RestController
@RequestMapping("/manage/food")
public class FoodController {
	@Autowired
	private IFoodService iFoodService;
	
	@RequestMapping("/list")
	public JsonResult FoodList(
			@RequestParam(value="keyword",defaultValue="",required=false)String keyword,
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false)int pageSize) {
		return iFoodService.list(keyword,pageNum,pageSize);
	}
	
	@RequestMapping("/detail")
	public JsonResult FoodDetail(Integer food_id) {
		return iFoodService.detail(food_id);
	}
	
	@RequestMapping("/add")
	public JsonResult add(Food food) {
		System.out.println(food);
		return iFoodService.add(food);
	}
	
	@RequestMapping("/update")
	public JsonResult update(Food food) {
		return iFoodService.update(food);
	}
	
}
