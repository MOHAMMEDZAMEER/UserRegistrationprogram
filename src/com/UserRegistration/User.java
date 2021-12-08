package com.UserRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	/*** UC-1 :- As a User need to enter a valid First Name. ***/
	
	final String FIRST_NAME = "^[A-Z][a-z]{3,}$" ; //User FirstName Start caps
	
	public void FirstName(String name){
		
		Pattern pattern = Pattern.compile(FIRST_NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
				
		}
	
	 }

