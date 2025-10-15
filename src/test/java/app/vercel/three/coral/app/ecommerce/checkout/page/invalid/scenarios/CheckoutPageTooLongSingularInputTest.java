package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTooLongSingularInputTest extends TestMethods {

    //invalid product(s) checkout verification tests

    //too long singular input

    // Test 024z -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping first name (100 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping First Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipFirstNameTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping first name (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipFirstNameTest();
    }

    // Test 024aa -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping last name (100 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping Last Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipLastNameTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping last name (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipLastNameTest();
    }

    // Test 024ab -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping email (100 chars -> name, domain) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping Email (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipEmailTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping email (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipEmailTest();
    }

    // Test 024ac -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping phone (16 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping Phone (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipPhoneTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping phone (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipPhoneTest();
    }

    // Test 024ad -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping address (100 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping Address (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipAddressTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping address (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipAddressTest();
    }

    // Test 024ae -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping city (100 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping City (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipCityTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping city (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipCityTest();
    }

    // Test 024af -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping state (100 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping State (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipStateTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping state (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipStateTest();
    }

    // Test 024ag -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping post code (6 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping Post Code (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipPostCodeTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping post code (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipPostCodeTest();
    }

    // Test 024ah -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping country (100 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Shipping Country (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongShipCountryTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping country (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongShipCountryTest();
    }

    // Test 024ai -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit cardholder name (201 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Credit Cardholder Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongCredCardholderNameTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit cardholder name (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongCredCardholderNameTest();
    }

    // Test 024aj -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card number (17 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Credit Card Number (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongCredCardNumberTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card number (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongCredCardNumberTest();
    }

    // Test 024ak -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card expiration date (6 chars) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Credit Card Expiry Date (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongCredCardExpDateTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card expiration date (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongCredCardExpDateTest();
    }

    // Test 024al -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card CVV number (4 digits) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Too Long Credit Card CVV Number (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationTooLongCredCardCVVTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card CVV number (as registered user)
        invalidProductCheckoutCreditCardConfirmationTooLongCredCardCVVTest();
    }

}
