package com.wx.result;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.google.gson.Gson;

@JsonSerialize(include=Inclusion.NON_NULL)
public class JsonResult {
	private Integer code;
	private String msg;
	private Object data;
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private JsonResult(int code,String msg) {
		this.code=code;
		this.msg=msg;
	}
	
	private JsonResult(int code,String msg,Object data) {
		this.code=code;
		this.msg=msg;
		this.data=data;
	}
	
	public JsonResult(Object data) {
		this(200,"ok",data);
	}
	
	
	public static JsonResult ok() {
		return new JsonResult(200,"ok");
	}
	
	public boolean isOk() {
		return this.code==200;
	}
	
	public static JsonResult error() {
		return new JsonResult(400,"error");
	}
	
	public static JsonResult ok(Object data) {
		return new JsonResult(200,"ok",data);
	}
	
	public static JsonResult error(String msg) {
		return new JsonResult(400,msg);
	}

	@Override
	public String toString() {
		Gson gson=new Gson();
		return gson.toJson(this);
	}
	
}
