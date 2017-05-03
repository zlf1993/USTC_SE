/**
 * adsfafaddfasdfadfaf
 */
package com.ustc.se.bbs.dao;

import java.util.TreeSet;

import org.apache.ibatis.annotations.Param;

import com.ustc.se.bbs.entity.Reply;

/**
 * ReplyDao.java
 * @Author zlf1993
 * @CreatTime 2017年5月1号
 * @Updater Docki
 * @UpdateTime 2017年5月2号
 *
 */
public interface ReplyDao {
	/**
	 * 根据Reply向从数据库中插入记录
	 * @param reply
	 * @return 
	 */
	public int addReply(Reply reply);
	/**
	 * 根据ReplyID查询对应的Reply
	 * @param replyID
	 * @return Reply
	 */
	public Reply selectReplyByReplyID(int  replyID);
	/**
	 * 根据CommentID查询这个comment下的所有Reply
	 * @param commentID
	 * @return TreeSet<Reply>
	 */
	public TreeSet<Reply> selectReplyByCommentID(int commentID);
	/**
	 * 用于分页显示回复，根据commentID查询某一帖子的回帖，每次查询从startIndex开始查询size数量的回复信息
	 * @param commentID
	 * @param startIndex
	 * @param size
	 * @return TreeSet<Reply>
	 */
	public TreeSet<Reply> selectReplyByCommentIDAndIndex(@Param("commentID") int commentID, @Param("startIndex") int startIndex, @Param("size") int size);
	/**
	 * 更新一条reply
	 * @param reply
	 * @return
	 */
	public int updateReply(Reply reply);
	/**
	 * 根据replyID删除一条回复记录
	 * @param ReplyID
	 * @return
	 */
	public int deleteReplyByReplyID(int replyID);
}
