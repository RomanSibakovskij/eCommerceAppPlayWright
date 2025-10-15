package app.vercel.three.coral.app.ecommerce.utilities;

import app.vercel.three.coral.app.ecommerce.*;
import app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios.CheckoutPageInvalidSingularInputFormat;
import app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios.CheckoutPageNoSingularInput;
import app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios.CheckoutPageTooLongSingularInput;
import app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios.CheckoutPageTooShortSingularInput;
import app.vercel.three.coral.app.ecommerce.checkout.page.valid.scenarios.CheckoutPageValidInput;
import app.vercel.three.coral.app.ecommerce.signin.page.invalid.scenarios.SignInPageInvalidSingularInput;
import app.vercel.three.coral.app.ecommerce.signup.page.invalid.scenarios.SignUpPageInvalidSingularInput;
import app.vercel.three.coral.app.ecommerce.modals.*;

import app.vercel.three.coral.app.ecommerce.page.data.loggers.*;
import app.vercel.three.coral.app.ecommerce.page.web.element.assertion.*;
import app.vercel.three.coral.app.ecommerce.page.text.element.assertion.*;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Paths;
import java.util.*;

import com.microsoft.playwright.Page;
import org.slf4j.*;

public class TestMethods extends BaseTest implements PageWebElementAsserts, PageTextElementAsserts, PageDataLoggers {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //navigate to sign up page test method
    protected void navigateToSignUpPageTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Sign up" button
        generalPage.clickHeaderSignUpBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //assert the user got onto sign up page
        String expectedURL = "https://ecommerce-app-coral-three.vercel.app/signup";
        String actualURL = page.url();
        assertEquals(expectedURL, actualURL, "The expected/actual sign up page URLs don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Navigate To Sign Up Page Test Result.png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation test

    //valid user account creation test method
    protected void validUserAccountCreationTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //valid user sign-up data getter
        signUpPage.validUserSignUpDataGetter();
        //input valid user first name into first name input field
        signUpPage.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPage.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPage.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPage.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Valid Data Input.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid User Account Creation Test Result.png")).setFullPage(true));
    }

    //invalid user account creation tests

    //no singular input

