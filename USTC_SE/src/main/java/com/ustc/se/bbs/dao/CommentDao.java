package com.ustc.se.bbs.dao;

import java.util.TreeSet;

import com.ustc.se.bbs.entity.Comment;

/**
 * 
 * CommentDao.java
 * @Author Docki
 * @CreateTime 2017年5月1日
 * @Updater Docki
 * @UpdateTime 2017年5月1日
 *
 */
public interface CommentDao {
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
	 * 根据postID和userID
	 * @param postID
	 * @param userID
	 * @return
	 */
	public TreeSet<Comment> selectCommentByPostIDAndUserID(int postID, int userID);
}
