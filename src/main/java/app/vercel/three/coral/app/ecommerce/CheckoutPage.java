package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class CheckoutPage extends BasePage {

    //checkout page web elements
    private Locator checkoutPageUpperBackBtn;
    private Locator checkoutPageTitle;
    private Locator checkoutPageBreadcrumb;
    //shipping address info section
    private Locator checkoutPageShipAddressInfoSectionTitle;
    private Locator checkoutPageShipAddressFirstNameSubtext;
    private Locator checkoutPageShipAddressFirstNameInputField;
    private Locator checkoutPageShipAddressLastNameSubtext;
    private Locator checkoutPageShipAddressLastNameInputField;
    private Locator checkoutPageShipAddressEmailSubtext;
    private Locator checkoutPageShipAddressEmailInputField;
    private Locator checkoutPageShipAddressPhoneSubtext;
    private Locator checkoutPageShipAddressPhoneInputField;
    private Locator checkoutPageShipAddressSubtext;
    private Locator checkoutPageShipAddressTextarea;
    private Locator checkoutPageShipAddressCitySubtext;
    private Locator checkoutPageShipAddressCityInputField;
    private Locator checkoutPageShipAddressStateSubtext;
    private Locator checkoutPageShipAddressStateInputField;
    private Locator checkoutPageShipAddressPostCodeSubtext;
    private Locator checkoutPageShipAddressPostCodeInputField;
    private Locator checkoutPageShipAddressCountrySubtext;
    private Locator checkoutPageShipAddressCountryInputField;
    //buttons
    private Locator checkoutPageBackBtn;
    private Locator checkoutPageNextBtn; //at the latter stage it's a "Place order" button
    //payment method
    private Locator checkoutPagePayMethodSectionTitle;
    private Locator checkoutPagePayMethodSectionSubtitle;
    //list elements
    private Locator checkoutPagePayMethodRadioBtnElements;
    private Locator checkoutPagePayMethodRadioSubtextElements;
    //debit/credit card input form
    private Locator checkoutPageCredCardCardholderNameInputField;
    private Locator checkoutPageCredCardNumberInputField;
    private Locator checkoutPageCredCardExpiryDateInputField;
    private Locator checkoutPageCredCardCVVInputField;
    //order summary section
    private Locator checkoutPageOrderSummarySectionTitle;
    //items subsection
    private Locator checkoutPageOrderSummaryItemsSubsectionTitle;
    //list elements
    private Locator checkoutPageOrderSummaryProductImgElements;
    private Locator checkoutPageOrderSummaryProductNameElements;
    private Locator checkoutPageOrderSummaryProductQtyElements;
    private Locator checkoutPageOrderSummaryProductUnitPriceElements;
    //shipping info subsection
    private Locator checkoutPageOrderSummaryShippingInfoSubsectionTitle;
    private Locator checkoutPageOrderSummaryShippingInfoSubsectionData;
    //payment method info subsection
    private Locator checkoutPageOrderSummaryPayMethodInfoSubsectionTitle;
    private Locator checkoutPageOrderSummaryPayMethodInfoSubsectionData;
    //aside order summary section
    private Locator checkoutPageAsideOrderSummarySectionTitle;
    //list elements
    private Locator checkoutPageAsideSummaryProductNameAndQtyElements;
    private Locator checkoutPageAsideSummaryProductUnitPriceElements;
    //singular elements
    private Locator checkoutPageAsideOrderSummarySubtotalSubtext;
    private Locator checkoutPageAsideOrderSummarySubtotalPrice;
    private Locator checkoutPageAsideOrderSummaryShippingSubtext;
    private Locator checkoutPageAsideOrderSummaryShippingPrice;
    private Locator checkoutPageAsideOrderSummaryTaxSubtext;
    private Locator checkoutPageAsideOrderSummaryTaxAmount;
    private Locator checkoutPageAsideOrderSummaryTotalSubtext;
    private Locator checkoutPageAsideOrderSummaryTotalPrice;
    //private Locator checkoutPageAsideOrderSummaryFreeShippingBoxText; //currently not used
    //order confirmed section
    private Locator checkoutPageOrderConfirmedIcon;
    private Locator checkoutPageOrderConfirmedTitle;
    private Locator checkoutPageOrderConfirmedDesc;
    private Locator checkoutPageOrderConfirmedContinueShoppingBtn;
    private Locator checkoutPageOrderConfirmedViewOrdersBtn;

    public CheckoutPage(Page page) {

        super(page);

        checkoutPageUpperBackBtn = page.locator("//div[@class='MuiBox-root css-1ol10sz']/button");
        checkoutPageTitle = page.locator("//div[@class='MuiBox-root css-1ol10sz']/h4");
        checkoutPageBreadcrumb = page.locator("//div[@class='MuiStepper-root MuiStepper-horizontal css-1vk2vi5']/div/span/span");
        //shipping address section
        checkoutPageShipAddressInfoSectionTitle = page.locator("//div[@class='MuiBox-root css-178yklu']/h6");
        checkoutPageShipAddressFirstNameSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//label");
        checkoutPageShipAddressFirstNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//input");
        checkoutPageShipAddressLastNameSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//label");
        checkoutPageShipAddressLastNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//input");
        checkoutPageShipAddressEmailSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[3]//label");
        checkoutPageShipAddressEmailInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[3]//input");
        checkoutPageShipAddressPhoneSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//label");
        checkoutPageShipAddressPhoneInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//input");
        checkoutPageShipAddressSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[5]//label");
        checkoutPageShipAddressTextarea = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[5]//textarea[1]");
        checkoutPageShipAddressCitySubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[6]//label");
        checkoutPageShipAddressCityInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[6]//input");
        checkoutPageShipAddressStateSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[7]//label");
        checkoutPageShipAddressStateInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[7]//input");
        checkoutPageShipAddressPostCodeSubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[8]//label");
        checkoutPageShipAddressPostCodeInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[8]//input");
        checkoutPageShipAddressCountrySubtext = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[9]//label");
        checkoutPageShipAddressCountryInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[9]//input");
        //buttons
        checkoutPageBackBtn = page.locator("//div[@class='MuiBox-root css-163v3sq']/button[1]");
        checkoutPageNextBtn = page.locator("//div[@class='MuiBox-root css-163v3sq']/button[2]");
        //payment method section
        checkoutPagePayMethodSectionTitle = page.locator("//div[@class='MuiBox-root css-178yklu']/h6");
        checkoutPagePayMethodSectionSubtitle = page.locator("//fieldset[@class='MuiFormControl-root css-tsdjw1']/legend");
        //list elements
        checkoutPagePayMethodRadioBtnElements = page.locator("//fieldset[@class='MuiFormControl-root css-tsdjw1']//input");
        checkoutPagePayMethodRadioSubtextElements = page.locator("//fieldset[@class='MuiFormControl-root css-tsdjw1']//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-17wcncy']");
        //debit/credit card input form
        checkoutPageCredCardCardholderNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//input");
        checkoutPageCredCardNumberInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//input");
        checkoutPageCredCardExpiryDateInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[3]//input");
        checkoutPageCredCardCVVInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//input");
        //order summary section
        checkoutPageOrderSummarySectionTitle = page.locator("//div[@class='MuiBox-root css-178yklu']/h6"); //same element as payment method section title
        //items subsection
        checkoutPageOrderSummaryItemsSubsectionTitle = page.locator("//div[@class='MuiBox-root css-178yklu']/div[1]/h6");
        //list elements
        checkoutPageOrderSummaryProductImgElements = page.locator("//div[@class='MuiBox-root css-178yklu']/div[1]//img");
        checkoutPageOrderSummaryProductNameElements = page.locator("//div[@class='MuiBox-root css-178yklu']/div[1]//h6[@class='MuiTypography-root MuiTypography-subtitle1 css-18kaqav']");
        checkoutPageOrderSummaryProductQtyElements = page.locator("//div[@class='MuiBox-root css-178yklu']/div[1]//p[@class='MuiTypography-root MuiTypography-body2 css-5itj1x']");
        checkoutPageOrderSummaryProductUnitPriceElements = page.locator("//div[@class='MuiBox-root css-178yklu']/div[1]//p[@class='MuiTypography-root MuiTypography-body1 css-17sx5fb']");
        //shipping info subsection
        checkoutPageOrderSummaryShippingInfoSubsectionTitle = page.locator("//div[@class='MuiBox-root css-178yklu']/div[2]/h6");
        checkoutPageOrderSummaryShippingInfoSubsectionData = page.locator("//div[@class='MuiBox-root css-178yklu']/div[2]/p"); //list of p elements
        //payment method info subsection
        checkoutPageOrderSummaryPayMethodInfoSubsectionTitle = page.locator("//div[@class='MuiBox-root css-178yklu']/div[3]/h6");
        checkoutPageOrderSummaryPayMethodInfoSubsectionData = page.locator("//div[@class='MuiBox-root css-178yklu']/div[3]/p"); //list of p elements
        //aside order summary section
        checkoutPageAsideOrderSummarySectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/h6");
        //list elements
        checkoutPageAsideSummaryProductNameAndQtyElements = page.locator("//div[@class='MuiBox-root css-1qm1lh']/div/p[1]");
        checkoutPageAsideSummaryProductUnitPriceElements = page.locator("//div[@class='MuiBox-root css-1qm1lh']/div/p[2]");
        //singular elements
        checkoutPageAsideOrderSummarySubtotalSubtext = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/div[2]/div[1]/p[1]");
        checkoutPageAsideOrderSummarySubtotalPrice = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/div[2]/div[1]/p[2]");
        checkoutPageAsideOrderSummaryShippingSubtext = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/div[2]/div[2]/p[1]");
        checkoutPageAsideOrderSummaryShippingPrice = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/div[2]/div[2]/span");
        checkoutPageAsideOrderSummaryTaxSubtext = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/div[2]/div[3]/p[1]");
        checkoutPageAsideOrderSummaryTaxAmount = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 css-do5xdo']/div[2]/div[3]/p[2]");
        checkoutPageAsideOrderSummaryTotalSubtext = page.locator("//div[@class='MuiBox-root css-gg4vpm']/h6[1]");
        checkoutPageAsideOrderSummaryTotalPrice = page.locator("//div[@class='MuiBox-root css-gg4vpm']/h6[2]");
        //checkoutPageAsideOrderSummaryFreeShippingBoxText = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 MuiAlert-root MuiAlert-colorInfo MuiAlert-standardInfo MuiAlert-standard css-dm5dyp']"); //currently not used
        //order confirmed section
        checkoutPageOrderConfirmedIcon = page.locator("//div[@class='MuiBox-root css-pu83ox']/*[local-name()='svg']");
        checkoutPageOrderConfirmedTitle = page.locator("//div[@class='MuiBox-root css-pu83ox']/h4");
        checkoutPageOrderConfirmedDesc = page.locator("//div[@class='MuiBox-root css-pu83ox']/p");
        checkoutPageOrderConfirmedContinueShoppingBtn = page.locator("//div[@class='MuiBox-root css-pu83ox']/button[1]");
        checkoutPageOrderConfirmedViewOrdersBtn = page.locator("//div[@class='MuiBox-root css-pu83ox']/button[2]");

    }

    //click "Next" (later place order) button method
    public void clickNextBtn(){checkoutPageNextBtn.click();}

    //click set payment method radio button method
    public void clickSetPayMethodRadioBtn(int index){checkoutPagePayMethodRadioBtnElements.nth(index).click();}

    //checkout page product/order data getters
    //order summary section (list elements)
    public List<String> getCheckoutPageOrderSummaryProductName() {
        int count = checkoutPageOrderSummaryProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageOrderSummaryProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageOrderSummaryProductQty() {
        int count = checkoutPageOrderSummaryProductQtyElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageOrderSummaryProductQtyElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageOrderSummaryProductUnitPrice() {
        int count = checkoutPageOrderSummaryProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageOrderSummaryProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //shipping info subsection (list elements)
    public List<String> getCheckoutPageOrderSummaryShippingInfoSubsectionData() {
        int count = checkoutPageOrderSummaryShippingInfoSubsectionData.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageOrderSummaryShippingInfoSubsectionData.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //payment method info subsection (list elements)
    public List<String> getCheckoutPageOrderSummaryPayMethodInfoSubsectionData() {
        int count = checkoutPageOrderSummaryPayMethodInfoSubsectionData.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageOrderSummaryPayMethodInfoSubsectionData.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //aside order summary section (list elements)
    public List<String> getCheckoutPageAsideSummaryProductNameAndQty() {
        int count = checkoutPageAsideSummaryProductNameAndQtyElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageAsideSummaryProductNameAndQtyElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageAsideSummaryProductUnitPrice() {
        int count = checkoutPageAsideSummaryProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageAsideSummaryProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //singular elements
    public String getCheckoutPageAsideOrderSummarySubtotalPrice() {return checkoutPageAsideOrderSummarySubtotalPrice.innerText();}
    public String getCheckoutPageAsideOrderSummaryShippingPrice() {return checkoutPageAsideOrderSummaryShippingPrice.innerText();}
    public String getCheckoutPageAsideOrderSummaryTaxAmount() {return checkoutPageAsideOrderSummaryTaxAmount.innerText();}
    public String getCheckoutPageAsideOrderSummaryTotalPrice() {return checkoutPageAsideOrderSummaryTotalPrice.innerText();}

    //checkout page text element getters
    public String getCheckoutPageTitle() {return checkoutPageTitle.innerText();}
    //shipping address section
    public String getCheckoutPageShipAddressInfoSectionTitle() {return checkoutPageShipAddressInfoSectionTitle.innerText();}
    public String getCheckoutPageShipAddressFirstNameSubtext() {return checkoutPageShipAddressFirstNameSubtext.innerText();}
    public String getCheckoutPageShipAddressLastNameSubtext() {return checkoutPageShipAddressLastNameSubtext.innerText();}
    public String getCheckoutPageShipAddressEmailSubtext() {return checkoutPageShipAddressEmailSubtext.innerText();}
    public String getCheckoutPageShipAddressPhoneSubtext() {return checkoutPageShipAddressPhoneSubtext.innerText();}
    public String getCheckoutPageShipAddressSubtext() {return checkoutPageShipAddressSubtext.innerText();}
    public String getCheckoutPageShipAddressCitySubtext() {return checkoutPageShipAddressCitySubtext.innerText();}
    public String getCheckoutPageShipAddressStateSubtext() {return checkoutPageShipAddressStateSubtext.innerText();}
    public String getCheckoutPageShipAddressPostCodeSubtext() {return checkoutPageShipAddressPostCodeSubtext.innerText();}
    public String getCheckoutPageShipAddressCountrySubtext() {return checkoutPageShipAddressCountrySubtext.innerText();}
    //buttons
    public String getCheckoutPageBackBtnText() {return checkoutPageBackBtn.innerText();}
    public String getCheckoutPageNextBtnText() {return checkoutPageNextBtn.innerText();}
    //payment method section
    public String getCheckoutPagePayMethodSectionTitle() {return checkoutPagePayMethodSectionTitle.innerText();}
    public String getCheckoutPagePayMethodSectionSubtitle() {return checkoutPagePayMethodSectionSubtitle.innerText();}
    //list elements
    public List<String> getCheckoutPagePayMethodRadioBtnSubtext() {
        int count = checkoutPagePayMethodRadioSubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPagePayMethodRadioSubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //order summary section
    public String getCheckoutPageOrderSummarySectionTitle() {return checkoutPageOrderSummarySectionTitle.innerText();}
    public String getCheckoutPageOrderSummaryItemsSubsectionTitle() {return checkoutPageOrderSummaryItemsSubsectionTitle.innerText();}
    //shipping info subsection
    public String getCheckoutPageOrderSummaryShippingInfoSubsectionTitle() {return checkoutPageOrderSummaryShippingInfoSubsectionTitle.innerText();}
    //payment info subsection
    public String getCheckoutPageOrderSummaryPayMethodInfoSubsectionTitle() {return checkoutPageOrderSummaryPayMethodInfoSubsectionTitle.innerText();}
    //aside order summary section
    public String getCheckoutPageAsideOrderSummarySectionTitle() {return checkoutPageAsideOrderSummarySectionTitle.innerText();}
    public String getCheckoutPageAsideOrderSummarySubtotalSubtext() {return checkoutPageAsideOrderSummarySubtotalSubtext.innerText();}
    public String getCheckoutPageAsideOrderSummaryShippingSubtext() {return checkoutPageAsideOrderSummaryShippingSubtext.innerText();}
    public String getCheckoutPageAsideOrderSummaryTaxSubtext() {return checkoutPageAsideOrderSummaryTaxSubtext.innerText();}
    public String getCheckoutPageAsideOrderSummaryTotalSubtext() {return checkoutPageAsideOrderSummaryTotalSubtext.innerText();}

    //order confirmed section
    public String getCheckoutPageOrderConfirmedTitle() {return checkoutPageOrderConfirmedTitle.innerText();}
    public String getCheckoutPageOrderConfirmedDesc() {return checkoutPageOrderConfirmedDesc.innerText();}
    public String getCheckoutPageOrderConfirmedContinueShoppingBtnText() {return checkoutPageOrderConfirmedContinueShoppingBtn.innerText();}
    public String getCheckoutPageOrderConfirmedViewOrdersBtnText() {return checkoutPageOrderConfirmedViewOrdersBtn.innerText();}

    //checkout page web element assert methods
    public boolean isCheckoutPageUpperBackBtnVisible() {return checkoutPageUpperBackBtn.isVisible();}
    public boolean isCheckoutPageTitleVisible() {return checkoutPageTitle.isVisible();}
    public boolean isCheckoutPageBreadcrumbVisible() {return checkoutPageBreadcrumb.all().stream().allMatch(Locator::isVisible);}
    //shipping address section
    public boolean isCheckoutPageShipAddressInfoSectionTitleVisible() {return checkoutPageShipAddressInfoSectionTitle.isVisible();}
    public boolean isCheckoutPageShipAddressFirstNameSubtextVisible() {return checkoutPageShipAddressFirstNameSubtext.isVisible();}
    public boolean isCheckoutPageShipAddressFirstNameInputFieldVisible() {return checkoutPageShipAddressFirstNameInputField.isVisible();}
    public boolean isCheckoutPageShipAddressLastNameSubtextVisible() {return checkoutPageShipAddressLastNameSubtext.isVisible();}
    public boolean isCheckoutPageShipAddressLastNameInputFieldVisible() {return checkoutPageShipAddressLastNameInputField.isVisible();}
    public boolean isCheckoutPageShipAddressEmailSubtextVisible() {return checkoutPageShipAddressEmailSubtext.isVisible();}
    public boolean isCheckoutPageShipAddressEmailInputFieldVisible() {return checkoutPageShipAddressEmailInputField.isVisible();}
    public boolean isCheckoutPageShipAddressPhoneInputFieldVisible() {return checkoutPageShipAddressPhoneInputField.isVisible();}
    public boolean isCheckoutPageShipAddressTextareaVisible() {return checkoutPageShipAddressTextarea.isVisible();}
    public boolean isCheckoutPageShipAddressCityInputFieldVisible() {return checkoutPageShipAddressCityInputField.isVisible();}
    public boolean isCheckoutPageShipAddressStateInputFieldVisible() {return checkoutPageShipAddressStateInputField.isVisible();}
    public boolean isCheckoutPageShipAddressPostCodeInputFieldVisible() {return checkoutPageShipAddressPostCodeInputField.isVisible();}
    public boolean isCheckoutPageShipAddressCountrySubtextVisible() {return checkoutPageShipAddressCountrySubtext.isVisible();}
    public boolean isCheckoutPageShipAddressCountryInputFieldVisible() {return checkoutPageShipAddressCountryInputField.isVisible();}
    //buttons
    public boolean isCheckoutPageBackBtnVisible() {return checkoutPageBackBtn.isVisible();}
    public boolean isCheckoutPageNextBtnVisible() {return checkoutPageNextBtn.isVisible();}
    //payment method section
    public boolean isCheckoutPagePayMethodSectionTitleVisible() {return checkoutPagePayMethodSectionTitle.isVisible();}
    public boolean isCheckoutPagePayMethodSectionSubtitleVisible() {return checkoutPagePayMethodSectionSubtitle.isVisible();}
    //list elements
    public boolean isCheckoutPagePayMethodRadioBtnVisible() {return checkoutPagePayMethodRadioBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isCheckoutPagePayMethodRadioSubtextVisible() {return checkoutPagePayMethodRadioSubtextElements.all().stream().allMatch(Locator::isVisible);}
    //debit/credit card input form
    public boolean isCheckoutPageCredCardCardholderNameInputFieldVisible() {return checkoutPageCredCardCardholderNameInputField.isVisible();}
    public boolean isCheckoutPageCredCardNumberInputFieldVisible() {return checkoutPageCredCardNumberInputField.isVisible();}
    public boolean isCheckoutPageCredCardExpiryDateInputFieldVisible() {return checkoutPageCredCardExpiryDateInputField.isVisible();}
    public boolean isCheckoutPageCredCardCVVInputFieldVisible() {return checkoutPageCredCardCVVInputField.isVisible();}
    //order summary section
    public boolean isCheckoutPageOrderSummarySectionTitleVisible() {return checkoutPageOrderSummarySectionTitle.isVisible();}
    //items subsection
    public boolean isCheckoutPageOrderSummaryItemsSubsectionTitleVisible() {return checkoutPageOrderSummaryItemsSubsectionTitle.isVisible();}
    //list elements
    public boolean isCheckoutPageOrderSummaryProductImgVisible() {return checkoutPageOrderSummaryProductImgElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isCheckoutPageOrderSummaryProductNameVisible() {return checkoutPageOrderSummaryProductNameElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isCheckoutPageOrderSummaryProductQtyVisible() {return checkoutPageOrderSummaryProductQtyElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isCheckoutPageOrderSummaryProductUnitPriceVisible() {return checkoutPageOrderSummaryProductUnitPriceElements.all().stream().allMatch(Locator::isVisible);}
    //shipping info subsection
    public boolean isCheckoutPageOrderSummaryShippingInfoSubsectionTitleVisible() {return checkoutPageOrderSummaryShippingInfoSubsectionTitle.isVisible();}
    //list elements (list cannot be found with VALID selector -> data is being read from this list)
    //public boolean isCheckoutPageOrderSummaryShippingInfoSubsectionDataVisible() {return checkoutPageOrderSummaryShippingInfoSubsectionData.all().stream().allMatch(Locator::isVisible);}
    //payment method subsection
    public boolean isCheckoutPageOrderSummaryPayMethodInfoSubsectionTitleVisible() {return checkoutPageOrderSummaryPayMethodInfoSubsectionTitle.isVisible();}
    //list elements
    public boolean isCheckoutPageOrderSummaryPayMethodInfoSubsectionDataVisible() {return checkoutPageOrderSummaryPayMethodInfoSubsectionData.all().stream().allMatch(Locator::isVisible);}
    //aside order summary section
    public boolean isCheckoutPageAsideOrderSummarySectionTitleVisible() {return checkoutPageAsideOrderSummarySectionTitle.isVisible();}
    //list elements
    public boolean isCheckoutPageAsideOrderSummaryProductNameAndQtyVisible() {return checkoutPageAsideSummaryProductNameAndQtyElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isCheckoutPageAsideOrderSummaryProductUnitPriceVisible() {return checkoutPageAsideSummaryProductUnitPriceElements.all().stream().allMatch(Locator::isVisible);}
    //singular elements
    public boolean isCheckoutPageAsideOrderSummarySubtotalSubtextVisible() {return checkoutPageAsideOrderSummarySubtotalSubtext.isVisible();}
    public boolean isCheckoutPageAsideOrderSummarySubtotalPriceVisible() {return checkoutPageAsideOrderSummarySubtotalPrice.isVisible();}
    public boolean isCheckoutPageAsideOrderSummaryShippingSubtextVisible() {return checkoutPageAsideOrderSummaryShippingSubtext.isVisible();}
    public boolean isCheckoutPageAsideOrderSummaryShippingPriceVisible() {return checkoutPageAsideOrderSummaryShippingPrice.isVisible();}
    public boolean isCheckoutPageAsideOrderSummaryTaxSubtextVisible() {return checkoutPageAsideOrderSummaryTaxSubtext.isVisible();}
    public boolean isCheckoutPageAsideOrderSummaryTaxAmountVisible() {return checkoutPageAsideOrderSummaryTaxAmount.isVisible();}
    public boolean isCheckoutPageAsideOrderSummaryTotalSubtextVisible() {return checkoutPageAsideOrderSummaryTotalSubtext.isVisible();}
    public boolean isCheckoutPageAsideOrderSummaryTotalPriceVisible() {return checkoutPageAsideOrderSummaryTotalPrice.isVisible();}
    //public boolean isCheckoutPageAsideOrderSummaryFreeShippingBoxTextVisible() {return checkoutPageAsideOrderSummaryFreeShippingBoxText.isVisible();} //currently not used
    //order confirmed section
    public boolean isCheckoutPageOrderConfirmedIconVisible() {return checkoutPageOrderConfirmedIcon.isVisible();}
    public boolean isCheckoutPageOrderConfirmedTitleVisible() {return checkoutPageOrderConfirmedTitle.isVisible();}
    public boolean isCheckoutPageOrderConfirmedDescVisible() {return checkoutPageOrderConfirmedDesc.isVisible();}
    public boolean isCheckoutPageOrderConfirmedContinueShoppingBtnVisible() {return checkoutPageOrderConfirmedContinueShoppingBtn.isVisible();}
    public boolean isCheckoutPageOrderConfirmedViewOrdersBtnVisible() {return checkoutPageOrderConfirmedViewOrdersBtn.isVisible();}

}