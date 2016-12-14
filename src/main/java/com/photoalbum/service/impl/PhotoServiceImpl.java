package com.photoalbum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoalbum.dao.PhotoDao;
import com.photoalbum.model.Photo;
import com.photoalbum.model.User;
import com.photoalbum.service.PhotoService;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoDao photoDao;

	public Photo save(Photo photo) {
		return photoDao.save(photo);
	}

	public List<Photo> findByUser(User user) {
		return photoDao.findByUser(user);
	}

	public Photo findByPhotoId(Long photoId) {
		return photoDao.findByPhotoId(photoId);
	}

	public List<Photo> findAll() {
		return photoDao.findAll();
	}
}
