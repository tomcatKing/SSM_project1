package com.wx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wx.pojo.Food;

public interface FoodMapper {
	@Select("select * from food")
	List<Food> foodList();
	
	@Select("select * from food where food_id=#{food_id}")
	Food foodDetail(Integer food_id);
	
	@Insert("insert into food(food_type,food_name,"
			+ "food_img,food_detail,food_price,"
			+ "food_count,food_status,create_time,"
			+ "update_time) "
			+ "values(#{food_type},#{food_name},"
			+ "#{food_img},#{food_detail},#{food_price},"
			+ "100,1,now(),now())")
	int addFood(Food food);
	
	@Update("<script>"+
			"update food" + 
			"    <set >" + 
			"      <if test='food_type != null' >" + 
			"        food_type = #{food_type}," + 
			"      </if>" + 
			"      <if test='food_name != null' >" + 
			"        food_name = #{food_name}," + 
			"      </if>" + 
			"      <if test='food_img!= null' >" + 
			"        food_img=#{food_img}," + 
			"      </if>" + 
			"      <if test='food_detail !=null'>" + 
			"       food_detail=#{food_detail}," + 
			"      </if>" + 
			"      <if test='food_price != null' >" + 
			"       food_price = #{food_price}," + 
			"      </if>" + 
			"      <if test='food_count != null' >" + 
			"        food_count = #{food_count}," + 
			"      </if>" + 
			"      <if test='food_status != null' >" + 
			"        food_status = #{food_status}," + 
			"      </if>" + 
			"      update_time = now()" + 
			"    </set>" + 
			"where food_id = #{food_id}"
			+"</script>")
	int updateFood(Food food);
	
	
	@Select("select * from food where food_name like #{keyword}")
	List<Food> searchFoods(String keyword);
}
