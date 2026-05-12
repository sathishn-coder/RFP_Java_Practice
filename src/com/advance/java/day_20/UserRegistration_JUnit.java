package com.advance.java.day_20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserRegistration_JUnit {
	UserRegistration user = new UserRegistration();

    // UC1 - First Name Test
    @Test
    void testFirstName_Valid() {
        assertTrue(user.validateFirstName("Virat"));
    }

    @Test
    void testFirstName_Invalid() {
        assertFalse(user.validateFirstName("vi"));
    }

    // UC2 - Last Name Test
    @Test
    void testLastName_Valid() {
        assertTrue(user.validateLastName("Kohli"));
    }

    @Test
    void testLastName_Invalid() {
        assertFalse(user.validateLastName("ko"));
    }

    // UC3 - Email Test
    @Test
    void testEmail_Valid() {
        assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    void testEmail_Invalid() {
        assertFalse(user.validateEmail("abc@.com"));
    }

    // UC4 - Mobile Number Test
    @Test
    void testMobile_Valid() {
        assertTrue(user.validateMobile("91 9919819801"));
    }

    @Test
    void testMobile_Invalid() {
        assertFalse(user.validateMobile("919919819801"));
    }

    // UC5 - Password Rule1 Test
    @Test
    void testPasswordRule1_Valid() {
        assertTrue(user.validatePasswordRule1("Password"));
    }

    @Test
    void testPasswordRule1_Invalid() {
        assertFalse(user.validatePasswordRule1("Pass"));
    }

    // UC6 - Password Rule2 Test
    @Test
    void testPasswordRule2_Valid() {
        assertTrue(user.validatePasswordRule2("Password"));
    }

    @Test
    void testPasswordRule2_Invalid() {
        assertFalse(user.validatePasswordRule2("password"));
    }

    // UC7 - Password Rule3 Test
    @Test
    void testPasswordRule3_Valid() {
        assertTrue(user.validatePasswordRule3("Password1"));
    }

    @Test
    void testPasswordRule3_Invalid() {
        assertFalse(user.validatePasswordRule3("Password"));
    }

    // UC8 - Password Rule4 Test
    @Test
    void testPasswordRule4_Valid() {
        assertTrue(user.validatePasswordRule4("Password@1"));
    }

    @Test
    void testPasswordRule4_Invalid() {
        assertFalse(user.validatePasswordRule4("Password@@1"));
    }


}
