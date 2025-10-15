package app.vercel.three.coral.app.ecommerce.page.web.element.assertion;

import app.vercel.three.coral.app.ecommerce.*;

import app.vercel.three.coral.app.ecommerce.modals.*;
import com.microsoft.playwright.Page;

import static org.junit.jupiter.api.Assertions.*;

public interface PageWebElementAsserts {


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (elements that all pages have)
    default void isGeneralPageWebElementVisible(Page page) {
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the general page header e-commerce home page logo is visible
        assertTrue(generalPage.isECommerceHomePageLogoVisible(), "The general page header e-commerce home page logo isn't visible");
        //assert the general page header shopping cart button is visible
        assertTrue(generalPage.isHeaderShoppingCartBtnVisible(), "The general page header shopping cart button isn't visible");
        //assert the general page header total price is visible
        assertTrue(generalPage.isHeaderTotalPriceVisible(), "The general page header total price isn't visible");
        //footer
        //assert the general page footer e-commerce title is visible
        assertTrue(generalPage.isFooterECommerceTitleVisible(), "The general page footer e-commerce title isn't visible");
        //assert the general page footer e-commerce subtitle is visible
        assertTrue(generalPage.isFooterECommerceSubtitleVisible(), "The general page footer e-commerce subtitle isn't visible");
        //assert the general page footer address icon is visible
        assertTrue(generalPage.isFooterAddressIconVisible(), "The general page footer address icon isn't visible");
        //assert the general page footer address is visible
        assertTrue(generalPage.isFooterAddressVisible(), "The general page footer address isn't visible");
        //assert the general page footer email icon is visible
        assertTrue(generalPage.isFooterEmailIconVisible(), "The general page footer email icon isn't visible");
        //assert the general page footer email address is visible
        assertTrue(generalPage.isFooterEmailAddressVisible(), "The general page footer email address isn't visible");
        //assert the general page footer phone icon is visible
        assertTrue(generalPage.isFooterPhoneIconVisible(), "The general page footer phone icon isn't visible");
        //assert the general page footer phone number is visible
        assertTrue(generalPage.isFooterPhoneNumberVisible(), "The general page footer phone number isn't visible");
        //footer shop section
        //assert the general page footer shop section title is visible
        assertTrue(generalPage.isFooterShopSectionTitleVisible(), "The general page footer shop section title isn't visible");
        //list elements
        //assert the general page footer shop section links are visible (as a list)
        assertTrue(generalPage.isFooterShopSectionLinkElementVisible(), "The general page footer shop section links aren't visible");
        //footer support section
        //assert the general page footer support section title is visible
        assertTrue(generalPage.isFooterSupportSectionTitleVisible(), "The general page footer support section title isn't visible");
        //list elements
        //assert the general page footer support section links are visible (as a list)
        assertTrue(generalPage.isFooterSupportSectionLinkElementVisible(), "The general page footer support section links aren't visible");
        //footer policies section
        //assert the general page footer policies section title is visible
        assertTrue(generalPage.isFooterPoliciesSectionTitleVisible(), "The general page footer policies section title isn't visible");
        //list elements
        //assert the general page footer policies section links are visible (as a list)
        assertTrue(generalPage.isFooterPoliciesSectionLinkElementVisible(), "The general page footer policies section links aren't visible");
        //footer connect section
        //assert the general page footer connect section title is visible
        assertTrue(generalPage.isFooterConnectSectionTitleVisible(), "The general page footer connect section title isn't visible");
        //assert the general page footer connect section follow me text is visible
        assertTrue(generalPage.isFooterConnectFollowMeTextVisible(), "The general page footer connect section follow me text isn't visible");
        //list elements
        //assert the general page footer connect section social icon buttons are visible (as a list)
        assertTrue(generalPage.isFooterConnectSocialIconBtnElementVisible(), "The general page footer connect section social icon buttons aren't visible");
        //lower footer
        //assert the general page lower footer copyright text is visible
        assertTrue(generalPage.isLowerFooterCopyrightTextVisible(), "The general page lower footer copyright text isn't visible");
        //assert the general page lower footer developed by text is visible
        assertTrue(generalPage.isLowerFooterDevelopedByTextVisible(), "The general page lower footer developed by text isn't visible");
        //list elements
        //assert the general page lower footer social links are visible (as a list)
        assertTrue(generalPage.isLowerFooterSocialLinkElementVisible(), "The general page lower footer social links aren't visible");
    }

    //general page (guest view) web element assert test method (elements that all pages have)
    default void isGeneralPageGuestWebElementVisible(Page page) {
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the general page header login button is visible
        assertTrue(generalPage.isHeaderLoginBtnVisible(), "The general page header login button isn't visible");
        //assert the general page header sign up button is visible
        assertTrue(generalPage.isHeaderSignUpBtnVisible(), "The general page header sign up button isn't visible");
    }

    //general page (registered user view) web element assert test method (elements that all pages have)
    default void isGeneralPageRegUserWebElementVisible(Page page) {
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the general page header profile icon button is visible
        assertTrue(generalPage.isHeaderProfileIconBtnVisible(), "The general page header profile icon button isn't visible");
    }

