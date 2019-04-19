package com.wx.util;


public class Common {
	public static final String CURRENT_USER="current_user";
	public static final String TO_MAIL="15113437287@163.com";

	public enum FoodTypeEnum{
    	TIANSHI(1,"甜食"),
    	GUAGUO(2,"瓜果"),
    	DANGAO(3,"蛋糕"),
    	YINLIAO(4,"饮料");
		FoodTypeEnum(int code,String value){
    		this.code=code;
    		this.value=value;
    	}
    	private String value;
    	private int code;
		public String getValue() {
			return value;
		}
		public int getCode() {
			return code;
		}	
		
		//订单状态  orderVo orderStatus
	    public static FoodTypeEnum codeOf(int code) {
	    	for(FoodTypeEnum orderStatusEnum:values()) {
	    		//如果遍历到了这个枚举,就返回
	    		if(orderStatusEnum.getCode()==code) {
	    			return orderStatusEnum;
	    		}
	    	}
	    	throw new RuntimeException("没有找到对应的枚举");
	    }
    }
	
	public enum FoodStatusEnum{
    	ZAISHOU(1,"在售"),
    	XIAJIA(2,"下架"),
    	SHANCHU(3,"删除");
		FoodStatusEnum(int code,String value){
    		this.code=code;
    		this.value=value;
    	}
    	private String value;
    	private int code;
		public String getValue() {
			return value;
		}
		public int getCode() {
			return code;
		}	
		
		//订单状态  orderVo orderStatus
	    public static FoodStatusEnum codeOf(int code) {
	    	for(FoodStatusEnum orderStatusEnum:values()) {
	    		//如果遍历到了这个枚举,就返回
	    		if(orderStatusEnum.getCode()==code) {
	    			return orderStatusEnum;
	    		}
	    	}
	    	throw new RuntimeException("没有找到对应的枚举");
	    }
    }
	
	public enum PaymentTypeEnum{
    	ZAIXIAN(1,"在线支付");
		PaymentTypeEnum(int code,String value){
    		this.code=code;
    		this.value=value;
    	}
    	private String value;
    	private int code;
		public String getValue() {
			return value;
		}
		public int getCode() {
			return code;
		}	
		
		//订单状态  orderVo orderStatus
	    public static PaymentTypeEnum codeOf(int code) {
	    	for(PaymentTypeEnum orderStatusEnum:values()) {
	    		//如果遍历到了这个枚举,就返回
	    		if(orderStatusEnum.getCode()==code) {
	    			return orderStatusEnum;
	    		}
	    	}
	    	throw new RuntimeException("没有找到对应的枚举");
	    }
    }
	
	public enum OrderStatusEnum{
		CANCELED(0,"已取消"),
    	NO_PAY(10,"未支付"),
    	PAID(20,"已付款"),
    	SHIPPED(40,"已发货"),
    	ORDER_SUCCESS(50,"订单完成"),
    	ORDER_CLOSE(60,"订单关闭");
		OrderStatusEnum(int code,String value){
    		this.code=code;
    		this.value=value;
    	}
		private String value;
    	private int code;
		public String getValue() {
			return value;
		}
		public int getCode() {
			return code;
		}	
		//订单状态  orderVo orderStatus
	    public static OrderStatusEnum codeOf(int code) {
	    	for(OrderStatusEnum orderStatusEnum:values()) {
	    		//如果遍历到了这个枚举,就返回
	    		if(orderStatusEnum.getCode()==code) {
	    			return orderStatusEnum;
	    		}
	    	}
	    	throw new RuntimeException("没有找到对应的枚举");
	    }
	}
    
}
