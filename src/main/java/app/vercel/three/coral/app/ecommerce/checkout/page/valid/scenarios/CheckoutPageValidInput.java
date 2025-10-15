package app.vercel.three.coral.app.ecommerce.checkout.page.valid.scenarios;

import app.vercel.three.coral.app.ecommerce.SignUpPage;
import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class CheckoutPageValidInput extends BasePage {

    //relevant web elements
    //shipping address section
    private Locator checkoutPageShipAddressPhoneInputField;
    private Locator checkoutPageShipAddressTextarea;
    private Locator checkoutPageShipAddressCityInputField;
    private Locator checkoutPageShipAddressStateInputField;
    private Locator checkoutPageShipAddressPostCodeInputField;

    //payment method section
    //debit/credit card input form
    private Locator checkoutPageCredCardCardholderNameInputField;
    private Locator checkoutPageCredCardNumberInputField;
    private Locator checkoutPageCredCardExpiryDateInputField;
    private Locator checkoutPageCredCardCVVInputField;

    //valid checkout shipping address input data
    private String validCheckoutShipPhone;
    private String validCheckoutShipAddress;
    private String validCheckoutShipCity;
    private String validCheckoutShipState;
    private String validCheckoutShipPostCode;

    //valid checkout credit card input data
    private String validCheckoutCreditCardholderName;
    private String validCheckoutCreditCardNumber;
    private String validCheckoutCreditCardExpiryDate;
    private String validCheckoutCreditCardCVV;

    public CheckoutPageValidInput(Page page) {
        super(page);

        //shipping address section
        checkoutPageShipAddressPhoneInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//input");
        checkoutPageShipAddressTextarea = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[5]//textarea[1]");
        checkoutPageShipAddressCityInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[6]//input");
        checkoutPageShipAddressStateInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[7]//input");
        checkoutPageShipAddressPostCodeInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[8]//input");

        //payment method section
        //debit/credit card input form
        checkoutPageCredCardCardholderNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//input");
        checkoutPageCredCardNumberInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//input");
        checkoutPageCredCardExpiryDateInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[3]//input");
        checkoutPageCredCardCVVInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//input");

    }

    //valid checkout user shipping address data getter
    public void validCheckoutUserShipAddressInputDataGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Valid checkout user shipping address generated data: " + "\n");

        logger.info("Valid checkout user generated shipping address phone: " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address: " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city: " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state: " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code: " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //valid checkout user shipping address data input methods
    public void inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(validCheckoutShipPhone);}
    public void inputCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(validCheckoutShipAddress);}
    public void inputCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(validCheckoutShipCity);}
    public void inputCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(validCheckoutShipState);}
    public void inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(validCheckoutShipPostCode);}

    //valid checkout user credit card data getter
    public void validCheckoutUserCredCardInputDataGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Valid checkout user credit card generated data: " + "\n");

        logger.info("Valid checkout user credit cardholder name: " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated credit card number: " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date: " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number: " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //valid checkout user credit card data input methods
    public void inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(validCheckoutCreditCardholderName);}
    public void inputCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(validCheckoutCreditCardNumber);}
    public void inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(validCheckoutCreditCardExpiryDate);}
    public void inputCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(validCheckoutCreditCardCVV);}

}
