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
    public void givenEightCharacterLongPassword_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastEightCharacterLong = UserRegistration.validatePassword("admin123");
        Assert.assertTrue(passwordAtLeastEightCharacterLong);
    }
    @Test
    public void givenEightCharacterLongPassword_WhenImProper_ShouldReturnFalse() {
        boolean passwordAtLeastEightCharacter = UserRegistration.validatePassword("abc");
        Assert.assertFalse(passwordAtLeastEightCharacter);
    }

    @Test
    public void givenAtLeastOneUpperCaseLetterPassword_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastOneUpperCase = UserRegistration.validatePasswordForCase("pppplkPpp");
        Assert.assertTrue(passwordAtLeastOneUpperCase);
    }
    @Test
    public void givenAtLeastOneUpperCaseLetterPassword_WhenImproper_ShouldReturnFalse() {
        boolean passwordAtLeastOneUpperCase = UserRegistration.validatePasswordForCase("plkpp");
        Assert.assertFalse(passwordAtLeastOneUpperCase);
    }
    @Test
    public void givenPasswordHasAtLeastOneNumber_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastOneNumber = UserRegistration.validatePasswordforNumber("Admin123");
        Assert.assertTrue(passwordAtLeastOneNumber);
    }
    @Test
    public void givenPasswordHasAtLeastOneNumber_WhenProper_ShouldReturnFalse() {
        boolean passwordAtLeastOneNumber = UserRegistration.validatePasswordforNumber("adminadmin");
        Assert.assertFalse(passwordAtLeastOneNumber);
    }

}
