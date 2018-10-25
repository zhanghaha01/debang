package com.yidu.fz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yidu.fz.bean.AfterUser;
@Repository
public interface AfterUserDao {
	/**
	 * 查询所有的方法
	 * @param u
	 * @return
	 */
	public List<AfterUser> selectUser();	
}
