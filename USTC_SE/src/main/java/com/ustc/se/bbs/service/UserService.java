package com.ustc.se.bbs.service;

import com.ustc.se.bbs.entity.User;

/**
 * 
 * UserService.java
 * @Author Docki
 * @CreateTime 2017年5月3日
 * @Updater Docki
 * @UpdateTime 2017年5月3日
 *
 */
public interface UserService {
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
	public int deleteUserByUserName(String userName);
	/**
	 * 检查userName是否被使用过
	 * @param userName
	 * @return userName被使用过返回false,未被使用返回true
	 */
	public boolean userNameCheck(String userName);
	/**
	 * 检查用户登录是否成功(即用户名、密码是否正确)
	 * @param userName
	 * @param userPassword
	 * @return 登录成功返回true, 否则返回false
	 */
	public boolean loginCheck(String userName, String userPassword);

}
