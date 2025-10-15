package app.vercel.three.coral.app.ecommerce.modals;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class ShopCartModal extends BasePage {

    //shopping cart modal web elements
    private Locator shoppingCartModalTitle;
    private Locator shoppingCartModalItemCount;
    //product table (list elements)
    private Locator shoppingCartModalProductImgElements;
    private Locator shoppingCartModalProductNameElements;
    private Locator shoppingCartModalProductPriceElements;
    private Locator shoppingCartModalProductQtyDecreaseBtnElements;
    private Locator shoppingCartModalProductQtyElements;
    private Locator shoppingCartModalProductQtyIncreaseBtnElements;
    private Locator shoppingCartModalProductRemoveBtnElements;
    //summary
    private Locator shoppingCartModalTotalPriceSubtext;
    private Locator shoppingCartModalTotalPrice;
    //buttons
    private Locator shoppingCartModalViewCartBtn;
    private Locator shoppingCartModalCheckoutBtn;
    //empty shopping cart modal elements
    private Locator emptyShoppingCartModalTitle;
    private Locator emptyShoppingCartModalStartShoppingBtn;

    public ShopCartModal(Page page) {
        super(page);

        shoppingCartModalTitle = page.locator("//div[@class='MuiBox-root css-1coeexk']/h6");
        shoppingCartModalItemCount = page.locator("//div[@class='MuiBox-root css-1coeexk']//span");
        //product table (list elements)
        shoppingCartModalProductImgElements = page.locator("//div[@class='MuiBox-root css-13uxdti']/img");
        shoppingCartModalProductNameElements = page.locator("//div[@class='MuiBox-root css-eqohbe']/h6");
        shoppingCartModalProductPriceElements = page.locator("//div[@class='MuiBox-root css-eqohbe']/p");
        shoppingCartModalProductQtyDecreaseBtnElements = page.locator("//div[@class='MuiBox-root css-1plr4xa']/button[1]");
        shoppingCartModalProductQtyElements = page.locator("//div[@class='MuiBox-root css-1plr4xa']/p");
        shoppingCartModalProductQtyIncreaseBtnElements = page.locator("//div[@class='MuiBox-root css-1plr4xa']/button[2]");
        shoppingCartModalProductRemoveBtnElements = page.locator("//div[@class='MuiBox-root css-13uxdti']/button");
        //summary
        shoppingCartModalTotalPriceSubtext = page.locator("//div[@class='MuiBox-root css-1kw3y0a']/h6[1]");
        shoppingCartModalTotalPrice = page.locator("//div[@class='MuiBox-root css-1kw3y0a']/h6[2]");
        //buttons
        shoppingCartModalViewCartBtn = page.locator("//div[@class='MuiBox-root css-dtg2nl']/button[1]");
        shoppingCartModalCheckoutBtn = page.locator("//div[@class='MuiBox-root css-dtg2nl']/button[2]");
        //empty shopping cart modal elements
        emptyShoppingCartModalTitle = page.locator("//div[@class='MuiBox-root css-8ptgxe']/p");
        emptyShoppingCartModalStartShoppingBtn = page.locator("//div[@class='MuiBox-root css-8ptgxe']/button");

    }

    //click set product increase quantity (by set amount) button method
    public void clickShopCartModalSetProductQtyIncreaseBtn(int index, int times) {
        Locator setProductQtyIncreaseBtn = shoppingCartModalProductQtyIncreaseBtnElements.nth(index);
        for (int i = 0; i < times; i++) {
            setProductQtyIncreaseBtn.click();
        }
    }

    //click set product remove button method
    public void clickSetProductRemoveBtn(int index) {shoppingCartModalProductRemoveBtnElements.nth(index).click();}

    //click "View Cart" button method
    public void clickViewCartBtn() {shoppingCartModalViewCartBtn.click();}

    //shopping cart modal product data getters
    public String getShoppingCartModalItemCount() {return shoppingCartModalItemCount.innerText();}
    //product table (list elements)
    public List<String> getShopCartModalProductName(){
        int count = shoppingCartModalProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartModalProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopCartModalProductPrice(){
        int count = shoppingCartModalProductPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartModalProductPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopCartModalProductQty(){
        int count = shoppingCartModalProductQtyElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartModalProductQtyElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //summary
    public String getShoppingCartModalTotalPrice() {return shoppingCartModalTotalPrice.innerText();}

    //shopping cart modal text element getters
    public String getShoppingCartModalTitle() {return shoppingCartModalTitle.innerText();}
    //summary
    public String getShoppingCartModalTotalSubtext() {return shoppingCartModalTotalPriceSubtext.innerText();}
    //buttons
    public String getShoppingCartModalViewCartBtnText() {return shoppingCartModalViewCartBtn.innerText();}
    public String getShoppingCartModalCheckoutBtnText() {return shoppingCartModalCheckoutBtn.innerText();}
    //empty shopping cart modal elements
    public String getEmptyShoppingCartModalTitle() {return emptyShoppingCartModalTitle.innerText();}
    public String getEmptyShoppingCartModalStartShoppingBtnText() {return emptyShoppingCartModalStartShoppingBtn.innerText();}

    //shopping cart modal web element assert methods
    public boolean isShoppingCartModalTitleVisible() {return shoppingCartModalTitle.isVisible();}
    public boolean isShoppingCartModalItemCountVisible() {return shoppingCartModalItemCount.isVisible();}
    //product table (list elements)
    public boolean isShoppingCartModalProductImgElementVisible() {return shoppingCartModalProductImgElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartModalProductNameElementVisible() {return shoppingCartModalProductNameElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartModalProductPriceElementVisible() {return shoppingCartModalProductPriceElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartModalProductQtyDecreaseBtnElementVisible() {return shoppingCartModalProductQtyDecreaseBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartModalProductQtyElementVisible() {return shoppingCartModalProductQtyElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartModalProductQtyIncreaseBtnElementVisible() {return shoppingCartModalProductQtyIncreaseBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isShoppingCartModalProductRemoveBtnElementVisible() {return shoppingCartModalProductRemoveBtnElements.all().stream().allMatch(Locator::isVisible);}
    //summary
    public boolean isShoppingCartModalTotalPriceSubtextVisible() {return shoppingCartModalTotalPriceSubtext.isVisible();}
    public boolean isShoppingCartModalTotalPriceVisible() {return shoppingCartModalTotalPrice.isVisible();}
    //buttons
    public boolean isShoppingCartModalViewCartBtnVisible() {return shoppingCartModalViewCartBtn.isVisible();}
    public boolean isShoppingCartModalCheckoutBtnVisible() {return shoppingCartModalCheckoutBtn.isVisible();}
    //empty shopping cart modal web element assert methods
    public boolean isEmptyShoppingCartModalTitleVisible() {return emptyShoppingCartModalTitle.isVisible();}
    public boolean isEmptyShoppingCartModalStartShoppingBtnVisible() {return emptyShoppingCartModalStartShoppingBtn.isVisible();}

}
