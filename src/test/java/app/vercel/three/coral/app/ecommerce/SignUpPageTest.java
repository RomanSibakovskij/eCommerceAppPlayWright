package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SignUpPageTest extends TestMethods{

    //valid user account creation test

    // Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation_Test")
    void validUserAccCreationTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
    }

    //invalid user account creation tests

    //no singular input

    // Test 002a -> invalid user account creation test - no user first name (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User First Name")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoFirstNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - no user first name
        invalidUserAccountCreationNoFirstNameTest();
    }

    // Test 002b -> invalid user account creation test - no user last name (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Last Name")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoLastNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - no user last name
        invalidUserAccountCreationNoLastNameTest();
    }

    // Test 002c -> invalid user account creation test - no user email (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Email")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - no user email
        invalidUserAccountCreationNoEmailTest();
    }

    // Test 002d -> invalid user account creation test - no user password/confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Password")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoPasswordTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - no user password/confirm password
        invalidUserAccountCreationNoPasswordTest();
    }

    //too short singular input

    // Test 002e -> invalid user account creation test - too short user first name (1 char) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User First Name")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortFirstNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too short user first name
        invalidUserAccountCreationTooShortFirstNameTest();
    }

    // Test 002f -> invalid user account creation test - too short user last name (1 char) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Last Name")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortLastNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too short user last name
        invalidUserAccountCreationTooShortLastNameTest();
    }

    // Test 002g -> invalid user account creation test - too short user email (1 char -> name, domain) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Email")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too short user email
        invalidUserAccountCreationTooShortEmailTest();
    }

    // Test 002h -> invalid user account creation test - too short user password/confirm password (5 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Password")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortPasswordTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too short user password/confirm password
        invalidUserAccountCreationTooShortPasswordTest();
    }

    //too long singular input

    // Test 002i -> invalid user account creation test - too long user first name (100 chars) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User First Name")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccCreationTooLongFirstNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too long user first name
        invalidUserAccountCreationTooLongFirstNameTest();
    }

    // Test 002j -> invalid user account creation test - too long user last name (100 chars) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Last Name")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccCreationTooLongLastNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too long user last name
        invalidUserAccountCreationTooLongLastNameTest();
    }

    // Test 002k -> invalid user account creation test - too long user email (100 chars -> name, domain) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Email")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooLongEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too long user email
        invalidUserAccountCreationTooLongEmailTest();
    }

    // Test 002l -> invalid user account creation test - too long user password/confirm password (75 chars) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Password")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccCreationTooLongPasswordTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - too long user password/confirm password
        invalidUserAccountCreationTooLongPasswordTest();
    }

    //invalid singular input format

    // Test 002m -> invalid user account creation test - invalid user first name format (special symbols only) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User First Name Format")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationInvalidFirstNameFormatTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - invalid user first name format
        invalidUserAccountCreationInvalidFirstNameFormatTest();
    }

    // Test 002n -> invalid user account creation test - invalid user last name format (special symbols only) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Last Name Format")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationInvalidLastNameFormatTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - invalid user last name format
        invalidUserAccountCreationInvalidLastNameFormatTest();
    }

    // Test 002o -> invalid user account creation test - invalid user email format missing '@') (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Email Format")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationInvalidEmailFormatTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - invalid user email format
        invalidUserAccountCreationInvalidEmailFormatTest();
    }

    // Test 002p -> invalid user account creation test - existing user email (used beforehand in manual testing) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Existing User Email")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationExistingEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - existing user email
        invalidUserAccountCreationExistingEmailTest();
    }

    // Test 002q -> invalid user account creation test - mismatching confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - Mismatching User Confirm Password")
    @Tag("Invalid_User_Account_Creation_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationMismatchingConfirmPasswordTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //invalid user account creation test - mismatching confirm password
        invalidUserAccountCreationMismatchingPasswordTest();
    }

}
