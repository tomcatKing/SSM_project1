package com.wx.service.impl;

import org.springframework.stereotype.Service;

import com.wx.service.IUserService;
import com.wx.util.Common;
import com.wx.util.MailUtil;

@Service
public class UserServiceImpl implements IUserService{
	
	@Override
	public void toMail() {
		MailUtil.send_mail(Common.TO_MAIL);
	}
	
}
