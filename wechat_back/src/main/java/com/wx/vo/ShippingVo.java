package com.wx.vo;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.wx.pojo.Shipping;

import lombok.Data;

@Data
@JsonSerialize(include=Inclusion.NON_NULL)
public class ShippingVo {
	private Integer shipping_id;
	private String open_id;
	private String receiver_name;
	private String receiver_phone;
	private String receiver_province;
	private String receiver_city;
	private String receiver_district;
	private String receiver_address;
	
	public static ShippingVo accessShippingVo(Shipping shipping) {
		ShippingVo shippingVo=new ShippingVo();
		shippingVo.setShipping_id(shipping.getShipping_id());
		shippingVo.setOpen_id(shipping.getOpen_id());
		shippingVo.setReceiver_name(shipping.getReceiver_name());
		shippingVo.setReceiver_phone(shipping.getReceiver_phone());
		shippingVo.setReceiver_province(shipping.getReceiver_province());
		shippingVo.setReceiver_city(shipping.getReceiver_city());
		shippingVo.setReceiver_district(shipping.getReceiver_district());
		shippingVo.setReceiver_address(shipping.getReceiver_address());
		return shippingVo;
	}
}
