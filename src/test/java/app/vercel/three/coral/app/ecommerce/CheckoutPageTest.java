package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //product(s) checkout verification tests (only registered users have this feature)

    //credit card payment method

    // Test 018 -> valid single home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test (as registered user)
    @Test
    @DisplayName("Valid Single Home Page Product (Credit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Credit_Card_Checkout")
    @Tag("Test_As_Reg_User")
    void validSingleHomeProductCheckoutConfirmationTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //add single home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
        addProductToCheckoutTest();
        //valid single home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test (as registered user)
        validProductCheckoutCreditCardConfirmationTest();
    }

    // Test 018a -> valid multiple home page products ("Powder Canister", "Calvin Klein CK One") (credit card) check out confirmation test (as registered user)
    @Test
    @DisplayName("Valid Multiple Home Page Products (Credit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("Credit_Card_Checkout")
    @Tag("Test_As_Reg_User")
    void validMultipleHomeProductsCheckoutConfirmationTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addMultipleHomePageProductsToShopCartModalRegUserTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addProductToCartTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to check out test (as registered user)
        addProductToCheckoutTest();
        //valid multiple home page products ("Powder Canister", "Calvin Klein CK One") (credit card) check out confirmation test (as registered user)
        validProductCheckoutCreditCardConfirmationTest();
    }

    // Test 019 -> valid set category ("Groceries") single product ("Cat Food") (credit card) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Valid Single Set Product (Credit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Credit_Card_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void validSingleCategoryProductCheckoutConfirmTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart modal test (as a registered user)
        addSetCategoryProductToCartModalRegUserTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart test (as a registered user)
        addProductToCartTest();
        //set category ("Groceries") single product ("Cat Food") addition to check out test (as a registered user)
        addProductToCheckoutTest();
        //valid set category ("Groceries") single product ("Cat Food") (credit card) check out confirmation test (as a registered user)
        validProductCheckoutCreditCardConfirmationTest();
    }

    // Test 019a -> valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (credit card) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Valid Multiple Set Products (Credit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("Credit_Card_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void validSingleCategoryMultipleProductsCheckoutConfirmTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart modal test (as a registered user)
        addSetCategoryMultipleProductsToCartModalRegUserTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart test (as a registered user)
        addProductToCartTest();
        //set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to check out test (as a registered user)
        addProductToCheckoutTest();
        //valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (credit card) check out confirmation test (as a registered user)
        validProductCheckoutCreditCardConfirmationTest();
    }

    //debit card payment method tests

    // Test 020 -> valid single set home page product ("Chanel Coco Noir Eau De") (debit card) check out verification test (as registered user)
    @Test
    @DisplayName("Valid Single Home Page Product (Debit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Debit_Card_Checkout")
    @Tag("Test_As_Reg_User")
    void validSingleHomeProductDebCardCheckoutConfirmationTest(){
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
        //valid single set home page product ("Chanel Coco Noir Eau De") (debit card) check out verification test (as registered user)
        validProductCheckoutDebitCardConfirmationTest();
    }

    // Test 020a -> valid multiple set home page products ("Powder Canister", "Calvin Klein CK One") (debit card) check out confirmation test (as registered user)
    @Test
    @DisplayName("Valid Multiple Home Page Product (Debit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("Debit_Card_Checkout")
    @Tag("Test_As_Reg_User")
    void validMultipleHomeProductsDebCardCheckoutConfirmationTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addMultipleHomePageProductsToShopCartModalRegUserTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addProductToCartTest();
        //add multiple set home page products ("Powder Canister", "Calvin Klein CK One") to check out test (as registered user)
        addProductToCheckoutTest();
        //valid multiple set home page products ("Powder Canister", "Calvin Klein CK One") (debit card) check out confirmation test (as registered user)
        validProductCheckoutDebitCardConfirmationTest();
    }

    // Test 021 -> valid set category ("Groceries") single product ("Cat Food") (debit card) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Valid Single Set Product (Debit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Single_Product_Checkout_Confirmation_Test")
    @Tag("Debit_Card_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void validSingleCategoryProductDebCardCheckoutConfirmTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart modal test (as a registered user)
        addSetCategoryProductToCartModalRegUserTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart test (as a registered user)
        addProductToCartTest();
        //set category ("Groceries") single product ("Cat Food") addition to check out test (as a registered user)
        addProductToCheckoutTest();
        //valid set category ("Groceries") single product ("Cat Food") (debit card) check out confirmation test (as a registered user)
        validProductCheckoutDebitCardConfirmationTest();
    }

    // Test 021a -> valid set category ("Furniture") multiple products ("Annibale Colombo Bed") check out confirmation test (as a registered user)
    @Test
    @DisplayName("Valid Multiple Set Products (Debit Card) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("Debit_Card_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void validSingleCategoryMultipleProductsDebCardCheckoutConfirmTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart modal test (as a registered user)
        addSetCategoryMultipleProductsToCartModalRegUserTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart test (as a registered user)
        addProductToCartTest();
        //set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to check out test (as a registered user)
        addProductToCheckoutTest();
        //valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (debit card) check out confirmation test (as a registered user)
        validProductCheckoutDebitCardConfirmationTest();
    }

    //paypal payment method tests

    // Test 022 -> valid single set home page product ("Chanel Coco Noir Eau De") (PayPal) check out verification test (as registered user)
    @Test
    @DisplayName("Valid Single Home Page Product (PayPal) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Single_Product_Checkout_Confirmation_Test")
    @Tag("PayPal_Checkout")
    @Tag("Test_As_Reg_User")
    void validSingleHomeProductPayPalCheckoutConfirmationTest(){
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
        //valid single set home page product ("Chanel Coco Noir Eau De") (PayPal) check out verification test (as registered user)
        validProductCheckoutPayPalConfirmationTest();
    }

    // Test 022a -> valid multiple set home page products ("Powder Canister", "Calvin Klein CK One") (PayPal) check out confirmation test (as registered user)
    @Test
    @DisplayName("Valid Multiple Home Page Product (PayPal) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("PayPal_Checkout")
    @Tag("Test_As_Reg_User")
    void validMultipleHomeProductsPayPalCheckoutConfirmationTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addMultipleHomePageProductsToShopCartModalRegUserTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addProductToCartTest();
        //add multiple set home page products ("Powder Canister", "Calvin Klein CK One") to check out test (as registered user)
        addProductToCheckoutTest();
        //valid multiple set home page products ("Powder Canister", "Calvin Klein CK One") (PayPal) check out confirmation test (as registered user)
        validProductCheckoutPayPalConfirmationTest();
    }

    // Test 023 -> valid set category ("Groceries") single product ("Cat Food") (PayPal) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Valid Single Set Product (PayPal) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Single_Product_Checkout_Confirmation_Test")
    @Tag("PayPal_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void validSingleCategoryProductPayPalCheckoutConfirmTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart modal test (as a registered user)
        addSetCategoryProductToCartModalRegUserTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart test (as a registered user)
        addProductToCartTest();
        //set category ("Groceries") single product ("Cat Food") addition to check out test (as a registered user)
        addProductToCheckoutTest();
        //valid set category ("Groceries") single product ("Cat Food") (PayPal) check out confirmation test (as a registered user)
        validProductCheckoutPayPalConfirmationTest();
    }

    // Test 023a -> valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (PayPal) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Valid Multiple Set Products (PayPal) Checkout Confirmation Test (as registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("PayPal_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void validSingleCategoryMultipleProductsPayPalCheckoutConfirmTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart modal test (as a registered user)
        addSetCategoryMultipleProductsToCartModalRegUserTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart test (as a registered user)
        addProductToCartTest();
        //set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to check out test (as a registered user)
        addProductToCheckoutTest();
        //valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (PayPal) check out confirmation test (as a registered user)
        validProductCheckoutPayPalConfirmationTest();
    }

}
