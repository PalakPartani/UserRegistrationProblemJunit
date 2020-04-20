package com.bridgelabz.userregistration;

public class UserRegistration {

    private final static String USER_NAME = "^[A-Z][a-z]{2,}$";
    private final static String MOBILE_NUMBER = "^[1-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
    private final static String EMAIL_ID = "^\\w{3,}([-._+]\\w+)?@\\w+.[a-z]{2,4}([.][a-z]{2,4})?$";
    private final static String PASSWORD_ATLEAST_EIGHT_CHARACTER ="^[\\w\\S]{8,}$";
    private final static String PASSWORD_ATLEAST_ONE_UPPERCASE ="(?=.*[A-Z])[A-Za-z]{8,15}";


    public static boolean validUserName(String name) {
        return name.matches(USER_NAME);
    }

    public static boolean validateEmailId(String email) {
        return email.matches(EMAIL_ID);

    }

    public static boolean validateMobileNumber(String mobileNo) {
        return mobileNo.matches(MOBILE_NUMBER);

    }
    public static boolean validatePassword(String passwordAtLeastEightCharacter ) {
        return passwordAtLeastEightCharacter.matches(PASSWORD_ATLEAST_EIGHT_CHARACTER);
    }

    public static boolean validatePasswordForCase(String passwordAtleastOneUpercase) {
        return passwordAtleastOneUpercase.matches(PASSWORD_ATLEAST_ONE_UPPERCASE);

    }
}
