/**
 * 
 */
package com.ustc.se.bbs.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Reply.java 
 * @author zlf1993
 * @CreateTime 2017年4月30号
 * @Updater Docki
 * @UpdateTime 2017年5月1号
 *
 */
public class Reply implements Comparable<Reply>{
	private int replyID;
	private int commentID;
	private String replySendName;
	private String replyReciveName;
	private String replyTime;
	private String replyContent;
	private Comment comment;
	@Override
	public int compareTo(Reply reply) {
		int res = 0;
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		try {
			Date replyTime1 = df.parse(this.getReplyTime());
			Date replyTime2 = df.parse(reply.getReplyTime());
			res = replyTime2.compareTo(replyTime1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	public Comment getComment() {
		return comment;
	}


	public void setComment(Comment comment) {
		this.comment = comment;
	}


	public int getReplyID() {
		return replyID;
	}
	public void setReplyID(int replyID) {
		this.replyID = replyID;
	}
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public String getReplySendName() {
		return replySendName;
	}
	public void setReplySendName(String replySendName) {
		this.replySendName = replySendName;
	}
	public String getReplyReciveName() {
		return replyReciveName;
	}
	public void setReplyReciveName(String replyReciveName) {
		this.replyReciveName = replyReciveName;
	}
	public String getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	
	
}
