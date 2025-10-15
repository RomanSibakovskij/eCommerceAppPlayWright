package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageInvalidSingularInputTest extends TestMethods {

    //invalid product(s) checkout verification tests

    //invalid singular input format

    // Test 024am -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping first name format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping First Name Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipFirstNameFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping first name format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipFirstNameFormatTest();
    }

    // Test 024an -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping last name format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping Last Name Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipLastNameFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping last name format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipLastNameFormatTest();
    }

    // Test 024ao -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping email format (missing '@') (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping Email Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipEmailFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping email format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipEmailFormatTest();
    }

    // Test 024ap -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping phone format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping Phone Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipPhoneFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping phone format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipPhoneFormatTest();
    }

    // Test 024aq -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping address format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping Address Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipAddressFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping address format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipAddressFormatTest();
    }

    // Test 024ar -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping city format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping City Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipCityFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping city format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipCityFormatTest();
    }

    // Test 024as -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping state format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping State Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipStateFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping state format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipStateFormatTest();
    }

    // Test 024at -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping post code format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping Post Code Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipPostCodeFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping post code format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipPostCodeFormatTest();
    }

    // Test 024au -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping country format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Shipping Country Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidShipCountryFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping country format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidShipCountryFormatTest();
    }

    // Test 024av -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit cardholder name format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Credit Cardholder Name Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidCredCardholderNameFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit cardholder name format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidCredCardholderNameFormatTest();
    }

    // Test 024aw -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card number format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Credit Card Number Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidCredCardNumberFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card number format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidCredCardNumberFormatTest();
    }

    // Test 024ax -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card expiration date format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Credit Card Expiry Date Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidCredCardExpDateFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card expiration date format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidCredCardExpDateFormatTest();
    }

    // Test 024ay -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card CVV number format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - Invalid Credit Card CVV Number Format (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationInvalidCredCardCVVFormatTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card CVV number format (as registered user)
        invalidProductCheckoutCreditCardConfirmationInvalidCredCardCVVFormatTest();
    }

}
