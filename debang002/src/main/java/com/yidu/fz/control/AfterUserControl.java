package com.yidu.fz.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.fz.services.imp.AfterUserImp;
import com.yidu.fz.bean.AfterUser;
@Controller
public class AfterUserControl {
	@Autowired
	private AfterUserImp aui;
	@RequestMapping("AfterUser.do")
	public @ResponseBody Map<String, Object> AfterUser(){
		List<AfterUser> list=aui.select_AfterUser();
		Map<String, Object> map=new HashMap<String, Object>(); 
		map.put("page", 1);
		map.put("limit", 10);
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 10);
		map.put("data", list);
		return map;		
}
}
