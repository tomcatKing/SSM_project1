package com.wx.pojo;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data //此注解将自动生成get/setter方法
public class Order {
    private Integer order_id;
    private Long order_no;
    private String open_id;
    private Integer shipping_id;
    private BigDecimal payment;
    private Integer payment_type;
    private Integer status;
    private String order_desc;
    private Date payment_time;
    private Date send_time;
    private Date end_time;  
    private Date close_time;  
    private Date create_time;
    private Date update_time;
}