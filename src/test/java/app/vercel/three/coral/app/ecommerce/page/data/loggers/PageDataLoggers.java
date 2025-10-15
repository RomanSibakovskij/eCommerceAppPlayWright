package app.vercel.three.coral.app.ecommerce.page.data.loggers;

import app.vercel.three.coral.app.ecommerce.*;

import app.vercel.three.coral.app.ecommerce.modals.*;
import static org.junit.jupiter.api.Assertions.*;
import com.microsoft.playwright.Page;

import org.slf4j.*;

import java.math.BigDecimal;

public interface PageDataLoggers {

    Logger logger = LoggerFactory.getLogger(PageDataLoggers.class);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page data logger method
    default void logGeneralPageData(Page page) {
        GeneralPage generalPage = new GeneralPage(page);

        System.out.println("The general page displayed data:" + "\n");

        logger.info("The general page displayed total order price: " + generalPage.getHeaderTotalOrderPrice());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page product data logger method
    default void logHomePageProductData(Page page) {
        HomePage homePage = new HomePage(page);

        System.out.println("The home page displayed product data: " + "\n");

        logger.info("The home page displayed product count: " + homePage.getHomePageProductCount());
        logger.info("The home page displayed product discount tag(s): " + homePage.getHomePageProductDiscountTag());
        logger.info("The home page displayed product availability(ies): " + homePage.getHomePageProductAvailability());
        logger.info("The home page displayed product category(ies): " + homePage.getHomePageProductCategory());
        logger.info("The home page displayed product product name(s): " + homePage.getHomePageProductName());
        logger.info("The home page displayed product average review score(s): " + homePage.getHomePageProductAvgReviewScore());
        logger.info("The home page displayed product unit price(s): " + homePage.getHomePageProductUnitPrice());
        logger.info("The home page displayed product old unit price(s): " + homePage.getHomePageProductOldUnitPrice());

        System.out.println("\n");

    }

    //home page product quick view text data logger method
    default void logHomePageProductQuickViewTextData(Page page) {
        HomePage homePage = new HomePage(page);

        System.out.println("The home page displayed product quick view text data: " + "\n");

        logger.info("The home page displayed product quick view text(s): " + homePage.getHomePageProductQuickViewText());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //filters modal data logger method
    default void logFiltersModalPriceData(Page page) {
        FiltersModal filtersModal = new FiltersModal(page);

        System.out.println("The filters modal displayed price (from/to) data:" + "\n");

        logger.info("The filters modal currently set price from range: " + filtersModal.getFiltersModalPriceFrom());
        logger.info("The filters modal currently set price to range: " + filtersModal.getFiltersModalPriceTo());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal product data logger method
    default void logShopCartModalProductData(Page page) {
        ShopCartModal shopCartModal = new ShopCartModal(page);

        System.out.println("The shopping cart modal displayed product data:" + "\n");

        logger.info("The shopping cart modal displayed item count: " + shopCartModal.getShoppingCartModalItemCount());
        logger.info("The shopping cart modal displayed product name(s): " + shopCartModal.getShopCartModalProductName());
        logger.info("The shopping cart modal displayed product price(s): " + shopCartModal.getShopCartModalProductPrice());
        logger.info("The shopping cart modal displayed product quantity(ies): " + shopCartModal.getShopCartModalProductQty());
        logger.info("The shopping cart modal displayed total product price: " + shopCartModal.getShoppingCartModalTotalPrice());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page product data logger method
    default void logSingleProductPageProductData(Page page) {
        SingleProductPage singleProductPage = new SingleProductPage(page);

        System.out.println("The single product page displayed product data:" + "\n");

        logger.info("The single product page displayed product category: " + singleProductPage.getSingleProductPageCategoryTagText());
        logger.info("The single product page displayed product brand: " + singleProductPage.getSingleProductPageBrandTagText());
        logger.info("The single product page displayed product discount: " + singleProductPage.getSingleProductPageDiscountTagText());
        logger.info("The single product page displayed product name: " + singleProductPage.getSingleProductPageProductName());
        logger.info("The single product page displayed product average review score: " + singleProductPage.getSingleProductPageProductAvgReviewScore());
        logger.info("The single product page displayed product availability: " + singleProductPage.getSingleProductPageProductAvailabilityTag());
        logger.info("The single product page displayed product unit price: " + singleProductPage.getSingleProductPageProductUnitPrice());
        logger.info("The single product page displayed product old unit price: " + singleProductPage.getSingleProductPageProductOldUnitPrice());
        logger.info("The single product page displayed product quantity: " + singleProductPage.getSingleProductPageProductQty());
        logger.info("The single product page displayed product discount text: " + singleProductPage.getSingleProductPageProductDiscountText());
        logger.info("The single product page displayed product description: " + singleProductPage.getSingleProductPageProductDesc());
        logger.info("The single product page displayed current toggled product details: " + singleProductPage.getSingleProductPageProductDetailsBoxText());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart page (without shipping price) product data logger method
    default void logShoppingCartPageNoShipPriceProductData(Page page) {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);

        System.out.println("The shopping cart page (no shipping price) displayed product data:" + "\n");

        logger.info("The shopping cart page (no shipping price) displayed item count: " + shoppingCartPage.getShoppingCartPageItemCount());
        logger.info("The shopping cart page (no shipping price) displayed product name(s): " + shoppingCartPage.getShoppingCartPageProductName());
        logger.info("The shopping cart page (no shipping price) displayed product brand(s): " + shoppingCartPage.getShoppingCartPageProductBrand());
        logger.info("The shopping cart page (no shipping price) displayed product quantity(ies): " + shoppingCartPage.getShoppingCartPageProductQty());
        logger.info("The shopping cart page (no shipping price) displayed product unit price(s): " + shoppingCartPage.getShoppingCartPageProductUnitPrice());
        logger.info("The shopping cart page (no shipping price) displayed product price(s): " + shoppingCartPage.getShoppingCartPageProductPrice());
        //assert the product subtotal price is equal to product subtotal price in summary (since these elements show the same data)
        BigDecimal totalProductSubtotal = shoppingCartPage.getShoppingCartPageProductPrice().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        assertEquals(totalProductSubtotal, shoppingCartPage.getShoppingCartPageSubtotalPrice(), "The shopping cart page subtotal price / subtotal product price in summary don't match expectations.");

        System.out.println("The shopping cart page (no shipping price) displayed order summary section data: " + "\n");

        logger.info("The shopping cart page (no shipping price) displayed order subtotal price: " + shoppingCartPage.getShoppingCartPageSubtotalPrice());
        logger.info("The shopping cart page (no shipping price) displayed order shipping price tag: " + shoppingCartPage.getShoppingCartPageShippingFreePriceTag());
        logger.info("The shopping cart page (no shipping price) displayed order tax amount: " + shoppingCartPage.getShoppingCartPageTaxAmount());
        logger.info("The shopping cart page (no shipping price) displayed order total price: " + shoppingCartPage.getShoppingCartPageTotalPrice());

        System.out.println("\n");

    }

    //shopping cart page product data logger method
    default void logShoppingCartPageProductData(Page page) {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(page);

        System.out.println("The shopping cart page displayed product data:" + "\n");

        logger.info("The shopping cart page displayed item count: " + shoppingCartPage.getShoppingCartPageItemCount());
        logger.info("The shopping cart page displayed product name(s): " + shoppingCartPage.getShoppingCartPageProductName());
        logger.info("The shopping cart page displayed product brand(s): " + shoppingCartPage.getShoppingCartPageProductBrand());
        logger.info("The shopping cart page displayed product quantity(ies): " + shoppingCartPage.getShoppingCartPageProductQty());
        logger.info("The shopping cart page displayed product unit price(s): " + shoppingCartPage.getShoppingCartPageProductUnitPrice());
        logger.info("The shopping cart page displayed product price(s): " + shoppingCartPage.getShoppingCartPageProductPrice());
        //assert the product subtotal price is equal to product subtotal price in summary (since these elements show the same data)
        BigDecimal totalProductSubtotal = shoppingCartPage.getShoppingCartPageProductPrice().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        assertEquals(totalProductSubtotal, shoppingCartPage.getShoppingCartPageSubtotalPrice(), "The shopping cart page subtotal price / subtotal product price in summary don't match expectations.");

        System.out.println("The shopping cart page displayed order summary section data: " + "\n");

        logger.info("The shopping cart page displayed order subtotal price: " + shoppingCartPage.getShoppingCartPageSubtotalPrice());
        logger.info("The shopping cart page displayed order shipping price: " + shoppingCartPage.getShoppingCartPageShippingPrice());
        logger.info("The shopping cart page displayed order tax amount: " + shoppingCartPage.getShoppingCartPageTaxAmount());
        logger.info("The shopping cart page displayed order total price: " + shoppingCartPage.getShoppingCartPageTotalPrice());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page aside order summary product data logger method
    default void logCheckoutPageAsideOrderSummaryProductData(Page page) {
        CheckoutPage checkoutPage = new CheckoutPage(page);

        System.out.println("The checkout page aside order summary section displayed order data:" + "\n");

        logger.info("The checkout page aside order summary section displayed product name(s) and quantity(ies): " + checkoutPage.getCheckoutPageAsideSummaryProductNameAndQty());
        logger.info("The checkout page aside order summary section displayed product unit price(s): " + checkoutPage.getCheckoutPageAsideSummaryProductUnitPrice());
        logger.info("The checkout page aside order summary section displayed order subtotal price: " + checkoutPage.getCheckoutPageAsideOrderSummarySubtotalPrice());
        logger.info("The checkout page aside order summary section displayed order shipping price: " + checkoutPage.getCheckoutPageAsideOrderSummaryShippingPrice());
        logger.info("The checkout page aside order summary section displayed order tax amount: " + checkoutPage.getCheckoutPageAsideOrderSummaryTaxAmount());
        logger.info("The checkout page aside order summary section displayed order total price: " + checkoutPage.getCheckoutPageAsideOrderSummaryTotalPrice());

        System.out.println("\n");

    }

    //checkout page order summary section data logger method
    default void logCheckoutPageOrderSummaryData(Page page) {
        CheckoutPage checkoutPage = new CheckoutPage(page);

        System.out.println("The checkout page order summary section displayed order data:" + "\n");

        logger.info("The checkout page order summary section displayed product name(s): " + checkoutPage.getCheckoutPageOrderSummaryProductName());
        logger.info("The checkout page order summary section displayed product quantity(ies): " + checkoutPage.getCheckoutPageOrderSummaryProductQty());
        logger.info("The checkout page order summary section displayed product unit price(s): " + checkoutPage.getCheckoutPageOrderSummaryProductUnitPrice());

        System.out.println("\n");

        System.out.println("The checkout page order summary section displayed user data:" + "\n");

        logger.info("The checkout page aside order summary section shipping information data: " + checkoutPage.getCheckoutPageOrderSummaryShippingInfoSubsectionData());
        logger.info("The checkout page aside order summary section payment method data: " + checkoutPage.getCheckoutPageOrderSummaryPayMethodInfoSubsectionData());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
