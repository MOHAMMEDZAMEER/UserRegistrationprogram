package com.UserRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	/*** UC-1 :- As a User need to enter a valid FullName. ***/
	
	 final String FullName= "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";//User Enter FullName Starting with Caps

	public void FULLNAME(String name){
		
		Pattern pattern = Pattern.compile(FullName);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
				
		}
	
	 }

