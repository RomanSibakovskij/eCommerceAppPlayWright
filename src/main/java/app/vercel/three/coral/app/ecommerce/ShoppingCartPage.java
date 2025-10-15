package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import com.microsoft.playwright.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

public class ShoppingCartPage extends BasePage {

    //shopping cart page web elements
    private Locator shoppingCartPageTitle;
    private Locator shoppingCartPageItemCounter;
    //product table (list elements)
    private Locator shoppingCartPageProductImgElements;
    private Locator shoppingCartPageProductNameElements;
    private Locator shoppingCartPageProductBrandElements;
    private Locator shoppingCartPageProductQtySubtextElements;
    private Locator shoppingCartPageProductQtyDecreaseBtnElements;
    private Locator shoppingCartPageProductQtyElements;
    private Locator shoppingCartPageProductQtyIncreaseBtnElements;
    private Locator shoppingCartPageProductUnitPriceElements;
    private Locator shoppingCartPageProductRemoveBtnElements;
    private Locator shoppingCartPageProductPriceElements;
    //singular elements
    private Locator shoppingCartPageClearCartBtn;
    //order summary section
    private Locator shoppingCartPageSummarySectionTitle;
    private Locator shoppingCartPageSubtotalSubtext;
    private Locator shoppingCartPageSubtotalPrice;
    private Locator shoppingCartPageShippingSubtext;
    private Locator shoppingCartPageShippingPrice;
    private Locator shoppingCartPageShippingFreePriceTag;
    private Locator shoppingCartPageTaxSubtext;
    private Locator shoppingCartPageTaxAmount;
    private Locator shoppingCartPageTotalSubtext;
    private Locator shoppingCartPageTotalPrice;
    private Locator shoppingCartPageFreeShippingBoxText;
    //buttons
    private Locator shoppingCartPageProceedToCheckoutBtn;
    private Locator shoppingCartPageContinueShoppingBtn;
    //icons
    private Locator shoppingCartPageFreeShippingIcon;
    private Locator shoppingCartPageFreeShippingSubtext;
    private Locator shoppingCartPageProductReturnsIcon;
    private Locator shoppingCartPageProductReturnsSubtext;
    private Locator shoppingCartPageSecureCheckoutIcon;
    private Locator shoppingCartPageSecureCheckoutSubtext;
    //empty shopping cart page elements
    private Locator emptyShoppingCartPageIcon;
    private Locator emptyShoppingCartPageTitle;
    private Locator emptyShoppingCartPageDesc;
    //buttons
    private Locator emptyShoppingCartPageBrowseProductsBtn;
    private Locator emptyShoppingCartPageGoBackBtn;

