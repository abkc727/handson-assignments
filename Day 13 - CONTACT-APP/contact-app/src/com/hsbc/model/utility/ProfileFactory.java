package com.hsbc.model.utility;

import com.hsbc.model.dao.ProfileDaoImpl;
import com.hsbc.model.service.ProfileServiceImpl;

public class ProfileFactory {
	
	public static Object getInstance(String type) {
		if(type.equals("dao")) {
			return new ProfileDaoImpl();
		}
		if(type.equals("service")) {
			return new ProfileServiceImpl();
		}
		return null;
	}

}
