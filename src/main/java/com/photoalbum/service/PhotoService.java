package com.photoalbum.service;

import java.util.List;

import com.photoalbum.model.Photo;
import com.photoalbum.model.User;

public interface PhotoService {
	Photo save(Photo photo);

	List<Photo> findByUser(User user);
	
	Photo findByPhotoId(Long photoId);
	
	List<Photo> findAll();
}
