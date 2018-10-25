/*package com.yidu.zj.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yidu.zj.bean.AfterUser;
import com.yidu.zj.services.imp.AfterUserServicesImp;

@Controller
public class AfterUserControl {
	@Autowired
	private AfterUserServicesImp user;
	@RequestMapping("/selectAfterUser.do")
	public ModelAndView selectAfterUser(AfterUser u,HttpServletRequest request){
		ModelAndView mav=new ModelAndView();
		HttpSession session= request.getSession();
		if(user.selectUser(u)!=null||(session.getAttribute("userName")!=null&&session.getAttribute("userPassword")!=null)){
			session.setAttribute("userName", u.getUserName());
			session.setAttribute("userPassword", u.getUserPassword());
			session.setMaxInactiveInterval(10*60);
			mav.setViewName("selectAllMenu.do");
			return mav;
		}else{
			mav.setViewName("index.jsp");
			return mav;
		}
	}
}
*/