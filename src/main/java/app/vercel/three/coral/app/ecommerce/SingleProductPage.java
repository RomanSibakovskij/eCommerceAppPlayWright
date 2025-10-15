package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class SingleProductPage extends BasePage {

    //single product page web elements
    private Locator singleProductPageProductImg;
    //list elements
    private Locator singleProductPageProductReviewStarElements;
    //singular elements
    private Locator singleProductPageProductCategoryTag;
    private Locator singleProductPageProductBrandTag;
    private Locator singleProductPageProductDiscountTag;
    private Locator singleProductPageProductName;
    private Locator singleProductPageProductAvgReviewScore;
    private Locator singleProductPageProductAvailabilityTag;
    private Locator singleProductPageProductUnitPrice;
    private Locator singleProductPageProductOldUnitPrice;
    private Locator singleProductPageProductDiscountText;
    private Locator singleProductPageProductDesc;
    private Locator singleProductPageProductQtySubtext;
    private Locator singleProductPageProductQtyDecreaseBtn;
    private Locator singleProductPageProductQty;
    private Locator singleProductPageProductQtyIncreaseBtn;
    private Locator singleProductPageAddToCartBtn;
    private Locator singleProductPageAddToWishlistBtn;
    private Locator singleProductPageAddToCompareListBtn;
    private Locator singleProductPageProductFreeShippingIcon;
    private Locator singleProductPageProductFreeShippingSubtext;
    private Locator singleProductPageProductReturnsIcon;
    private Locator singleProductPageProductReturnsSubtext;
    private Locator singleProductPageProductWarrantyIcon;
    private Locator singleProductPageProductWarrantySubtext;
    //navbar
    //list elements
    private Locator singleProductPageNavbarBtnElements;
    //singular elements
    private Locator singleProductPageProductDetailsBox;

    public SingleProductPage(Page page) {

        super(page);

        singleProductPageProductImg = page.locator("//div[@class='MuiBox-root css-cacgvk']/img");
        //list elements
        singleProductPageProductReviewStarElements = page.locator("//div[@class='MuiBox-root css-70qvj9']//span[@class='MuiRating-decimal css-l5xv05']");
        //singular elements
        singleProductPageProductCategoryTag = page.locator("//div[@class='MuiBox-root css-cktyg3']/div[1]");
        singleProductPageProductBrandTag = page.locator("//div[@class='MuiBox-root css-cktyg3']/div[2]");
        singleProductPageProductDiscountTag = page.locator("//div[@class='MuiBox-root css-cktyg3']/div[3]");
        singleProductPageProductName = page.locator("//div[@class='MuiBox-root css-1g4yje1']/h4");
        singleProductPageProductAvgReviewScore = page.locator("//div[@class='MuiBox-root css-70qvj9']/p");
        singleProductPageProductAvailabilityTag = page.locator("//div[@class='MuiChip-root MuiChip-filled MuiChip-sizeSmall MuiChip-colorSuccess MuiChip-filledSuccess css-7r9qy9']/span");
        singleProductPageProductUnitPrice = page.locator("//div[@class='MuiBox-root css-syu8eu']/h3");
        singleProductPageProductOldUnitPrice = page.locator("//div[@class='MuiBox-root css-syu8eu']/h6");
        singleProductPageProductDiscountText = page.locator("//div[@class='MuiBox-root css-i3pbo']/p");
        singleProductPageProductDesc = page.locator("//div[@class='MuiBox-root css-1g4yje1']/p");
        singleProductPageProductQtySubtext = page.locator("//div[@class='MuiBox-root css-i3pbo']/h6");
        singleProductPageProductQtyDecreaseBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-eyhcd8']/button[1]");
        singleProductPageProductQty = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-eyhcd8']/h6");
        singleProductPageProductQtyIncreaseBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 css-eyhcd8']/button[2]");
        singleProductPageAddToCartBtn = page.locator("//div[@class='MuiBox-root css-1wbf2rv']/button");
        singleProductPageAddToWishlistBtn = page.locator("//div[@class='MuiBox-root css-1i27l4i']/button[1]");
        singleProductPageAddToCompareListBtn = page.locator("//div[@class='MuiBox-root css-1i27l4i']/button[2]");
        singleProductPageProductFreeShippingIcon = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-2 css-1klpoq2']/div[1]/*[local-name()='svg']");
        singleProductPageProductFreeShippingSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-2 css-1klpoq2']/div[1]/p");
        singleProductPageProductReturnsIcon = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-2 css-1klpoq2']/div[2]/*[local-name()='svg']");
        singleProductPageProductReturnsSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-2 css-1klpoq2']/div[2]/p");
        singleProductPageProductWarrantyIcon = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-2 css-1klpoq2']/div[3]/*[local-name()='svg']");
        singleProductPageProductWarrantySubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-2 css-1klpoq2']/div[3]/p");
        //navbar
        //list elements
        singleProductPageNavbarBtnElements = page.locator("//div[@class='MuiTabs-list MuiTabs-flexContainer css-162tvoi']/button"); //specifications button crashes the app
        //singular elements
        singleProductPageProductDetailsBox = page.locator("//div[@class='MuiBox-root css-19kzrtu']/p");

    }

    //click product decrease quantity (by set amount) button method
    public void clickSingleProductPageProductQtyDecreaseBtn(int times) {
        for (int i = 0; i < times; i++) {
            singleProductPageProductQtyDecreaseBtn.click();
        }
    }

    //click product increase quantity (by set amount) button method
    public void clickSingleProductPageProductQtyIncreaseBtn(int times) {
        for (int i = 0; i < times; i++) {
            singleProductPageProductQtyIncreaseBtn.click();
        }
    }

    //click "Add to cart" button method
    public void clickAddToCartBtn() {singleProductPageAddToCartBtn.click();}

    //click "Add to wishlist" button method
    public void clickAddToWishlistBtn() {singleProductPageAddToWishlistBtn.click();}

    //click "Add to compare list" button method
    public void clickAddToCompareListBtn() {singleProductPageAddToCompareListBtn.click();}

    //single product page product data getters
    public String getSingleProductPageCategoryTagText(){return singleProductPageProductCategoryTag.innerText();}
    public String getSingleProductPageBrandTagText(){return singleProductPageProductBrandTag.innerText();}
    public String getSingleProductPageDiscountTagText(){return singleProductPageProductCategoryTag.innerText();}
    public String getSingleProductPageProductName(){return singleProductPageProductName.innerText();}
    public String getSingleProductPageProductAvgReviewScore(){return singleProductPageProductAvgReviewScore.innerText();}
    public String getSingleProductPageProductAvailabilityTag(){return singleProductPageProductAvailabilityTag.innerText();}
    public String getSingleProductPageProductUnitPrice(){return singleProductPageProductUnitPrice.innerText();}
    public String getSingleProductPageProductOldUnitPrice(){return singleProductPageProductOldUnitPrice.innerText();}
    public String getSingleProductPageProductDiscountText(){return singleProductPageProductDiscountText.innerText();}
    public String getSingleProductPageProductDesc(){return singleProductPageProductDesc.innerText();}
    public String getSingleProductPageProductQty(){return singleProductPageProductQty.innerText();}
    public String getSingleProductPageProductDetailsBoxText(){return singleProductPageProductDetailsBox.innerText();}

    //single product page text element getters
    public String getSingleProductPageProductQtySubtext(){return singleProductPageProductQtySubtext.innerText();}
    public String getSingleProductPageProductFreeShippingSubtext(){return singleProductPageProductFreeShippingSubtext.innerText();}
    public String getSingleProductPageProductReturnsSubtext(){return singleProductPageProductReturnsSubtext.innerText();}
    public String getSingleProductPageProductWarrantySubtext(){return singleProductPageProductWarrantySubtext.innerText();}

    public String getSingleProductPageAddToCartBtnText(){
        String fullText = singleProductPageAddToCartBtn.innerText();
        String trimmedText = fullText.trim().replaceAll("\\s+", " ");

        String[] text = trimmedText.split("\\s*-\\s*");//split on '-' and take the first part
        return text[0];
    }

    //list elements
    public List<String> getSingleProductPageNavbarBtnText(){
        int count = singleProductPageNavbarBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageNavbarBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //single product page web element assert methods
    public boolean isSingleProductPageProductImgVisible() {return singleProductPageProductImg.isVisible();}
    //list elements
    public boolean isSingleProductPageProductReviewStarElementVisible() {return singleProductPageProductReviewStarElements.all().stream().allMatch((Locator::isVisible));}
    //singular elements
    public boolean isSingleProductPageProductCategoryTagVisible() {return singleProductPageProductCategoryTag.isVisible();}
    public boolean isSingleProductPageProductBrandTagVisible() {return singleProductPageProductBrandTag.isVisible();}
    public boolean isSingleProductPageProductDiscountTagVisible() {return singleProductPageProductDiscountTag.isVisible();}
    public boolean isSingleProductPageProductNameVisible() {return singleProductPageProductName.isVisible();}
    public boolean isSingleProductPageProductAvgReviewScoreVisible() {return singleProductPageProductAvgReviewScore.isVisible();}
    public boolean isSingleProductPageProductAvailabilityTagVisible() {return singleProductPageProductAvailabilityTag.isVisible();}
    public boolean isSingleProductPageProductUnitPriceTagVisible() {return singleProductPageProductUnitPrice.isVisible();}
    public boolean isSingleProductPageProductOldUnitPriceVisible() {return singleProductPageProductOldUnitPrice.isVisible();}
    public boolean isSingleProductPageProductDiscountTextVisible() {return singleProductPageProductDiscountText.isVisible();}
    public boolean isSingleProductPageProductDescVisible() {return singleProductPageProductDesc.isVisible();}
    public boolean isSingleProductPageProductQtySubtextVisible() {return singleProductPageProductQtySubtext.isVisible();}
    public boolean isSingleProductPageProductQtyDecreaseBtnVisible() {return singleProductPageProductQtyDecreaseBtn.isVisible();}
    public boolean isSingleProductPageProductQtyVisible() {return singleProductPageProductQty.isVisible();}
    public boolean isSingleProductPageProductQtyIncreaseBtnVisible() {return singleProductPageProductQtyIncreaseBtn.isVisible();}
    public boolean isSingleProductPageAddToCartBtnVisible() {return singleProductPageAddToCartBtn.isVisible();}
    public boolean isSingleProductPageAddToWishlistBtnVisible() {return singleProductPageAddToWishlistBtn.isVisible();}
    public boolean isSingleProductPageAddToCompareBtnVisible() {return singleProductPageAddToCompareListBtn.isVisible();}
    public boolean isSingleProductPageProductFreeShippingIconVisible() {return singleProductPageProductFreeShippingIcon.isVisible();}
    public boolean isSingleProductPageProductFreeShippingSubtextVisible() {return singleProductPageProductFreeShippingSubtext.isVisible();}
    public boolean isSingleProductPageProductReturnsIconVisible() {return singleProductPageProductReturnsIcon.isVisible();}
    public boolean isSingleProductPageProductReturnsSubtextVisible() {return singleProductPageProductReturnsSubtext.isVisible();}
    public boolean isSingleProductPageProductWarrantyIconVisible() {return singleProductPageProductWarrantyIcon.isVisible();}
    public boolean isSingleProductPageProductWarrantySubtextVisible() {return singleProductPageProductWarrantySubtext.isVisible();}
    //list elements
    public boolean isSingleProductPageNavbarBtnElementVisible() {return singleProductPageNavbarBtnElements.all().stream().allMatch((Locator::isVisible));}
    //singular elements
    public boolean isSingleProductPageProductDetailsBoxVisible() {return singleProductPageProductDetailsBox.isVisible();}

}
