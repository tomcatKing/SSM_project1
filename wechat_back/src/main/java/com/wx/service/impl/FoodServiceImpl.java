package com.wx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.wx.dao.FoodMapper;
import com.wx.pojo.Food;
import com.wx.result.JsonResult;
import com.wx.service.IFoodService;
import com.wx.vo.FoodVo;
@Service
public class FoodServiceImpl implements IFoodService {
	@Autowired
	private FoodMapper foodMapper;
	
	@Override
	public JsonResult list(String keyword,int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Food> foodList=Lists.newArrayList();
		if(keyword==null || keyword.trim()=="") {
			foodList=foodMapper.foodList();
		}else {
			//加上关键字搜索
			foodList=foodMapper.searchFoods("%"+keyword+"%");
		}
		PageInfo pageResult=new PageInfo(foodList);
		List<FoodVo> foodVoList=Lists.newArrayList();
		for (Food food : foodList) {
			foodVoList.add(FoodVo.assembeFoodVo(food));
		}
		pageResult.setList(foodVoList);
		return JsonResult.ok(pageResult);
	}

	@Override
	public JsonResult detail(Integer food_id) {
		Food food=foodMapper.foodDetail(food_id);
		FoodVo foodVo=FoodVo.assembeFoodVo(food);
		return JsonResult.ok(foodVo);
	}

	@Override
	public JsonResult add(Food food) {
		if(food==null || food.getFood_type()==null 
				|| food.getFood_price()==null || food.getFood_name()==null || food.getFood_img()==null ) {
			System.out.println(food);
			return JsonResult.error("传入参数异常");
		}
		// TODO Auto-generated method stub
		int count=foodMapper.addFood(food);
		if(count>0) {
			return JsonResult.ok();
		}
		return JsonResult.error();
	}

	@Override
	public JsonResult update(Food food) {
		System.out.println(food);
		// TODO Auto-generated method stub
		int count=foodMapper.updateFood(food);
		if(count>0) {
			return JsonResult.ok();
		}
		return JsonResult.error();
	}

}
