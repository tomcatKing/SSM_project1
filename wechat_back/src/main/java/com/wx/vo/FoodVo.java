package com.wx.vo;

import java.math.BigDecimal;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.wx.pojo.Food;
import com.wx.util.Common;

import lombok.Data;

@JsonSerialize(include=Inclusion.NON_NULL)
@Data
public class FoodVo {
	private Integer food_id;
	private String food_type;
	private String food_name;
	private BigDecimal food_price;
	private String food_img;
	private String food_detail;
	private Integer food_count;
	private String food_status;
	
	public static FoodVo assembeFoodVo(Food food){
		FoodVo foodVo=new FoodVo();
		foodVo.setFood_id(food.getFood_id());
		foodVo.setFood_type(
				Common.FoodTypeEnum.codeOf(food.getFood_type()).getValue());
		foodVo.setFood_name(food.getFood_name());
		foodVo.setFood_price(food.getFood_price());
		foodVo.setFood_img(food.getFood_img());
		foodVo.setFood_detail(food.getFood_detail());
		foodVo.setFood_count(food.getFood_count());
		foodVo.setFood_status(
				Common.FoodStatusEnum.codeOf(food.getFood_status()).getValue());
		return foodVo;
	}
	
}
