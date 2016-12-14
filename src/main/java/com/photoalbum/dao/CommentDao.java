package com.photoalbum.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.photoalbum.model.Comment;

public interface CommentDao extends CrudRepository<Comment, Long> {

	Comment save(Comment comment);
	
	Comment findOne(Long commentId);
	
	List<Comment> findByPhotoId(Long photoId);
	
}
