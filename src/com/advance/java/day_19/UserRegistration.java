package com.advance.java.day_19;

import java.util.regex.Pattern;

public class UserRegistration {
	
	   // UC1 - First Name Validation
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }
    
    // UC2 - Last Name Validation
    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, lastName);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 UserRegistration user = new UserRegistration();

	        // UC1
	        System.out.println("First Name Validation:");
	        System.out.println(user.validateFirstName("Virat"));
	        
	        // UC2
	        System.out.println("\nLast Name Validation:");
	        System.out.println(user.validateLastName("Kohli"));


	}

}
