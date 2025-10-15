package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductPageTest extends TestMethods{

    //set category product(s) addition to cart tests

    // Test 011 -> set category ("Groceries") single product ("Cat Food") addition to cart test (as a registered user)
    @Test
    @DisplayName("Add Single Set Product To Shopping Cart Test")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Set_Category")
    void singleCategoryProductAddToCartTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart modal test (as a registered user)
        addSetCategoryProductToCartModalRegUserTest();
        //set category ("Groceries") single product ("Cat Food") addition to shopping cart test (as a registered user)
        addProductToCartTest();
    }

    // Test 011a -> set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to cart test (as a registered user)
    @Test
    @DisplayName("Add Multiple Set Products To Shopping Cart Test")
    @Tag("Add_Multiple_Products_To_Cart")
    @Tag("Set_Category")
    void singleCategoryMultipleProductsAddToCartTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart modal test (as a registered user)
        addSetCategoryMultipleProductsToCartModalRegUserTest();
        //set category ("Furniture") single product ("Annibale Colombo Bed") addition to shopping cart test (as a registered user)
        addProductToCartTest();
    }

    //set category product addition to wishlist test

    // Test 012 -> set category ("Groceries") single product ("Cat Food") addition to wishlist test (as a registered user) (the product fails to be added to wishlist, test has failed)
    @Test
    @DisplayName("Add Single Set Product To Wishlist Test")
    @Tag("Add_Single_Product_To_Wishlist")
    @Tag("Set_Category")
    void singleCategoryProductAddToWishlistTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Groceries") single product ("Cat Food") addition to wishlist test (as a registered user)
        addSetCategoryProductToWishlistRegUserTest();
    }

    //set category product(s) addition to compare list test

    // Test 013 -> set category ("Groceries") single product ("Beef Steak") addition to compare list test (as a registered user) (the product fails to be added to compare list, test has failed)
    @Test
    @DisplayName("Add Single Set Product To Compare List Test")
    @Tag("Add_Single_Product_To_Compare_List")
    @Tag("Set_Category")
    void singleCategoryProductAddToCompareListTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //set category ("Groceries") single product ("Beef Steak") addition to compare list test (as a registered user)
        addSetCategoryProductToCompareListRegUserTest();
    }

}
