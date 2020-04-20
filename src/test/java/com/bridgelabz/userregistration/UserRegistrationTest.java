package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validInputName("Plk");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName = UserRegistration.validInputName("plkk");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validInputName("Partani");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName = UserRegistration.validInputName("PARTANi");
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
}
