package com.ustc.se.bbs.serviceimpl;

import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.dao.PostDao;
import com.ustc.se.bbs.entity.Post;
import com.ustc.se.bbs.service.PostService;

/**
 * 
 * PostServiceImpl.java
 * @Author Docki
 * @CreateTime 2017年5月3日
 * @Updater Docki
 * @UpdateTime 2017年5月3日
 *
 */
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao postDao;
	
	@Override
	public Post selectPostByPostID(int postID) {
		return postDao.selectPostByPostID(postID);
	}

	@Override
	public TreeSet<Post> selectAllPost() {
		return postDao.selectAllPost();
	}

	@Override
	public TreeSet<Post> selectPostByUserID(int userID) {
		return postDao.selectPostByUserID(userID);
	}

	@Override
	public TreeSet<Post> selectPostByIndex(int startIndex, int size) {
		return postDao.selectPostByIndex(startIndex, size);
	}

	@Override
	public int addPost(Post post) {
		return postDao.addPost(post);
	}

	@Override
	public int updatePost(Post post) {
		return postDao.updatePost(post);
	}

	@Override
	public int deletePostByPostID(int postID) {
		return postDao.deletePostByPostID(postID);
	}

	@Override
	public int deletePostByPostTitleAndUserID(int postTitle, int userID) {
		return postDao.deletePostByPostTitleAndUserID(postTitle, userID);
	}

	@Override
	public int deletePostByPostTime(String postTime) {
		return postDao.deletePostByPostTime(postTime);
	}

}
