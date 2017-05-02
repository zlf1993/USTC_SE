package com.ustc.se.bbs.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;


/**
 * 
 * PostEntity.java
 * @Author Docki
 * @CreateTime 2017年4月30日
 * @Updater Docki
 * @UpdateTime 2017年5月2日
 *
 */
public class Post implements Comparable<Post>{
	private int postID;
	private String postTitle;
	private String postTime;
	private int postHits;
	private String postContent;
	private String postLabel;
	private User user;
	private TreeSet<Comment> postComments;
	private TreeSet<Message> postMessages;
	
	@Override
	public int compareTo(Post post) {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		int res = 0;
		try {
			Date postTime1 = df.parse(this.getPostTime());
			Date postTime2 = df.parse(post.getPostTime());
			res = postTime2.compareTo(postTime1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}




	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostTime() {
		return postTime;
	}

	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}

	public int getPostHits() {
		return postHits;
	}

	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostLabel() {
		return postLabel;
	}

	public void setPostLabel(String postLabel) {
		this.postLabel = postLabel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}




	public TreeSet<Comment> getPostComments() {
		return postComments;
	}




	public void setPostComments(TreeSet<Comment> postComments) {
		this.postComments = postComments;
	}




	public TreeSet<Message> getPostMessages() {
		return postMessages;
	}




	public void setPostMessages(TreeSet<Message> postMessages) {
		this.postMessages = postMessages;
	}
	
	
	
}
