package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validUserName("Plk");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName = UserRegistration.validUserName("plkk");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validUserName("Partani");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName = UserRegistration.validUserName("PARTANi");
        Assert.assertFalse(lastName);
    }


    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean emailId = UserRegistration.validateEmailId("abc@gmail.com");
        Assert.assertTrue(emailId);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean emailId = UserRegistration.validateEmailId("abcggg.com");
        Assert.assertFalse(emailId);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("91 9404890045");
        Assert.assertTrue(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("123456789");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenMinimumEightCharacterPassword_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastEightCharacterLong = UserRegistration.validatePassword("admin123", UserRegistration.PASSWORD_ATLEAST_EIGHT_CHARACTER);
        Assert.assertTrue(passwordAtLeastEightCharacterLong);
    }

    @Test
    public void givenMinimumEightCharacterLongPassword_WhenImProper_ShouldReturnFalse() {
        boolean passwordAtLeastEightCharacter = UserRegistration.validatePassword("abc", UserRegistration.PASSWORD_ATLEAST_EIGHT_CHARACTER);
        Assert.assertFalse(passwordAtLeastEightCharacter);
    }

    @Test
    public void givenAtLeastOneUpperCaseLetterPassword_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastOneUpperCase = UserRegistration.validatePassword("pppplkPpp", UserRegistration.PASSWORD_ATLEAST_ONE_UPPERCASE);
        Assert.assertTrue(passwordAtLeastOneUpperCase);
    }

    @Test
    public void givenAtLeastOneUpperCaseLetterPassword_WhenImproper_ShouldReturnFalse() {
        boolean passwordAtLeastOneUpperCase = UserRegistration.validatePassword("plkpp", UserRegistration.PASSWORD_ATLEAST_ONE_UPPERCASE);
        Assert.assertFalse(passwordAtLeastOneUpperCase);
    }

    @Test
    public void givenPasswordWithAtLeastOneNumber_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastOneNumber = UserRegistration.validatePassword("Admin123", UserRegistration.PASSWORD_ATLEAST_ONE_NUMBER);
        Assert.assertTrue(passwordAtLeastOneNumber);
    }

    @Test
    public void givenPasswordForAtLeastOneNumber_WhenImProper_ShouldReturnFalse() {
        boolean passwordAtLeastOneNumber = UserRegistration.validatePassword("adminadmin", UserRegistration.PASSWORD_ATLEAST_ONE_NUMBER);
        Assert.assertFalse(passwordAtLeastOneNumber);
    }

    @Test
    public void givenPasswordWithExactlyOneSpecialCharacter_WhenProper_ShouldReturnTrue() {
        boolean passwordWithExactlyOneSpecialCharacter = UserRegistration.validatePassword("Admin@123", UserRegistration.PASSWORD_ATLEAST_ONE_SPECIAL_CHARACTER);
        Assert.assertTrue(passwordWithExactlyOneSpecialCharacter);
    }

    @Test
    public void givenPasswordWithExactlyOneSpecialCharacter_WhenImProper_ShouldReturnFalse() {
        boolean passwordWithExactlyOneSpecialCharacter = UserRegistration.validatePassword("adm!n@123", UserRegistration.PASSWORD_ATLEAST_ONE_SPECIAL_CHARACTER);
        Assert.assertFalse(passwordWithExactlyOneSpecialCharacter);
    }

}