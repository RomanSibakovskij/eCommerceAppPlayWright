package app.vercel.three.coral.app.ecommerce.modals;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.BoundingBox;

import java.util.*;
import java.util.stream.*;

public class FiltersModal extends BasePage {

    //filters modal web elements
    private Locator filtersModalTitle;
    private Locator filtersModalCloseButton;
    //sort by dropdown section
    private Locator filtersModalSortByDropSectionTitle;
    private Locator filtersModalSortByDropScrollBtn;
    //list elements
    private Locator filtersModalSortByRadioBtnElements;
    private Locator filtersModalSortByRadioSubtextElements;
    //price range dropdown section
    private Locator filtersModalPriceRangeDropSectionTitle;
    private Locator filtersModalPriceRangeDropScrollBtn;
    private Locator filtersModalPriceRangePriceFrom;
    private Locator filtersModalPriceRangePriceSliderLeftBtn;
    private Locator filtersModalPriceRangePriceSliderRightBtn;
    private Locator filtersModalPriceRangePriceTo;
    //customer rating dropdown section
    private Locator filtersModalCustomerRatingDropSectionTitle;
    private Locator filtersModalCustomerRatingDropScrollBtn;
    //list elements
    private Locator filtersModalCustomerRatingRadioBtnElements;
    private Locator filtersModalCustomerRatingRadioSubtextElements;
    //categories dropdown section
    private Locator filtersModalCategoriesDropSectionTitle;
    private Locator filtersModalCategoriesDropScrollBtn;
    //list elements
    private Locator filtersModalCategoriesRadioBtnElements;
    private Locator filtersModalCategoriesRadioSubtextElements;
    //availability dropdown section
    private Locator filtersModalAvailabilityDropSectionTitle;
    private Locator filtersModalAvailabilityDropScrollBtn;
    private Locator filtersModalAvailabilityInStockCheckbox;
    private Locator filtersModalAvailabilityInStockCheckboxSubtext;
    //button
    private Locator filtersModalApplyFiltersBtn;

