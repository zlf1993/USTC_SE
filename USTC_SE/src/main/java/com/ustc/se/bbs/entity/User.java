package com.ustc.se.bbs.entity;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * UserEntity.java
 * @Author Docki
 * @CreatTime 2017年4月30日
 * @Updater Docki
 * @UpdateTime 2017年4月30日
 *
 */
public class User {
	private int userID;
	private String userName;
	private String userPassword;
	private String userEmail;
	private int userAge;
	private String userGender;
	private String userHeadPortrait;
	private String userBirth;
	private int userMessageCount;
	private TreeSet<Post> userPosts;
	private TreeSet<Comment> userComments;
	private TreeSet<Message> userMessage;
	
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserHeadPortrait() {
		return userHeadPortrait;
	}
	public void setUserHeadPortrait(String userHeadPortrait) {
		this.userHeadPortrait = userHeadPortrait;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public int getUserMessageCount() {
		return userMessageCount;
	}
	public void setUserMessageCount(int userMessageCount) {
		this.userMessageCount = userMessageCount;
	}
	public TreeSet<Post> getUserPosts() {
		return userPosts;
	}
	public void setUserPosts(TreeSet<Post> userPosts) {
		this.userPosts = userPosts;
	}
	public TreeSet<Comment> getUserComments() {
		return userComments;
	}
	public void setUserComments(TreeSet<Comment> userComments) {
		this.userComments = userComments;
	}
	public TreeSet<Message> getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(TreeSet<Message> userMessage) {
		this.userMessage = userMessage;
	}
	
	

}
