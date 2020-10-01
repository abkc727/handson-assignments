package com.hsbc.model.beans;

public class Profile {
	private int profileId;
	private String name;
	private String password;
	private long phone;
	private String dob;
	
	
	
	public int getProfileId() {
		return profileId;
	}



	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", password=" + password + ", phone=" + phone
				+ ", dob=" + dob + "]";
	}
	
	

}
