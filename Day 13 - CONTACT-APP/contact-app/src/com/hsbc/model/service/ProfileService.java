package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.Profile;

public interface ProfileService {
	
	public Profile login(int profileId, String password) throws AuthenticationException;
	public Profile registerProfile(Profile profile);
	public Profile getProfileById(int id);
	public Profile updateProfile(Profile profile);
	public Contact addContact(int id, Contact contact);
	public List<Contact> viewAllContacts(int id);
	public Contact editContacts(Contact contact);
	
	public void deleteContact(Contact contact);
	public void deleteProfile(Profile profile);
	
	

}
