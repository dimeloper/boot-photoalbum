package com.photoalbum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoalbum.dao.CommentDao;
import com.photoalbum.model.Comment;
import com.photoalbum.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;

	public Comment save(Comment comment) {
		return commentDao.save(comment);
	}

	public Comment findOne(Long commentId) {
		return commentDao.findOne(commentId);
	}

	public List<Comment> findByPhotoId(Long photoId) {
		return commentDao.findByPhotoId(photoId);
	}

}
