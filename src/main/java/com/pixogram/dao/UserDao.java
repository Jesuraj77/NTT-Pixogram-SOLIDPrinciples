package com.pixogram.dao;

import java.util.List;

import com.pixogram.models.Content;
import com.pixogram.models.Feedback;
import com.pixogram.models.Followers;
import com.pixogram.models.LogActivities;
import com.pixogram.models.User;

public interface UserDao {
	
	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String password);
	User getProfile(int userId);
	boolean updateProfile(User user);
	boolean deleteProfile(int userId);
	boolean addComment(Feedback feedback);
	boolean followUser(int userId,int senderId);
	List<Followers>followList(int userId);
	boolean  hideMedia(String imagePath,boolean visibility,String videoPath);
    List<LogActivities> activityLog(int userId);
    User getUserById(int userId);
    List<Content> getContentByUser(int userId);


}
