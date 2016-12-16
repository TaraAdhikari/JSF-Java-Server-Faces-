package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFour {

	private String firstName;
	private String lastName;
	
	//since user can select multiple languages
	// we need an array of strings
	
	private String[] favouriteLanguages;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getFavouriteLanguages() {
		return favouriteLanguages;
	}

	public void setFavouriteLanguages(String[] favouriteLanguages) {
		this.favouriteLanguages = favouriteLanguages;
	}
	 
	
}
