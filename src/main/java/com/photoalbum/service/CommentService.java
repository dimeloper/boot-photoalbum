package com.photoalbum.service;

import java.util.List;

import com.photoalbum.model.Comment;

public interface CommentService {

	Comment save(Comment comment);

	Comment findOne(Long commentId);

	List<Comment> findByPhotoId(Long photoId);

}
