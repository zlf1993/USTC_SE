package com.ustc.se.bbs.serviceimpl;

import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.dao.CommentDao;
import com.ustc.se.bbs.entity.Comment;
import com.ustc.se.bbs.service.CommentService;

public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public Comment selectCommentByCommentID(int commentID) {
		return commentDao.selectCommentByCommentID(commentID);
	}

	@Override
	public TreeSet<Comment> selectCommentByPostID(int postID) {
		return commentDao.selectCommentByPostID(postID);
	}

	@Override
	public TreeSet<Comment> selectCommentByPostIDAndIndex(int postID, int startIndex, int size) {
		return commentDao.selectCommentByPostIDAndIndex(postID, startIndex, size);
	}

	@Override
	public TreeSet<Comment> selectCommentByPostIDAndUserID(int postID, int userID) {
		return commentDao.selectCommentByPostIDAndUserID(postID, userID);
	}

	@Override
	public TreeSet<Comment> selectCommentByUserID(int userID) {
		return commentDao.selectCommentByUserID(userID);
	}

	@Override
	public int addComment(Comment comment) {
		return commentDao.addComment(comment);
	}

	@Override
	public int updateComment(Comment comment) {
		return commentDao.updateComment(comment);
	}

	@Override
	public int deleteCommentByCommentID(int commentID) {
		return commentDao.deleteCommentByCommentID(commentID);
	}

	@Override
	public int deleteCommentByUserID(int userID, int postID) {
		return commentDao.deleteCommentByUserID(userID, postID);
	}

}
