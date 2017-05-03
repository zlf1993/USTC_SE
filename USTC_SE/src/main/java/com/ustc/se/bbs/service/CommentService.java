package com.ustc.se.bbs.service;

import java.util.TreeSet;

import com.ustc.se.bbs.entity.Comment;

/**
 * 
 * CommentService.java
 * @Author Docki
 * @CreateTime 2017年5月3日
 * @Updater Docki
 * @UpdateTime 2017年5月3日
 *
 */
public interface CommentService {

	/**
	 * 根据commentID查询一条回帖信息
	 * @param commentID
	 * @return comment
	 */
	public Comment selectCommentByCommentID(int commentID);
	/**
	 * 根据postID查询某一帖子的所有回帖信息
	 * @param postID
	 * @return TreeSet<Comment>
	 */
	public TreeSet<Comment> selectCommentByPostID(int postID);
	/**
	 * 用于分页显示回帖，根据postID查询某一帖子的回帖，每次查询从startIndex开始查询size数量的回帖信息
	 * @param postID
	 * @param startIndex
	 * @param size
	 * @return TreeSet<Comment>
	 */
	public TreeSet<Comment> selectCommentByPostIDAndIndex(int postID, int startIndex, int size);
	/**
	 * 根据postID和userID查询某一发帖中某一用户的所有回帖
	 * @param postID
	 * @param userID
	 * @return
	 */
	public TreeSet<Comment> selectCommentByPostIDAndUserID(int postID, int userID);
	/**
	 * 根据userID查询某一用户的所有回帖
	 * @param userID
	 * @return
	 */
	public TreeSet<Comment> selectCommentByUserID(int userID);
	/**
	 * 根据comment向回帖表插入一条记录
	 * @return
	 */
	public int addComment(Comment comment);
	/**
	 * 根据comment更新一条回帖记录
	 * @param comment
	 * @return
	 */
	public int updateComment(Comment comment);
	/**
	 * 根据commentID删除一条回帖记录
	 * @param commentID
	 * @return
	 */
	public int deleteCommentByCommentID(int commentID);
	/**
	 * 根据userID和postID删除某一帖子中某一用户的所有回帖记录
	 * @param userID postID
	 * @return
	 */
	public int deleteCommentByUserID(int userID, int postID);
}
