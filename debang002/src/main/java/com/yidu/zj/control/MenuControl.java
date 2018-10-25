/*package com.yidu.zj.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yidu.zj.bean.MenuBean;
import com.yidu.zj.services.imp.MenuServicesImp;

@Controller
public class MenuControl {
	@Autowired
	private MenuServicesImp menu;
	*//**
	 * 查询菜单
	 * @param request
	 * @return
	 *//*
	@RequestMapping("/selectAllMenu.do")
	public ModelAndView selectAllPro(HttpServletRequest request){
		HttpSession session=request.getSession();
		ModelAndView mav=new ModelAndView();
		if(session.getAttribute("phone")==null){
			mav.setViewName("login.jsp");
		}else{
			List<MenuBean> list=menu.selectAllMenu();
			mav.addObject("menuList", list);
			mav.setViewName("layouts.jsp");
		}
		return mav;
	}
}
*/