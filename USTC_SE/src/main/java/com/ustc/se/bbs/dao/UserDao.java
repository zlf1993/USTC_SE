package com.ustc.se.bbs.dao;

import com.ustc.se.bbs.entity.User;

/**
 * 
 * UserDao.java
 * @Author Docki
 * @CreateTime 2017年4月30日
 * @Updater Docki
 * @UpdateTime 2017年4月30日
 *
 */
public interface UserDao {
	/**
	 * 根据userID从数据库表中查询一条数据
	 * @param userID
	 * @return user
	 */
	public User selectUserByUserID(int userID);
	/**
	 * 根据userName从数据库表中查询一条数据
	 * @param userName
	 * @return user
	 */
	public User selectUserByUserName(String userName);
	
	/**
	 * 根据user对象向数据库中插入一条用户记录
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	/**
	 * 根据user对象更新数据库中对应的一条用户记录
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	/**
	 * 根据userID删除数据库中对应的用户记录
	 * @param userID
	 * @return
	 */
	public int deleteUserByUserID(int userID);
	/**
	 * 根据userName删除数据库中对应的用户记录
	 * @param userName
	 * @return
	 */
	public int deleteUserByUserName(int userName);
	
}