    public ShoppingCartPage(Page page) {
        super(page);

        shoppingCartPageTitle = page.locator("//div[@class='MuiContainer-root MuiContainer-maxWidthXl css-vh0fcp']/h3");
        shoppingCartPageItemCounter = page.locator("//div[@class='MuiContainer-root MuiContainer-maxWidthXl css-vh0fcp']/p");
        //product table (list elements)
        shoppingCartPageProductImgElements = page.locator("//div[@class='MuiBox-root css-ty7r6d']/img");
        shoppingCartPageProductNameElements = page.locator("//div[@class='MuiBox-root css-0']/h6");
        shoppingCartPageProductBrandElements = page.locator("//div[@class='MuiBox-root css-0']/p");
        shoppingCartPageProductQtySubtextElements = page.locator("//div[@class='MuiBox-root css-1uuhu1d']/div/p");
        shoppingCartPageProductQtyDecreaseBtnElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-eyhcd8']/button[1]");
        shoppingCartPageProductQtyElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-eyhcd8']/p");
        shoppingCartPageProductQtyIncreaseBtnElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-eyhcd8']/button[2]");
        shoppingCartPageProductUnitPriceElements = page.locator("//div[@class='MuiBox-root css-1qdyvok']/h6");
        shoppingCartPageProductRemoveBtnElements = page.locator("//div[@class='MuiBox-root css-1uuhu1d']/div[2]/button");
        shoppingCartPageProductPriceElements = page.locator("//div[@class='MuiBox-root css-1uuhu1d']/div[2]/h6");
        //singular elements
        shoppingCartPageClearCartBtn = page.locator("//div[@class='MuiBox-root css-1bvc4cc']/button");
        //order summary section
        shoppingCartPageSummarySectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-do5xdo']/h5");
        shoppingCartPageSubtotalSubtext = page.locator("//div[@class='MuiBox-root css-rxas85']/div[1]/p[1]");
        shoppingCartPageSubtotalPrice = page.locator("//div[@class='MuiBox-root css-rxas85']/div[1]/p[2]");
        shoppingCartPageShippingSubtext = page.locator("//div[@class='MuiBox-root css-rxas85']/div[2]/p[1]");
        shoppingCartPageShippingPrice = page.locator("//div[@class='MuiBox-root css-rxas85']/div[2]/p[2]");
        shoppingCartPageShippingFreePriceTag = page.locator("//div[@class='MuiBox-root css-rxas85']/div[2]//span");
        shoppingCartPageTaxSubtext = page.locator("//div[@class='MuiBox-root css-rxas85']/div[3]/p[1]");
        shoppingCartPageTaxAmount = page.locator("//div[@class='MuiBox-root css-rxas85']/div[3]/p[2]");
        shoppingCartPageTotalSubtext = page.locator("//div[@class='MuiBox-root css-gg4vpm']/h6");
        shoppingCartPageTotalPrice = page.locator("//div[@class='MuiBox-root css-gg4vpm']/h5");
        //shoppingCartPageFreeShippingBoxText = page.locator("//div[@role='alert']"); //currently not used
        //buttons
        shoppingCartPageProceedToCheckoutBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-do5xdo']/button[1]");
        shoppingCartPageContinueShoppingBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-do5xdo']/button[2]");
        //icons
        shoppingCartPageFreeShippingIcon = page.locator("//div[@class='MuiBox-root css-ji59cs']/div/div[1]/*[local-name()='svg']");
        shoppingCartPageFreeShippingSubtext = page.locator("//div[@class='MuiBox-root css-ji59cs']/div/div[1]/p");
        shoppingCartPageProductReturnsIcon = page.locator("//div[@class='MuiBox-root css-ji59cs']/div/div[2]/*[local-name()='svg']");
        shoppingCartPageProductReturnsSubtext = page.locator("//div[@class='MuiBox-root css-ji59cs']/div/div[2]/p");
        shoppingCartPageSecureCheckoutIcon = page.locator("//div[@class='MuiBox-root css-ji59cs']/div/div[3]/*[local-name()='svg']");
        shoppingCartPageSecureCheckoutSubtext = page.locator("//div[@class='MuiBox-root css-ji59cs']/div/div[3]/p");
        //empty shopping cart page elements
        emptyShoppingCartPageIcon = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-1hy22ya']/*[local-name()='svg']");
        emptyShoppingCartPageTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-1hy22ya']/h4");
        emptyShoppingCartPageDesc = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-1hy22ya']/p");
        emptyShoppingCartPageBrowseProductsBtn = page.locator("//div[@class='MuiBox-root css-hi8lfv']/button[1]");
        emptyShoppingCartPageGoBackBtn = page.locator("//div[@class='MuiBox-root css-hi8lfv']/button[1]");

    }

    //click set product decrease quantity (by set amount) button method
    public void clickShopCartPageSetProductQtyDecreaseBtn(int index, int times) {
        Locator setProductQtyDecreaseBtn = shoppingCartPageProductQtyDecreaseBtnElements.nth(index);
        for (int i = 0; i < times; i++) {
            setProductQtyDecreaseBtn.click();
        }
    }

    //click set product increase quantity (by set amount) button method
    public void clickShopCartPageSetProductQtyIncreaseBtn(int index, int times) {
        Locator setProductQtyIncreaseBtn = shoppingCartPageProductQtyIncreaseBtnElements.nth(index);
        for (int i = 0; i < times; i++) {
            setProductQtyIncreaseBtn.click();
        }
    }

    //click set product remove button method
    public void clickShopCartPageSetProductRemoveBtn(int index) {shoppingCartPageProductRemoveBtnElements.nth(index).click();}

    //click "Clear Cart" button method
    public void clickShopCartPageClearCartBtn() {
        shoppingCartPageClearCartBtn.hover();
        shoppingCartPageClearCartBtn.click();
    }

    //click "Proceed to checkout" button method
    public void clickShopCartPageProceedToCheckoutBtn() {shoppingCartPageProceedToCheckoutBtn.click();}

