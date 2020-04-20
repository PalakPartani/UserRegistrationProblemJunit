package com.bridgelabz.userregistration;

public class UserRegistration {

    static String USER_NAME = "^[A-Z]{1}[a-z]{2,}$";

    public static boolean validInputName(String name) {
        return name.matches(USER_NAME);
    }

}