    public FiltersModal(Page page) {
        super(page);

        filtersModalTitle = page.locator("//div[@class='MuiBox-root css-v08z5u']/h6");
        filtersModalCloseButton = page.locator("//div[@class='MuiBox-root css-v08z5u']/button");
        //sort by dropdown section
        filtersModalSortByDropSectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][1]/h3");
        filtersModalSortByDropScrollBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][1]/h3/button");
        filtersModalSortByRadioBtnElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][1]//div[@class='MuiFormGroup-root MuiRadioGroup-root css-1ytbthu']//input");
        filtersModalSortByRadioSubtextElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][1]//div[@class='MuiFormGroup-root MuiRadioGroup-root css-1ytbthu']//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-17wcncy']");
        //price range dropdown section
        filtersModalPriceRangeDropSectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][2]/h3");
        filtersModalPriceRangeDropScrollBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][2]/h3/button");
        filtersModalPriceRangePriceFrom = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][2]//div[@class='MuiBox-root css-gg4vpm']/p[1]");
        filtersModalPriceRangePriceSliderLeftBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][2]//div[@class='MuiAccordionDetails-root css-l9xe8y']//span[@data-index='0']");
        filtersModalPriceRangePriceSliderRightBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][2]//div[@class='MuiAccordionDetails-root css-l9xe8y']//span[@data-index='1']");
        filtersModalPriceRangePriceTo = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][2]//div[@class='MuiBox-root css-gg4vpm']/p[2]");
        //customer rating dropdown section
        filtersModalCustomerRatingDropSectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][3]/h3");
        filtersModalCustomerRatingDropScrollBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][3]/h3/button");
        filtersModalCustomerRatingRadioBtnElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][3]//div[@class='MuiFormGroup-root MuiRadioGroup-root css-1ytbthu']//input");
        filtersModalCustomerRatingRadioSubtextElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][3]//div[@class='MuiFormGroup-root MuiRadioGroup-root css-1ytbthu']//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-17wcncy']");
        //categories dropdown section
        filtersModalCategoriesDropSectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][4]/h3");
        filtersModalCategoriesDropScrollBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][4]/h3/button");
        filtersModalCategoriesRadioBtnElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][4]//div[@class='MuiBox-root css-1821gv5']//input");
        filtersModalCategoriesRadioSubtextElements = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-sw2z0c'][4]//div[@class='MuiBox-root css-1821gv5']//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-17wcncy']");
        //availability dropdown section
        filtersModalAvailabilityDropSectionTitle = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-f5aw4x']/h3");
        filtersModalAvailabilityDropScrollBtn = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-f5aw4x']/h3/button");
        filtersModalAvailabilityInStockCheckbox = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-f5aw4x']//div[@class='MuiAccordionDetails-root css-l9xe8y']//input");
        filtersModalAvailabilityInStockCheckboxSubtext = page.locator("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-f5aw4x']//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-17wcncy']");
        //button
        filtersModalApplyFiltersBtn = page.locator("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-fullWidth css-9cd5co']");

    }

    //set the price from range slider method
    public void setTheSetPriceFrom(int offsetX){
        BoundingBox box = filtersModalPriceRangePriceSliderLeftBtn .boundingBox();
        if (box != null) {
            double startX = box.x + box.width / 2;
            double startY = box.y + box.height / 2;

            // Drag the handle horizontally by offsetX pixels
            page.mouse().move(startX, startY);
            page.mouse().down();
            page.mouse().move(startX + offsetX, startY, new Mouse.MoveOptions().setSteps(10));
            page.mouse().up();
        }
    }

    //click set customer rating radio button method
    public void clickSetCustomerRatingRadioBtn(int index){filtersModalCustomerRatingRadioBtnElements.nth(index).click();}

    //click set category radio button method
    public void clickSetCategoryRadioBtn(int index){filtersModalCategoriesRadioBtnElements.nth(index).click();}

    //click "Close" button method
    public void clickCloseFiltersModalBtn(){filtersModalCloseButton.click();}

    //click "Apply Filters" button method
    public void clickApplyFiltersBtn(){filtersModalApplyFiltersBtn.click();}

    //filters modal data getters
    public String getFiltersModalPriceFrom() {return filtersModalPriceRangePriceFrom.innerText();}
    public String getFiltersModalPriceTo() {return filtersModalPriceRangePriceTo.innerText();}

    //filters modal text element getters
    public String getFiltersModalTitle() {return filtersModalTitle.innerText();}
    //sort by dropdown section
    public String getFiltersModalSortByDropdownSectionTitle() {return filtersModalSortByDropSectionTitle.innerText();}
    //list elements
    public List<String> getFiltersModalSortByRadioBtnText(){
        int count = filtersModalSortByRadioSubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> filtersModalSortByRadioSubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //price range dropdown section
    public String getFiltersModalPriceRangeDropdownSectionTitle() {return filtersModalPriceRangeDropSectionTitle.innerText();}
    //customer rating dropdown section
    public String getFiltersModalCustomerRatingDropdownSectionTitle() {return filtersModalCustomerRatingDropSectionTitle.innerText();}
    //list elements
    public List<String> getFiltersModalCustomerRatingRadioBtnSubtext(){
        int count = filtersModalCustomerRatingRadioSubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> filtersModalCustomerRatingRadioSubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //categories dropdown section
    public String getFiltersModalCategoriesDropdownSectionTitle() {return filtersModalCategoriesDropSectionTitle.innerText();}
    //list elements
    public List<String> getFiltersModalCategoriesRadioBtnSubtext(){
        int count = filtersModalCategoriesRadioSubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> filtersModalCategoriesRadioSubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //availability dropdown section
    public String getFiltersModalAvailabilityDropdownSectionTitle() {return filtersModalAvailabilityDropSectionTitle.innerText();}
    public String getFiltersModalAvailabilityInStockCheckboxSubtext() {return filtersModalAvailabilityInStockCheckboxSubtext.innerText();}
    //button
    public String getFiltersModalApplyFiltersBtnText() {return filtersModalApplyFiltersBtn.innerText();}

    //filters modal web element assert methods
    public boolean isFiltersModalTitleVisible() {return filtersModalTitle.isVisible();}
    public boolean isFiltersModalCloseBtnVisible() {return filtersModalCloseButton.isVisible();}
    //sort by dropdown section
    public boolean isFiltersModalSortByDropdownSectionTitleVisible() {return filtersModalSortByDropSectionTitle.isVisible();}
    public boolean isFiltersModalSortByDropdownScrollBtnVisible() {return filtersModalSortByDropScrollBtn.isVisible();}
    //list elements
    public boolean isFiltersModalSortByRadioBtnElementVisible() {return filtersModalSortByRadioBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isFiltersModalSortByRadioSubtextElementVisible() {return filtersModalSortByRadioSubtextElements.all().stream().allMatch(Locator::isVisible);}
    //price range dropdown section
    public boolean isFiltersModalPriceRangeDropdownSectionTitleVisible() {return filtersModalPriceRangeDropSectionTitle.isVisible();}
    public boolean isFiltersModalPriceRangeDropdownScrollBtnVisible() {return filtersModalPriceRangeDropScrollBtn.isVisible();}
    public boolean isFiltersModalPriceRangePriceFromVisible() {return filtersModalPriceRangePriceFrom.isVisible();}
    public boolean isFiltersModalPriceRangePriceSliderLeftBtnVisible() {return filtersModalPriceRangePriceSliderLeftBtn.isVisible();}
    public boolean isFiltersModalPriceRangePriceSliderRightBtnVisible() {return filtersModalPriceRangePriceSliderRightBtn.isVisible();}
    public boolean isFiltersModalPriceRangePriceToVisible() {return filtersModalPriceRangePriceTo.isVisible();}
    //customer rating dropdown section
    public boolean isFiltersModalCustomerRatingDropdownSectionTitleVisible() {return filtersModalCustomerRatingDropSectionTitle.isVisible();}
    public boolean isFiltersModalCustomerRatingDropdownScrollBtnVisible() {return filtersModalCustomerRatingDropScrollBtn.isVisible();}
    //list elements
    public boolean isFiltersModalCustomerRatingRadioBtnElementVisible() {return filtersModalCustomerRatingRadioBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isFiltersModalCustomerRatingRadioSubtextElementVisible() {return filtersModalCustomerRatingRadioSubtextElements.all().stream().allMatch(Locator::isVisible);}
    //categories dropdown section
    public boolean isFiltersModalCategoriesDropdownSectionTitleVisible() {return filtersModalCategoriesDropSectionTitle.isVisible();}
    public boolean isFiltersModalCategoriesDropdownScrollBtnVisible() {return filtersModalCategoriesDropScrollBtn.isVisible();}
    //list elements
    public boolean isFiltersModalCategoriesRadioBtnElementVisible() {return filtersModalCategoriesRadioBtnElements.all().stream().allMatch(Locator::isVisible);}
    public boolean isFiltersModalCategoriesRadioSubtextElementVisible() {return filtersModalCategoriesRadioSubtextElements.all().stream().allMatch(Locator::isVisible);}
    //availability dropdown section
    public boolean isFiltersModalAvailabilityDropdownSectionTitleVisible() {return filtersModalAvailabilityDropSectionTitle.isVisible();}
    public boolean isFiltersModalAvailabilityDropdownScrollBtnVisible() {return filtersModalAvailabilityDropScrollBtn.isVisible();}
    public boolean isFiltersModalAvailabilityInStockCheckboxVisible() {return filtersModalAvailabilityInStockCheckbox.isVisible();}
    public boolean isFiltersModalAvailabilityInStockCheckboxSubtextVisible() {return filtersModalAvailabilityInStockCheckboxSubtext.isVisible();}
    //button
    public boolean isFiltersModalApplyFiltersBtnVisible() {return filtersModalApplyFiltersBtn.isVisible();}

}
