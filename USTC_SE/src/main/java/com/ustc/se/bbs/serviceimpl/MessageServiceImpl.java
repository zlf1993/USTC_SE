package com.ustc.se.bbs.serviceimpl;

import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.dao.MessageDao;
import com.ustc.se.bbs.entity.Message;
import com.ustc.se.bbs.service.MessageService;

public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageDao messageDao;
	
	@Override
	public Message selectMessageByMessageID(int messageID) {
		return messageDao.selectMessageByMessageID(messageID);
	}

	@Override
	public TreeSet<Message> selectAllMessage() {
		return messageDao.selectAllMessage();
	}

	@Override
	public TreeSet<Message> selectMessageByUserID(int userID) {
		return messageDao.selectMessageByUserID(userID);
	}

	@Override
	public TreeSet<Message> selectMessageByPostID(int postID) {
		return messageDao.selectMessageByPostID(postID);
	}

	@Override
	public TreeSet<Message> selectMessageByReadStatus(int massageunread) {
		return messageDao.selectMessageByReadStatus(massageunread);
	}

	@Override
	public int addMessage(Message message) {
		return messageDao.addMessage(message);
	}

	@Override
	public int updateMessage(Message message) {
		return messageDao.updateMessage(message);
	}

	@Override
	public int deleteMessageByMeaasgeID(int messageID) {
		return messageDao.deleteMessageByMeaasgeID(messageID);
	}

	@Override
	public int deleteMessageByTime(String messageTime) {
		return messageDao.deleteMessageByTime(messageTime);
	}

	@Override
	public int deleteMessageUnread(int messageUnread) {
		return messageDao.deleteMessageUnread(messageUnread);
	}

}