    //shopping cart page product data getters
    public String getShoppingCartPageItemCount() {return shoppingCartPageItemCounter.innerText();}
    //product table (list elements)
    public List<String> getShoppingCartPageProductName() {
        int count = shoppingCartPageProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartPageProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShoppingCartPageProductBrand() {
        int count = shoppingCartPageProductBrandElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartPageProductBrandElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShoppingCartPageProductQty() {
        int count = shoppingCartPageProductQtyElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartPageProductQtyElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShoppingCartPageProductUnitPrice() {
        int count = shoppingCartPageProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartPageProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<BigDecimal> getShoppingCartPageProductPrice() {
        int count = shoppingCartPageProductPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> {
                    String priceText = shoppingCartPageProductPriceElements.nth(i).innerText().replaceAll("[^\\d.,]", "");
                    return new BigDecimal(priceText.replace(",", ".")); //formatting
                })
                .collect(Collectors.toList());
    }
    //order summary section
    public BigDecimal getShoppingCartPageSubtotalPrice() {
        String priceText = shoppingCartPageSubtotalPrice.innerText()
                .replaceAll("[^\\d.,]", "");
        return new BigDecimal(priceText.replace(",", "."));
    }
    public String getShoppingCartPageShippingPrice() {return shoppingCartPageShippingPrice.innerText();}
    public String getShoppingCartPageShippingFreePriceTag() {return shoppingCartPageShippingFreePriceTag.innerText();}
    public String getShoppingCartPageTaxAmount() {return shoppingCartPageTaxAmount.innerText();}
    public String getShoppingCartPageTotalPrice() {return shoppingCartPageTotalPrice.innerText();}
    
    //shopping cart page text element getters
    public String getShoppingCartPageTitle() {return shoppingCartPageTitle.innerText();}
    //product table (list elements)
    public List<String> getShoppingCartProductQtySubtext() {
        int count = shoppingCartPageProductQtySubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartPageProductQtySubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //order summary section
    public String getShoppingCartPageSummarySectionTitle() {return shoppingCartPageSummarySectionTitle.innerText();}

    public String getShoppingCartPageSubtotalSubtext() {
        String fullText = shoppingCartPageSubtotalSubtext.innerText().trim().replaceAll("\\s+", " ");
        return fullText.split("\\s")[0];
    }

    public String getShoppingCartPageShippingSubtext() {return shoppingCartPageShippingSubtext.innerText();}
    public String getShoppingCartPageTaxSubtext() {return shoppingCartPageTaxSubtext.innerText();}
    public String getShoppingCartPageTotalSubtext() {return shoppingCartPageTotalSubtext.innerText();}
    //public String getShoppingCartPageFreeShippingBoxText() {return shoppingCartPageFreeShippingBoxText.innerText();} //currently not used
    //buttons
    public String getShoppingCartPageClearCartBtnText() {return shoppingCartPageClearCartBtn.innerText();}
    public String getShoppingCartPageProceedToCheckoutBtnText() {return shoppingCartPageProceedToCheckoutBtn.innerText();}
    public String getShoppingCartPageContinueShoppingBtnText() {return shoppingCartPageContinueShoppingBtn.innerText();}
    //icons
    public String getShoppingCartPageFreeShippingSubtext() {return shoppingCartPageFreeShippingSubtext.innerText();}
    public String getShoppingCartPageProductReturnsSubtext() {return shoppingCartPageProductReturnsSubtext.innerText();}
    public String getShoppingCartPageSecureCheckoutSubtext() {return shoppingCartPageSecureCheckoutSubtext.innerText();}
    //empty shopping cart page
    public String getEmptyShoppingCartPageTitle() {return emptyShoppingCartPageTitle.innerText();}
    public String getEmptyShoppingCartPageDesc() {return emptyShoppingCartPageDesc.innerText();}
    public String getEmptyShoppingCartPageBrowseProductsBtnText() {return emptyShoppingCartPageBrowseProductsBtn.innerText();}
    public String getEmptyShoppingCartPageGoBackBtnText() {return emptyShoppingCartPageGoBackBtn.innerText();}

    //shopping cart page web element assert methods
    public boolean isShoppingCartPageTitleVisible(){return shoppingCartPageTitle.isVisible();}
    public boolean isShoppingCartPageItemCounterVisible(){return shoppingCartPageItemCounter.isVisible();}
    //product table (list elements)
    public boolean isShoppingCartPageProductImgElementVisible(){return shoppingCartPageProductImgElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductNameElementVisible(){return shoppingCartPageProductNameElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductBrandElementVisible(){return shoppingCartPageProductBrandElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductQtySubtextElementVisible(){return shoppingCartPageProductQtySubtextElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductQtyDecreaseBtnElementVisible(){return shoppingCartPageProductQtyDecreaseBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductQtyElementVisible(){return shoppingCartPageProductQtyElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductQtyIncreaseBtnElementVisible(){return shoppingCartPageProductQtyIncreaseBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductUnitPriceElementVisible(){return shoppingCartPageProductUnitPriceElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductRemoveButtonElementVisible(){return shoppingCartPageProductRemoveBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartPageProductPriceElementVisible(){return shoppingCartPageProductPriceElements.all().stream().allMatch(Locator::isVisible);}
    //singular elements
    public boolean isShoppingCartPageClearCartBtnVisible(){return shoppingCartPageClearCartBtn.isVisible();}
    //order summary section
    public boolean isShoppingCartPageSummarySectionTitleVisible(){return shoppingCartPageSummarySectionTitle.isVisible();}
    public boolean isShoppingCartPageSummarySubtotalSubtextVisible(){return shoppingCartPageSubtotalSubtext.isVisible();}
    public boolean isShoppingCartPageSummarySubtotalPriceVisible(){return shoppingCartPageSubtotalPrice.isVisible();}
    public boolean isShoppingCartPageSummaryShippingSubtextVisible(){return shoppingCartPageShippingSubtext.isVisible();}
    public boolean isShoppingCartPageSummaryShippingPriceVisible(){return shoppingCartPageShippingPrice.isVisible();}
    public boolean isShoppingCartPageSummaryFreeShippingPriceTagVisible(){return shoppingCartPageShippingFreePriceTag.isVisible();} //
    public boolean isShoppingCartPageSummaryTaxSubtextVisible(){return shoppingCartPageTaxSubtext.isVisible();}
    public boolean isShoppingCartPageSummaryTaxAmountVisible(){return shoppingCartPageTaxAmount.isVisible();}
    public boolean isShoppingCartPageSummaryTotalSubtextVisible(){return shoppingCartPageTotalSubtext.isVisible();}
    public boolean isShoppingCartPageSummaryTotalPriceVisible(){return shoppingCartPageTotalPrice.isVisible();}
    //buttons
    public boolean isShoppingCartPageProceedToCheckoutBtnVisible(){return shoppingCartPageProceedToCheckoutBtn.isVisible();}
    public boolean isShoppingCartPageContinueShoppingBtnVisible(){return shoppingCartPageContinueShoppingBtn.isVisible();}
    //icons
    public boolean isShoppingCartPageFreeShippingIconVisible(){return shoppingCartPageFreeShippingIcon.isVisible();}
    public boolean isShoppingCartPageFreeShippingSubtextVisible(){return shoppingCartPageFreeShippingSubtext.isVisible();}
    public boolean isShoppingCartPageProductReturnsIconVisible(){return shoppingCartPageProductReturnsIcon.isVisible();}
    public boolean isShoppingCartPageProductReturnsSubtextVisible(){return shoppingCartPageProductReturnsSubtext.isVisible();}
    public boolean isShoppingCartPageSecureCheckoutIconVisible(){return shoppingCartPageSecureCheckoutIcon.isVisible();}
    public boolean isShoppingCartPageSecureCheckoutSubtextVisible(){return shoppingCartPageSecureCheckoutSubtext.isVisible();}
    //empty shopping cart page
    public boolean isEmptyShoppingCartPageIconVisible(){return emptyShoppingCartPageIcon.isVisible();}
    public boolean isEmptyShoppingCartPageTitleVisible(){return emptyShoppingCartPageTitle.isVisible();}
    public boolean isEmptyShoppingCartPageDescVisible(){return emptyShoppingCartPageDesc.isVisible();}
    public boolean isEmptyShoppingCartPageBrowseProductsBtnVisible(){return emptyShoppingCartPageBrowseProductsBtn.isVisible();}
    public boolean isEmptyShoppingCartPageGoBackBtnVisible(){return emptyShoppingCartPageGoBackBtn.isVisible();}

}
