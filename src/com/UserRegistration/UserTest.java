package com.UserRegistration;

import java.util.Scanner;

public class UserTest {

	/*****Main Method****/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("-------Wellcome to UserRegistration-------");
		System.out.print("Enter User FullName:");
		String  name = z.nextLine();
		//Function calling for 
		User FullName = new User();
		FullName.FULLNAME(name);
			
			z.close();
		
	}

}
