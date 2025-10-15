package app.vercel.three.coral.app.ecommerce.page.text.element.assertion;

import app.vercel.three.coral.app.ecommerce.*;

import app.vercel.three.coral.app.ecommerce.modals.*;
import com.microsoft.playwright.Page;
import java.util.*;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public interface PageTextElementAsserts {

    Logger logger = LoggerFactory.getLogger(PageTextElementAsserts.class);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert text method
    default void isGeneralPageTextElementAsExpected(Page page){
        GeneralPage generalPage = new GeneralPage(page);
        //footer
        //assert the general page footer e-commerce title is as expected
        assertEquals("Ecommerce Store", generalPage.getFooterECommerceTitle(), "The footer e-commerce title doesn't match expectations.");
        //assert the general page footer e-commerce subtitle is as expected
        assertEquals("Your one-stop destination for quality products. We're committed to providing the best shopping experience with fast delivery and excellent customer service.", generalPage.getFooterECommerceSubtitle(), "The footer e-commerce subtitle doesn't match expectations.");
        //assert the general page footer address is as expected
        assertEquals("Karachi, Pakistan", generalPage.getFooterAddress(), "The footer address doesn't match expectations.");
        //assert the general page footer email address is as expected
        assertEquals("mubashirali504@gmail.com", generalPage.getFooterEmailAddress(), "The general page footer email address doesn't match expectations.");
        //assert the general page footer phone number is as expected
        assertEquals("+92 300 1234567", generalPage.getFooterPhoneNumber(), "The general page footer phone number doesn't match expectations.");
        //footer shop section
        //assert the general page footer shop section title is as expected
        assertEquals("Shop", generalPage.getFooterShopSectionTitle(), "The general page footer shop section title doesn't match expectations.");
        //list elements
        //assert the general page footer shop section link texts are as expected (as a list)
        List<String> footerShopSectionLinkTexts = Arrays.asList("All Products", "New Arrivals", "Best Sellers", "Sales & Deals");
        List<String> actualFooterShopSectionLinkTexts = generalPage.getFooterShopSectionLinkText();
        assertEquals(footerShopSectionLinkTexts, actualFooterShopSectionLinkTexts, "The general page footer shop section link texts don't match expectations.");
        //footer support section
        //assert the general page footer support section title is as expected
        assertEquals("Support", generalPage.getFooterSupportSectionTitle(), "The general page footer support section title doesn't match expectations.");
        //list elements
        //assert the general page footer support section link texts are as expected (as a list)
        List<String> footerSupportSectionLinkTexts = Arrays.asList("Contact Us", "Shipping Info", "Returns & Exchanges", "FAQ");
        List<String> actualFooterSupportSectionLinkTexts = generalPage.getFooterSupportSectionLinkText();
        assertEquals(footerSupportSectionLinkTexts, actualFooterSupportSectionLinkTexts, "The general page footer support section link texts don't match expectations.");
        //footer policies section
        //assert the general page footer policies section title is as expected
        assertEquals("Policies", generalPage.getFooterPoliciesSectionTitle(), "The general page footer policies section title doesn't match expectations.");
        //list elements
        //assert the general page footer policies section link texts are as expected (as a list)
        List<String> footerPoliciesSectionLinkTexts = Arrays.asList("Privacy Policy", "Terms of Service", "Refund Policy", "Cookie Policy");
        List<String> actualFooterPoliciesSectionLinkTexts = generalPage.getFooterPoliciesSectionLinkText();
        assertEquals(footerPoliciesSectionLinkTexts, actualFooterPoliciesSectionLinkTexts, "The general page footer policies section link texts don't match expectations.");
        //footer connect section
        //assert the general page footer connect section title is as expected
        assertEquals("Connect", generalPage.getFooterConnectSectionTitle(), "The general page footer connect section title doesn't match expectations.");
        //assert the general page footer connect section follow me text is as expected
        assertEquals("Follow me for updates and new projects", generalPage.getFooterConnectFollowMeText(), "The general page footer connect section follow me text doesn't match expectations.");
        //lower footer
        //assert the general page lower footer copyright text is as expected
        assertEquals("© 2025 Ecommerce Store. All rights reserved.", generalPage.getLowerFooterCopyrightText(), "The general page lower footer copyright text doesn't match expectations.");
        //assert the general page lower footer developed by text is as expected
        assertEquals("Developed by Mubashir Ali", generalPage.getLowerFooterDevelopedByText(), "The general page lower footer developed by text doesn't match expectations.");
        //list elements
        //assert the general page footer policies section link texts are as expected (as a list)
        List<String> lowerFooterSocialLinkTexts = Arrays.asList("GitHub", "LinkedIn", "Email");
        List<String> actualLowerFooterSocialLinkTexts = generalPage.getLowerFooterSocialLinkText();
        assertEquals(lowerFooterSocialLinkTexts, actualLowerFooterSocialLinkTexts, "The general page lower footer social link texts don't match expectations.");
    }

    //general page header (guest view) text element assert test method
    default void isGeneralPageHeaderGuestTextElementAsExpected(Page page){
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the general page header login button text is as expected
        assertEquals("LOGIN", generalPage.getHeaderLoginBtnText(), "The general page header login button (guest) text doesn't match expectations.");
        //assert the general page header sign up button text is as expected
        assertEquals("SIGN UP", generalPage.getHeaderSignUpBtnText(), "The general page header sign up button (guest) text doesn't match expectations.");
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page text element assert test method
    default void isHomePageTextElementAsExpected(Page page){
        HomePage homePage = new HomePage(page);
        //header
        //assert the home page header navbar filters modal button text is as expected
        assertEquals("FILTERS", homePage.getHomeNavbarFiltersModalMenuBtnText(), "The home page header navbar filters modal menu button doesn't match expectations.");
        //assert the home page header navbar categories subtitle is as expected
        assertEquals("Categories:", homePage.getHomeNavbarCategoriesSubtitle(), "The home page header navbar categories subtitle doesn't match expectations.");
        //list elements
        //assert the home page header navbar categories button texts are as expected (as a list)
        List<String> expectedHomePageNavbarCategoriesBtnTexts = Arrays.asList("All", "beauty", "fragrances", "furniture", "groceries", "home decoration", "kitchen accessories", "laptops", "mens shirts", "+16 more");
        //log the misspelling issues
        if ((expectedHomePageNavbarCategoriesBtnTexts.contains("men shirts"))) {
            logger.info("The men shirts category button text is spelled correctly.");
        } else {
            logger.error("The men shirts category button text isn't spelled correctly.");
        }
        List<String> actualHomePageNavbarCategoriesBtnTexts = homePage.getHomePageNavbarCategoriesBtnText();
        assertEquals(expectedHomePageNavbarCategoriesBtnTexts, actualHomePageNavbarCategoriesBtnTexts, "The home page header navbar categories button texts don't match expectations.");
        //product table (list elements)
        //assert the home page header navbar categories button texts are as expected (as a list)
        List<String> actualHomePageProductAddToCartBtnTexts = homePage.getHomePageProductAddToCartBtnText();
        assertTrue(actualHomePageProductAddToCartBtnTexts.stream().allMatch("Add to Cart"::equals), "Not all product 'Add to Cart' buttons have the expected text.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //sign up page text element assert test method
    default void isSignUpPageTextElementAsExpected(Page page){
        SignUpPage signUpPage = new SignUpPage(page);
        //assert the sign-up page title is as expected
        assertEquals("Create Account", signUpPage.getSignUpPageTitle(), "The sign up page title doesn't match expectations.");
        //assert the sign-up page subtitle is as expected
        assertEquals("Join us to start your shopping journey", signUpPage.getSignUpPageSubtitle(), "The sign up page subtitle doesn't match expectations.");
        //input form
        //assert the sign-up page first name subtext is as expected
        assertEquals("First Name", signUpPage.getSignUpPageFirstNameSubtext(), "The sign up page first name subtext doesn't match expectations.");
        //assert the sign-up page last name subtext is as expected
        assertEquals("Last Name", signUpPage.getSignUpPageLastNameSubtext(), "The sign up page last name subtext doesn't match expectations.");
        //assert the sign-up page email subtext is as expected
        assertEquals("Email Address", signUpPage.getSignUpPageEmailSubtext(), "The sign up page email subtext doesn't match expectations.");
        //assert the sign-up page password subtext is as expected
        assertEquals("Password", signUpPage.getSignUpPagePasswordSubtext(), "The sign up page password subtext doesn't match expectations.");
        //assert the sign-up page confirm password subtext is as expected
        assertEquals("Confirm Password", signUpPage.getSignUpPageConfirmPasswordSubtext(), "The sign up page confirm password subtext doesn't match expectations.");
        //buttons
        //assert the sign-up page create account button text is as expected
        assertEquals("CREATE ACCOUNT", signUpPage.getSignUpPageCreateAccountBtnText(), "The sign up page create account button text doesn't match expectations.");
        //assert the sign-up page have account text is as expected
        assertEquals("Already have an account?", signUpPage.getSignUpPageHaveAccountText(), "The sign up page have account text doesn't match expectations.");
        //assert the sign-up page sign up button text is as expected
        assertEquals("SIGN IN TO EXISTING ACCOUNT", signUpPage.getSignUpPageSignUpBtnText(), "The sign up page sign up button text doesn't match expectations.");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //sign in page text element assert test method
    default void isSignInPageTextElementAsExpected(Page page){
        SignInPage signInPage = new SignInPage(page);
        //assert the sign-in page title is as expected
        assertEquals("Welcome Back", signInPage.getSignInPageTitle(), "The sign in page title doesn't match expectations.");
        //assert the sign-in page subtitle is as expected
        assertEquals("Sign in to your account to continue shopping", signInPage.getSignInPageSubtitle(), "The sign in page subtitle doesn't match expectations.");
        //input field
        //assert the sign-in page email subtext is as expected
        assertEquals("Email Address", signInPage.getSignInPageEmailSubtext(), "The sign in page email subtext doesn't match expectations.");
        //assert the sign-in page password subtext is as expected
        assertEquals("Password", signInPage.getSignInPagePasswordSubtext(), "The sign in page password subtext doesn't match expectations.");
        //buttons
        //assert the sign-in page sign in button is as expected
        assertEquals("SIGN IN", signInPage.getSignInPageSignInBtnText(), "The sign in page sign in button doesn't match expectations.");
        //assert the sign-in page create account text is as expected
        assertEquals("New to our store?", signInPage.getSignInPageCreateAccountText(), "The sign in page create account text doesn't match expectations.");
        //assert the sign-in page create new account button is as expected
        assertEquals("CREATE NEW ACCOUNT", signInPage.getSignInPageCreateNewAccountBtnText(), "The sign in page create new account button doesn't match expectations.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //filters modal text element assert test method
    default void isFiltersModalTextElementAsExpected(Page page){
        FiltersModal filtersModal = new FiltersModal(page);
        //assert the filters modal title is as expected
        assertEquals("Filters", filtersModal.getFiltersModalTitle(), "The filters modal title doesn't match expectations.");
        //sort by dropdown section
        //assert the filters modal sort by dropdown section title is as expected
        assertEquals("Sort By", filtersModal.getFiltersModalSortByDropdownSectionTitle(), "The filters modal sort by dropdown section title doesn't match expectations.");
        //list elements
        //assert the filter modal sort by dropdown section radio button texts are as expected (as a list)
        List<String> expectedFiltersModalSortByRadioBtnTexts = Arrays.asList("Featured", "Price: Low to High", "Price: High to Low", "Top Rated", "Name: A to Z");
        List<String> actualFiltersModalSortByRadioBtnTexts = filtersModal.getFiltersModalSortByRadioBtnText();
        assertEquals(expectedFiltersModalSortByRadioBtnTexts, actualFiltersModalSortByRadioBtnTexts, "The filter modal sort by dropdown section radio button texts don't match expectations.");
        //price range dropdown section
        //assert the filters modal price range dropdown section title is as expected
        assertEquals("Price Range", filtersModal.getFiltersModalPriceRangeDropdownSectionTitle(), "The filters modal price range dropdown section title doesn't match expectations.");
        //customer rating dropdown section
        //assert the filters modal customer rating dropdown section title is as expected
        assertEquals("Customer Rating", filtersModal.getFiltersModalCustomerRatingDropdownSectionTitle(), "The filters modal customer rating dropdown section title doesn't match expectations.");
        //list elements
        //assert the filter modal customer rating dropdown section radio button texts are as expected (as a list)
        List<String> expectedFiltersModalCustRatingRadioBtnTexts = Arrays.asList("All Ratings", "4★ & above", "3★ & above", "2★ & above");
        List<String> actualFiltersModalCustRatingRadioBtnTexts = filtersModal.getFiltersModalCustomerRatingRadioBtnSubtext();
        assertEquals(expectedFiltersModalCustRatingRadioBtnTexts, actualFiltersModalCustRatingRadioBtnTexts, "The filter modal customer rating dropdown section radio button texts don't match expectations.");
        //categories dropdown section
        //assert the filters modal categories dropdown section title is as expected
        assertEquals("Categories", filtersModal.getFiltersModalCategoriesDropdownSectionTitle(), "The filters modal categories dropdown section title doesn't match expectations.");
        //list elements
        //assert the filter modal categories dropdown section radio button texts are as expected (as a list)
        List<String> expectedFiltersModalCategoriesRadioBtnTexts = Arrays.asList("All Categories", "beauty", "fragrances", "furniture", "groceries", "home decoration", "kitchen accessories", "laptops",
                "mens shirts", "mens shoes", "mens watches", "mobile accessories", "motorcycle", "skin care", "smartphones", "sports accessories", "sunglasses", "tablets", "tops", "vehicle", "womens bags",
                "womens dresses", "womens jewellery", "womens shoes", "womens watches");
        List<String> actualFiltersModalCategoriesRadioBtnTexts = filtersModal.getFiltersModalCategoriesRadioBtnSubtext();
        assertEquals(expectedFiltersModalCategoriesRadioBtnTexts, actualFiltersModalCategoriesRadioBtnTexts, "The filter modal categories dropdown section radio button texts don't match expectations.");
        //availability dropdown section
        //assert the filters modal availability dropdown section title is as expected
        assertEquals("Availability", filtersModal.getFiltersModalAvailabilityDropdownSectionTitle(), "The filters modal availability dropdown section title doesn't match expectations.");
        //assert the filters modal availability dropdown in stock checkbox subtext is as expected
        assertEquals("In Stock Only", filtersModal.getFiltersModalAvailabilityInStockCheckboxSubtext(), "The filters modal availability in stock checkbox subtext doesn't match expectations.");
        //assert the filters modal apply filters button text is as expected
        assertEquals("APPLY FILTERS", filtersModal.getFiltersModalApplyFiltersBtnText(), "The filters modal apply filters button text doesn't match expectations.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal text element assert test method
    default void isShoppingCartModalTextElementAsExpected(Page page){
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //assert the shopping cart modal title is as expected
        assertEquals("Your Cart", shopCartModal.getShoppingCartModalTitle(), "The shopping cart modal title doesn't match expectations.");
        //summary
        //assert the shopping cart modal total price subtext is as expected
        assertEquals("Total:", shopCartModal.getShoppingCartModalTotalSubtext(), "The shopping cart modal total price subtext doesn't match expectations.");
        //buttons
        //assert the shopping cart modal view cart button text is as expected
        assertEquals("VIEW CART", shopCartModal.getShoppingCartModalViewCartBtnText(), "The shopping cart modal view cart button text doesn't match expectations.");
        //assert the shopping cart modal checkout button text is as expected
        assertEquals("CHECKOUT", shopCartModal.getShoppingCartModalCheckoutBtnText(), "The shopping cart modal checkout button text doesn't match expectations.");
    }

    //empty shopping cart modal text element assert test method
    default void isEmptyShoppingCartModalTextElementAsExpected(Page page){
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //assert the empty shopping cart modal title is as expected
        assertEquals("Your cart is empty", shopCartModal.getEmptyShoppingCartModalTitle(), "The empty shopping cart modal title doesn't match expectations.");
        //assert the empty shopping cart modal start shopping button text is as expected
        assertEquals("START SHOPPING", shopCartModal.getEmptyShoppingCartModalStartShoppingBtnText(), "The empty shopping cart modal start shopping button text doesn't match expectations.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page text element assert test method
    default void isSingleProductPageTextElementAsExpected(Page page){
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page product quantity subtext is as expected
        assertEquals("Quantity", singleProductPage.getSingleProductPageProductQtySubtext(), "The single product page product quantity subtext doesn't match expectations.");
        //assert the single product page product free shipping subtext is as expected
        assertEquals("Free shipping", singleProductPage.getSingleProductPageProductFreeShippingSubtext(), "The single product page product free shipping subtext doesn't match expectations.");
        //assert the single product page product returns subtext is as expected
        assertEquals("30-day returns", singleProductPage.getSingleProductPageProductReturnsSubtext(), "The single product page product returns subtext doesn't match expectations.");
        //assert the single product page product warranty subtext is as expected
        assertEquals("2-year warranty", singleProductPage.getSingleProductPageProductWarrantySubtext(), "The single product page product warranty subtext doesn't match expectations.");
        //assert the single product page add to cart button text is as expected
        assertEquals("ADD TO CART", singleProductPage.getSingleProductPageAddToCartBtnText(), "The single product page add to cart button text doesn't match expectations.");
        //list elements
        //assert the single product page navbar button texts are as expected (as a list)
        List<String> expectedSingleProductPageNavbarBtnNames = Arrays.asList("DESCRIPTION", "SPECIFICATIONS", "REVIEWS");
        List<String> actualSingleProductPageNavbarBtnNames = singleProductPage.getSingleProductPageNavbarBtnText();
        assertEquals(expectedSingleProductPageNavbarBtnNames, actualSingleProductPageNavbarBtnNames, "The single product page navbar button texts aren't match expectations.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart page text element assert test method
    default void isShoppingCartPageTextElementAsExpected(Page page){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //assert the shopping cart page title is as expected
        assertEquals("Shopping Cart", shoppingCartPage.getShoppingCartPageTitle(), "The shopping cart page title doesn't match expectations.");
        //product table (list elements)
        //assert the shopping cart page product quantity subtexts are as expected (as a list)
        List<String> actualShoppingCartPageProductQtySubtexts = shoppingCartPage.getShoppingCartProductQtySubtext();
        assertTrue(actualShoppingCartPageProductQtySubtexts.stream().allMatch("Quantity:"::equals), "The shopping cart page product quantity subtexts don't match expectations.");
        //order summary section
        //assert the shopping cart page order summary section title is as expected
        assertEquals("Order Summary", shoppingCartPage.getShoppingCartPageSummarySectionTitle(), "The shopping cart page order summary section title doesn't match expectations.");
        //assert the shopping cart page order summary subtotal subtext is as expected
        assertEquals("Subtotal", shoppingCartPage.getShoppingCartPageSubtotalSubtext(), "The shopping cart page order summary subtotal subtext doesn't match expectations.");
        //assert the shopping cart page order summary shipping subtext is as expected
        assertEquals("Shipping:", shoppingCartPage.getShoppingCartPageShippingSubtext(), "The shopping cart page order summary shipping subtext doesn't match expectations.");
        //assert the shopping cart page order summary tax subtext is as expected
        assertEquals("Tax (10%):", shoppingCartPage.getShoppingCartPageTaxSubtext(), "The shopping cart page order summary tax subtext doesn't match expectations.");
        //assert the shopping cart page order summary total subtext is as expected
        assertEquals("Total:", shoppingCartPage.getShoppingCartPageTotalSubtext(), "The shopping cart page order summary total subtext doesn't match expectations.");
        //buttons
        //assert the shopping cart page clear cart button text is as expected
        assertEquals("CLEAR ENTIRE CART", shoppingCartPage.getShoppingCartPageClearCartBtnText(), "The shopping cart page clear cart button text doesn't match expectations.");
        //assert the shopping cart page proceed to checkout button text is as expected
        assertEquals("PROCEED TO CHECKOUT", shoppingCartPage.getShoppingCartPageProceedToCheckoutBtnText(), "The shopping cart page proceed to checkout button text doesn't match expectations.");
        //assert the shopping cart page continue shopping button text is as expected
        assertEquals("CONTINUE SHOPPING", shoppingCartPage.getShoppingCartPageContinueShoppingBtnText(), "The shopping cart page continue shopping button text doesn't match expectations.");
        //icons
        //assert the shopping cart page free shipping subtext is as expected
        assertEquals("Free shipping on orders over $50", shoppingCartPage.getShoppingCartPageFreeShippingSubtext(), "The shopping cart page free shipping subtext doesn't match expectations.");
        //assert the shopping cart page product returns subtext is as expected
        assertEquals("30-day return policy", shoppingCartPage.getShoppingCartPageProductReturnsSubtext(), "The shopping cart page product returns subtext doesn't match expectations.");
        //assert the shopping cart page secure checkout subtext is as expected
        assertEquals("Secure checkout", shoppingCartPage.getShoppingCartPageSecureCheckoutSubtext(), "The shopping cart page secure checkout subtext doesn't match expectations.");
    }

    //empty shopping cart page text element assert test method
    default void isEmptyShoppingCartPageTextElementAsExpected(Page page){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //assert the empty shopping cart page title is as expected
        assertEquals("Your Cart is Empty", shoppingCartPage.getEmptyShoppingCartPageTitle(), "The empty shopping cart page title doesn't match expectations.");
        //assert the empty shopping cart page description is as expected
        assertEquals("Discover amazing products and add them to your cart.", shoppingCartPage.getEmptyShoppingCartPageDesc(), "The empty shopping cart page description doesn't match expectations.");
        //buttons
        //assert the empty shopping cart page browse products button is as expected
        assertEquals("BROWSE PRODUCTS", shoppingCartPage.getEmptyShoppingCartPageBrowseProductsBtnText(), "The empty shopping cart page browse products button doesn't match expectations.");
        //assert the empty shopping cart page go back button is as expected
        assertEquals("GO BACK", shoppingCartPage.getEmptyShoppingCartPageGoBackBtnText(), "The empty shopping cart page go back button doesn't match expectations.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page (elements that other (except order confirmation) sections share) text element assert test method
    default void isCheckoutPageTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page title is as expected
        assertEquals("Checkout", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations.");
        //button
        //assert the checkout page back button text is as expected
        assertEquals("BACK", checkoutPage.getCheckoutPageBackBtnText(), "The checkout page back button text doesn't match expectations.");
    }

    //checkout page shipping address section text element assert test method
    default void isCheckoutPageShipAddressSectionTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page shipping address section title is as expected
        assertEquals("Shipping Address", checkoutPage.getCheckoutPageShipAddressInfoSectionTitle(), "The checkout page shipping address section title doesn't match expectations.");
        //assert the checkout page shipping address first name subtext is as expected
        assertEquals("First Name *", checkoutPage.getCheckoutPageShipAddressFirstNameSubtext(), "The checkout page shipping address first name subtext doesn't match expectations.");
        //assert the checkout page shipping address last name subtext is as expected
        assertEquals("Last Name *", checkoutPage.getCheckoutPageShipAddressLastNameSubtext(), "The checkout page shipping address last name subtext doesn't match expectations.");
        //assert the checkout page shipping address email subtext is as expected
        assertEquals("Email Address *", checkoutPage.getCheckoutPageShipAddressEmailSubtext(), "The checkout page shipping address email subtext doesn't match expectations.");
        //assert the checkout page shipping address phone subtext is as expected
        assertEquals("Phone Number *", checkoutPage.getCheckoutPageShipAddressPhoneSubtext(), "The checkout page shipping address phone subtext doesn't match expectations.");
        //assert the checkout page shipping address subtext is as expected
        assertEquals("Address *", checkoutPage.getCheckoutPageShipAddressSubtext(), "The checkout page shipping address subtext doesn't match expectations.");
        //assert the checkout page shipping address city subtext is as expected
        assertEquals("City *", checkoutPage.getCheckoutPageShipAddressCitySubtext(), "The checkout page shipping address city subtext doesn't match expectations.");
        //assert the checkout page shipping address state subtext is as expected
        assertEquals("State/Province *", checkoutPage.getCheckoutPageShipAddressStateSubtext(), "The checkout page shipping address state subtext doesn't match expectations.");
        //assert the checkout page shipping address post code subtext is as expected
        assertEquals("ZIP / Postal Code *", checkoutPage.getCheckoutPageShipAddressPostCodeSubtext(), "The checkout page shipping address post code subtext doesn't match expectations.");
        //assert the checkout page shipping address country subtext is as expected
        assertEquals("Country *", checkoutPage.getCheckoutPageShipAddressCountrySubtext(), "The checkout page shipping address country subtext doesn't match expectations.");
        //button
        //assert the checkout page next button text is as expected
        assertEquals("NEXT", checkoutPage.getCheckoutPageNextBtnText(), "The checkout page next button text doesn't match expectations.");
    }

    //checkout page payment method section text element assert test method
    default void isCheckoutPagePayMethodSectionTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page payment method section title is as expected
        assertEquals("Payment Method", checkoutPage.getCheckoutPagePayMethodSectionTitle(), "The checkout page payment method section title doesn't match expectations.");
        //assert the checkout page payment method section subtitle is as expected
        assertEquals("Select Payment Method", checkoutPage.getCheckoutPagePayMethodSectionSubtitle(), "The checkout page payment method section subtitle doesn't match expectations.");
        //list elements
        //assert the checkout page payment method radio button subtexts are as expected(as a list)
        List<String> expectedPayMethodRadioBtnSubtexts = Arrays.asList("Credit Card", "Debit Card", "PayPal");
        List<String> actualPayMethodRadioBtnSubtexts = checkoutPage.getCheckoutPagePayMethodRadioBtnSubtext();
        assertEquals(expectedPayMethodRadioBtnSubtexts, actualPayMethodRadioBtnSubtexts, "The checkout page expected/actual payment method radio button subtexts don't match expectations.");
        //button
        //assert the checkout page next button text is as expected
        assertEquals("NEXT", checkoutPage.getCheckoutPageNextBtnText(), "The checkout page next button text doesn't match expectations.");
    }

    //checkout page order summary section text element assert test method
    default void isCheckoutPageOrderReviewSectionTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //order summary section
        //assert the checkout page order summary section title is as expected
        assertEquals("Order Summary", checkoutPage.getCheckoutPageOrderSummarySectionTitle(), "The checkout page order summary section title doesn't match expectations.");
        //items subsection
        //assert the checkout page items subsection title is as expected
        assertEquals("Items", checkoutPage.getCheckoutPageOrderSummaryItemsSubsectionTitle(), "The checkout page items subsection title doesn't match expectations.");
        //shipping information section
        //assert the checkout page shipping information subsection title is as expected
        assertEquals("Shipping Information", checkoutPage.getCheckoutPageOrderSummaryShippingInfoSubsectionTitle(), "The checkout page shipping information subsection title doesn't match expectations.");
        //payment information subsection
        //assert the checkout page payment information subsection title is as expected
        assertEquals("Payment Method", checkoutPage.getCheckoutPageOrderSummaryPayMethodInfoSubsectionTitle(), "The checkout page payment information subsection title doesn't match expectations.");
        //button
        //assert the checkout page payment information subsection title is as expected
        assertEquals("PLACE ORDER", checkoutPage.getCheckoutPageNextBtnText(), "The checkout page place order button text doesn't match expectations.");
    }

    //checkout page aside order summary section text element assert test method
    default void isCheckoutPageAsideOrderSummarySectionTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page aside order summary section title is as expected
        assertEquals("Order Summary", checkoutPage.getCheckoutPageAsideOrderSummarySectionTitle(), "The checkout page aside order summary section title doesn't match expectations.");
        //assert the checkout page aside order summary subtotal subtext is as expected
        assertEquals("Subtotal:", checkoutPage.getCheckoutPageAsideOrderSummarySubtotalSubtext(), "The checkout page aside order summary subtotal subtext doesn't match expectations.");
        //assert the checkout page aside order summary shipping subtext is as expected
        assertEquals("Shipping:", checkoutPage.getCheckoutPageAsideOrderSummaryShippingSubtext(), "The checkout page aside order summary shipping subtext doesn't match expectations.");
        //assert the checkout page aside order summary tax subtext is as expected
        assertEquals("Tax:", checkoutPage.getCheckoutPageAsideOrderSummaryTaxSubtext(), "The checkout page aside order summary tax subtext doesn't match expectations.");
        //assert the checkout page aside order summary total subtext is as expected
        assertEquals("Total:", checkoutPage.getCheckoutPageAsideOrderSummaryTotalSubtext(), "The checkout page aside order summary total subtext doesn't match expectations.");
    }

    //checkout page order confirmation section text element assert test method
    default void isCheckoutPageOrderConfirmationSectionTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page order confirmation section title is as expected
        assertEquals("Order Confirmed!", checkoutPage.getCheckoutPageOrderConfirmedTitle(), "The checkout page order confirmation section title doesn't match expectations.");
        //assert the checkout page order confirmation section description is as expected
        assertEquals("Thank you for your purchase. Your order has been successfully placed.", checkoutPage.getCheckoutPageOrderConfirmedDesc(), "The checkout page order confirmation section description doesn't match expectations.");
        //assert the checkout page order confirmation section continue shopping button text is as expected
        assertEquals("CONTINUE SHOPPING", checkoutPage.getCheckoutPageOrderConfirmedContinueShoppingBtnText(), "The checkout page order confirmation section continue shopping button text doesn't match expectations.");
        //assert the checkout page order confirmation section view orders button text is as expected
        assertEquals("VIEW ORDERS", checkoutPage.getCheckoutPageOrderConfirmedViewOrdersBtnText(), "The checkout page order confirmation section view orders button text doesn't match expectations.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
