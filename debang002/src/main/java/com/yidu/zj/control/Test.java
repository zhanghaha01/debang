/*package com.yidu.zj.control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yidu.zj.bean.AfterUser;
import com.yidu.zj.services.imp.AfterUserServicesImp;

@Controller
public class Test {
	@Autowired
	private AfterUserServicesImp user;
	@RequestMapping("/insertAfterUser.do")
	public ModelAndView selectAfterUser(AfterUser u,HttpServletRequest request){
		ModelAndView mav=new ModelAndView();
		u.setUserId(UUID.randomUUID().toString());
		u.setLastLoginTime(new SimpleDateFormat("yyyy-mm-ss HH:ss").format(new Date()));
		user.insertAfterUser(u);
		mav.setViewName("index.jsp");
		return mav;
	}
}
*/