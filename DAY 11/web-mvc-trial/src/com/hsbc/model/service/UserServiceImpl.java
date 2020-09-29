package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.util.UserFactory;

public class UserServiceImpl implements UserService {

	private UserDao userDao = null;
	public UserServiceImpl() {
		userDao = (UserDao)UserFactory.getInstance("dao");
	}
	@Override
	public User login(int userId, String password) throws AuthenticationException {
		User user = userDao.authenticate(userId, password);
		if(user == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return user;
	}


	@Override
	public User createUser(User user) {
		User createdUser = userDao.store(user);
		return createdUser;
	}

	@Override
	public User updatePhone(int userId, long phone) {
		User user = getUser(userId);
		user.setPhone(phone);
		return userDao.updateUser(userId, user);
		
		
	}

	@Override
	public User updatePassword(int userId, String password) {
		User user = getUser(userId);
		user.setPassword(password);
		return userDao.updateUser(userId, user);
	}

	@Override
	public User getUser(int userId) {
		
		return null;
	}

	@Override
	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		return userDao.fetchAllUsers();
	}

}
