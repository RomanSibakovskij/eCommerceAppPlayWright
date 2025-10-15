package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.SignUpPage;
import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class CheckoutPageTooLongSingularInput extends BasePage{

    //relevant web elements
    //shipping address section
    private Locator checkoutPageShipAddressFirstNameInputField;
    private Locator checkoutPageShipAddressLastNameInputField;
    private Locator checkoutPageShipAddressEmailInputField;
    private Locator checkoutPageShipAddressPhoneInputField;
    private Locator checkoutPageShipAddressTextarea;
    private Locator checkoutPageShipAddressCityInputField;
    private Locator checkoutPageShipAddressStateInputField;
    private Locator checkoutPageShipAddressPostCodeInputField;
    private Locator checkoutPageShipAddressCountryInputField;

    //payment method section
    //debit/credit card input form
    private Locator checkoutPageCredCardCardholderNameInputField;
    private Locator checkoutPageCredCardNumberInputField;
    private Locator checkoutPageCredCardExpiryDateInputField;
    private Locator checkoutPageCredCardCVVInputField;

    //invalid checkout shipping address input data - too long singular input
    private String tooLongCheckoutShipFirstName;
    private String tooLongCheckoutShipLastName;
    private String tooLongCheckoutShipEmail;
    private String tooLongCheckoutShipPhone;
    private String tooLongCheckoutShipAddress;
    private String tooLongCheckoutShipCity;
    private String tooLongCheckoutShipState;
    private String tooLongCheckoutShipPostCode;
    private String tooLongCheckoutShipCountry;

    //valid checkout shipping address input data (for remaining inputs)
    private String validCheckoutShipFirstName;
    private String validCheckoutShipLastName;
    private String validCheckoutShipEmail;
    private String validCheckoutShipPhone;
    private String validCheckoutShipAddress;
    private String validCheckoutShipCity;
    private String validCheckoutShipState;
    private String validCheckoutShipPostCode;

    //invalid checkout credit card input data - too long singular input
    private String tooLongCheckoutCreditCardholderName;
    private String tooLongCheckoutCreditCardNumber;
    private String tooLongCheckoutCreditCardExpiryDate;
    private String tooLongCheckoutCreditCardCVV;

    //valid checkout credit card input data (for remaining inputs)
    private String validCheckoutCreditCardholderName;
    private String validCheckoutCreditCardNumber;
    private String validCheckoutCreditCardExpiryDate;
    private String validCheckoutCreditCardCVV;

    public CheckoutPageTooLongSingularInput(Page page) {
        super(page);

        //shipping address section
        checkoutPageShipAddressFirstNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//input");
        checkoutPageShipAddressLastNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//input");
        checkoutPageShipAddressEmailInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[3]//input");
        checkoutPageShipAddressPhoneInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//input");
        checkoutPageShipAddressTextarea = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[5]//textarea[1]");
        checkoutPageShipAddressCityInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[6]//input");
        checkoutPageShipAddressStateInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[7]//input");
        checkoutPageShipAddressPostCodeInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[8]//input");
        checkoutPageShipAddressCountryInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[9]//input");

        //payment method section
        //debit/credit card input form
        checkoutPageCredCardCardholderNameInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//input");
        checkoutPageCredCardNumberInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//input");
        checkoutPageCredCardExpiryDateInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[3]//input");
        checkoutPageCredCardCVVInputField = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[4]//input");

    }

    //invalid checkout user shipping address data getter - too long shipping address first name (100 chars)
    public void invalidCheckoutUserShipAddressInputDataTooLongFirstNameGetter() {

        tooLongCheckoutShipFirstName = "JsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address first name): " + "\n");

        logger.info("Too long checkout user first name: " + tooLongCheckoutShipFirstName);
        logger.info("Valid checkout user generated shipping address phone (too long shipping address first name): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address first name): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address first name): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address first name): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address first name): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address first name
    public void inputTooLongCheckoutPageShipAddressFirstNameIntoShipAddressFirstNameInputField() {checkoutPageShipAddressFirstNameInputField.fill(tooLongCheckoutShipFirstName);}

    //invalid checkout user shipping address data getter - too long shipping address last name (100 chars)
    public void invalidCheckoutUserShipAddressInputDataTooLongLastNameGetter() {

        tooLongCheckoutShipLastName = "KsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address last name): " + "\n");

        logger.info("Too long checkout user last name: " + tooLongCheckoutShipLastName);
        logger.info("Valid checkout user generated shipping address phone (too long shipping address last name): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address last name): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address last name): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address last name): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address last name): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address last name
    public void inputTooLongCheckoutPageShipAddressLastNameIntoShipAddressLastNameInputField() {checkoutPageShipAddressLastNameInputField.fill(tooLongCheckoutShipLastName);}

    //invalid checkout user shipping address data getter - too long shipping address email (100 chars -> name, domain)
    public void invalidCheckoutUserShipAddressInputDataTooLongEmailGetter() {

        tooLongCheckoutShipEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address email): " + "\n");

        logger.info("Too long checkout user email: " + tooLongCheckoutShipEmail);
        logger.info("Valid checkout user generated shipping address phone (too long shipping address email): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address email): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address email): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address email): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address email): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address email
    public void inputTooLongCheckoutPageShipAddressEmailIntoShipAddressEmailInputField() {checkoutPageShipAddressEmailInputField.fill(tooLongCheckoutShipEmail);}

    //invalid checkout user shipping address data getter - too long shipping address phone (16 digits)
    public void invalidCheckoutUserShipAddressInputDataTooLongPhoneGetter() {

        tooLongCheckoutShipPhone = "2423543563423454";
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address phone): " + "\n");

        logger.info("Too long checkout shipping address phone: " + tooLongCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address phone): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address phone): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address phone): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address phone): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address phone
    public void inputTooLongCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(tooLongCheckoutShipPhone);}

    //invalid checkout user shipping address data getter - too long shipping address (100 chars)
    public void invalidCheckoutUserShipAddressInputDataTooLongAddressGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        tooLongCheckoutShipAddress = TestDataGenerator.generateRandomAddress(97);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too long shipping address): " + validCheckoutShipPhone);
        logger.info("Too long checkout shipping address: " + tooLongCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address
    public void inputTooLongCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(tooLongCheckoutShipAddress);}

    //invalid checkout user shipping address data getter - too long shipping address city (100 chars)
    public void invalidCheckoutUserShipAddressInputDataTooLongCityGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        tooLongCheckoutShipCity = "VsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf";
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address city): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too long shipping address city): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address city): " + validCheckoutShipAddress);
        logger.info("Too long checkout shipping address city: " + tooLongCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address city): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address city): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address city
    public void inputTooLongCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(tooLongCheckoutShipCity);}

    //invalid checkout user shipping address data getter - too long shipping address state (100 chars)
    public void invalidCheckoutUserShipAddressInputDataTooLongStateGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        tooLongCheckoutShipState = "DsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address state): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too long shipping address state): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address state): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address state): " + validCheckoutShipCity);
        logger.info("Too long checkout shipping address state: " + tooLongCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address state): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address state
    public void inputTooLongCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(tooLongCheckoutShipState);}

    //invalid checkout user shipping address data getter - too long shipping address post code (6 digits)
    public void invalidCheckoutUserShipAddressInputDataTooLongPostCodeGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        tooLongCheckoutShipPostCode = "675439";

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address post code): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too long shipping address post code): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address post code): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address post code): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address post code): " + validCheckoutShipState);
        logger.info("Too long checkout shipping address post code: " + tooLongCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too long user shipping address post code
    public void inputTooLongCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(tooLongCheckoutShipPostCode);}

    //invalid checkout user shipping address data getter - too long shipping address country (100 chars)
    public void invalidCheckoutUserShipAddressInputDataTooLongCountryGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        tooLongCheckoutShipCountry = "FsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf";

        System.out.println("Invalid checkout user shipping address generated data (too long shipping address country): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too long shipping address country): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too long shipping address country): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too long shipping address country): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too long shipping address country): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too long shipping address country): " + validCheckoutShipPostCode);
        logger.info("Too long shipping address country: " + tooLongCheckoutShipCountry);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - too long user shipping address country
    public void inputTooLongCheckoutPageShipAddressCountryIntoShipAddressCountryInputField() {checkoutPageShipAddressCountryInputField.fill(tooLongCheckoutShipCountry);}

    //valid checkout user shipping address data input methods (for remaining inputs)
    public void inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(validCheckoutShipPhone);}
    public void inputCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(validCheckoutShipAddress);}
    public void inputCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(validCheckoutShipCity);}
    public void inputCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(validCheckoutShipState);}
    public void inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(validCheckoutShipPostCode);}


    //invalid checkout user credit card data getter - too long credit cardholder name (201 chars)
    public void invalidCheckoutUserCredCardInputDataTooLongCardholderNameGetter() {

        tooLongCheckoutCreditCardholderName = "DsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf AsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretewasfsdgdfhgretrgdfgdfgfdgf";
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (too long credit cardholder name): " + "\n");

        logger.info("Too long checkout user credit cardholder name: " + tooLongCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated credit card number (too long credit cardholder name): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (too long credit cardholder name): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too long credit cardholder name): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too long user credit cardholder name
    public void inputTooLongCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(tooLongCheckoutCreditCardholderName);}

    //invalid checkout user credit card data getter - too long credit card number (17 digits)
    public void invalidCheckoutUserCredCardInputDataTooLongCardNumberGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        tooLongCheckoutCreditCardNumber = "45326754786598356";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (too long credit card number): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too long credit card number): " + validCheckoutCreditCardholderName);
        logger.info("Too long checkout credit card number: " + tooLongCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (too long credit card number): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too long credit card number): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too long user credit card number
    public void inputTooLongCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(tooLongCheckoutCreditCardNumber);}

    //invalid checkout user credit card data getter - too long credit card expiration date (6 chars)
    public void invalidCheckoutUserCredCardInputDataTooLongCardExpDateGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        tooLongCheckoutCreditCardExpiryDate = "12/312";
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (too long credit card expiration date): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too long credit card expiration date): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (too long credit card expiration date): " + validCheckoutCreditCardNumber);
        logger.info("Too long checkout credit card expiration date: " + tooLongCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too long credit card expiration date): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too long user credit card expiration date
    public void inputTooLongCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(tooLongCheckoutCreditCardExpiryDate);}

    //invalid checkout user credit card data getter - too long credit card CVV number (4 digits)
    public void invalidCheckoutUserCredCardInputDataTooLongCardCVVGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        tooLongCheckoutCreditCardCVV = "5643";

        System.out.println("Invalid checkout user credit card generated data (too long credit card CVV number): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too long credit card CVV number): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (too long credit card CVV number): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated user credit card expiration date (too long credit card CVV number): " + validCheckoutCreditCardExpiryDate);
        logger.info("Too long checkout credit card CVV number: " + tooLongCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too long user credit card CVV number
    public void inputTooLongCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(tooLongCheckoutCreditCardCVV);}

    //valid checkout user credit card data input methods (for remaining inputs)
    public void inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(validCheckoutCreditCardholderName);}
    public void inputCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(validCheckoutCreditCardNumber);}
    public void inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(validCheckoutCreditCardExpiryDate);}
    public void inputCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(validCheckoutCreditCardCVV);}

}