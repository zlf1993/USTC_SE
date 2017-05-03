package com.ustc.se.bbs.serviceimpl;

import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.dao.ReplyDao;
import com.ustc.se.bbs.entity.Reply;
import com.ustc.se.bbs.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyDao replyDao;
	
	@Override
	public int addReply(Reply reply) {
		return replyDao.addReply(reply);
	}

	@Override
	public Reply selectReplyByReplyID(int replyID) {
		return replyDao.selectReplyByReplyID(replyID);
	}

	@Override
	public TreeSet<Reply> selectReplyByCommentID(int commentID) {
		return replyDao.selectReplyByCommentID(commentID);
	}

	@Override
	public TreeSet<Reply> selectReplyByCommentIDAndIndex(int commentID, int startIndex, int size) {
		return replyDao.selectReplyByCommentIDAndIndex(commentID, startIndex, size);
	}

	@Override
	public int updateReply(Reply reply) {
		return replyDao.updateReply(reply);
	}

	@Override
	public int deleteReplyByReplyID(int replyID) {
		return replyDao.deleteReplyByReplyID(replyID);
	}

}
