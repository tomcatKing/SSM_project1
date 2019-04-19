package com.wx.pojo;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class Food {
	private Integer food_id;
	private Integer food_type;
	private String food_name;
	private String food_img;
	private String food_detail;
	private BigDecimal food_price;
	private Integer food_count;
	private Integer food_status;
	private Date create_time;
	private Date update_time;

}
