package com.ustc.se.bbs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.dao.UserDao;
import com.ustc.se.bbs.entity.User;
import com.ustc.se.bbs.service.UserService;

/**
 * 
 * UserServiceImpl.java
 * @Author Docki
 * @CreateTime 2017年5月3日
 * @Updater Docki
 * @UpdateTime 2017年5月3日
 *
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User selectUserByUserID(int userID) {
		User user = userDao.selectUserByUserID(userID);
		return user;
	}

	@Override
	public User selectUserByUserName(String userName) {
		return userDao.selectUserByUserName(userName);
	}

	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUserByUserID(int userID) {
		return userDao.deleteUserByUserID(userID);
	}

	@Override
	public int deleteUserByUserName(String userName) {
		return userDao.deleteUserByUserName(userName);
	}

	@Override
	public boolean userNameCheck(String userName) {
		boolean res = false;
		User user = userDao.selectUserByUserName(userName);
		if(user == null){
			res = true;
		}
		return res;
	}

	@Override
	public boolean loginCheck(String userName, String userPassword) {
		boolean res = false;
		User user = userDao.selectUserByUserName(userName);
		if(userPassword.equals(user.getUserPassword())){
			res = true;
		}
		return res;
	}

}
