package com.wx.vo;

import java.math.BigDecimal;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.wx.pojo.OrderItem;

import lombok.Data;

@Data
@JsonSerialize(include=Inclusion.NON_NULL)
public class OrderItemVo {
	private Integer order_item_id;
	private String open_id;
	private Integer food_id;
	private String food_name;
	private String food_img;
	private BigDecimal food_price;
	private Integer food_num;
	private BigDecimal total_price;
	
	public static OrderItemVo accessOrderItemVO(OrderItem orderItem) {
		OrderItemVo orderItemVo=new OrderItemVo();
		orderItemVo.setOrder_item_id(orderItem.getOrder_item_id());
		orderItemVo.setOpen_id(orderItem.getOpen_id());
		orderItemVo.setFood_id(orderItem.getFood_id());
		orderItemVo.setFood_name(orderItem.getFood_name());
		orderItemVo.setFood_img(orderItem.getFood_img());
		orderItemVo.setFood_price(orderItem.getFood_price());
		orderItemVo.setFood_num(orderItem.getFood_num());
		orderItemVo.setTotal_price(orderItem.getTotal_price());
		return orderItemVo;
	}
}
