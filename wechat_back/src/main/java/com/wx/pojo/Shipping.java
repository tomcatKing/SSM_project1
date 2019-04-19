package com.wx.pojo;

import java.util.Date;

import lombok.Data;
@Data //此注解将自动生成get/setter方法
public class Shipping {
    private Integer shipping_id;
    private String open_id;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_province;
    private String receiver_city;
    private String receiver_district;
    private String receiver_address;
    private Date create_time;
    private Date update_time;
}