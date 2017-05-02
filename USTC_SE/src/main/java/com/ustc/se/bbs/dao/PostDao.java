package com.ustc.se.bbs.dao;

import java.util.TreeSet;

import org.apache.ibatis.annotations.Param;

import com.ustc.se.bbs.entity.Post;

/**
 * 
 * PostDao.java
 * @Author Docki
 * @CreateTime 2017年4月30日
 * @Updater Docki
 * @UpdateTime 2017年4月30日
 *
 */
public interface PostDao {

	/**
	 * 根据postID从数据库中查询对应的记录
	 * @param postID
	 * @return post
	 */
	public Post selectPostByPostID(int postID);
	/**
	 * 按照日期倒序（即postID倒序）查询出所有的发帖信息
	 * @return TreeSet<Post>
	 */
	public TreeSet<Post> selectAllPost();
	/**
	 * 根据userID查询某一用户的发帖信息
	 * @param userID
	 * @return TreeSet<Post>
	 */
	public TreeSet<Post> selectPostByUserID(int userID);
	/**
	 * 根据起始位置startIndex和size按逆序（即postID倒序）查询一定数量的发帖信息
	 * @param startIndex
	 * @param size
	 * @return TreeSet<Post>
	 */
	public TreeSet<Post> selectPostByIndex(@Param("startIndex") int startIndex, @Param("size") int size);
	/**
	 * 根据post向发帖表插入一条数据
	 * @param post
	 * @return
	 */
	public int addPost(Post post);
	/**
	 * 根据post更新发帖表中的一条数据
	 * @param post
	 * @return
	 */
	public int updatePost(Post post);
	/**
	 * 根据postID删除发帖表中的一条数据
	 * @param postID
	 * @return
	 */
	public int deletePostByPostID(int postID);
	/**
	 * 根据postTitle和userID删除对应的一条发帖数据
	 * @param postTitle
	 * @param userID
	 * @return
	 */
	public int deletePostByPostTitleAndUserID(@Param("postTitle") int postTitle, @Param("userID") int userID);
	/**
	 * 删除数据库中发帖时间小于postTime的数据(即删除postTime之前的所有发帖)
	 * @param postTime
	 * @return
	 */
	public int deletePostByPostTime(String postTime);
}
