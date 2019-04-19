package com.wx.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wx.pojo.Admin;
import com.wx.result.JsonResult;
import com.wx.service.IUserService;
import com.wx.util.Common;
import com.wx.util.TokenCache;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping("/login")
	public JsonResult Login(HttpSession session,String user_name,String pass_word) {
		System.out.println(user_name+","+pass_word);
		if(StringUtils.isBlank(user_name) || StringUtils.isBlank(pass_word)) {
			return JsonResult.error("参数异常");
		}
		//如果guava中没有这个验证码缓存,就说明登录失败
		String code_value=TokenCache.getKey(Common.TO_MAIL);
		if(StringUtils.isBlank(code_value)) {
			return JsonResult.error("验证码已过期!!");
		}
		if(user_name.equals("admin") && code_value.equals(pass_word)) {
			Admin admin=new Admin();
			admin.setUser_name(user_name);
			session.setMaxInactiveInterval(1800);
			session.setAttribute(Common.CURRENT_USER,admin);
			System.out.println("登录成功!!");
			return JsonResult.ok(admin);
		}else {
			return JsonResult.error("验证不通过!!");
		}
	}
	
	@RequestMapping("/code")
	public JsonResult code() {
		iUserService.toMail();
		return JsonResult.ok();
	}
	
	@RequestMapping("/logout")
	public JsonResult exit(HttpSession session) {
		session.removeAttribute(Common.CURRENT_USER);
		return JsonResult.ok();
	}
	
	@RequestMapping("/info")
	public JsonResult info(HttpSession session) {
		if(session.getAttribute(Common.CURRENT_USER)!=null) {
			return JsonResult.ok(session.getAttribute(Common.CURRENT_USER));
		}else {
			return JsonResult.error("当前用户未登录!!");
		}
	}
}
