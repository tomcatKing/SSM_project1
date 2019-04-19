package com.wx.dao;

import org.apache.ibatis.annotations.Select;

import com.wx.pojo.Shipping;

public interface ShippingMapper {
	@Select("select shipping_id,receiver_name,receiver_phone"
			+ ",receiver_province,receiver_city,receiver_district,receiver_address"
			+ " from shipping where shipping_id=#{shipping_id}")
	Shipping getShippingByShippingId(Integer shipping_id);
}
