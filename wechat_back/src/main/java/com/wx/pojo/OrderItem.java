package com.wx.pojo;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data //此注解将自动生成get/setter方法
public class OrderItem {
    private Integer order_item_id;
    private String open_id;
    private Long order_no;
    private Integer food_id;
    private String food_name;
    private String food_img;
    private BigDecimal food_price;
    private Integer food_num;
    private BigDecimal total_price;
    private Date create_time;
    private Date update_time;

}