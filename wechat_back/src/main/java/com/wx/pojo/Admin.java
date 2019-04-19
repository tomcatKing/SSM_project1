package com.wx.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import lombok.Data;

@Data
@JsonSerialize(include=Inclusion.NON_NULL)
public class Admin {
	private String user_name;
	private String pass_word;
}
