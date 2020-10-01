package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.Profile;
import com.hsbc.model.dao.ProfileDao;
import com.hsbc.model.utility.ProfileFactory;

public class ProfileServiceImpl implements ProfileService {
	
	private ProfileDao profileDao = null;
	

	public ProfileServiceImpl() {
		
		profileDao = (ProfileDao)ProfileFactory.getInstance("dao");
	}

	@Override
	public Profile login(int profileId, String password) throws AuthenticationException {
		
		Profile profile = profileDao.authenticate(profileId, password);
		if(profile == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return profile;
	}

	@Override
	public Profile registerProfile(Profile profile) {
		
		Profile createdProfile = profileDao.store(profile);
		return createdProfile;
	}

	@Override
	public Contact addContact(int id, Contact contact) {
		Contact createdContact = profileDao.storeContact(id, contact);
		return createdContact;
	}

	@Override
	public List<Contact> viewAllContacts(int id) {
		
		return profileDao.getContacts(id);
	}

	@Override
	public Contact editContacts(Contact contact) {
		
		return profileDao.editContact(contact);
	}

	@Override
	public Profile getProfileById(int id) {
		// TODO Auto-generated method stub
		return profileDao.fetchProfileById(id);
	}

	@Override
	public Profile updateProfile(Profile profile) {
		// TODO Auto-generated method stub
		return profileDao.editProfile(profile);
	}

	@Override
	public void deleteContact(Contact contact) {
		profileDao.removeContact(contact);
		
	}

	@Override
	public void deleteProfile(Profile profile) {
		profileDao.removeProfile(profile);
		
	}
	
	
	
	
	

}
