package com.wx.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wx.result.JsonResult;
import com.wx.util.Common;
/**
 * 全局异常拦截
 * @author admin
 *
 */
public class GlobalHandler implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("拦截器开始工作!!");
		HttpSession session=request.getSession();
		System.out.println(session.getAttribute(Common.CURRENT_USER));
		if(session.getAttribute(Common.CURRENT_USER)==null) {
			System.out.println("请求不放行");
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=UTF-8");
			PrintWriter out=response.getWriter();
			JsonResult jsonResult=JsonResult.error("当前用户未登录");
			out.print(jsonResult);
			return false;
		}else {
			System.out.println("请求放行,用户请求["+request.getServletPath()+","+request.getQueryString()+"]");
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