    //invalid user account creation test method - no user first name
    protected void invalidUserAccountCreationNoFirstNameTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - no user first name
        signUpPageInvalidSingularInput.invalidUserSignUpDataNoFirstNameGetter();
        //don't input user first name into first name input field
        signUpPageInvalidSingularInput.inputNoFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - no user first name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - No User First Name.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No User First Name.png")).setFullPage(true));
            throw new Error ("The user account was created without first name, test has failed");
        }
    }

    //invalid user account creation test method - no user last name
    protected void invalidUserAccountCreationNoLastNameTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - no user last name
        signUpPageInvalidSingularInput.invalidUserSignUpDataNoLastNameGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //don't input user last name into last name input field
        signUpPageInvalidSingularInput.inputNoLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - no user last name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - No User Last Name.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No User Last Name.png")).setFullPage(true));
            throw new Error ("The user account was created without last name, test has failed");
        }
    }

    //invalid user account creation test method - no user email
    protected void invalidUserAccountCreationNoEmailTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - no user email
        signUpPageInvalidSingularInput.invalidUserSignUpDataNoEmailGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //don't input user email into email input field
        signUpPageInvalidSingularInput.inputNoEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - no user email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - No User Email.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No User Email.png")).setFullPage(true));
            throw new Error ("The user account was created without email, test has failed");
        }
    }

    //invalid user account creation test method - no user password/confirm password
    protected void invalidUserAccountCreationNoPasswordTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - no user password/confirm password
        signUpPageInvalidSingularInput.invalidUserSignUpDataNoPasswordGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //don't input user password into password input field
        signUpPageInvalidSingularInput.inputNoPasswordIntoPasswordInputField();
        //don't input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputNoConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the sign-up page display after invalid data input - no user password/confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - No User Password and Confirm Password.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //assert the user receives an expected error
        assertEquals("Password must be at least 6 characters long", signUpPage.getSignUpPageInvalidSingularInputErrorMsg(), "The missing password input error doesn't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No User Password and Confirm Password.png")).setFullPage(true));
    }

    //too short singular input

    //invalid user account creation test method - too short user first name (1 char)
    protected void invalidUserAccountCreationTooShortFirstNameTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too short user first name (1 char)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooShortFirstNameGetter();
        //input too short user first name into first name input field (1 char)
        signUpPageInvalidSingularInput.inputTooShortFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too short user first name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Short User First Name.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short User First Name.png")).setFullPage(true));
            throw new Error ("The user account was created with too short first name, test has failed");
        }
    }

    //invalid user account creation test method - too short user last name (1 char)
    protected void invalidUserAccountCreationTooShortLastNameTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too short user last name (1 char)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooShortLastNameGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input too short user last name into last name input field (1 char)
        signUpPageInvalidSingularInput.inputTooShortLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too short user last name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Short User Last Name.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short User Last Name.png")).setFullPage(true));
            throw new Error ("The user account was created with too short last name, test has failed");
        }
    }

    //invalid user account creation test method - too short user email (1 char -> name, domain)
    protected void invalidUserAccountCreationTooShortEmailTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too short user email (1 char -> name, domain)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooShortEmailGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input too short user email into email input field (1 char -> name, domain)
        signUpPageInvalidSingularInput.inputTooShortEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too short user email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Short User Email.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short User Email.png")).setFullPage(true));
            throw new Error ("The user account was created with too short email, test has failed");
        }
    }

    //invalid user account creation test method - too short user password/confirm password (5 chars)
    protected void invalidUserAccountCreationTooShortPasswordTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too short user password/confirm password (5 chars)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooShortPasswordGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input too short user password into password input field (5 chars)
        signUpPageInvalidSingularInput.inputTooShortPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input too short matching user confirm password into confirm password input field (5 chars)
        signUpPageInvalidSingularInput.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too short user password/confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Short User Password and Confirm Password.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //assert the user receives an expected error
        assertEquals("Password must be at least 6 characters long", signUpPage.getSignUpPageInvalidSingularInputErrorMsg(), "The too short password input error doesn't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short User Password and Confirm Password.png")).setFullPage(true));
    }

    //too long singular input

    //invalid user account creation test method - too long user first name (100 chars)
    protected void invalidUserAccountCreationTooLongFirstNameTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too long user first name (100 chars)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooLongFirstNameGetter();
        //input too long user first name into first name input field (100 chars)
        signUpPageInvalidSingularInput.inputTooLongFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too long user first name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Long User First Name.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long User First Name.png")).setFullPage(true));
            throw new Error ("The user account was created with too long first name, test has failed");
        }
    }

    //invalid user account creation test method - too long user last name (100 chars)
    protected void invalidUserAccountCreationTooLongLastNameTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too long user last name (100 chars)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooLongLastNameGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input too long user last name into last name input field (100 chars)
        signUpPageInvalidSingularInput.inputTooLongLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too long user last name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Long User Last Name.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long User Last Name.png")).setFullPage(true));
            throw new Error ("The user account was created with too long last name, test has failed");
        }
    }

    //invalid user account creation test method - too long user email (100 chars -> name, domain)
    protected void invalidUserAccountCreationTooLongEmailTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too long user email (100 chars -> name, domain)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooLongEmailGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input too long user email into email input field (100 chars -> name, domain)
        signUpPageInvalidSingularInput.inputTooLongEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too long user email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Long User Email.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long User Email.png")).setFullPage(true));
            throw new Error ("The user account was created with too long email, test has failed");
        }
    }

    //invalid user account creation test method - too long user password/confirm password (75 chars)
    protected void invalidUserAccountCreationTooLongPasswordTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - too long user password/confirm password (75 chars)
        signUpPageInvalidSingularInput.invalidUserSignUpDataTooLongPasswordGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input too long user password into password input field (75 chars)
        signUpPageInvalidSingularInput.inputTooLongPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input too long matching user confirm password into confirm password input field (75 chars)
        signUpPageInvalidSingularInput.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - too long user password/confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Too Long User Password and Confirm Password.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long User User Password and Confirm Password.png")).setFullPage(true));
            throw new Error ("The user account was created with too long password, test has failed");
        }
    }

    //invalid singular input format

    //invalid user account creation test method - invalid user first name format (special symbols only)
    protected void invalidUserAccountCreationInvalidFirstNameFormatTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - invalid user first name format (special symbols only)
        signUpPageInvalidSingularInput.invalidUserSignUpDataInvalidFirstNameFormatGetter();
        //input invalid user first name format into first name input field (special symbols only)
        signUpPageInvalidSingularInput.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - invalid user first name format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Invalid User First Name Format.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Invalid User First Name Format.png")).setFullPage(true));
            throw new Error ("The user account was created with invalid first name input format, test has failed");
        }
    }

    //invalid user account creation test method - invalid user last name format (special symbols only)
    protected void invalidUserAccountCreationInvalidLastNameFormatTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - invalid user last name format (special symbols only)
        signUpPageInvalidSingularInput.invalidUserSignUpDataInvalidLastNameFormatGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input invalid user last name format into last name input field (special symbols only)
        signUpPageInvalidSingularInput.inputInvalidLastNameFormatIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - invalid user last name format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Invalid User Last Name Format.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Invalid User Last Name Format.png")).setFullPage(true));
            throw new Error ("The user account was created with invalid last name input format, test has failed");
        }
    }

    //invalid user account creation test method - invalid user email format (missing '@')
    protected void invalidUserAccountCreationInvalidEmailFormatTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - invalid user email format (missing '@')
        signUpPageInvalidSingularInput.invalidUserSignUpDataInvalidEmailFormatGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input invalid user email format into email input field (missing '@')
        signUpPageInvalidSingularInput.inputInvalidEmailFormatIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - invalid user email format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Invalid User Email Format.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Invalid User Email Format.png")).setFullPage(true));
            throw new Error ("The user account was created with invalid email input format, test has failed");
        }
    }

    //invalid user account creation test method - existing user email format (used beforehand in manual testing')
    protected void invalidUserAccountCreationExistingEmailTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - existing user email format (used beforehand in manual testing)
        signUpPageInvalidSingularInput.invalidUserSignUpDataExistingEmailGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input existing user email into email input field (used beforehand in manual testing)
        signUpPageInvalidSingularInput.inputExistingEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input matching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - existing user email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Existing User Email.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //since there's no error to be triggered, if the user gets onto home page, throw an error
        String expectedHomePageURL = "https://ecommerce-app-coral-three.vercel.app/products";
        if(page.url().equals(expectedHomePageURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Existing User Email.png")).setFullPage(true));
            throw new Error ("The user account was created with existing email, test has failed");
        }
    }

    //invalid user account creation test method - mismatching confirm password
    protected void invalidUserAccountCreationMismatchingPasswordTest(){
        BasePage basePage = new BasePage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignUpPageInvalidSingularInput signUpPageInvalidSingularInput = new SignUpPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //sign-up page web element assert
        isSignUpWebElementVisible(page);
        //sign-up page text element assert
        isSignUpPageTextElementAsExpected(page);
        //capture screenshot of the sign-up page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display Before Data Input.png")).setFullPage(true));
        //invalid user sign-up data getter - mismatching confirm password
        signUpPageInvalidSingularInput.invalidUserSignUpDataMismatchingConfirmPasswordGetter();
        //input valid user first name into first name input field
        signUpPageInvalidSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        signUpPageInvalidSingularInput.inputLastNameIntoLastNameInputField();
        //input valid user email into email input field
        signUpPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid user password into password input field
        signUpPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //click "View password" button
        signUpPage.clickViewPasswordBtn();
        //input mismatching user confirm password into confirm password input field
        signUpPageInvalidSingularInput.inputMismatchingConfirmPasswordIntoConfirmPasswordInputField();
        //click "View confirm password" button
        signUpPage.clickViewConfirmPasswordBtn();
        //capture screenshot of the sign-up page display after invalid data input - mismatching confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign Up Page Display After Invalid Data Input - Mismatching Confirm Password.png")).setFullPage(true));
        //click "Create account" button
        signUpPage.clickCreateAccountBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //assert the user receives an expected error
        assertEquals("Passwords do not match", signUpPage.getSignUpPageInvalidSingularInputErrorMsg(), "The mismatching password input error doesn't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Mismatching Confirm Password.png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //user logout test

    //user logout test method
    protected void userLogoutTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //click header profile icon button
        generalPage.clickHeaderProfileIconBtn();
        //click "Logout" option
        generalPage.clickSetProfileDropdownOptionLink(1);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/User Account Logout Test Result.png")).setFullPage(true));
    }

    //valid user login test

    //valid user login test method
    protected void validUserLoginTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignInPage signInPage = new SignInPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click header "Login" button
        generalPage.clickHeaderLoginBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //sign in page web element assert
        isSignInPageWebElementVisible(page);
        //sign in page text element assert
        isSignInPageTextElementAsExpected(page);
        //capture screenshot of the sign-in page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display Before Data Input.png")).setFullPage(true));
        //valid sign in input data getter
        signInPage.validSignInInputDataGetter(signUpPage);
        //input valid sign in email into sign in email input field
        signInPage.inputSignInEmailIntoSignInEmailInputField();
        //input valid sign in password into sign in password input field
        signInPage.inputSignInPasswordIntoSignInPasswordInputField();
        //click "View password" button
        signInPage.clickSignInViewPasswordBtn();
        //capture screenshot of the sign-in page display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display After Valid Data Input.png")).setFullPage(true));
        //click "Sign in" button
        signInPage.clickSignInBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid User Account Login Test Result.png")).setFullPage(true));
    }

    //invalid user login tests

    //no singular input

    //invalid user login test method - no login email
    protected void invalidUserLoginNoEmailTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignInPage signInPage = new SignInPage(page);
        SignInPageInvalidSingularInput signInPageInvalidSingularInput = new SignInPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click header "Login" button
        generalPage.clickHeaderLoginBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //sign in page web element assert
        isSignInPageWebElementVisible(page);
        //sign in page text element assert
        isSignInPageTextElementAsExpected(page);
        //capture screenshot of the sign-in page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display Before Data Input.png")).setFullPage(true));
        //invalid sign in input data getter - no login email
        signInPageInvalidSingularInput.invalidSignInInputDataNoEmailGetter(signUpPage);
        //don't input sign in email into sign in email input field
        signInPageInvalidSingularInput.inputNoSignInEmailIntoSignInEmailInputField();
        //input valid sign in password into sign in password input field
        signInPageInvalidSingularInput.inputSignInPasswordIntoSignInPasswordInputField();
        //click "View password" button
        signInPage.clickSignInViewPasswordBtn();
        //capture screenshot of the sign-in page display after invalid data input - no login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display After Invalid Data Input - No Login Email.png")).setFullPage(true));
        //click "Sign in" button
        signInPage.clickSignInBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets an expected error
        assertEquals("Invalid email or password", signInPage.getSignInPageInvalidSingularInputErrorMsg(), "The missing login email error doesn't match expectations");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Login Test Result - No Login Email.png")).setFullPage(true));
    }

    //invalid user login test method - no login password
    protected void invalidUserLoginNoPasswordTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignInPage signInPage = new SignInPage(page);
        SignInPageInvalidSingularInput signInPageInvalidSingularInput = new SignInPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click header "Login" button
        generalPage.clickHeaderLoginBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //sign in page web element assert
        isSignInPageWebElementVisible(page);
        //sign in page text element assert
        isSignInPageTextElementAsExpected(page);
        //capture screenshot of the sign-in page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display Before Data Input.png")).setFullPage(true));
        //invalid sign in input data getter - no login password
        signInPageInvalidSingularInput.invalidSignInInputDataNoPasswordGetter(signUpPage);
        //input valid sign in email into sign in email input field
        signInPageInvalidSingularInput.inputSignInEmailIntoSignInEmailInputField();
        //don't input sign in password into sign in password input field
        signInPageInvalidSingularInput.inputNoSignInPasswordIntoSignInPasswordInputField();
        //capture screenshot of the sign-in page display after invalid data input - no login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display After Invalid Data Input - No Login Password.png")).setFullPage(true));
        //click "Sign in" button
        signInPage.clickSignInBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets an expected error
        assertEquals("Invalid email or password", signInPage.getSignInPageInvalidSingularInputErrorMsg(), "The missing login password error doesn't match expectations");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Login Test Result - No Login Password.png")).setFullPage(true));
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserLoginInvalidEmailTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignInPage signInPage = new SignInPage(page);
        SignInPageInvalidSingularInput signInPageInvalidSingularInput = new SignInPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click header "Login" button
        generalPage.clickHeaderLoginBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //sign in page web element assert
        isSignInPageWebElementVisible(page);
        //sign in page text element assert
        isSignInPageTextElementAsExpected(page);
        //capture screenshot of the sign-in page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display Before Data Input.png")).setFullPage(true));
        //invalid sign in input data getter - invalid login email
        signInPageInvalidSingularInput.invalidSignInInputDataInvalidEmailGetter(signUpPage);
        //input invalid sign in email into sign in email input field
        signInPageInvalidSingularInput.inputInvalidSignInEmailIntoSignInEmailInputField();
        //input valid sign in password into sign in password input field
        signInPageInvalidSingularInput.inputSignInPasswordIntoSignInPasswordInputField();
        //click "View password" button
        signInPage.clickSignInViewPasswordBtn();
        //capture screenshot of the sign-in page display after invalid data input - invalid login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display After Invalid Data Input - Invalid Login Email.png")).setFullPage(true));
        //click "Sign in" button
        signInPage.clickSignInBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets an expected error
        assertEquals("Invalid email or password", signInPage.getSignInPageInvalidSingularInputErrorMsg(), "The invalid login email error doesn't match expectations");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Login Test Result - Invalid Login Email.png")).setFullPage(true));
    }

    //invalid user login test method - invalid login email format
    protected void invalidUserLoginInvalidEmailFormatTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignInPage signInPage = new SignInPage(page);
        SignInPageInvalidSingularInput signInPageInvalidSingularInput = new SignInPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click header "Login" button
        generalPage.clickHeaderLoginBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //sign in page web element assert
        isSignInPageWebElementVisible(page);
        //sign in page text element assert
        isSignInPageTextElementAsExpected(page);
        //capture screenshot of the sign-in page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display Before Data Input.png")).setFullPage(true));
        //invalid sign in input data getter - invalid login email format
        signInPageInvalidSingularInput.invalidSignInInputDataInvalidEmailFormatGetter(signUpPage);
        //input invalid sign in email format into sign in email input field
        signInPageInvalidSingularInput.inputInvalidSignInEmailFormatIntoSignInEmailInputField();
        //input valid sign in password into sign in password input field
        signInPageInvalidSingularInput.inputSignInPasswordIntoSignInPasswordInputField();
        //click "View password" button
        signInPage.clickSignInViewPasswordBtn();
        //capture screenshot of the sign-in page display after invalid data input - invalid login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display After Invalid Data Input - Invalid Login Email Format.png")).setFullPage(true));
        //click "Sign in" button
        signInPage.clickSignInBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets an expected error
        assertEquals("Invalid email or password", signInPage.getSignInPageInvalidSingularInputErrorMsg(), "The invalid login email input format error doesn't match expectations");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Login Test Result - Invalid Login Email Format.png")).setFullPage(true));
    }

    //invalid user login test method - invalid login password
    protected void invalidUserLoginInvalidPasswordTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        SignInPage signInPage = new SignInPage(page);
        SignInPageInvalidSingularInput signInPageInvalidSingularInput = new SignInPageInvalidSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click header "Login" button
        generalPage.clickHeaderLoginBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //sign in page web element assert
        isSignInPageWebElementVisible(page);
        //sign in page text element assert
        isSignInPageTextElementAsExpected(page);
        //capture screenshot of the sign-in page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display Before Data Input.png")).setFullPage(true));
        //invalid sign in input data getter - invalid login password
        signInPageInvalidSingularInput.invalidSignInInputDataInvalidPasswordGetter(signUpPage);
        //input valid sign in email into sign in email input field
        signInPageInvalidSingularInput.inputSignInEmailIntoSignInEmailInputField();
        //input invalid sign in password into sign in password input field
        signInPageInvalidSingularInput.inputInvalidSignInPasswordIntoSignInPasswordInputField();
        //click "View password" button
        signInPage.clickSignInViewPasswordBtn();
        //capture screenshot of the sign-in page display after invalid data input - no login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Sign In Page Display After Invalid Data Input - Invalid Login Password.png")).setFullPage(true));
        //click "Sign in" button
        signInPage.clickSignInBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets an expected error
        assertEquals("Invalid email or password", signInPage.getSignInPageInvalidSingularInputErrorMsg(), "The invalid login password error doesn't match expectations");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Login Test Result - Invalid Login Password.png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //view user account test

    //view user account test method
    protected void viewUserAccountTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //click header profile icon button
        generalPage.clickHeaderProfileIconBtn();
        //click "Profile" option
        generalPage.clickSetProfileDropdownOptionLink(0);
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //assert the user gets onto user account page, throw an error otherwise
        try{
            String expectedURL = "https://ecommerce-app-coral-three.vercel.app/profile";
            String actualURL = page.url();
            assertEquals(expectedURL, actualURL, "The expected/actual account URLs don't match expectations.");
        } catch (Exception e){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/View User Account Test Result.png")).setFullPage(true));
            throw new Error("The user didn't get to the user account page, test has failed.");
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add home page product(s) to cart test

    //add single home page product ("Chanel Coco Noir Eau De") to cart test method (as a guest)
    protected void addSingleHomePageProductToCartGuestTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        HomePage homePage = new HomePage(page);
        FiltersModal filtersModal = new FiltersModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click navbar "Filters" modal button
        homePage.clickNavbarFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //log filters modal price data
        logFiltersModalPriceData(page);
        //capture screenshot of the filters modal display before filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display Before Filter Application.png")).setFullPage(true));
        //click set customer rating radio button
        filtersModal.clickSetCustomerRatingRadioBtn(1);
        //set the set price from range ($100)
        filtersModal.setTheSetPriceFrom(13);
        //log filters modal price data (to verify the price range has been applied)
        logFiltersModalPriceData(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //capture screenshot of the filters modal display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display After Filter Application.png")).setFullPage(true));
        //click "Apply filters" button
        filtersModal.clickApplyFiltersBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //log home page product data (to verify the filters have been applied)
        logHomePageProductData(page);
        //capture screenshot of the home page display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display After Set Filter Application.png")).setFullPage(true));
        //click set product ("Chanel Coco Noir Eau De") "Add to cart" button
        homePage.clickSetProductAddToCartBtn(0);
        //click header shopping cart button
        generalPage.clickHeaderShopCartIconBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //if the user gets onto login page, throw an error (means the feature is available only to registered users)
        String expectedLoginURL = "https://ecommerce-app-coral-three.vercel.app/login";
        String actualLoginURL = page.url();
        if(expectedLoginURL.equals(actualLoginURL)){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Home Page Product (Chanel Coco Noir Eau De) To Cart Test Failure Result (guest).png")).setFullPage(true));
            throw new Error("The product addition to cart requires a valid user account, test has failed.");
        }
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Home Page Product (Chanel Coco Noir Eau De) To Cart Test Result (guest).png")).setFullPage(true));
    }

    //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test method (as a registered user)
    protected void addSingleHomePageProductToShopCartModalRegUserTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        HomePage homePage = new HomePage(page);
        FiltersModal filtersModal = new FiltersModal(page);
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click navbar "Filters" modal button
        homePage.clickNavbarFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //log filters modal price data
        logFiltersModalPriceData(page);
        //capture screenshot of the filters modal display before filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display Before Filter Application.png")).setFullPage(true));
        //click set customer rating radio button
        filtersModal.clickSetCustomerRatingRadioBtn(1);
        //set the set price from range ($100)
        filtersModal.setTheSetPriceFrom(13);
        //log filters modal price data (to verify the price range has been applied)
        logFiltersModalPriceData(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //capture screenshot of the filters modal display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display After Filter Application.png")).setFullPage(true));
        //click "Apply filters" button
        filtersModal.clickApplyFiltersBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //log home page product data (to verify the filters have been applied)
        logHomePageProductData(page);
        //capture screenshot of the home page display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display After Set Filter Application.png")).setFullPage(true));
        //click set product ("Chanel Coco Noir Eau De") "Add to cart" button
        homePage.clickSetProductAddToCartBtn(0);
        //click header shopping cart button
        generalPage.clickHeaderShopCartIconBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log shopping cart product data
        logShopCartModalProductData(page);
        //assert the expected product has been added to shopping cart modal
        String expectedProductName = "Chanel Coco Noir Eau De";
        String actualProductName = shopCartModal.getShopCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected/actual product name doesn't match expectations.");
        //assert the expected product quantity is displayed in shopping cart modal
        String expectedProductQty = "1";
        String actualProductQty = shopCartModal.getShopCartModalProductQty().getFirst();
        assertEquals(expectedProductQty, actualProductQty, "The expected/actual product quantities doesn't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Home Page Product (Chanel Coco Noir Eau De) To Shopping Cart Modal Test Result (registered user).png")).setFullPage(true));
    }

    //add multiple home page products to shopping cart modal test method (as a registered user)
    protected void addMultipleHomePageProductsToShopCartModalRegUserTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        HomePage homePage = new HomePage(page);
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click set product ("Powder Canister") "Add to cart" button
        homePage.clickSetProductAddToCartBtn(2);
        //click set product ("Calvin Klein CK One") "Add to cart" button
        homePage.clickSetProductAddToCartBtn(5);
        //click header shopping cart button
        generalPage.clickHeaderShopCartIconBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log shopping cart product data
        logShopCartModalProductData(page);
        //assert the expected products have been added to shopping cart modal
        List<String> expectedMultipleProductNames = Arrays.asList("Powder Canister", "Calvin Klein CK One");
        List<String> actualMultipleProductNames = shopCartModal.getShopCartModalProductName();
        assertEquals(expectedMultipleProductNames, actualMultipleProductNames, "The expected/actual multiple product names don't match expectations.");
        //assert the expected product quantities are displayed in shopping cart modal
        List<String> expectedMultipleProductQuantities = Arrays.asList("1", "1");
        List<String> actualMultipleProductQuantities = shopCartModal.getShopCartModalProductQty();
        assertEquals(expectedMultipleProductQuantities, actualMultipleProductQuantities, "The expected/actual multiple product quantities don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Multiple Home Page Products (Powder Canister, Calvin Klein CK One) To Shopping Cart Modal Test Result (registered user).png")).setFullPage(true));
    }

    //add set product(s) to shopping cart test

    //add set product(s) to shopping cart test method
    protected void addProductToCartTest(){
        BasePage basePage = new BasePage(page);
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log shopping cart product data
        logShopCartModalProductData(page);
        //click "View Cart" button
        shopCartModal.clickViewCartBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets onto shopping cart page
        String expectedShopCartURL = "https://ecommerce-app-coral-three.vercel.app/cart";
        String actualShopCartURL = page.url();
        assertEquals(expectedShopCartURL, actualShopCartURL, "The expected/actual shopping cart URLs don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Home Page Product(s) To Cart Test Result (registered user).png")).setFullPage(true));
    }

    //update set product quantity in shopping cart test

    //update set product quantity in shopping cart test method
    protected void updateSetProductQuantityInShopCartModalTest(){
        BasePage basePage = new BasePage(page);
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log shopping cart product data
        logShopCartModalProductData(page);
        //capture screenshot of the shopping cart modal before product quantity update
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shopping Cart Modal Display Before Product Quantity Update.png")).setFullPage(true));
        //update set product quantity in shopping cart modal
        shopCartModal.clickShopCartModalSetProductQtyIncreaseBtn(0, 4);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the expected product quantity is displayed in shopping cart modal
        String expectedProductQty = "5";
        String actualProductQty = shopCartModal.getShopCartModalProductQty().getFirst();
        assertEquals(expectedProductQty, actualProductQty, "The expected/actual product quantities doesn't match expectations. Expected: " + expectedProductQty + ", Actual: " + actualProductQty);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Update Set Product Quantity In Shopping Cart Modal Test Result (registered user).png")).setFullPage(true));
    }

    //remove product from shopping cart test

    //remove product from shopping cart test method
    protected void removeProductFromShopCartModalTest(){
        BasePage basePage = new BasePage(page);
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log shopping cart product data
        logShopCartModalProductData(page);
        //capture screenshot of the shopping cart modal before product removal
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shopping Cart Modal Display Before Product Removal.png")).setFullPage(true));
        //click set product remove button
        shopCartModal.clickSetProductRemoveBtn(0);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //empty shopping cart modal web element assert
        isEmptyShoppingCartModalWebElementVisible(page);
        //empty shopping cart modal text element assert
        isEmptyShoppingCartModalTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Product Removal From Shopping Cart Modal Test Result (registered user).png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add home page product(s) to wishlist

    //add single home page product ("Essence Mascara Lash Princess") to wishlist test method (as a guest)
    protected void addSingleHomePageProductToWishlistGuestTest(){
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //hover over set product ("Essence Mascara Lash Princess") card
        homePage.hoverOverSetProductCard(0);
        //click set product ("Essence Mascara Lash Princess") "Add to wishlist" button
        homePage.clickSetProductAddToWishlistBtn(0);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //assert the user gets onto wishlist page, throw an error otherwise
        String expectedWishlistURL = "https://ecommerce-app-coral-three.vercel.app/wishlist/";
        String actualWishlistURL = page.url();
        assertEquals(expectedWishlistURL, actualWishlistURL, "The expected/actual wishlist URL doesn't match expectations. The (guest) user has failed to add product to wishlist, test has failed");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product (Essence Mascara Lash Princess) To Wishlist Test Result (as guest).png")).setFullPage(true));
    }

    //add single home page product ("Eyeshadow Palette with Mirror") to wishlist test method (as a registered user)
    protected void addSingleHomePageProductToWishlistRegUserTest(){
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //hover over set product ("Eyeshadow Palette with Mirror") card
        homePage.hoverOverSetProductCard(0);
        //click set product ("Eyeshadow Palette with Mirror") "Add to wishlist" button
        homePage.clickSetProductAddToWishlistBtn(0);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //assert the user gets onto wishlist page, throw an error otherwise
        String expectedWishlistURL = "https://ecommerce-app-coral-three.vercel.app/wishlist/";
        String actualWishlistURL = page.url();
        assertEquals(expectedWishlistURL, actualWishlistURL, "The expected/actual wishlist URL doesn't match expectations. The registered user has failed to add product to wishlist, test has failed");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product (Eyeshadow Palette with Mirror) To Wishlist Test Result (as registered user).png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //multiple products "Quick view" feature tests

    //multiple products ("Essence Mascara Lash Princess", "Eyeshadow Palette with Mirror", "Powder Canister", "Red Lipstick", "Red Nail Polish", "Calvin Klein CK One") "Quick view" feature test method (as guest)
    protected void multipleProductsQuickViewFeatureGuestTest(){
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page (guest view) web element assert
        isGeneralPageGuestWebElementVisible(page);
        //general page header (guest view) text element assert
        isGeneralPageHeaderGuestTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //hover over set product ("Essence Mascara Lash Princess") card
        homePage.hoverOverSetProductCard(0);
        //click set product ("Essence Mascara Lash Princess") "Quick view" button
        homePage.clickSetProductQuickViewBtn(0);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Eyeshadow Palette with Mirror") card
        homePage.hoverOverSetProductCard(1);
        //click set product ("Eyeshadow Palette with Mirror") "Quick view" button
        homePage.clickSetProductQuickViewBtn(1);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Powder Canister") card
        homePage.hoverOverSetProductCard(2);
        //click set product ("Powder Canister") "Quick view" button
        homePage.clickSetProductQuickViewBtn(2);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Red Lipstick") card
        homePage.hoverOverSetProductCard(3);
        //click set product ("Red Lipstick") "Quick view" button
        homePage.clickSetProductQuickViewBtn(3);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Red Nail Polish") card
        homePage.hoverOverSetProductCard(4);
        //click set product ("Red Nail Polish") "Quick view" button
        homePage.clickSetProductQuickViewBtn(4);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Calvin Klein CK One") card
        homePage.hoverOverSetProductCard(5);
        //click set product ("Calvin Klein CK One") "Quick view" button
        homePage.clickSetProductQuickViewBtn(5);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //log the product quick view texts data
        logHomePageProductQuickViewTextData(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Multiple Products (Essence Mascara Lash Princess, Eyeshadow Palette with Mirror, Powder Canister, Red Lipstick, Red Nail Polish, Calvin Klein CK One) Quick View Feature Test Result (as guest).png")).setFullPage(true));
    }

    //multiple products ("Chanel Coco Noir Eau De", "Dior J'adore", "Dolce Shine Eau de", "Gucci Bloom Eau de", "Annibale Colombo Bed", "Bedside Table African Cherry") "Quick view" feature test method (as registered user)
    protected void multipleProductsQuickViewFeatureRegUserTest(){
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //hover over set product ("Chanel Coco Noir Eau De") card
        homePage.hoverOverSetProductCard(6);
        //click set product ("Chanel Coco Noir Eau De") "Quick view" button
        homePage.clickSetProductQuickViewBtn(6);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Dior J'adore") card
        homePage.hoverOverSetProductCard(7);
        //click set product ("Dior J'adore") "Quick view" button
        homePage.clickSetProductQuickViewBtn(7);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Dolce Shine Eau de") card
        homePage.hoverOverSetProductCard(8);
        //click set product ("Dolce Shine Eau de") "Quick view" button
        homePage.clickSetProductQuickViewBtn(8);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Gucci Bloom Eau de") card
        homePage.hoverOverSetProductCard(9);
        //click set product ("Gucci Bloom Eau de") "Quick view" button
        homePage.clickSetProductQuickViewBtn(9);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Annibale Colombo Bed") card
        homePage.hoverOverSetProductCard(10);
        //click set product ("Annibale Colombo Bed") "Quick view" button
        homePage.clickSetProductQuickViewBtn(10);
        //wait for the text to be registered (explicit wait doesn't seem to work here)
        page.waitForTimeout(800);
        //hover over set product ("Bedside Table African Cherry") card
        homePage.hoverOverSetProductCard(11);
        //click set product ("Bedside Table African Cherry") "Quick view" button
        homePage.clickSetProductQuickViewBtn(11);
        //wait for elements to load
        basePage.waitForPageLoad(3500);
        //log the product quick view texts data
        logHomePageProductQuickViewTextData(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Multiple Products (Chanel Coco Noir Eau De, Dior J'adore, Dolce Shine Eau de, Gucci Bloom Eau de, Annibale Colombo Bed, Bedside Table African Cherry) Quick View Feature Test Result (as registered user).png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add set category product(s) to shopping cart modal tests (due to guest user requiring an account for addition of the product to cart, further guest branch testing is ignored)

    //add set single category ("Groceries") product ("Cat Food") to shopping cart modal test method (as a registered user)
    protected void addSetCategoryProductToCartModalRegUserTest() {
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        HomePage homePage = new HomePage(page);
        FiltersModal filtersModal = new FiltersModal(page);
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click navbar "Filters" modal button
        homePage.clickNavbarFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //log filters modal price data
        logFiltersModalPriceData(page);
        //capture screenshot of the filters modal display before filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display Before Filter Application.png")).setFullPage(true));
        //click set category ("Groceries") rating radio button
        filtersModal.clickSetCategoryRadioBtn(4);
        //click close filters modal button
        filtersModal.clickCloseFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //log home page product data (to verify the filters have been applied)
        logHomePageProductData(page);
        //capture screenshot of the home page display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display After Set (Category) Filter Application.png")).setFullPage(true));
        //hover over set product card ("Cat Food") method
        homePage.hoverOverSetProductCard(2);
        //click set product ("Cat Food") card method
        homePage.clickSetProductCard(2);
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //assert the user gets ont expected product page
        String expectedSingleProductPageName = "Cat Food";
        String actualSingleProductPageName = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedSingleProductPageName, actualSingleProductPageName, "The expected/actual single product page name don't match expectations. Expected: " + expectedSingleProductPageName + ", Actual: " + actualSingleProductPageName);
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product (Cat Food) Page Display.png")).setFullPage(true));
        //click "Add to Cart" button
        singleProductPage.clickAddToCartBtn();
        //click header shopping cart icon button
        generalPage.clickHeaderShopCartIconBtn();
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product Page (Cat Food) Product To Shopping Cart Test Result.png")).setFullPage(true));
    }

    //add set single category ("Furniture") multiple products ("Annibale Colombo Bed") to shopping cart modal test method (as a registered user)
    protected void addSetCategoryMultipleProductsToCartModalRegUserTest() {
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        HomePage homePage = new HomePage(page);
        FiltersModal filtersModal = new FiltersModal(page);
        SingleProductPage singleProductPage = new SingleProductPage(page);
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click navbar "Filters" modal button
        homePage.clickNavbarFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //log filters modal price data
        logFiltersModalPriceData(page);
        //capture screenshot of the filters modal display before filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display Before Filter Application.png")).setFullPage(true));
        //click set category ("Furniture") rating radio button
        filtersModal.clickSetCategoryRadioBtn(3);
        //click close filters modal button
        filtersModal.clickCloseFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //log home page product data (to verify the filters have been applied)
        logHomePageProductData(page);
        //capture screenshot of the home page display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display After Set (Category) Filter Application.png")).setFullPage(true));
        //hover over set product card ("Annibale Colombo Bed") method
        homePage.hoverOverSetProductCard(0);
        //click set product ("Annibale Colombo Bed") card method
        homePage.clickSetProductCard(0);
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //assert the user gets ont expected product page
        String expectedSingleProductPageName = "Annibale Colombo Bed";
        String actualSingleProductPageName = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedSingleProductPageName, actualSingleProductPageName, "The expected/actual single product page name don't match expectations. Expected: " + expectedSingleProductPageName + ", Actual: " + actualSingleProductPageName);
        //capture screenshot of the single product page display before product quantity update
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product (Annibale Colombo Bed) Page Display Before Quantity Update.png")).setFullPage(true));
        //click product quantity increase button
        singleProductPage.clickSingleProductPageProductQtyIncreaseBtn(4);
        //capture screenshot of the single product page display after product quantity increase
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product (Annibale Colombo Bed) Page Display After Quantity Increase.png")).setFullPage(true));
        //log single product page product data (to verify the quantity has been altered)
        logSingleProductPageProductData(page);
        //click product quantity decrease button
        singleProductPage.clickSingleProductPageProductQtyDecreaseBtn(1);
        //capture screenshot of the single product page display after product quantity decrease
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product (Annibale Colombo Bed) Page Display After Quantity Decrease.png")).setFullPage(true));
        //log single product page product data (to verify the quantity has been altered)
        logSingleProductPageProductData(page);
        //click "Add to Cart" button
        singleProductPage.clickAddToCartBtn();
        //click header shopping cart icon button
        generalPage.clickHeaderShopCartIconBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the expected product quantity is present in the shopping cart modal
        String expectedProductQty = "4";
        String actualProductQty = shopCartModal.getShopCartModalProductQty().getFirst();
        assertEquals(expectedProductQty, actualProductQty, "The expected/actual product (Annibale Colombo Bed) quantities don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product Page (Annibale Colombo Bed) Product To Shopping Cart Test Result.png")).setFullPage(true));
    }

    //add set category product to wishlist test

    //add set single category ("Groceries") product ("Cat Food") to wishlist test method (as a registered user)
    protected void addSetCategoryProductToWishlistRegUserTest() {
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        FiltersModal filtersModal = new FiltersModal(page);
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click navbar "Filters" modal button
        homePage.clickNavbarFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //log filters modal price data
        logFiltersModalPriceData(page);
        //capture screenshot of the filters modal display before filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display Before Filter Application.png")).setFullPage(true));
        //click set category ("Groceries") rating radio button
        filtersModal.clickSetCategoryRadioBtn(4);
        //click close filters modal button
        filtersModal.clickCloseFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //log home page product data (to verify the filters have been applied)
        logHomePageProductData(page);
        //capture screenshot of the home page display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display After Set (Category) Filter Application.png")).setFullPage(true));
        //hover over set product card ("Cat Food") method
        homePage.hoverOverSetProductCard(2);
        //click set product ("Cat Food") card method
        homePage.clickSetProductCard(2);
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //assert the user gets ont expected product page
        String expectedSingleProductPageName = "Cat Food";
        String actualSingleProductPageName = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedSingleProductPageName, actualSingleProductPageName, "The expected/actual single product page name don't match expectations. Expected: " + expectedSingleProductPageName + ", Actual: " + actualSingleProductPageName);
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product (Cat Food) Page Display.png")).setFullPage(true));
        //click "Add to Wishlist" button
        singleProductPage.clickAddToWishlistBtn();
        //assert the user gets onto wishlist page, throw an error otherwise
        String expectedWishlistURL = "https://ecommerce-app-coral-three.vercel.app/wishlist/";
        String actualWishlistURL = page.url();
        assertEquals(expectedWishlistURL, actualWishlistURL, "The expected/actual wishlist URL doesn't match expectations. The (registered) user has failed to add product (Cat Food) to wishlist, test has failed");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product Page (Cat Food) Product To Wishlist Test Result.png")).setFullPage(true));
    }

    //add set category product to wishlist tests

    //add set single category ("Groceries") product ("Beef Steak") to compare list test method (as a registered user)
    protected void addSetCategoryProductToCompareListRegUserTest() {
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        FiltersModal filtersModal = new FiltersModal(page);
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //log home page product data
        logHomePageProductData(page);
        //click navbar "Filters" modal button
        homePage.clickNavbarFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //filters modal web element assert
        isFiltersModalWebElementVisible(page);
        //filters modal text element assert
        isFiltersModalTextElementAsExpected(page);
        //log filters modal price data
        logFiltersModalPriceData(page);
        //capture screenshot of the filters modal display before filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Filters Modal Display Before Filter Application.png")).setFullPage(true));
        //click set category ("Groceries") rating radio button
        filtersModal.clickSetCategoryRadioBtn(4);
        //click close filters modal button
        filtersModal.clickCloseFiltersModalBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //log home page product data (to verify the filters have been applied)
        logHomePageProductData(page);
        //capture screenshot of the home page display after filter application
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display After Set (Category) Filter Application.png")).setFullPage(true));
        //hover over set product card ("Beef Steak") method
        homePage.hoverOverSetProductCard(1);
        //click set product ("Beef Steak") card method
        homePage.clickSetProductCard(1);
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //assert the user gets ont expected product page
        String expectedSingleProductPageName = "Beef Steak";
        String actualSingleProductPageName = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedSingleProductPageName, actualSingleProductPageName, "The expected/actual single product page name don't match expectations. Expected: " + expectedSingleProductPageName + ", Actual: " + actualSingleProductPageName);
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product (Beef Steak) Page Display.png")).setFullPage(true));
        //click "Add to compare list" button
        singleProductPage.clickAddToCompareListBtn();
        //assert the user gets onto compare list page, throw an error otherwise
        String expectedWishlistURL = "https://ecommerce-app-coral-three.vercel.app/comparelist/";
        String actualWishlistURL = page.url();
        assertEquals(expectedWishlistURL, actualWishlistURL, "The expected/actual compare list URL doesn't match expectations. The (registered) user has failed to add product (Beef Steak) to compare list, test has failed");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product Page (Beef Steak) Product To Compare List Test Result.png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add product(s) to checkout test

    //add product(s) to checkout test method (only registered users have this feature)
    protected void addProductToCheckoutTest(){
        BasePage basePage = new BasePage(page);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart page web element assert
        isShoppingCartPageWebElementVisible(page);
        //if the free shipping price tag is present, then execute its assert, otherwise, execute its price assert (the loggers are executed either with or without shipping price)
        boolean isFreeShipTagVisible = shoppingCartPage.isShoppingCartPageSummaryFreeShippingPriceTagVisible();
        if (isFreeShipTagVisible) {
            isShoppingCartPageFreeShipPriceWebElementVisible(page);
            logShoppingCartPageNoShipPriceProductData(page);
        } else {
            isShoppingCartPageShipPriceWebElementVisible(page);
            logShoppingCartPageProductData(page);
        }
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(page);
        //capture screenshot of the shopping cart page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shopping Cart Page Display.png")).setFullPage(true));
        //click "Proceed to checkout" button
        shoppingCartPage.clickShopCartPageProceedToCheckoutBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the user gets onto checkout page
        String expectedCheckoutPageURL = "https://ecommerce-app-coral-three.vercel.app/checkout";
        String actualCheckoutPageURL = page.url();
        assertEquals(expectedCheckoutPageURL, actualCheckoutPageURL, "The expected/actual checkout page URLs don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Product(s) To Checkout Test Result.png")).setFullPage(true));
    }

    //update product quantity in shopping cart page test

    //update product quantity in shopping cart page test method (only registered users have this feature)
    protected void updateProductQtyInShopCartPageTest(){
        BasePage basePage = new BasePage(page);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart page web element assert
        isShoppingCartPageWebElementVisible(page);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(page);
        //log shopping cart page product data
        logShoppingCartPageNoShipPriceProductData(page);
        //capture screenshot of the shopping cart page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shopping Cart Page Display.png")).setFullPage(true));
        //click set product quantity increase button
        shoppingCartPage.clickShopCartPageSetProductQtyIncreaseBtn(0, 4);
        //log shopping cart page product data (to verify the product quantity has been altered)
        logShoppingCartPageNoShipPriceProductData(page);
        //assert the set product quantity is set onto the expected count
        String expectedProductQuantity = "5";
        String actualProductQuantity = shoppingCartPage.getShoppingCartPageProductQty().getFirst();
        assertEquals(expectedProductQuantity, actualProductQuantity, "The expected/actual product quantity counts don't match expectations.");
        //assert the order total price is altered onto the expected price
        String expectedOrderPrice = "$714.95";
        String actualOrderPrice = shoppingCartPage.getShoppingCartPageTotalPrice();
        assertEquals(expectedOrderPrice, actualOrderPrice, "The expected/actual order prices don't match expectations.");
        //click set product quantity decrease button
        shoppingCartPage.clickShopCartPageSetProductQtyDecreaseBtn(0, 2);
        //log shopping cart page product data (to verify the product quantity has been altered)
        logShoppingCartPageNoShipPriceProductData(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //assert the set product quantity is set onto the expected count
        String expectedProductDecreasedQuantity = "3";
        String actualProductDecreasedQuantity = shoppingCartPage.getShoppingCartPageProductQty().getFirst();
        assertEquals(expectedProductDecreasedQuantity, actualProductDecreasedQuantity, "The expected/actual product decreased quantity counts don't match expectations.");
        //assert the order total price is altered onto the expected price
        String expectedOrderDecreasedPrice = "$428.97";
        String actualOrderDecreasedPrice = shoppingCartPage.getShoppingCartPageTotalPrice();
        assertEquals(expectedOrderDecreasedPrice, actualOrderDecreasedPrice, "The expected/actual order decreased prices don't match expectations.");
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Update Product Quantity In Shopping Cart Page Test Result.png")).setFullPage(true));
    }

    //remove single product from shopping cart tests

    //remove single product from shopping cart test method (only registered users have this feature)
    protected void productRemovalFromShopCartPageTest(){
        BasePage basePage = new BasePage(page);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart page web element assert
        isShoppingCartPageWebElementVisible(page);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(page);
        //log shopping cart page product data
        logShoppingCartPageNoShipPriceProductData(page);
        //capture screenshot of the shopping cart page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shopping Cart Page Display.png")).setFullPage(true));
        //click set product remove button
        shoppingCartPage.clickShopCartPageSetProductRemoveBtn(0);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //empty shopping cart page web elements
        isEmptyShoppingCartPageWebElementVisible(page);
        //empty shopping cart page text element assert
        isEmptyShoppingCartPageTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Update Product Quantity In Shopping Cart Page Test Result.png")).setFullPage(true));
    }

    //remove single product (Clear Cart button) from shopping cart test method (only registered users have this feature)
    protected void productRemovalFromShopCartPageClearCartBtnTest(){
        BasePage basePage = new BasePage(page);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //shopping cart page web element assert
        isShoppingCartPageWebElementVisible(page);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(page);
        //log shopping cart page product data
        logShoppingCartPageNoShipPriceProductData(page);
        //capture screenshot of the shopping cart page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shopping Cart Page Display.png")).setFullPage(true));
        //click "Clear Cart" button
        shoppingCartPage.clickShopCartPageClearCartBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //empty shopping cart page web elements
        isEmptyShoppingCartPageWebElementVisible(page);
        //empty shopping cart page text element assert
        isEmptyShoppingCartPageTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Update Product Quantity In Shopping Cart Page Test Result.png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid product checkout verification tests (only registered users have this feature)

    //valid product checkout (credit card payment method) verification test method (as registered user)
    protected void validProductCheckoutCreditCardConfirmationTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user credit card data getter
        checkoutPageValidInput.validCheckoutUserCredCardInputDataGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageValidInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageValidInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageValidInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageValidInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Valid Data Input (credit card).png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page order review section web element assert
        isCheckoutPageOrderReviewSectionWebElementVisible(page);
        //checkout page order review text element assert
        isCheckoutPageOrderReviewSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //capture screenshot of the checkout page order review section display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Order Review Section Display (credit card).png")).setFullPage(true));
        //log checkout order summary section data
        logCheckoutPageOrderSummaryData(page);
        //click "Place order" button (same element as "Next" button)
        checkoutPage.clickNextBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page order confirmation section web element assert
        isCheckoutPageOrderConfirmedSectionWebElementVisible(page);
        //checkout page order confirmation section text element assert
        isCheckoutPageOrderConfirmationSectionTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid Product(s) (credit card) Checkout Confirmation Test Result.png")).setFullPage(true));
    }

    //valid product checkout (debit card payment method) verification test method (as registered user)
    protected void validProductCheckoutDebitCardConfirmationTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //click set payment method ("Debit card") radio button
        checkoutPage.clickSetPayMethodRadioBtn(1);
        //valid checkout user credit card data getter
        checkoutPageValidInput.validCheckoutUserCredCardInputDataGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageValidInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageValidInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageValidInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageValidInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Valid Data Input (debit card).png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page order review section web element assert
        isCheckoutPageOrderReviewSectionWebElementVisible(page);
        //checkout page order review text element assert
        isCheckoutPageOrderReviewSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //capture screenshot of the checkout page order review section display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Order Review Section Display (debit card).png")).setFullPage(true));
        //log checkout order summary section data
        logCheckoutPageOrderSummaryData(page);
        //click "Place order" button (same element as "Next" button)
        checkoutPage.clickNextBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page order confirmation section web element assert
        isCheckoutPageOrderConfirmedSectionWebElementVisible(page);
        //checkout page order confirmation section text element assert
        isCheckoutPageOrderConfirmationSectionTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid Product(s) (debit card) Checkout Confirmation Test Result.png")).setFullPage(true));
    }

    //valid product checkout (paypal payment method) verification test method (as registered user)
    protected void validProductCheckoutPayPalConfirmationTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //click set payment method ("PayPal") radio button
        checkoutPage.clickSetPayMethodRadioBtn(2);
        //capture screenshot of the checkout page payment method section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Valid Data Input (paypal).png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page order review section web element assert
        isCheckoutPageOrderReviewSectionWebElementVisible(page);
        //checkout page order review text element assert
        isCheckoutPageOrderReviewSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //capture screenshot of the checkout page order review section display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Order Review Section Display (paypal).png")).setFullPage(true));
        //log checkout order summary section data
        logCheckoutPageOrderSummaryData(page);
        //click "Place order" button (same element as "Next" button)
        checkoutPage.clickNextBtn();
        //wait for elements to load (explicit wait doesn't seem to work here)
        page.waitForTimeout(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page order confirmation section web element assert
        isCheckoutPageOrderConfirmedSectionWebElementVisible(page);
        //checkout page order confirmation section text element assert
        isCheckoutPageOrderConfirmationSectionTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid Product(s) (paypal) Checkout Confirmation Test Result.png")).setFullPage(true));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //invalid product checkout verification tests (only registered users have this feature)

    //no singular input

    //invalid product checkout (credit card payment method) verification test method - no shipping first name (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipFirstNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address first name
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoFirstNameGetter();
        //don't input checkout shipping address first name into shipping address first name input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressFirstNameIntoShipAddressFirstNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping first name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping First Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping First Name.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address first name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping last name (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipLastNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address last name
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoLastNameGetter();
        //don't input checkout shipping address last name into shipping address last name input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressLastNameIntoShipAddressLastNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping last name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping Last Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping Last Name.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address last name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping email (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipEmailTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address email
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoEmailGetter();
        //don't input checkout shipping address email into shipping address email input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressEmailIntoShipAddressEmailInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping Email.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping Email.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address email error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping phone (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipPhoneTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address phone
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoPhoneGetter();
        //don't input checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping phone
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping Phone.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping Phone.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address phone error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping address (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipAddressTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoAddressGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //don't input checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping address
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping Address.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping Address.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping address city (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipCityTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address city
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoCityGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //don't input checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping address city
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping City.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping City.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address city error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping address state (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipStateTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address state
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoStateGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //don't input checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping address state
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping State.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping State.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address state error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping address post code (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipPostCodeTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address post code
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoPostCodeGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //don't input checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping address post code
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping Post Code.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping Post Code.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address post code error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - no shipping address country (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationNoShipCountryTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - no shipping address country
        checkoutPageNoSingularInput.invalidCheckoutUserShipAddressInputDataNoCountryGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageNoSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //don't input checkout shipping address country into shipping address country input field
        checkoutPageNoSingularInput.inputNoCheckoutPageShipAddressCountryIntoShipAddressCountryInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - no user shipping address country
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - No Shipping Country.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Shipping Country.png")).setFullPage(true));
            throw new Error("The checkout page missing shipping address country error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - no credit cardholder name
    protected void invalidProductCheckoutCreditCardConfirmationNoCredCardholderNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - no credit cardholder name
        checkoutPageNoSingularInput.invalidCheckoutUserCredCardInputDataNoCardholderNameGetter();
        //don't input checkout credit cardholder name into credit cardholder name input field
        checkoutPageNoSingularInput.inputNoCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - no credit cardholder name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - No Credit Cardholder Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Credit Cardholder Name.png")).setFullPage(true));
            throw new Error("The checkout page missing credit cardholder name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - no credit card number
    protected void invalidProductCheckoutCreditCardConfirmationNoCredCardNumberTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - no credit card number
        checkoutPageNoSingularInput.invalidCheckoutUserCredCardInputDataNoCardNumberGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //don't input checkout credit card number into credit card number input field
        checkoutPageNoSingularInput.inputNoCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - no credit card number
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - No Credit Card Number.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Credit Card Number.png")).setFullPage(true));
            throw new Error("The checkout page missing credit card number error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - no credit card expiration date
    protected void invalidProductCheckoutCreditCardConfirmationNoCredCardExpDateTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - no credit card expiration date
        checkoutPageNoSingularInput.invalidCheckoutUserCredCardInputDataNoCardExpDateGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //don't input checkout credit card expiration date into credit card expiration date input field
        checkoutPageNoSingularInput.inputNoCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - no credit card expiration date
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - No Credit Card Expiry Date.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Credit Card Expiry Date.png")).setFullPage(true));
            throw new Error("The checkout page missing credit card expiration date error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - no credit card CVV number
    protected void invalidProductCheckoutCreditCardConfirmationNoCredCardCVVTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - no credit card CVV number
        checkoutPageNoSingularInput.invalidCheckoutUserCredCardInputDataNoCardCVVGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageNoSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //don't input checkout credit card CVV number into credit card CVV number input field
        checkoutPageNoSingularInput.inputNoCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - no credit card CVV number
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - No Credit Card CVV Number.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - No Credit Card CVV Number.png")).setFullPage(true));
            throw new Error("The checkout page missing credit card CVV number error wasn't triggered, test has failed.");
        }
    }

    //too short singular input

    //invalid product checkout (credit card payment method) verification test method - too short shipping first name (1 char) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipFirstNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address first name (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortFirstNameGetter();
        //input too short checkout shipping address first name into shipping address first name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressFirstNameIntoShipAddressFirstNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping first name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping First Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping First Name.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address first name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping last name (1 char) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipLastNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address last name (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortLastNameGetter();
        //input too short checkout shipping address last name into shipping address last name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressLastNameIntoShipAddressLastNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping last name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping Last Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping Last Name.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address last name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping email (1 char -> name, domain) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipEmailTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address email (1 char -> name, domain)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortEmailGetter();
        //input too short checkout shipping address email into shipping address email input field (1 char -> name, domain)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressEmailIntoShipAddressEmailInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping Email.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping Email.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address email error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping phone (2 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipPhoneTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address phone (2 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortPhoneGetter();
        //input too short checkout shipping address phone into shipping address phone input field (2 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping phone
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping Phone.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping Phone.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address phone error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping address (3 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipAddressTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address (3 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortAddressGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input too short checkout shipping address into shipping address textarea (3 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping address
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping Address.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping Address.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping city (1 char) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipCityTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address city (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortCityGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input too short checkout shipping address city into shipping address city input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping address city
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping City.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping City.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address city error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping state (1 char) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipStateTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address state (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortStateGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input too short checkout shipping address state into shipping address state input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping address state
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping State.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping State.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address state error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping post code (4 digits) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipPostCodeTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address post code (4 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortPostCodeGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input too short checkout shipping address post code into shipping address post code input field (4 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping address post code
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping Post Code.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping Post Code.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address post code error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too short shipping country (2 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortShipCountryTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too short shipping address country (2 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutUserShipAddressInputDataTooShortCountryGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooShortSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //input too short checkout shipping address country into shipping address country input field (2 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageShipAddressCountryIntoShipAddressCountryInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too short user shipping address country (2 chars)
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Short Shipping Country.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Shipping Country.png")).setFullPage(true));
            throw new Error("The checkout page too short shipping address country error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too short credit cardholder name (3 chars)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortCredCardholderNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too short credit cardholder name (3 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutUserCredCardInputDataTooShortCardholderNameGetter();
        //input too short checkout credit cardholder name into credit cardholder name input field (3 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too short credit cardholder name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Short Credit Cardholder Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Credit Cardholder Name.png")).setFullPage(true));
            throw new Error("The checkout page too short credit cardholder name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too short credit card number (15 digits)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortCredCardNumberTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too short credit card number (15 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutUserCredCardInputDataTooShortCardNumberGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input too short checkout credit card number into credit card number input field (15 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too short credit card number
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Short Credit Card Number.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Credit Card Number.png")).setFullPage(true));
            throw new Error("The checkout page too short credit card number error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too short credit card expiration date (4 chars)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortCredCardExpDateTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too short credit card expiration date (4 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutUserCredCardInputDataTooShortCardExpDateGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input too short checkout credit card expiration date into credit card expiration date input field (4 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too short credit card expiration date
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Short Credit Card Expiry Date.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Credit Card Expiry Date.png")).setFullPage(true));
            throw new Error("The checkout page too short credit card expiration date error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too short credit card CVV number (2 digits)
    protected void invalidProductCheckoutCreditCardConfirmationTooShortCredCardCVVTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too short credit card CVV number (2 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutUserCredCardInputDataTooShortCardCVVGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageTooShortSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input too short checkout credit card CVV number into credit card CVV number input field (2 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too short credit card CVV number
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Short Credit Card CVV Number.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Short Credit Card CVV Number.png")).setFullPage(true));
            throw new Error("The checkout page too short credit card CVV number error wasn't triggered, test has failed.");
        }
    }

    //too long singular input

    //invalid product checkout (credit card payment method) verification test method - too long shipping first name (100 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipFirstNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping address first name (100 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongFirstNameGetter();
        //input too long checkout shipping address first name into shipping address first name input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressFirstNameIntoShipAddressFirstNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping first name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping First Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping First Name.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address first name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping last name (100 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipLastNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping address last name (100 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongLastNameGetter();
        //input too long checkout shipping address last name into shipping address last name input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressLastNameIntoShipAddressLastNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping last name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping Last Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping Last Name.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address last name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping email (100 chars -> name, domain) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipEmailTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping address email (100 chars -> name, domain)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongEmailGetter();
        //input too long checkout shipping address email into shipping address email input field (100 chars -> name, domain)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressEmailIntoShipAddressEmailInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping Email.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping Email.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address email error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping phone (16 digits) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipPhoneTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping address phone (16 digits)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongPhoneGetter();
        //input too long checkout shipping address phone into shipping address phone input field (16 digits)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping address phone
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping Phone.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping Phone.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address phone error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping address (100 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipAddressTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping address (100 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongAddressGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input too long checkout shipping address into shipping address textarea (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping address
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping Address.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping Address.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping city (100 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipCityTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping city (100 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongCityGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input too long checkout shipping address city into shipping address city input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping address city
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping City.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping City.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address city error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping state (100 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipStateTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping state (100 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongStateGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input too long checkout shipping address state into shipping address state input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping address state
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping State.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping State.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address state error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping post code (6 digits) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipPostCodeTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping post code (6 digits)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongPostCodeGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input too long checkout shipping address post code into shipping address post code input field (6 digits)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping address post code
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping Post Code.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping Post Code.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address post code error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - too long shipping post code (100 chars) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongShipCountryTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - too long shipping country (100 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserShipAddressInputDataTooLongCountryGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageTooLongSingularInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //input too long checkout shipping address country into shipping address country input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageShipAddressCountryIntoShipAddressCountryInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - too long user shipping address country
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Too Long Shipping Country.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Shipping Country.png")).setFullPage(true));
            throw new Error("The checkout page too long shipping address country error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too long credit cardholder name (201 chars)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongCredCardholderNameTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too long credit cardholder name (201 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserCredCardInputDataTooLongCardholderNameGetter();
        //input too long checkout credit cardholder name into credit cardholder name input field (201 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too long credit cardholder name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Long Credit Cardholder Name.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Credit Cardholder Name.png")).setFullPage(true));
            throw new Error("The checkout page too long credit cardholder name error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too long credit card number (17 digits)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongCredCardNumberTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too long credit cardholder name (17 digits)
        checkoutPageTooLongSingularInput.invalidCheckoutUserCredCardInputDataTooLongCardNumberGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input too long checkout credit card number into credit card number input field (17 digits)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too long credit card number
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Long Credit Card Number.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Credit Card Number.png")).setFullPage(true));
            throw new Error("The checkout page too long credit card number error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too long credit card expiration date (6 chars)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongCredCardExpDateTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too long credit card expiration date (6 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutUserCredCardInputDataTooLongCardExpDateGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input too long checkout credit card expiration date into credit card expiration date input field (6 digits)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too long credit card expiration date
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Long Credit Card Expiry Date.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Credit Card Expiry Date.png")).setFullPage(true));
            throw new Error("The checkout page too long credit card expiration date error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - too long credit card CVV number (6 chars)
    protected void invalidProductCheckoutCreditCardConfirmationTooLongCredCardCVVTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - too long credit card CVV number (4 digits)
        checkoutPageTooLongSingularInput.invalidCheckoutUserCredCardInputDataTooLongCardCVVGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageTooLongSingularInput.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input too long checkout credit card CVV number into credit card CVV number input field (4 digits)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - too long credit card CVV number
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Too Long Credit Card CVV Number.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Too Long Credit Card CVV Number.png")).setFullPage(true));
            throw new Error("The checkout page too long credit card CVV number error wasn't triggered, test has failed.");
        }
    }

    //invalid singular input format

    //invalid product checkout (credit card payment method) verification test method - invalid shipping first name format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipFirstNameFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address first name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidFirstNameFormatGetter();
        //input invalid checkout shipping address first name format into shipping address first name input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressFirstNameFormatIntoShipAddressFirstNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping first name format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping First Name Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping First Name Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address first name input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping last name format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipLastNameFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address last name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidLastNameFormatGetter();
        //input invalid checkout shipping address last name format into shipping address last name input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressLastNameFormatIntoShipAddressLastNameInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping last name format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping Last Name Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping Last Name Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address last name input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping email format (missing '@') (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipEmailFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address email format (missing '@')
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidEmailFormatGetter();
        //input invalid checkout shipping address email format into shipping address email input field (missing '@')
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressEmailFormatIntoShipAddressEmailInputField();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping email format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping Email Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping Email Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address email input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping phone format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipPhoneFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address phone format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidPhoneFormatGetter();
        //input invalid checkout shipping address phone format into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressPhoneFormatIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping phone format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping Phone Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping Phone Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address phone input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping address format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipAddressFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidAddressFormatGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input invalid checkout shipping address format into shipping address textarea (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressFormatIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping address format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping Address Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping Address Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping city format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipCityFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address city format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidCityFormatGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input invalid checkout shipping address city format into shipping address city input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressCityFormatIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping address city format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping City Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping City Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address city input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping state format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipStateFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address state format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidStateFormatGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input invalid checkout shipping address state format into shipping address state input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressStateFormatIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping address state format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping State Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping State Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address state input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping post code format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipPostCodeFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address post code format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidPostCodeFormatGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input invalid checkout shipping address post code format into shipping address post code input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressPostCodeFormatIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping address post code format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping Post Code Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping Post Code Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address post code input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method - invalid shipping country format (special symbols only) (as registered user)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidShipCountryFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user shipping address input data getter - invalid shipping address country format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserShipAddressInputDataInvalidCountryFormatGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //input invalid checkout shipping address country format into shipping address country input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageShipAddressCountryFormatIntoShipAddressCountryInputField();
        //capture screenshot of the checkout page shipping address section display after invalid data input - invalid user shipping address country format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Invalid Data Input - Invalid Shipping Country Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Shipping Country Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid shipping address country input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - invalid credit cardholder name format (special symbols only)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidCredCardholderNameFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - invalid credit cardholder name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserCredCardInputDataInvalidCardholderNameFormatGetter();
        //input invalid checkout credit cardholder name format into credit cardholder name input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageCredCardCardholderNameFormatIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - invalid credit cardholder name format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Invalid Credit Cardholder Name Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Credit Cardholder Name Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid credit cardholder name input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - invalid credit card number format (special symbols only)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidCredCardNumberFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - invalid credit card number format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserCredCardInputDataInvalidCardNumberFormatGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input invalid checkout credit card number format into credit card number input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageCredCardNumberFormatIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - invalid credit card number format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Invalid Credit Card Number Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Credit Card Number Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid credit card number input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - invalid credit card expiration date format (special symbols only)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidCredCardExpDateFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - invalid credit card expiration date format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserCredCardInputDataInvalidCardExpDateFormatGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input invalid checkout credit card expiration date format into credit card expiration date input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageCredCardExpiryDateFormatIntoCredCardExpiryDateInputField();
        //input valid checkout credit card CVV number into credit card CVV number input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardCVVIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - invalid credit card expiration date format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Invalid Credit Card Expiry Date Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Credit Card Expiry Date Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid credit card expiration date input format error wasn't triggered, test has failed.");
        }
    }

    //invalid product checkout (credit card payment method) verification test method (as registered user) - invalid credit card CVV number format (special symbols only)
    protected void invalidProductCheckoutCreditCardConfirmationInvalidCredCardCVVFormatTest(){
        BasePage basePage = new BasePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        CheckoutPageValidInput checkoutPageValidInput = new CheckoutPageValidInput(page);
        SignUpPage signUpPage = new SignUpPage(page);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(page);
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page shipping address section web element assert
        isCheckoutPageShipAddressSectionWebElementVisible(page);
        //checkout page shipping address section text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page shipping address section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display Before Data Input.png")).setFullPage(true));
        //valid checkout user shipping address input data getter
        checkoutPageValidInput.validCheckoutUserShipAddressInputDataGetter();
        //input valid checkout shipping address phone into shipping address phone input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField();
        //input valid checkout shipping address into shipping address textarea
        checkoutPageValidInput.inputCheckoutPageShipAddressIntoShipAddressTextarea();
        //input valid checkout shipping address city into shipping address city input field
        checkoutPageValidInput.inputCheckoutPageShipAddressCityIntoShipAddressCityInputField();
        //input valid checkout shipping address state into shipping address state input field
        checkoutPageValidInput.inputCheckoutPageShipAddressStateIntoShipAddressStateInputField();
        //input valid checkout shipping address post code into shipping address post code input field
        checkoutPageValidInput.inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField();
        //capture screenshot of the checkout page shipping address section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Shipping Address Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //wait for elements to load
        basePage.waitForPageLoad(3000);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //general page header (registered user view) web element assert
        isGeneralPageRegUserWebElementVisible(page);
        //general page breadcrumb web element assert (since this page has one)
        isGeneralPageBreadcrumbWebElementVisible(page);
        //log general page displayed data
        logGeneralPageData(page);
        //checkout page web element assert (element that most its sections share)
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert (element that most its sections share)
        isCheckoutPageTextElementAsExpected(page);
        //checkout page payment method section web element assert
        isCheckoutPagePayMethodSectionWebElementVisible(page);
        //checkout page payment method text element assert
        isCheckoutPagePayMethodSectionTextElementAsExpected(page);
        //checkout page aside order summary section web element assert
        isCheckoutPageAsideOrderSummarySectionWebElementVisible(page);
        //checkout page aside order summary section text element assert
        isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(page);
        //log checkout page aside order summary displayed order data
        logCheckoutPageAsideOrderSummaryProductData(page);
        //capture screenshot of the checkout page payment method section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display Before Data Input.png")).setFullPage(true));
        //invalid checkout user credit card data getter - invalid credit card CVV number format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidCheckoutUserCredCardInputDataInvalidCardCVVFormatGetter(signUpPage);
        //input valid checkout credit cardholder name into credit cardholder name input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField();
        //input valid checkout credit card number into credit card number input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardNumberIntoCredCardNumberInputField();
        //input valid checkout credit card expiration date into credit card expiration date input field
        checkoutPageInvalidSingularInputFormat.inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField();
        //input invalid checkout credit card CVV number into credit card CVV number input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidCheckoutPageCredCardCVVFormatIntoCredCardCVVInputField();
        //capture screenshot of the checkout page payment method section display after invalid data input - invalid credit card CVV number format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Payment Method Section Display After Invalid Data Input (credit card) - Invalid Credit Card CVV Number Format.png")).setFullPage(true));
        //click "Next" button
        checkoutPage.clickNextBtn();
        //since there's no error displayed, throw an error, if next section title appears
        if(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible()){
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid Product(s) (credit card) Checkout Confirmation Test Result - Invalid Credit Card CVV Number Format.png")).setFullPage(true));
            throw new Error("The checkout page invalid credit card CVV number input format error wasn't triggered, test has failed.");
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
