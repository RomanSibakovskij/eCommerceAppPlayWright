package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //valid user logout test

    // Test 003 -> valid user logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_User_Logout_Test")
    void userAccLogoutTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
    }

    //valid user login test

    // Test 004 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_User_Login_Test")
    void userAccLoginTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
        //valid user login test
        validUserLoginTest();
    }

    //invalid user login test

    //no singular input

    // Test 004a -> invalid user login test - no login email
    @Test
    @DisplayName("Invalid User Login Test - No Login Email")
    @Tag("Invalid_User_Login_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccLoginNoEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login email
        invalidUserLoginNoEmailTest();
    }

    // Test 004b -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Login Test - No Login Password")
    @Tag("Invalid_User_Login_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccLoginNoPasswordTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login password
        invalidUserLoginNoPasswordTest();
    }

    //invalid singular input

    // Test 004c -> invalid user login test - invalid login email
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccLoginInvalidEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login email
        invalidUserLoginInvalidEmailTest();
    }

    // Test 004d -> invalid user login test - invalid login email format (missing '@')
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email Format")
    @Tag("Invalid_User_Login_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccLoginInvalidEmailFormatTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login email format
        invalidUserLoginInvalidEmailFormatTest();
    }

    // Test 004e -> invalid user login test - invalid login password
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Password")
    @Tag("Invalid_User_Login_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccLoginInvalidPasswordTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login password
        invalidUserLoginInvalidPasswordTest();
    }

}
