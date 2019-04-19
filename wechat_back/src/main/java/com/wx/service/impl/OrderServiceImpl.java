package com.wx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.wx.dao.OrderItemMapper;
import com.wx.dao.OrderMapper;
import com.wx.dao.ShippingMapper;
import com.wx.pojo.Order;
import com.wx.pojo.OrderItem;
import com.wx.pojo.Shipping;
import com.wx.result.JsonResult;
import com.wx.service.IOrderService;
import com.wx.vo.OrderItemVo;
import com.wx.vo.OrderVo;
import com.wx.vo.ShippingVo;

@Service
public class OrderServiceImpl implements IOrderService {
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private OrderItemMapper orderItemMapper;
	@Autowired
	private ShippingMapper shippingMapper;
	
	@Override
	public JsonResult list(String keyword,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Order> orderList=Lists.newArrayList();
		if(keyword==null || keyword.trim()=="") {
			orderList=orderMapper.orderList();
		}else {
			orderList=orderMapper.searchList("%"+keyword+"%");
		}
		PageInfo pageResult=new PageInfo(orderList);
		List<OrderVo> orderVoList=Lists.newArrayList();
		for (Order order : orderList) {
			List<OrderItem> orderItemList=orderItemMapper.getOrderItemByOrderNo(order.getOrder_no());
			List<OrderItemVo> orderItemVoList=accessOrderItemVo(orderItemList);
			Shipping shipping=shippingMapper.getShippingByShippingId(order.getShipping_id());
			ShippingVo shippingVo=ShippingVo.accessShippingVo(shipping);
			orderVoList.add(OrderVo.accessmaOrderVo(order, orderItemVoList, shippingVo));
		}
		pageResult.setList(orderVoList);
		return JsonResult.ok(pageResult);
	}

	@Override
	public JsonResult detail(Long order_no) {
		Order order=orderMapper.getOrder(order_no);
		List<OrderItem> orderItemList=orderItemMapper.getOrderItemByOrderNo(order.getOrder_no());
		List<OrderItemVo> orderItemVoList=accessOrderItemVo(orderItemList);
		Shipping shipping=shippingMapper.getShippingByShippingId(order.getShipping_id());
		ShippingVo shippingVo=ShippingVo.accessShippingVo(shipping);
		OrderVo orderVo=OrderVo.accessmaOrderVo(order, orderItemVoList,shippingVo);
		return JsonResult.ok(orderVo);
	}
	
	private List<OrderItemVo> accessOrderItemVo(List<OrderItem> orderItemList){
		List<OrderItemVo> orderItemVoList=Lists.newArrayList();
		for (OrderItem orderItem : orderItemList) {
			orderItemVoList.add(OrderItemVo.accessOrderItemVO(orderItem));
		}
		return orderItemVoList;
	}
}
