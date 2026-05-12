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
    
    // UC3 - Email Validation
    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(regex, email);
    }
    
    // UC4 - Mobile Number Validation
    public boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        return Pattern.matches(regex, mobile);
    }
    
 // UC5 - Password Rule 1 (Minimum 8 Characters)
    public boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$";
        return Pattern.matches(regex, password);
    }
    
    // UC6 - Password Rule 2 (At least 1 Uppercase)
    public boolean validatePasswordRule2(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";
        return Pattern.matches(regex, password);
    }
    
    // UC7 - Password Rule 3 (At least 1 Numeric Number)
    public boolean validatePasswordRule3(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }
    
    // UC8 - Password Rule 4 (Exactly 1 Special Character)
    public boolean validatePasswordRule4(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1})[A-Za-z0-9[^a-zA-Z0-9]]{8,}$";
        return Pattern.matches(regex, password);
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
	        
	        // UC3
	        System.out.println("\nEmail Validation:");
	        System.out.println(user.validateEmail("abc.xyz@bl.co.in"));
	        
	        // UC4
	        System.out.println("\nMobile Number Validation:");
	        System.out.println(user.validateMobile("91 9919819801"));
	        
	     // UC5
	        System.out.println("\nPassword Rule1:");
	        System.out.println(user.validatePasswordRule1("Password"));

	     // UC6
	        System.out.println("\nPassword Rule2:");
	        System.out.println(user.validatePasswordRule2("Password"));
	        
	        // UC7
	        System.out.println("\nPassword Rule3:");
	        System.out.println(user.validatePasswordRule3("Password1"));
	        

	        // UC8
	        System.out.println("\nPassword Rule4:");
	        System.out.println(user.validatePasswordRule4("Password@1"));



	}

}
