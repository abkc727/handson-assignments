package com.hsbc.model.dao;



import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.User;

public class CollectionBackedUserDao implements UserDao {
	
	// create a ArrayList with List reference
	
	List<User> list = new ArrayList<User>();
	
	  

    // Object[] objects = list.toArray(); 
	@Override
	public User store(User user) {
		// TODO Auto-generated method stub
		list.add(user);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		// TODO Auto-generated method stub
		User[] allUsers = list.toArray(new User[list.size()]);
		//allUsers=list.toArray(allUsers);
		return allUsers;
	}

	
	  
	@Override
	public User fetchUserById(int userId) {
		User user = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUserId() == userId) { 
				user = list.get(i);
				return user;
			}
		}
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUserId()==userId) {
				list.set(i,user);
			}
		}
		return user;
	}

}
