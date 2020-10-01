package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.Profile;

public interface ProfileDao {
	public Profile authenticate(int profileId, String password) throws AuthenticationException;
	public Profile store(Profile profile);
	public Profile fetchProfileById(int id);
	public Profile editProfile(Profile profile);
	
	public Contact storeContact(int id, Contact contact);
	public List<Contact> getContacts(int id);
	public Contact editContact(Contact contact);
	
	public void removeContact(Contact contact);
	public void removeProfile(Profile profile);

}
