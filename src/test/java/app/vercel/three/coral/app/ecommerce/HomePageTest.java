package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //important note: the guest user cannot perform operations, all of them require a valid user account

    //user navigation to sign up page test

    // Test 001 -> navigate to sign up page test
    @Test
    @DisplayName("Navigate To Sign Up Page Test")
    @Tag("User_Navigation_To_Sign_Up_Page")
    void userNavigateToSignUpPageTest(){
        navigateToSignUpPageTest();
    }

    //user account view test

    // Test 005 -> view user account test (the user fails to get onto user account page, test has failed)
    @Test
    @DisplayName("View User Account Test")
    @Tag("View_User_Account")
    void viewUserAccTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //view user account test
        viewUserAccountTest();
    }

    //add set home page product(s) to cart tests

    // Test 006 -> add single set home page product ("Chanel Coco Noir Eau De") to cart test (as guest) (the user account is required, test has failed, guest branch testing is halted here)
    @Test
    @DisplayName("Add Single Home Page Product To Cart Test (as guest)")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Test_As_Guest")
    void addSingleHomeProductToCartGuestTest(){
        //add single set home page product ("Chanel Coco Noir Eau De") to cart test (as guest)
        addSingleHomePageProductToCartGuestTest();
    }


    // Test 006a -> add single set home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
    @Test
    @DisplayName("Add Single Home Page Product To Cart Test (as registered user)")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Test_As_Reg_User")
    void addSingleHomeProductToCartTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
    }

    // Test 006b -> add multiple set home page products ("Powder Canister", "Calvin Klein CK One") to cart test (as registered user)
    @Test
    @DisplayName("Add Multiple Home Page Product To Cart Test (as registered user)")
    @Tag("Add_Multiple_Products_To_Cart")
    @Tag("Test_As_Reg_User")
    void addMultipleHomeProductsToCartTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addMultipleHomePageProductsToShopCartModalRegUserTest();
        //add multiple home page products ("Powder Canister", "Calvin Klein CK One") to shopping cart modal test (as registered user)
        addProductToCartTest();
    }

    //update set product quantity in shopping cart modal test

    // Test 007 -> update set product quantity in shopping cart modal test
    @Test
    @DisplayName("Update Set Product Quantity In Shopping Cart Test (as registered user)")
    @Tag("Update_Product_Quantity_In_Cart_Modal")
    @Tag("Test_As_Reg_User")
    void updateHomeProductQtyInCartModalTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //update set home page product quantity in shopping cart modal test
        updateSetProductQuantityInShopCartModalTest();
    }

    //product removal from shopping cart modal test

    // Test 008 -> product removal from shopping cart modal test
    @Test
    @DisplayName("Product Removal From Shopping Cart Test (as registered user)")
    @Tag("Product_Removal_From_Cart_Modal")
    @Tag("Test_As_Reg_User")
    void productRemovalFromCartModalTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //product removal from shopping cart modal testt
        removeProductFromShopCartModalTest();
    }

    //add single home page product to wishlist tests

    // Test 009 -> add single set home page product ("Essence Mascara Lash Princess") to wishlist test (as guest) (the user account is required, test has failed, guest branch testing is halted here)
    @Test
    @DisplayName("Add Single Home Page Product To Wishlist Test (as guest)")
    @Tag("Add_Single_Product_To_Wishlist")
    @Tag("Test_As_Guest")
    void addSingleHomeProductToWishlistGuestTest(){
        //add single set home page product ("Essence Mascara Lash Princess") to wishlist test (as guest)
        addSingleHomePageProductToWishlistGuestTest();
    }


    // Test 009a -> add single set home page product ("Eyeshadow Palette with Mirror") to wishlist test (as registered user) (the user doesn't get onto wishlist page, test has failed)
    @Test
    @DisplayName("Add Single Home Page Product To Wishlist Test (as registered user)")
    @Tag("Add_Single_Product_To_Wishlist")
    @Tag("Test_As_Reg_User")
    void addSingleHomeProductToWishlistRegUserTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Eyeshadow Palette with Mirror") to wishlist test (as registered user)
        addSingleHomePageProductToWishlistRegUserTest();
    }

    //home page products "Quick View" feature tests

    // Test 010 -> home page products ("Essence Mascara Lash Princess", "Eyeshadow Palette with Mirror", "Powder Canister", "Red Lipstick", "Red Nail Polish", "Calvin Klein CK One") "Quick View" feature test (as guest)
    @Test
    @DisplayName("Home Page Products Quick View Test (as guest)")
    @Tag("Home_Page_Products_Quick_View_Test")
    @Tag("Test_As_Guest")
    void multipleHomeProductsQuickViewGuestTest(){
        //home page products ("Essence Mascara Lash Princess", "Eyeshadow Palette with Mirror", "Powder Canister", "Red Lipstick", "Red Nail Polish", "Calvin Klein CK One") "Quick View" feature test (as guest) (the user account is required, test has failed, guest branch testing is halted here)
        multipleProductsQuickViewFeatureGuestTest();
    }


    // Test 010a -> home page products ("Chanel Coco Noir Eau De", "Dior J'adore", "Dolce Shine Eau de", "Gucci Bloom Eau de", "Annibale Colombo Bed", "Bedside Table African Cherry") "Quick View" feature test (as registered user)
    @Test
    @DisplayName("Home Page Products Quick View Test (as registered user)")
    @Tag("Home_Page_Products_Quick_View_Test")
    @Tag("Test_As_Reg_User")
    void multipleHomeProductsQuickViewRegUserTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //home page products ("Chanel Coco Noir Eau De", "Dior J'adore", "Dolce Shine Eau de", "Gucci Bloom Eau de", "Annibale Colombo Bed", "Bedside Table African Cherry") "Quick View" feature test (as registered user) (the user doesn't get onto wishlist page, test has failed)
        multipleProductsQuickViewFeatureRegUserTest();
    }

}
