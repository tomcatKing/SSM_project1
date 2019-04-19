package com.wx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wx.pojo.OrderItem;

public interface OrderItemMapper {
	
	@Select("select order_item_id,order_no,food_id,food_name,food_img,food_price,food_num,total_price from order_item where order_no=#{order_no}")
	List<OrderItem> getOrderItemByOrderNo(Long order_no);
}
