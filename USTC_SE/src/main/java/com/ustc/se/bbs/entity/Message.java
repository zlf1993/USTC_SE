/**
 * adsfafaddfasdfadfaf
 */
package com.ustc.se.bbs.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Message.java
 * @Author zlf1993
 * @CreateTime 2017年4月30号
 * @Updater zlf1993
 * @UpdateTime 2017年4月30号
 *
 */
public class Message implements Comparable<Message>{
	private int messageID;
	private int userID;
	private int commentID;
	private String messageSendName;
	private String messageTime;
	private String messageUnread;
	private User user;
	private Comment comment;
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Message message) {
		int res = 0;
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		try {
			Date messageTime1 = df.parse(this.getMessageTime());
			Date messageTime2 = df.parse(message.getMessageTime());
			res = messageTime1.compareTo(messageTime2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Comment getComment() {
		return comment;
	}


	public void setComment(Comment comment) {
		this.comment = comment;
	}


	public int getMessageID() {
		return messageID;
	}
	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public String getMessageSendName() {
		return messageSendName;
	}
	public void setMessageSendName(String messageSendName) {
		this.messageSendName = messageSendName;
	}
	public String getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}
	public String getMessageUnread() {
		return messageUnread;
	}
	public void setMessageUnread(String messageUnread) {
		this.messageUnread = messageUnread;
	}
	

}
