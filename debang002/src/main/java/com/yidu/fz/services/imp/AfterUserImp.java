package com.yidu.fz.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.fz.bean.AfterUser;
import com.yidu.fz.dao.AfterUserDao;
import com.yidu.fz.services.AfterUserServices;

@Service
public class AfterUserImp implements AfterUserServices{
	@Autowired
	private AfterUserDao au;
	public List<AfterUser> select_AfterUser() {
		List<AfterUser> list=au.selectUser();
	
		return list;
	}
	
}
