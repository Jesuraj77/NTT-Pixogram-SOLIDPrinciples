package com.pixogram.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pixogram.models.Content;
import com.pixogram.models.Feedback;
import com.pixogram.models.Followers;
import com.pixogram.models.LogActivities;
import com.pixogram.models.User;

@Component

public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean resetPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public User getProfile(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean updateProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean deleteProfile(int userId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean addComment(Feedback feedback) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean followUser(int userId, int senderId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public List<Followers> followList(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean hideMedia(String imagePath, boolean visibility, String videoPath) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public List<LogActivities> activityLog(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Content> getContentByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
