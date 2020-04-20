package com.bridgelabz.userregistration;

public class UserRegistration {

    static String USER_NAME = "^[A-Z][a-z]{2,}$";
    static String MOBILE_NUMBER = "^[1-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
    static String EMAIL_ID = "^\\w{3,}([-._+]\\w+)?@\\w+.[a-z]{2,4}([.][a-z]{2,4})?$";
    static String PASSWORD_ATLEAST_EIGHT_CHARACTER = "^[\\w\\S]{8,}$";
    static String PASSWORD_ATLEAST_ONE_UPPERCASE = "(?=.*[A-Z])[A-Za-z]{8,15}";
    static String PASSWORD_ATLEAST_ONE_NUMBER = "((?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,10})";
    static String PASSWORD_ATLEAST_ONE_SPECIAL_CHARACTER = "^((?=[^\\W\\_]*[\\W\\_][^\\W\\_]*$)(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9\\W\\_]{8,})$";

    public static boolean validUserName(String name) {
        return name.matches(USER_NAME);
    }

    public static boolean validateEmailId(String email) {
        return email.matches(EMAIL_ID);

    }

    public static boolean validateMobileNumber(String mobileNo) {
        return mobileNo.matches(MOBILE_NUMBER);

    }

    public static boolean validatePassword(String password, String pattern) {
        return password.matches(pattern);
    }
}
