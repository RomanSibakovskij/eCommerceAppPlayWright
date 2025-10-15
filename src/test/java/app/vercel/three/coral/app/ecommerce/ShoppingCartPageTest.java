package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //add set home page product(s) to checkout tests (only registered users have this feature)

    // Test 014 -> add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
    @Test
    @DisplayName("Add Single Home Page Product To Checkout Test (as registered user)")
    @Tag("Add_Single_Product_To_Checkout")
    @Tag("Test_As_Reg_User")
    void addSingleHomeProductToCheckoutTest(){
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
    }

    // Test 014a -> add multiple set home page products ("Powder Canister", "Calvin Klein CK One") to check out test (as registered user)
    @Test
    @DisplayName("Add Multiple Home Page Product To Checkout Test (as registered user)")
    @Tag("Add_Multiple_Products_To_Checkout")
    @Tag("Test_As_Reg_User")
    void addMultipleHomeProductsToCheckoutTest(){
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
    }

    //set category product(s) addition to checkout tests

    // Test 015 -> set category ("Groceries") single product ("Cat Food") addition to check out test (as a registered user)
    @Test
    @DisplayName("Add Single Set Product To Checkout Test")
    @Tag("Add_Single_Product_To_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void singleCategoryProductAddToCheckoutTest(){
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
    }

    // Test 015a -> set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to check out test (as a registered user)
    @Test
    @DisplayName("Add Multiple Set Products To Checkout Test")
    @Tag("Add_Multiple_Products_To_Checkout")
    @Tag("Set_Category")
    @Tag("Test_As_Reg_User")
    void singleCategoryMultipleProductsAddToCheckoutTest(){
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
    }

    //update product quantity in shopping cart page test (only registered users have this feature)

    // Test 016 -> update product quantity in shopping cart test (as registered user)
    @Test
    @DisplayName("Update Product Quantity In Shopping Cart Page Test (as registered user)")
    @Tag("Update_Product_Qty_In_Shopping_Cart")
    @Tag("Test_As_Reg_User")
    void updateProductQtyInShoppingCartTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //update product quantity in shopping cart test
        updateProductQtyInShopCartPageTest();
    }

    //remove product from shopping cart page tests (only registered users have this feature)

    // Test 017 -> remove single product from shopping cart test (as registered user) (the button fails to be clicked during automation run, test has failed)
    @Test
    @DisplayName("Remove Single Product From Shopping Cart Page Test (as registered user)")
    @Tag("Remove_Product_From_Shopping_Cart")
    @Tag("Test_As_Reg_User")
    void removeProductFromShoppingCartPageTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //remove single product from shopping cart test (as registered user)
        productRemovalFromShopCartPageTest();
    }

    // Test 017a -> remove single product (Clear Cart Button) from shopping cart test (as registered user) (the button fails to be clicked during automation run, test has failed)
    @Test
    @DisplayName("Remove Single Product (Clear Cart Button) From Shopping Cart Page Test (as registered user)")
    @Tag("Remove_Product_From_Shopping_Cart")
    @Tag("Test_As_Reg_User")
    void removeProductFromShoppingCartPageClearCartBtnTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //add single home page product ("Chanel Coco Noir Eau De") to shopping cart modal test (as registered user)
        addSingleHomePageProductToShopCartModalRegUserTest();
        //add single home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
        addProductToCartTest();
        //remove single product (Clear Cart Button) from shopping cart test (as registered user)
        productRemovalFromShopCartPageClearCartBtnTest();
    }

}
