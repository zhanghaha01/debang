package com.yidu.fz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yidu.fz.bean.AfterUser;

@Service
public interface AfterUserServices {
	/**
	 * 查询所有
	 * @return
	 */
	public List<AfterUser> select_AfterUser();
}
