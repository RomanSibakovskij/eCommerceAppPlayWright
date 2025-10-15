package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTooShortSingularInputTest extends TestMethods {

    //invalid product(s) checkout verification tests

    //too short singular input

    // Test 024m -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping first name (1 char) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping First Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipFirstNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping first name (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipFirstNameTest();
    }

    // Test 024n -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping last name (1 char) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping Last Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipLastNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping last name (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipLastNameTest();
    }

    // Test 024o -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping email (1 char -> name, domain) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping Email (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipEmailTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping email (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipEmailTest();
    }

    // Test 024p -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping phone (2 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping Phone (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipPhoneTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping phone (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipPhoneTest();
    }

    // Test 024q -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping address (3 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping Address (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipAddressTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping address (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipAddressTest();
    }

    // Test 024r -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping city (1 char) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping City (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipCityTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping city (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipCityTest();
    }

    // Test 024s -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping state (1 char) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping State (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipStateTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping state (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipStateTest();
    }

    // Test 024t -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping post code (4 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping Post Code (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipPostCodeTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping post code (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipPostCodeTest();
    }

    // Test 024u -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping country (2 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Shipping Country (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortShipCountryTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping country (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortShipCountryTest();
    }

    // Test 024v -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit cardholder name (3 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Credit Cardholder Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortCredCardholderNameTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit cardholder name (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortCredCardholderNameTest();
    }

    // Test 024w -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card number (15 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Credit Card Number (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortCredCardNumberTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card number (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortCredCardNumberTest();
    }

    // Test 024x -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card expiration date (4 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Credit Card Expiry Date (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortCredCardExpDateTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card expiration date (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortCredCardExpDateTest();
    }

    // Test 024y -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card CVV number (2 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Short Credit Card CVV Number (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooShortCredCardCVVTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card CVV number (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooShortCredCardCVVTest();
    }

}
