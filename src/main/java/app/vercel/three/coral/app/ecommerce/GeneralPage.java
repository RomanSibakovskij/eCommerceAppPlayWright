package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class GeneralPage extends BasePage {

    //general page web elements (all pages have them)
    //header
    private Locator eCommerceHomePageLogo;
    private Locator headerShoppingCartBtn;
    private Locator headerTotalPrice;
    private Locator headerLoginBtn; //disappear after login
    private Locator headerSignUpBtn; //guest has this element
    private Locator headerProfileIconBtn; //appears only after login
    //list elements
    private Locator headerProfileDropdownLinkElements; //appears only after login
    //breadcrumb (only some pages have it displayed)
    private Locator generalPageBreadcrumbElements;
    //footer
    private Locator footerECommerceTitle;
    private Locator footerECommerceSubtitle;
    private Locator footerAddressIcon;
    private Locator footerAddress;
    private Locator footerEmailIcon;
    private Locator footerEmailAddress;
    private Locator footerPhoneIcon;
    private Locator footerPhoneNumber;
    //footer shop section
    private Locator footerShopSectionTitle;
    //list elements
    private Locator footerShopSectionLinkElements;
    //footer support section
    private Locator footerSupportSectionTitle;
    //list elements
    private Locator footerSupportSectionLinkElements;
    //footer policies section
    private Locator footerPoliciesSectionTitle;
    //list elements
    private Locator footerPoliciesSectionLinkElements;
    //footer connect section
    private Locator footerConnectSectionTitle;
    private Locator footerConnectFollowMeText;
    //list elements
    private Locator footerConnectSocialIconBtnElements;
    //lower footer
    private Locator lowerFooterCopyrightText;
    private Locator lowerFooterDevelopedByText;
    //list elements
    private Locator lowerFooterSocialLinkElements;

    public GeneralPage(Page page) {

        super(page);

        //header
        eCommerceHomePageLogo = page.locator("//div[@class='MuiBox-root css-gcqaox']");
        headerShoppingCartBtn = page.locator("//div[@class='MuiBox-root css-1kptg10']/button[@tabindex='0']");
        headerTotalPrice = page.locator("//p[@class='MuiTypography-root MuiTypography-body1 css-crwwbw']");
        headerLoginBtn = page.locator("//header//div[@class='MuiBox-root css-dtg2nl']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit css-163en0u']");
        headerSignUpBtn = page.locator("//header//div[@class='MuiBox-root css-dtg2nl']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1oys0r4']");
        headerProfileIconBtn = page.locator("//div[@class='MuiBox-root css-70qvj9']/button");
        //list elements
        headerProfileDropdownLinkElements = page.locator("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-ubifyk']/li");
        //breadcrumb (only some pages have it displayed)
        generalPageBreadcrumbElements = page.locator("//nav[@class='MuiTypography-root MuiTypography-body1 MuiBreadcrumbs-root css-8x52ts']/ol/li");
        //footer
        footerECommerceTitle = page.locator("//h6[@class='MuiTypography-root MuiTypography-h6 MuiTypography-gutterBottom css-r9qawh']");
        footerECommerceSubtitle = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][1]/p");
        footerAddressIcon = page.locator("//footer//div[@class='MuiBox-root css-1821gv5']//div[@class='MuiBox-root css-axw7ok'][1]/*[local-name()='svg']");
        footerAddress = page.locator("//footer//div[@class='MuiBox-root css-1821gv5']//div[@class='MuiBox-root css-axw7ok'][1]/p");
        footerEmailIcon = page.locator("//footer//div[@class='MuiBox-root css-1821gv5']//div[@class='MuiBox-root css-axw7ok'][2]/*[local-name()='svg']");
        footerEmailAddress = page.locator("//footer//div[@class='MuiBox-root css-1821gv5']//div[@class='MuiBox-root css-axw7ok'][2]/p");
        footerPhoneIcon = page.locator("//footer//div[@class='MuiBox-root css-1821gv5']//div[@class='MuiBox-root css-axw7ok'][3]/*[local-name()='svg']");
        footerPhoneNumber = page.locator("//footer//div[@class='MuiBox-root css-1821gv5']//div[@class='MuiBox-root css-axw7ok'][3]/p");
        //footer shop section
        footerShopSectionTitle = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][2]/h6");
        //list elements
        footerShopSectionLinkElements = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][2]/div/a");
        //footer support section
        footerSupportSectionTitle = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][3]/h6");
        //list elements
        footerSupportSectionLinkElements = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][3]/div/a");
        //footer policies section
        footerPoliciesSectionTitle = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][4]/h6");
        //list elements
        footerPoliciesSectionLinkElements = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][4]/div/a");
        //footer connect section
        footerConnectSectionTitle = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][5]/h6");
        footerConnectFollowMeText = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][5]/p");
        //list elements
        footerConnectSocialIconBtnElements = page.locator("//div[@class='MuiGrid-root MuiGrid-direction-xs-row css-1n5khr6'][5]/div/a");
        //lower footer
        lowerFooterCopyrightText = page.locator("//div[@class='MuiBox-root css-pqgty']/p");
        lowerFooterDevelopedByText = page.locator("//div[@class='MuiBox-root css-pqgty']/div/p");
        //list elements
        lowerFooterSocialLinkElements = page.locator("//div[@class='MuiBox-root css-1c1kq07']/a");

    }

    //click header "Sign up" button method
    public void clickHeaderSignUpBtn(){headerSignUpBtn.click();}

    //click header "Login" button method
    public void clickHeaderLoginBtn(){headerLoginBtn.click();}

    //click header shopping cart icon button method
    public void clickHeaderShopCartIconBtn(){headerShoppingCartBtn.click();}

    //click header profile icon button
    public void clickHeaderProfileIconBtn(){headerProfileIconBtn.click();}

    //click set profile dropdown option link method
    public void clickSetProfileDropdownOptionLink(int index){headerProfileDropdownLinkElements.nth(index).click();}

    //general page product data getters
    public String getHeaderTotalOrderPrice(){return headerTotalPrice.innerText();}

    //general page text element getters
    //header (guest elements)
    public String getHeaderLoginBtnText() {return headerLoginBtn.innerText();}
    public String getHeaderSignUpBtnText() {return headerSignUpBtn.innerText();}
    //footer
    public String getFooterECommerceTitle(){return footerECommerceTitle.innerText();}
    public String getFooterECommerceSubtitle(){return footerECommerceSubtitle.innerText();}
    public String getFooterAddress(){return footerAddress.innerText();}
    public String getFooterEmailAddress(){return footerEmailAddress.innerText();}
    public String getFooterPhoneNumber(){return footerPhoneNumber.innerText();}
    //footer shop section
    public String getFooterShopSectionTitle(){return footerShopSectionTitle.innerText();}
    //list elements
    public List<String> getFooterShopSectionLinkText(){
        int count = footerShopSectionLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> footerShopSectionLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //footer support section
    public String getFooterSupportSectionTitle(){return footerSupportSectionTitle.innerText();}
    //list elements
    public List<String> getFooterSupportSectionLinkText(){
        int count = footerSupportSectionLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> footerSupportSectionLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //footer policies section
    public String getFooterPoliciesSectionTitle(){return footerPoliciesSectionTitle.innerText();}
    //list elements
    public List<String> getFooterPoliciesSectionLinkText(){
        int count = footerPoliciesSectionLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> footerPoliciesSectionLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //footer connect section
    public String getFooterConnectSectionTitle(){return footerConnectSectionTitle.innerText();}
    public String getFooterConnectFollowMeText(){return footerConnectFollowMeText.innerText();}
    //lower footer
    public String getLowerFooterCopyrightText(){return lowerFooterCopyrightText.innerText();}
    public String getLowerFooterDevelopedByText(){return lowerFooterDevelopedByText.innerText();}
    //list elements
    public List<String> getLowerFooterSocialLinkText(){
        int count = lowerFooterSocialLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> lowerFooterSocialLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //general page web element assert methods (all pages have them)
    //header
    public boolean isECommerceHomePageLogoVisible() {return eCommerceHomePageLogo.isVisible();}
    public boolean isHeaderShoppingCartBtnVisible() {return headerShoppingCartBtn.isVisible();}
    public boolean isHeaderTotalPriceVisible() {return headerTotalPrice.isVisible();}
    //breadcrumb
    public boolean isBreadcrumbElementVisible() {return generalPageBreadcrumbElements.all().stream().allMatch(Locator::isVisible);}
    //footer
    public boolean isFooterECommerceTitleVisible() {return footerECommerceTitle.isVisible();}
    public boolean isFooterECommerceSubtitleVisible() {return footerECommerceSubtitle.isVisible();}
    public boolean isFooterAddressIconVisible() {return footerAddressIcon.isVisible();}
    public boolean isFooterAddressVisible() {return footerAddress.isVisible();}
    public boolean isFooterEmailIconVisible() {return footerEmailIcon.isVisible();}
    public boolean isFooterEmailAddressVisible() {return footerEmailAddress.isVisible();}
    public boolean isFooterPhoneIconVisible() {return footerPhoneIcon.isVisible();}
    public boolean isFooterPhoneNumberVisible() {return footerPhoneNumber.isVisible();}
    //footer shop section
    public boolean isFooterShopSectionTitleVisible() {return footerShopSectionTitle.isVisible();}
    //list elements
    public boolean isFooterShopSectionLinkElementVisible() {return footerShopSectionLinkElements.all().stream().allMatch(Locator::isVisible);}
    //footer support section
    public boolean isFooterSupportSectionTitleVisible() {return footerSupportSectionTitle.isVisible();}
    //list elements
    public boolean isFooterSupportSectionLinkElementVisible() {return footerSupportSectionLinkElements.all().stream().allMatch(Locator::isVisible);}
    //footer policies section
    public boolean isFooterPoliciesSectionTitleVisible() {return footerPoliciesSectionTitle.isVisible();}
    //list elements
    public boolean isFooterPoliciesSectionLinkElementVisible() {return footerPoliciesSectionLinkElements.all().stream().allMatch(Locator::isVisible);}
    //footer connect section
    public boolean isFooterConnectSectionTitleVisible() {return footerConnectSectionTitle.isVisible();}
    public boolean isFooterConnectFollowMeTextVisible() {return footerConnectFollowMeText.isVisible();}
    //list elements
    public boolean isFooterConnectSocialIconBtnElementVisible() {return footerConnectSocialIconBtnElements.all().stream().allMatch(Locator::isVisible);}
    //lower footer
    public boolean isLowerFooterCopyrightTextVisible() {return lowerFooterCopyrightText.isVisible();}
    public boolean isLowerFooterDevelopedByTextVisible() {return lowerFooterDevelopedByText.isVisible();}
    //list elements
    public boolean isLowerFooterSocialLinkElementVisible() {return lowerFooterSocialLinkElements.all().stream().allMatch(Locator::isVisible);}

    //general page web element assert methods (guest view)
    public boolean isHeaderLoginBtnVisible() {return headerLoginBtn.isVisible();}
    public boolean isHeaderSignUpBtnVisible() {return headerSignUpBtn.isVisible();}

    //general page web element assert method (registered user element)
    public boolean isHeaderProfileIconBtnVisible() {return headerProfileIconBtn.isVisible();}

}
