package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageNoSingularInputTest extends TestMethods{

    //invalid product(s) checkout verification tests

    //no singular input

    // Test 024 -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping first name (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping First Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipFirstNameTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping first name (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipFirstNameTest();
    }

    // Test 024a -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping last name (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping Last Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipLastNameTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping last name (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipLastNameTest();
    }

    // Test 024b -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping email (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping Email (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipEmailTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping email (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipEmailTest();
    }

    // Test 024c -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping phone (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping Phone (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipPhoneTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping phone (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipPhoneTest();
    }

    // Test 024d -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping Address (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipAddressTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipAddressTest();
    }

    // Test 024e -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address city (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping City (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipCityTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping city (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipCityTest();
    }

    // Test 024f -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address state (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping State (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipStateTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping state (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipStateTest();
    }

    // Test 024g -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address post code (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping Post Code (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipPostCodeTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping post code (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipPostCodeTest();
    }

    // Test 024h -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address country (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Shipping Country (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoShipCountryTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping country (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoShipCountryTest();
    }

    // Test 024i -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit cardholder name (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Credit Cardholder Name (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoCredCardholderNameTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit cardholder name (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoCredCardholderNameTest();
    }

    // Test 024j -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card number (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Credit Card Number (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoCredCardNumberTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card number (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoCredCardNumberTest();
    }

    // Test 024k -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card expiration date (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Credit Card Expiration Date (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoCredCardExpDateTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card expiration date (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoCredCardExpDateTest();
    }

    // Test 024l -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card CVV number (as registered user) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Home Page Product Checkout Confirmation Test - No Credit Card CVV Number (as registered user)")
    @Tag("Invalid_Single_Product_Checkout_Confirmation_Test")
    @Tag("No_Singular_Input")
    @Tag("Test_As_Reg_User")
    void invalidProductCheckoutConfirmationNoCredCardCVVTest(){
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
        //invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card CVV number (as registered user)
        invalidProductCheckoutCreditCardConfirmationNoCredCardCVVTest();
    }

}
