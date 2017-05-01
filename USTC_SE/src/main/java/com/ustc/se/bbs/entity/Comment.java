package com.ustc.se.bbs.entity;

import java.util.TreeSet;

/**
 * 
 * Comment.java
 * @Author zlf1993
 * @CreateTime 2017年4月30号
 * @Updater Docki
 * @UpdateTime 2017年5月1号
 *
 */

public class Comment implements Comparable<Comment>{
	private int commentID;
	private int postID;
	private int userID;
	private String commentFloor;
	private String commentTime;
	private String commentContent;
	private Post post;
	private User user;
	private TreeSet<Reply> commentReply;
	private TreeSet<Message> commentMessage;
	
	@Override
	public int compareTo(Comment comment) {
		return this.getCommentID() - comment.getCommentID();
	}

	
	public Post getPost() {
		return post;
	}


	public void setPost(Post post) {
		this.post = post;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getCommentFloor() {
		return commentFloor;
	}

	public void setCommentFloor(String commentFloor) {
		this.commentFloor = commentFloor;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public TreeSet<Reply> getCommentReply() {
		return commentReply;
	}

	public void setCommentReply(TreeSet<Reply> commentReply) {
		this.commentReply = commentReply;
	}

	public TreeSet<Message> getCommentMessage() {
		return commentMessage;
	}

	public void setCommentMessage(TreeSet<Message> commentMessage) {
		this.commentMessage = commentMessage;
	}
		
}