    //general page breadcrumb web element assert test method (not all pages have these elements)
    default void isGeneralPageBreadcrumbWebElementVisible(Page page) {
        GeneralPage generalPage = new GeneralPage(page);
        //assert the general page breadcrumb elements are visible (as a list)
        assertTrue(generalPage.isBreadcrumbElementVisible(), "The general page breadcrumb elements aren't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page web element assert test method
    default void isHomePageWebElementVisible(Page page) {
        HomePage homePage = new HomePage(page);
        //header
        //assert the home page navbar search bar input field is visible
        assertTrue(homePage.isHomePageNavbarSearchInputFieldVisible(), "The home page navbar search input field isn't visible");
        //assert the home page navbar filters modal menu button is visible
        assertTrue(homePage.isHomePageNavbarFiltersModalMenuBtnVisible(), "The home page navbar filters modal menu button isn't visible");
        //assert the home page navbar sort by dropdown menu button is visible
        assertTrue(homePage.isHomePageNavbarSortByDropdownMenuVisible(), "The home page navbar sort by dropdown menu button isn't visible");
        //assert the home page navbar categories subtitle is visible
        assertTrue(homePage.isHomePageNavbarCategoriesSubtitleVisible(), "The home page navbar categories subtitle isn't visible");
        //list elements
        //assert the home page navbar categories buttons are visible (as a list)
        assertTrue(homePage.isHomePageNavbarCategoriesBtnVisible(), "The home page navbar categories buttons aren't visible");
        //main
        //assert the home page product count is visible
        assertTrue(homePage.isHomePageProductCountVisible(), "The home page product count isn't visible");
        //list
        //assert the home page product cards are visible (as a list)
        assertTrue(homePage.isHomePageProductCardElementVisible(), "The home page product cards aren't visible");
        //assert the home page product discount tags are visible (as a list)
        assertTrue(homePage.isHomePageProductDiscountTagElementVisible(), "The home page product discount tags aren't visible");
        //assert the home page product availability tags are visible (as a list)
        assertTrue(homePage.isHomePageProductAvailabilityElementVisible(), "The home page product availability tags aren't visible");
        //assert the home page product images are visible (as a list)
        assertTrue(homePage.isHomePageProductImgElementVisible(), "The home page product images aren't visible");
        //assert the home page product categories are visible (as a list)
        assertTrue(homePage.isHomePageProductCategoryElementVisible(), "The home page product categories aren't visible");
        //assert the home page product names are visible (as a list)
        assertTrue(homePage.isHomePageProductNameLinkElementVisible(), "The home page product names aren't visible");
        //assert the home page product review stars are visible (as a list)
        assertTrue(homePage.isHomePageProductReviewStarElementVisible(), "The home page product review stars aren't visible");
        //assert the home page product average review scores are visible (as a list)
        assertTrue(homePage.isHomePageProductAvgReviewScoreElementVisible(), "The home page product average review scores aren't visible");
        //assert the home page product unit prices are visible (as a list)
        assertTrue(homePage.isHomePageProductUnitPriceElementVisible(), "The home page product unit prices aren't visible");
        //assert the home page product old unit prices are visible (as a list)
        assertTrue(homePage.isHomePageProductOldUnitPriceElementVisible(), "The home page product old unit prices aren't visible");
        //assert the home page product add to cart buttons are visible (as a list)
        assertTrue(homePage.isHomePageProductAddToCartBtnElementVisible(), "The home page product add to cart buttons aren't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //sign up web element assert test method
    default void isSignUpWebElementVisible(Page page) {
        SignUpPage signUpPage = new SignUpPage(page);
        //assert the sign-up page icon is visible
        assertTrue(signUpPage.isSignUpPageIconVisible(), "The sign up page icon isn't visible");
        //assert the sign-up page title is visible
        assertTrue(signUpPage.isSignUpPageTitleVisible(), "The sign up page title isn't visible");
        //assert the sign-up page subtitle is visible
        assertTrue(signUpPage.isSignUpPageSubtitleVisible(), "The sign up page subtitle isn't visible");
        //input form
        //assert the sign-up page first name icon is visible
        assertTrue(signUpPage.isSignUpPageFirstNameIconVisible(), "The sign up page first name icon isn't visible");
        //assert the sign-up page first name subtext is visible
        assertTrue(signUpPage.isSignUpPageFirstNameSubtextVisible(), "The sign up page first name subtext isn't visible");
        //assert the sign-up page first name input field is visible
        assertTrue(signUpPage.isSignUpPageFirstNameInputFieldVisible(), "The sign up page first name input field isn't visible");
        //assert the sign-up page last name icon is visible
        assertTrue(signUpPage.isSignUpPageLastNameIconVisible(), "The sign up page last name icon isn't visible");
        //assert the sign-up page last name subtext is visible
        assertTrue(signUpPage.isSignUpPageLastNameSubtextVisible(), "The sign up page last name subtext isn't visible");
        //assert the sign-up page lst name input field is visible
        assertTrue(signUpPage.isSignUpPageLastNameInputFieldVisible(), "The sign up page last name input field isn't visible");
        //assert the sign-up page email icon is visible
        assertTrue(signUpPage.isSignUpPageEmailIconVisible(), "The sign up page email icon isn't visible");
        //assert the sign-up page email subtext is visible
        assertTrue(signUpPage.isSignUpPageEmailSubtextVisible(), "The sign up page email subtext isn't visible");
        //assert the sign-up page email input field is visible
        assertTrue(signUpPage.isSignUpPageEmailInputFieldVisible(), "The sign up page email input field isn't visible");
        //assert the sign-up page password icon is visible
        assertTrue(signUpPage.isSignUpPagePasswordIconVisible(), "The sign up page password icon isn't visible");
        //assert the sign-up page password subtext is visible
        assertTrue(signUpPage.isSignUpPagePasswordSubtextVisible(), "The sign up page password subtext isn't visible");
        //assert the sign-up page password input field is visible
        assertTrue(signUpPage.isSignUpPagePasswordInputFieldVisible(), "The sign up page password input field isn't visible");
        //assert the sign-up page view password button is visible
        assertTrue(signUpPage.isSignUpPageViewPasswordBtnVisible(), "The sign up page view password button isn't visible");
        //assert the sign-up page confirm password icon is visible
        assertTrue(signUpPage.isSignUpPageConfirmPasswordIconVisible(), "The sign up page confirm password icon isn't visible");
        //assert the sign-up page confirm password subtext is visible
        assertTrue(signUpPage.isSignUpPageConfirmPasswordSubtextVisible(), "The sign up page confirm password subtext isn't visible");
        //assert the sign-up page confirm password input field is visible
        assertTrue(signUpPage.isSignUpPageConfirmPasswordInputFieldVisible(), "The sign up page confirm password input field isn't visible");
        //assert the sign-up page view confirm password button is visible
        assertTrue(signUpPage.isSignUpPageViewConfirmPasswordBtnVisible(), "The sign up page view confirm password button isn't visible");
        //buttons
        //assert the sign-up page create account button is visible
        assertTrue(signUpPage.isSignUpPageCreateAccountBtnVisible(), "The sign up page create account button isn't visible");
        //assert the sign-up page have account text is visible
        assertTrue(signUpPage.isSignUpPageHaveAccountTextVisible(), "The sign up page have account text isn't visible");
        //assert the sign-up page sign up button is visible
        assertTrue(signUpPage.isSignUpPageSignUpBtnVisible(), "The sign up page sign up button isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //sign in page web element assert test method
    default void isSignInPageWebElementVisible(Page page) {
        SignInPage signInPage = new SignInPage(page);
        //assert the sign-in page icon is visible
        assertTrue(signInPage.isSignInPageIconVisible(), "The sign in page icon isn't visible");
        //assert the sign-in page title is visible
        assertTrue(signInPage.isSignInPageTitleVisible(), "The sign in page title isn't visible");
        //assert the sign-in page subtitle is visible
        assertTrue(signInPage.isSignInPageSubtitleVisible(), "The sign in page subtitle isn't visible");
        //input form
        //assert the sign-in page email icon is visible
        assertTrue(signInPage.isSignInPageEmailIconVisible(), "The sign in page email icon isn't visible");
        //assert the sign-in page email subtext is visible
        assertTrue(signInPage.isSignInPageEmailSubtextVisible(), "The sign in page email subtext isn't visible");
        //assert the sign-in page email input field is visible
        assertTrue(signInPage.isSignInPageEmailInputFieldVisible(), "The sign in page email input field isn't visible");
        //assert the sign-in page password icon is visible
        assertTrue(signInPage.isSignInPagePasswordIconVisible(), "The sign in page password icon isn't visible");
        //assert the sign-in page password subtext is visible
        assertTrue(signInPage.isSignInPagePasswordSubtextVisible(), "The sign in page password subtext isn't visible");
        //assert the sign-in page password input field is visible
        assertTrue(signInPage.isSignInPagePasswordInputFieldVisible(), "The sign in page password input field isn't visible");
        //assert the sign-in page view password button is visible
        assertTrue(signInPage.isSignInPageViewPasswordBtnVisible(), "The sign in page view password button isn't visible");
        //buttons
        //assert the sign-in page sign in button is visible
        assertTrue(signInPage.isSignInPageSignInBtnVisible(), "The sign in page sign in button isn't visible");
        //assert the sign-in page create account text is visible
        assertTrue(signInPage.isSignInPageCreateAccountTextVisible(), "The sign in page create account text isn't visible");
        //assert the sign-in page create new account button is visible
        assertTrue(signInPage.isSignInPageCreateNewAccountBtnVisible(), "The sign in page create new account button isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //filters modal web element assert test method
    default void isFiltersModalWebElementVisible(Page page) {
        FiltersModal filtersModal = new FiltersModal(page);
        //assert the filters modal title is visible
        assertTrue(filtersModal.isFiltersModalTitleVisible(), "The filters modal title isn't visible");
        //assert the filters modal close button is visible
        assertTrue(filtersModal.isFiltersModalCloseBtnVisible(), "The filters modal close button isn't visible");
        //sort by dropdown section
        //assert the filters modal sort by dropdown section title is visible
        assertTrue(filtersModal.isFiltersModalSortByDropdownSectionTitleVisible(), "The filters modal sort by dropdown section title isn't visible");
        //assert the filters modal sort by dropdown scroll button is visible
        assertTrue(filtersModal.isFiltersModalSortByDropdownScrollBtnVisible(), "The filters modal sort by dropdown scroll button isn't visible");
        //list elements
        //assert the filters modal sort by dropdown radio buttons are visible (as a list)
        assertTrue(filtersModal.isFiltersModalSortByRadioBtnElementVisible(), "The filters modal sort by dropdown radio buttons aren't visible");
        //assert the filters modal sort by dropdown radio button subtexts are visible (as a list)
        assertTrue(filtersModal.isFiltersModalSortByRadioSubtextElementVisible(), "The filters modal sort by dropdown radio button subtexts aren't visible");
        //price range dropdown section
        //assert the filters modal price range dropdown section title is visible
        assertTrue(filtersModal.isFiltersModalPriceRangeDropdownSectionTitleVisible(), "The filters modal price range dropdown section title isn't visible");
        //assert the filters modal price range dropdown scroll button is visible
        assertTrue(filtersModal.isFiltersModalPriceRangeDropdownScrollBtnVisible(), "The filters modal price range dropdown scroll button isn't visible");
        //assert the filters modal price range price from is visible
        assertTrue(filtersModal.isFiltersModalPriceRangePriceFromVisible(), "The filters modal price range price from isn't visible");
        //assert the filters modal price range price slider left is visible
        assertTrue(filtersModal.isFiltersModalPriceRangePriceSliderLeftBtnVisible(), "The filters modal price range price slider left isn't visible");
        //assert the filters modal price range price slider right is visible
        assertTrue(filtersModal.isFiltersModalPriceRangePriceSliderRightBtnVisible(), "The filters modal price range price slider right isn't visible");
        //assert the filters modal price range price to is visible
        assertTrue(filtersModal.isFiltersModalPriceRangePriceToVisible(), "The filters modal price range price to isn't visible");
        //customer rating dropdown section
        //assert the filters modal customer rating dropdown section title is visible
        assertTrue(filtersModal.isFiltersModalCustomerRatingDropdownSectionTitleVisible(), "The filters modal customer rating dropdown section title isn't visible");
        //assert the filters modal customer rating dropdown scroll button is visible
        assertTrue(filtersModal.isFiltersModalCustomerRatingDropdownScrollBtnVisible(), "The filters modal customer rating dropdown scroll button isn't visible");
        //list elements
        //assert the filters modal customer rating dropdown radio buttons are visible (as a list)
        assertTrue(filtersModal.isFiltersModalCustomerRatingRadioBtnElementVisible(), "The filters modal customer rating dropdown radio buttons aren't visible");
        //assert the filters modal customer rating dropdown radio button subtexts are visible (as a list)
        assertTrue(filtersModal.isFiltersModalCustomerRatingRadioSubtextElementVisible(), "The filters modal customer rating dropdown radio button subtexts aren't visible");
        //categories dropdown section
        //assert the filters modal categories dropdown section title is visible
        assertTrue(filtersModal.isFiltersModalCategoriesDropdownSectionTitleVisible(), "The filters modal categories dropdown section title isn't visible");
        //assert the filters modal categories dropdown scroll button is visible
        assertTrue(filtersModal.isFiltersModalCategoriesDropdownScrollBtnVisible(), "The filters modal categories dropdown scroll button isn't visible");
        //list elements
        //assert the filters modal categories dropdown radio buttons are visible (as a list)
        assertTrue(filtersModal.isFiltersModalCategoriesRadioBtnElementVisible(), "The filters modal categories dropdown radio buttons aren't visible");
        //assert the filters modal categories dropdown radio button subtexts are visible (as a list)
        assertTrue(filtersModal.isFiltersModalCategoriesRadioSubtextElementVisible(), "The filters modal categories dropdown radio button subtexts aren't visible");
        //availability dropdown section
        //assert the filters modal availability dropdown section title is visible
        assertTrue(filtersModal.isFiltersModalAvailabilityDropdownSectionTitleVisible(), "The filters modal availability dropdown section title isn't visible");
        //assert the filters modal availability dropdown scroll button is visible
        assertTrue(filtersModal.isFiltersModalAvailabilityDropdownScrollBtnVisible(), "The filters modal availability dropdown scroll button isn't visible");
        //assert the filters modal availability dropdown in stock checkbox is visible
        assertTrue(filtersModal.isFiltersModalAvailabilityInStockCheckboxVisible(), "The filters modal availability in stock checkbox isn't visible");
        //assert the filters modal availability dropdown in stock checkbox subtext is visible
        assertTrue(filtersModal.isFiltersModalAvailabilityInStockCheckboxSubtextVisible(), "The filters modal availability in stock checkbox subtitle isn't visible");
        //assert the filters modal apply filters button is visible
        assertTrue(filtersModal.isFiltersModalApplyFiltersBtnVisible(), "The filters modal availability apply filters button isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal web element assert test method
    default void isShoppingCartModalWebElementVisible(Page page){
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //assert the shopping cart modal title is visible
        assertTrue(shopCartModal.isShoppingCartModalTitleVisible(), "The shopping cart modal title isn't visible");
        //assert the shopping cart modal item count is visible
        assertTrue(shopCartModal.isShoppingCartModalItemCountVisible(), "The shopping cart modal item count isn't visible");
        //product table (list elements)
        //assert the shopping cart modal product images are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductImgElementVisible(), "The shopping cart modal product images aren't visible");
        //assert the shopping cart modal product names are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductNameElementVisible(), "The shopping cart modal product names aren't visible");
        //assert the shopping cart modal product prices are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductPriceElementVisible(), "The shopping cart modal product prices aren't visible");
        //assert the shopping cart modal product quantity decrease buttons are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductQtyDecreaseBtnElementVisible(), "The shopping cart modal product quantity decrease buttons aren't visible");
        //assert the shopping cart modal product quantities are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductQtyElementVisible(), "The shopping cart modal product quantities aren't visible");
        //assert the shopping cart modal product quantity increase buttons are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductQtyIncreaseBtnElementVisible(), "The shopping cart modal product quantity increase buttons aren't visible");
        //assert the shopping cart modal product remove buttons are visible (as a list)
        assertTrue(shopCartModal.isShoppingCartModalProductRemoveBtnElementVisible(), "The shopping cart modal product remove buttons aren't visible");
        //summary
        //assert the shopping cart modal total price subtext is visible
        assertTrue(shopCartModal.isShoppingCartModalTotalPriceSubtextVisible(), "The shopping cart modal total price subtext isn't visible");
        //assert the shopping cart modal total price is visible
        assertTrue(shopCartModal.isShoppingCartModalTotalPriceVisible(), "The shopping cart modal total price isn't visible");
        //buttons
        //assert the shopping cart modal view cart button is visible
        assertTrue(shopCartModal.isShoppingCartModalViewCartBtnVisible(), "The shopping cart modal view cart button isn't visible");
        //assert the shopping cart modal checkout button is visible
        assertTrue(shopCartModal.isShoppingCartModalCheckoutBtnVisible(), "The shopping cart modal checkout button isn't visible");
    }

    //empty shopping cart modal web element assert test method
    default void isEmptyShoppingCartModalWebElementVisible(Page page){
        ShopCartModal shopCartModal = new ShopCartModal(page);
        //assert the empty shopping cart modal title is visible
        assertTrue(shopCartModal.isEmptyShoppingCartModalTitleVisible(), "The empty shopping cart modal title isn't visible");
        //assert the empty shopping cart modal start shopping button is visible
        assertTrue(shopCartModal.isEmptyShoppingCartModalStartShoppingBtnVisible(), "The shopping cart modal start shopping button isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page web element assert test method
    default void isSingleProductPageWebElementVisible(Page page){
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page product image is visible
        assertTrue(singleProductPage.isSingleProductPageProductImgVisible(), "The single product page product image isn't visible");
        //list elements
        //assert the single product page product review stars are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewStarElementVisible(), "The single product page product review stars aren't visible");
        //singular elements
        //assert the single product page product category tag is visible
        assertTrue(singleProductPage.isSingleProductPageProductCategoryTagVisible(), "The single product page product category tag isn't visible");
        //assert the single product page product brand tag is visible
        assertTrue(singleProductPage.isSingleProductPageProductBrandTagVisible(), "The single product page product brand tag isn't visible");
        //assert the single product page product discount tag is visible
        assertTrue(singleProductPage.isSingleProductPageProductDiscountTagVisible(), "The single product page product discount tag isn't visible");
        //assert the single product page product name is visible
        assertTrue(singleProductPage.isSingleProductPageProductNameVisible(), "The single product page product name isn't visible");
        //assert the single product page product avg review score is visible
        assertTrue(singleProductPage.isSingleProductPageProductAvgReviewScoreVisible(), "The single product page product avg review score isn't visible");
        //assert the single product page product availability tag is visible
        assertTrue(singleProductPage.isSingleProductPageProductAvailabilityTagVisible(), "The single product page product availability tag isn't visible");
        //assert the single product page product unit price is visible
        assertTrue(singleProductPage.isSingleProductPageProductUnitPriceTagVisible(), "The single product page product unit price isn't visible");
        //assert the single product page product old unit price is visible
        assertTrue(singleProductPage.isSingleProductPageProductOldUnitPriceVisible(), "The single product page product old unit price isn't visible");
        //assert the single product page product discount text is visible
        assertTrue(singleProductPage.isSingleProductPageProductDiscountTextVisible(), "The single product page product discount text isn't visible");
        //assert the single product page product description is visible
        assertTrue(singleProductPage.isSingleProductPageProductDescVisible(), "The single product page product description isn't visible");
        //assert the single product page product quantity subtext is visible
        assertTrue(singleProductPage.isSingleProductPageProductQtySubtextVisible(), "The single product page product quantity subtext isn't visible");
        //assert the single product page product quantity decrease button is visible
        assertTrue(singleProductPage.isSingleProductPageProductQtyDecreaseBtnVisible(), "The single product page product quantity decrease button isn't visible");
        //assert the single product page product quantity is visible
        assertTrue(singleProductPage.isSingleProductPageProductQtyVisible(), "The single product page product quantity isn't visible");
        //assert the single product page product quantity increase button is visible
        assertTrue(singleProductPage.isSingleProductPageProductQtyIncreaseBtnVisible(), "The single product page product quantity increase button isn't visible");
        //assert the single product page add to cart button is visible
        assertTrue(singleProductPage.isSingleProductPageAddToCartBtnVisible(), "The single product page add to cart button isn't visible");
        //assert the single product page add to wishlist button is visible
        assertTrue(singleProductPage.isSingleProductPageAddToWishlistBtnVisible(), "The single product page add to wishlist button isn't visible");
        //assert the single product page add to compare button is visible
        assertTrue(singleProductPage.isSingleProductPageAddToCompareBtnVisible(), "The single product page add to compare button isn't visible");
        //assert the single product page product free shipping icon is visible
        assertTrue(singleProductPage.isSingleProductPageProductFreeShippingIconVisible(), "The single product page product free shipping icon isn't visible");
        //assert the single product page product free shipping subtext is visible
        assertTrue(singleProductPage.isSingleProductPageProductFreeShippingSubtextVisible(), "The single product page product free shipping subtext isn't visible");
        //assert the single product page product returns icon is visible
        assertTrue(singleProductPage.isSingleProductPageProductReturnsIconVisible(), "The single product page product returns icon isn't visible");
        //assert the single product page product returns subtext is visible
        assertTrue(singleProductPage.isSingleProductPageProductReturnsSubtextVisible(), "The single product page returns subtext isn't visible");
        //assert the single product page product warranty icon is visible
        assertTrue(singleProductPage.isSingleProductPageProductWarrantyIconVisible(), "The single product page product warranty icon isn't visible");
        //assert the single product page product warranty subtext is visible
        assertTrue(singleProductPage.isSingleProductPageProductWarrantySubtextVisible(), "The single product page product warranty subtext isn't visible");
        //list elements
        //assert the single product page navbar buttons are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageNavbarBtnElementVisible(), "The single product page navbar buttons aren't visible");
        //singular elements
        //assert the single product page product details box is visible
        assertTrue(singleProductPage.isSingleProductPageProductDetailsBoxVisible(), "The single product page product details box isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart page web element assert test method
    default void isShoppingCartPageWebElementVisible(Page page){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //assert the shopping cart page title is visible
        assertTrue(shoppingCartPage.isShoppingCartPageTitleVisible(), "The shopping cart page title isn't visible");
        //assert the shopping cart page item counter is visible
        assertTrue(shoppingCartPage.isShoppingCartPageItemCounterVisible(), "The shopping cart page item counter isn't visible");
        //product table (list elements)
        //assert the shopping cart page product images are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductImgElementVisible(), "The shopping cart page product images aren't visible");
        //assert the shopping cart page product names are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductNameElementVisible(), "The shopping cart page product names aren't visible");
        //assert the shopping cart page product brands are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductBrandElementVisible(), "The shopping cart page product brands aren't visible");
        //assert the shopping cart page product quantity subtexts are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtySubtextElementVisible(), "The shopping cart page product quantity subtexts aren't visible");
        //assert the shopping cart page product quantity decrease buttons are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtyDecreaseBtnElementVisible(), "The shopping cart page product quantity decrease buttons aren't visible");
        //assert the shopping cart page product quantities are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtyElementVisible(), "The shopping cart page product quantities aren't visible");
        //assert the shopping cart page product quantity increase buttons are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtyIncreaseBtnElementVisible(), "The shopping cart page product quantity increase buttons aren't visible");
        //assert the shopping cart page product unit prices are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductUnitPriceElementVisible(), "The shopping cart page product unit prices aren't visible");
        //assert the shopping cart page product remove buttons are visible (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductRemoveButtonElementVisible(), "The shopping cart page product remove buttons aren't visible");
        //assert the shopping cart page product prices are visible (as a list) (doubler of a unit price)
        assertTrue(shoppingCartPage.isShoppingCartPageProductPriceElementVisible(), "The shopping cart page product prices aren't visible");
        //singular elements
        //assert the shopping cart page product clear cart button is visible
        assertTrue(shoppingCartPage.isShoppingCartPageClearCartBtnVisible(), "The shopping cart page product clear cart button isn't visible");
        //order summary section
        //assert the shopping cart page order summary section title is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummarySectionTitleVisible(), "The shopping cart page order summary section title isn't visible");
        //assert the shopping cart page order summary subtotal subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummarySubtotalSubtextVisible(), "The shopping cart page order summary subtotal subtext isn't visible");
        //assert the shopping cart page order summary subtotal price is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummarySubtotalPriceVisible(), "The shopping cart page order summary subtotal price isn't visible");
        //assert the shopping cart page order summary shipping subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryShippingSubtextVisible(), "The shopping cart page order summary shipping subtext isn't visible");
        //assert the shopping cart page order summary tax subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryTaxSubtextVisible(), "The shopping cart page order summary tax subtext isn't visible");
        //assert the shopping cart page order summary tax amount is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryTaxAmountVisible(), "The shopping cart page order summary tax amount isn't visible");
        //assert the shopping cart page order summary total subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryTotalSubtextVisible(), "The shopping cart page order summary total subtext isn't visible");
        //assert the shopping cart page order summary total price is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryTotalPriceVisible(), "The shopping cart page order summary total price isn't visible");
        //buttons
        //assert the shopping cart page proceed to checkout button is visible
        assertTrue(shoppingCartPage.isShoppingCartPageProceedToCheckoutBtnVisible(), "The shopping cart page proceed to checkout button isn't visible");
        //assert the shopping cart page continue shopping button is visible
        assertTrue(shoppingCartPage.isShoppingCartPageContinueShoppingBtnVisible(), "The shopping cart page continue shopping button isn't visible");
        //icons
        //assert the shopping cart page free shipping icon is visible
        assertTrue(shoppingCartPage.isShoppingCartPageFreeShippingIconVisible(), "The shopping cart page free shipping icon isn't visible");
        //assert the shopping cart page free shipping subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageFreeShippingSubtextVisible(), "The shopping cart page free shipping subtext isn't visible");
        //assert the shopping cart page product returns icon is visible
        assertTrue(shoppingCartPage.isShoppingCartPageProductReturnsIconVisible(), "The shopping cart page product returns icon isn't visible");
        //assert the shopping cart page product returns subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageProductReturnsSubtextVisible(), "The shopping cart page product returns subtext isn't visible");
        //assert the shopping cart page secure checkout icon is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSecureCheckoutIconVisible(), "The shopping cart page secure checkout icon isn't visible");
        //assert the shopping cart page secure checkout subtext is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSecureCheckoutSubtextVisible(), "The shopping cart page secure checkout subtext isn't visible");
    }

    //shopping cart page (free shipping price) web element assert test method
    default void isShoppingCartPageFreeShipPriceWebElementVisible(Page page) {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //assert the shopping cart page order summary free shipping price tag is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryFreeShippingPriceTagVisible(), "The shopping cart page order summary free shipping price tag isn't visible");
    }

    //shopping cart page (shipping price) web element assert test method
    default void isShoppingCartPageShipPriceWebElementVisible(Page page) {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //assert the shopping cart page order summary shipping price tag is visible
        assertTrue(shoppingCartPage.isShoppingCartPageSummaryShippingPriceVisible(), "The shopping cart page order summary shipping price isn't visible");
    }

    //empty shopping cart page web element assert test method
    default void isEmptyShoppingCartPageWebElementVisible(Page page){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);
        //assert the empty shopping cart page icon is visible
        assertTrue(shoppingCartPage.isEmptyShoppingCartPageIconVisible(), "The empty shopping cart page icon isn't visible");
        //assert the empty shopping cart page title is visible
        assertTrue(shoppingCartPage.isEmptyShoppingCartPageTitleVisible(), "The empty shopping cart page title isn't visible");
        //assert the empty shopping cart page description is visible
        assertTrue(shoppingCartPage.isEmptyShoppingCartPageDescVisible(), "The empty shopping cart page description isn't visible");
        //buttons
        //assert the empty shopping cart page browse products button is visible
        assertTrue(shoppingCartPage.isEmptyShoppingCartPageBrowseProductsBtnVisible(), "The empty shopping cart page browse products button isn't visible");
        //assert the empty shopping cart page go back button is visible
        assertTrue(shoppingCartPage.isEmptyShoppingCartPageGoBackBtnVisible(), "The empty shopping cart page go back button isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page web element assert test method
    default void isCheckoutPageWebElementVisible(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page upper back button is visible
        assertTrue(checkoutPage.isCheckoutPageUpperBackBtnVisible(), "The checkout page upper back button isn't visible");
        //assert the checkout page title is visible
        assertTrue(checkoutPage.isCheckoutPageTitleVisible(), "The checkout page title isn't visible");
        //assert the checkout page breadcrumb is visible
        assertTrue(checkoutPage.isCheckoutPageBreadcrumbVisible(), "The checkout page breadcrumb isn't visible");
        //buttons
        //assert the checkout page back button is visible
        assertTrue(checkoutPage.isCheckoutPageBackBtnVisible(), "The checkout page back button isn't visible");
        //assert the checkout page next button is visible
        assertTrue(checkoutPage.isCheckoutPageNextBtnVisible(), "The checkout page next button isn't visible");
    }

    //checkout page shipping address section web element assert test method
    default void isCheckoutPageShipAddressSectionWebElementVisible(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page shipping address section title is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressInfoSectionTitleVisible(), "The checkout page shipping address section title isn't visible");
        //assert the checkout page shipping address first name subtext is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressFirstNameSubtextVisible(), "The checkout page shipping address first name subtext isn't visible");
        //assert the checkout page shipping address first name input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressFirstNameInputFieldVisible(), "The checkout page shipping address first name input field isn't visible");
        //assert the checkout page shipping address last name subtext is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressLastNameSubtextVisible(), "The checkout page shipping address last name subtext isn't visible");
        //assert the checkout page shipping address last name input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressLastNameInputFieldVisible(), "The checkout page shipping address last name input field isn't visible");
        //assert the checkout page shipping address email subtext is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressEmailSubtextVisible(), "The checkout page shipping address email subtext isn't visible");
        //assert the checkout page shipping address email input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressEmailInputFieldVisible(), "The checkout page shipping address email input field isn't visible");
        //assert the checkout page shipping address phone input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressPhoneInputFieldVisible(), "The checkout page shipping address phone input field isn't visible");
        //assert the checkout page shipping address input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressTextareaVisible(), "The checkout page shipping address input field isn't visible");
        //assert the checkout page shipping address city input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressCityInputFieldVisible(), "The checkout page shipping address city input field isn't visible");
        //assert the checkout page shipping address state input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressStateInputFieldVisible(), "The checkout page shipping address state input field isn't visible");
        //assert the checkout page shipping address post code input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressPostCodeInputFieldVisible(), "The checkout page shipping address post code input field isn't visible");
        //assert the checkout page shipping address country subtext is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressCountrySubtextVisible(), "The checkout page shipping address country subtext isn't visible");
        //assert the checkout page shipping address country input field is visible
        assertTrue(checkoutPage.isCheckoutPageShipAddressCountryInputFieldVisible(), "The checkout page shipping address country input field isn't visible");
    }

    //checkout page payment method section web element assert test method
    default void isCheckoutPagePayMethodSectionWebElementVisible(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page payment method section title is visible
        assertTrue(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible(), "The checkout page payment method section title isn't visible");
        //assert the checkout page payment method section subtitle is visible
        assertTrue(checkoutPage.isCheckoutPagePayMethodSectionSubtitleVisible(), "The checkout page payment method section subtitle isn't visible");
        //list elements
        //assert the checkout page payment method radio buttons are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPagePayMethodRadioBtnVisible(), "The checkout page payment method radio buttons aren't visible");
        //assert the checkout page payment method radio button subtexts are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPagePayMethodRadioSubtextVisible(), "The checkout page payment method radio button subtexts aren't visible");
        //debit/credit card input form
        //assert the checkout page credit card cardholder name input field is visible
        assertTrue(checkoutPage.isCheckoutPageCredCardCardholderNameInputFieldVisible(), "The checkout page credit card cardholder name input field isn't visible");
        //assert the checkout page credit card number input field is visible
        assertTrue(checkoutPage.isCheckoutPageCredCardNumberInputFieldVisible(), "The checkout page credit card number input field isn't visible");
        //assert the checkout page credit card expiry date input field is visible
        assertTrue(checkoutPage.isCheckoutPageCredCardExpiryDateInputFieldVisible(), "The checkout page credit card expiry date input field isn't visible");
        //assert the checkout page credit card CVV input field is visible
        assertTrue(checkoutPage.isCheckoutPageCredCardCVVInputFieldVisible(), "The checkout page credit card CVV input field isn't visible");
    }

    //checkout page order summary section web element assert test method
    default void isCheckoutPageOrderReviewSectionWebElementVisible(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //wait for elements to load (as summary shipping information elements fail to be found with VALID selectors)
        //page.waitForTimeout(2500);
        //assert the checkout page order summary section title is visible
        assertTrue(checkoutPage.isCheckoutPageOrderSummarySectionTitleVisible(), "The checkout page order summary section title isn't visible");
        //items subsection
        //assert the checkout page order summary items subsection title is visible
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryItemsSubsectionTitleVisible(), "The checkout page order summary items subsection title isn't visible");
        //list elements
        //assert the checkout page order summary product images are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryProductImgVisible(), "The checkout page order summary product images aren't visible");
        //assert the checkout page order summary product names are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryProductNameVisible(), "The checkout page order summary product names aren't visible");
        //assert the checkout page order summary product quantities are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryProductQtyVisible(), "The checkout page order summary product quantities aren't visible");
        //assert the checkout page order summary product unit prices are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryProductUnitPriceVisible(), "The checkout page order summary product unit prices aren't visible");
        //shipping info subsection
        //assert the checkout page order summary shipping information subsection title is visible
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryShippingInfoSubsectionTitleVisible(), "The checkout page order summary shipping information subsection title isn't visible");
        //list elements
        //assert the checkout page order summary shipping information data is visible (as a list of <p> elements)
        //assertTrue(checkoutPage.isCheckoutPageOrderSummaryShippingInfoSubsectionDataVisible(), "The checkout page order summary shipping information data isn't visible");
        //payment method subsection
        //assert the checkout page order summary payment method information subsection title is visible
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryPayMethodInfoSubsectionTitleVisible(), "The checkout page order summary payment method information subsection title isn't visible");
        //list elements
        //assert the checkout page order summary payment method information data is visible (as a list of <p> elements)
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryPayMethodInfoSubsectionDataVisible(), "The checkout page order summary payment method information data isn't visible");
    }

    //checkout page aside order summary section web element assert test method
    default void isCheckoutPageAsideOrderSummarySectionWebElementVisible(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page aside order summary section title is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummarySectionTitleVisible(), "The checkout page aside order summary section title isn't visible");
        //list elements
        //assert the checkout page aside order summary product names/quantities are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryProductNameAndQtyVisible(), "The checkout page aside order summary product names/quantities aren't visible");
        //assert the checkout page aside order summary product unit prices are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryProductUnitPriceVisible(), "The checkout page aside order summary product unit prices aren't visible");
        //singular elements
        //assert the checkout page aside order summary subtotal subtext is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummarySubtotalSubtextVisible(), "The checkout page aside order summary subtotal subtext isn't visible");
        //assert the checkout page aside order summary subtotal price is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummarySubtotalPriceVisible(), "The checkout page aside order summary subtotal price isn't visible");
        //assert the checkout page aside order summary shipping subtext is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryShippingSubtextVisible(), "The checkout page aside order summary shipping subtext isn't visible");
        //assert the checkout page aside order summary shipping price is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryShippingPriceVisible(), "The checkout page aside order summary shipping price isn't visible");
        //assert the checkout page aside order summary tax subtext is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryTaxSubtextVisible(), "The checkout page aside order summary tax subtext isn't visible");
        //assert the checkout page aside order summary tax amount is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryTaxAmountVisible(), "The checkout page aside order summary tax amount isn't visible");
        //assert the checkout page aside order summary total subtext is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryTotalSubtextVisible(), "The checkout page aside order summary total subtext isn't visible");
        //assert the checkout page aside order summary total price is visible
        assertTrue(checkoutPage.isCheckoutPageAsideOrderSummaryTotalPriceVisible(), "The checkout page aside order summary total price isn't visible");
    }

    //checkout page order confirmed section web element assert test method
    default void isCheckoutPageOrderConfirmedSectionWebElementVisible(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page order confirmed section icon is visible
        assertTrue(checkoutPage.isCheckoutPageOrderConfirmedIconVisible(), "The checkout page order confirmed section icon isn't visible");
        //assert the checkout page order confirmed section title is visible
        assertTrue(checkoutPage.isCheckoutPageOrderConfirmedTitleVisible(), "The checkout page order confirmed section title isn't visible");
        //assert the checkout page order confirmed section description is visible
        assertTrue(checkoutPage.isCheckoutPageOrderConfirmedDescVisible(), "The checkout page order confirmed section description isn't visible");
        //assert the checkout page order confirmed section continue shopping button is visible
        assertTrue(checkoutPage.isCheckoutPageOrderConfirmedContinueShoppingBtnVisible(), "The checkout page order confirmed section continue shopping button isn't visible");
        //assert the checkout page order confirmed section view orders button is visible
        assertTrue(checkoutPage.isCheckoutPageOrderConfirmedViewOrdersBtnVisible(), "The checkout page order confirmed section view orders button isn't visible");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
