package com.wx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wx.pojo.Order;

public interface OrderMapper {
	
	@Select("select order_no,shipping_id,payment,payment_type,status,order_desc,create_time from `order`")
	List<Order> orderList();
	
	@Select("select order_no,shipping_id,payment,payment_type,status,order_desc,create_time from `order` where order_no=#{order_no}")
	Order getOrder(Long order_no);

	@Select("select order_no,shipping_id,payment,payment_type,status,order_desc,create_time from `order` where order_no like #{keyword}")
	List<Order> searchList(String keyword);
}
