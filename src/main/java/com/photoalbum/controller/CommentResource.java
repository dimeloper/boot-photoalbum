package com.photoalbum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.photoalbum.model.Comment;
import com.photoalbum.model.Photo;
import com.photoalbum.service.CommentService;
import com.photoalbum.service.PhotoService;

@RestController
@RequestMapping("/rest")
public class CommentResource {

	@Autowired
	private PhotoService photoService;

	@Autowired
	private CommentService commentService;

	@RequestMapping(value="/comment/add", method=RequestMethod.POST) 
	public void addComment(@RequestBody Comment comment) {
		Photo photo = photoService.findByPhotoId(comment.getPhotoId());
		//List<Comment> commentList=photo.getCommentList();
		comment.setPhoto(photo);
		commentService.save(comment);
		
	}
}
