package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class HomePage extends BasePage {

    //home page web elements
    //navbar
    private Locator homeNavbarSearchInputField;
    private Locator homeNavbarFiltersModalMenuBtn;
    private Locator homeNavbarSortByDropdownMenu;
    private Locator homeNavbarCategoriesSubtitle;
    //list elements
    //private Locator homeNavbarSortByDropdownOptionElements; //currently not used
    private Locator homeNavbarCategoriesBtnElements;
    //main
    private Locator homePageProductCount;
    //product table (list elements)
    private Locator homePageProductCardElements;
    private Locator homePageProductCardLinkElements;
    private Locator homePageProductDiscountTagElements;
    private Locator homePageProductAvailabilityElements;
    private Locator homePageProductImgElements;
    private Locator homePageProductAddToWishlistBtnElements; //visible after hover
    private Locator homePageProductQuickViewBtnElements; //visible after hover
    private Locator homePageProductCategoryElements;
    private Locator homePageProductNameLinkElements;
    private Locator homePageProductReviewStarElements;
    private Locator homePageProductAvgReviewScoreElements;
    private Locator homePageProductUnitPriceElements;
    private Locator homePageProductOldUnitPriceElements;
    private Locator homePageProductQuickViewTextElements;
    private Locator homePageProductAddToCartBtnElements;

    public HomePage(Page page) {
        super(page);

        //navbar
        homeNavbarSearchInputField = page.locator("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-1ooubvk']");
        homeNavbarFiltersModalMenuBtn = page.locator("//div[@class='MuiBox-root css-nxbirx']/button");
        homeNavbarSortByDropdownMenu = page.locator("//select[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-d66nsb']");
        homeNavbarCategoriesSubtitle = page.locator("//div[@class='MuiBox-root css-g7uanr']/p");
        //list elements
        //homeNavbarSortByDropdownOptionElements = page.locator("//select[@id='«rkot»']/option"); //currently not used
        homeNavbarCategoriesBtnElements = page.locator("//div[@class='MuiBox-root css-g7uanr']/div[@role='button']");
        //main
        homePageProductCount = page.locator("//p[@class='MuiTypography-root MuiTypography-body1 css-67g9bz']");
        //product table (list elements)
        homePageProductCardElements = page.locator("//div[@class='MuiBox-root css-4rmlxi']");
        homePageProductCardLinkElements = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1p9rlll']");
        homePageProductDiscountTagElements = page.locator("//div[@class='MuiChip-root MuiChip-filled MuiChip-sizeSmall MuiChip-colorError MuiChip-filledError css-qp0x04']/span");
        homePageProductAvailabilityElements = page.locator("//div[@class='MuiChip-root MuiChip-filled MuiChip-sizeSmall MuiChip-colorSuccess MuiChip-filledSuccess css-ey01xf']/span");
        homePageProductImgElements = page.locator("//div[@class='MuiBox-root css-59d0cz']/img");
        homePageProductAddToWishlistBtnElements = page.locator("//div[@class='MuiBox-root css-camdtk']/button[1]"); //visible after hover
        homePageProductQuickViewBtnElements = page.locator("//div[@class='MuiBox-root css-camdtk']/button[2]"); //visible after hover
        homePageProductCategoryElements = page.locator("//div[@class='MuiCardContent-root css-1wu6jp5']/span");
        homePageProductNameLinkElements = page.locator("//div[@class='MuiCardContent-root css-1wu6jp5']/h3");
        homePageProductReviewStarElements = page.locator("//div[@class='MuiBox-root css-1x2mlia']/span/span");
        homePageProductAvgReviewScoreElements = page.locator("//div[@class='MuiBox-root css-1x2mlia']/p");
        homePageProductUnitPriceElements = page.locator("//div[@class='MuiBox-root css-a7so53']/h6");
        homePageProductOldUnitPriceElements = page.locator("//div[@class='MuiBox-root css-a7so53']/p");
        homePageProductQuickViewTextElements = page.locator("//p[@class='MuiTypography-root MuiTypography-body2 css-19mka2n']");
        homePageProductAddToCartBtnElements = page.locator("//div[@class='MuiCardActions-root MuiCardActions-spacing css-17t2p8x']/button");

    }

    //click navbar "Filters" modal button method
    public void clickNavbarFiltersModalBtn(){homeNavbarFiltersModalMenuBtn.click();}

    //click set product "Add to cart" button method
    public void clickSetProductAddToCartBtn(int index){homePageProductAddToCartBtnElements.nth(index).click();}

    //hover over set product card method
    public void hoverOverSetProductCard(int index){homePageProductCardElements.nth(index).hover();}

    //click set product "Add to wishlist" button method
    public void clickSetProductAddToWishlistBtn(int index){homePageProductAddToWishlistBtnElements.nth(index).click();}

    //click set product "Quick view" button method
    public void clickSetProductQuickViewBtn(int index){homePageProductQuickViewBtnElements.nth(index).click();}

    //click set product card method
    public void clickSetProductCard(int index){
        Locator productCard = homePageProductCardLinkElements.nth(index);
        //productCard.focus();
        productCard.click();
    }

    //home page product data getters
    //main
    public String getHomePageProductCount() {return homePageProductCount.innerText();}
    //product table (list elements)
    public List<String> getHomePageProductDiscountTag(){
        int count = homePageProductDiscountTagElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductDiscountTagElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductAvailability(){
        int count = homePageProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductAvailabilityElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductCategory(){
        int count = homePageProductCategoryElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductCategoryElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductName(){
        int count = homePageProductNameLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductNameLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductAvgReviewScore(){
        int count = homePageProductAvgReviewScoreElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductAvgReviewScoreElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductUnitPrice(){
        int count = homePageProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductOldUnitPrice(){
        int count = homePageProductOldUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductOldUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageProductQuickViewText(){
        int count = homePageProductQuickViewTextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductQuickViewTextElements.nth(i).innerText().trim())
                .filter(text -> !text.isEmpty())
                .collect(Collectors.toList());
    }

    //home page text element getters
    //header
    public String getHomeNavbarFiltersModalMenuBtnText() {return homeNavbarFiltersModalMenuBtn.innerText();}
    public String getHomeNavbarCategoriesSubtitle() {return homeNavbarCategoriesSubtitle.innerText();}
    //list elements
    public List<String> getHomePageNavbarCategoriesBtnText(){
        int count = homeNavbarCategoriesBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homeNavbarCategoriesBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //product table (list elements)
    public List<String> getHomePageProductAddToCartBtnText(){
        int count = homePageProductAddToCartBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageProductAddToCartBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //home page web element assert methods
    //header
    public boolean isHomePageNavbarSearchInputFieldVisible(){return homeNavbarSearchInputField.isVisible();}
    public boolean isHomePageNavbarFiltersModalMenuBtnVisible(){return homeNavbarFiltersModalMenuBtn.isVisible();}
    public boolean isHomePageNavbarSortByDropdownMenuVisible(){return homeNavbarSortByDropdownMenu.isVisible();}
    public boolean isHomePageNavbarCategoriesSubtitleVisible(){return homeNavbarCategoriesSubtitle.isVisible();}
    //list elements
    public boolean isHomePageNavbarCategoriesBtnVisible(){return homeNavbarCategoriesBtnElements.all().stream().allMatch(Locator::isVisible);}
    //main
    public boolean isHomePageProductCountVisible(){return homePageProductCount.isVisible();}
    //list elements
    public boolean isHomePageProductCardElementVisible(){return homePageProductCardElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductDiscountTagElementVisible(){return homePageProductDiscountTagElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductAvailabilityElementVisible(){return homePageProductAvailabilityElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductImgElementVisible(){return homePageProductImgElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductCategoryElementVisible(){return homePageProductCategoryElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductNameLinkElementVisible(){return homePageProductNameLinkElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductReviewStarElementVisible(){return homePageProductReviewStarElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductAvgReviewScoreElementVisible(){return homePageProductAvgReviewScoreElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductUnitPriceElementVisible(){return homePageProductUnitPriceElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductOldUnitPriceElementVisible(){return homePageProductOldUnitPriceElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isHomePageProductAddToCartBtnElementVisible(){return homePageProductAddToCartBtnElements.all().stream().allMatch(Locator::isVisible);}

}