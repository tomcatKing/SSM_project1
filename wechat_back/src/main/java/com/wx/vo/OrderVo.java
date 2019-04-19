package com.wx.vo;

import java.math.BigDecimal;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.wx.pojo.Order;
import com.wx.util.Common;
import com.wx.util.DateUtil;

import lombok.Data;

@Data
@JsonSerialize(include=Inclusion.NON_NULL)
public class OrderVo {
	private Integer order_id;
	private Long order_no;
	private String open_id;
	private Integer shipping_id;
	private List<OrderItemVo> orderItemList;
	private ShippingVo shippingVo;
	private BigDecimal payment;
	private String payment_type;
	private String status;
	private String order_desc;
	private String create_time;
	
	public static OrderVo accessmaOrderVo(Order order,
			List<OrderItemVo> orderItemList,
			ShippingVo shippingVo) {
		OrderVo orderVo=new OrderVo();
		orderVo.setOrder_id(order.getOrder_id());
		orderVo.setOrder_no(order.getOrder_no());
		orderVo.setOpen_id(order.getOpen_id());
		orderVo.setShipping_id(order.getShipping_id());
		orderVo.setPayment(order.getPayment());
		orderVo.setOrderItemList(orderItemList);
		orderVo.setShippingVo(shippingVo);
		orderVo.setPayment_type(
				Common.PaymentTypeEnum.codeOf(order.getPayment_type()).getValue());
		orderVo.setStatus(
				Common.OrderStatusEnum.codeOf(order.getStatus()).getValue());
		orderVo.setOrder_desc(order.getOrder_desc());
		orderVo.setCreate_time(DateUtil.dateToString(order.getCreate_time()));
		return orderVo;
	}
}
