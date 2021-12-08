package com.UserRegistration;

import java.util.Scanner;

public class UserTest {

	/*****Main Method****/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("-------Wellcome to UserRegistration-------");
		System.out.print("Enter User FirstName:");
		String  name = z.nextLine();
		
		User firstname = new User();
		firstname.FirstName(name);
			
			z.close();
		
	}

}
