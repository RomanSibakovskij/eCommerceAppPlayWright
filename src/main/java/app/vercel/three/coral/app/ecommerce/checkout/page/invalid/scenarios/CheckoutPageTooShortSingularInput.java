package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.SignUpPage;
import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class CheckoutPageTooShortSingularInput extends BasePage {

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

    //invalid checkout shipping address input data - too short singular input
    private String tooShortCheckoutShipFirstName;
    private String tooShortCheckoutShipLastName;
    private String tooShortCheckoutShipEmail;
    private String tooShortCheckoutShipPhone;
    private String tooShortCheckoutShipAddress;
    private String tooShortCheckoutShipCity;
    private String tooShortCheckoutShipState;
    private String tooShortCheckoutShipPostCode;
    private String tooShortCheckoutShipCountry;

    //valid checkout shipping address input data (for remaining inputs)
    private String validCheckoutShipFirstName;
    private String validCheckoutShipLastName;
    private String validCheckoutShipEmail;
    private String validCheckoutShipPhone;
    private String validCheckoutShipAddress;
    private String validCheckoutShipCity;
    private String validCheckoutShipState;
    private String validCheckoutShipPostCode;

    //invalid checkout credit card input data - too short singular input
    private String tooShortCheckoutCreditCardholderName;
    private String tooShortCheckoutCreditCardNumber;
    private String tooShortCheckoutCreditCardExpiryDate;
    private String tooShortCheckoutCreditCardCVV;

    //valid checkout credit card input data (for remaining inputs)
    private String validCheckoutCreditCardholderName;
    private String validCheckoutCreditCardNumber;
    private String validCheckoutCreditCardExpiryDate;
    private String validCheckoutCreditCardCVV;

    public CheckoutPageTooShortSingularInput(Page page) {
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

    //invalid checkout user shipping address data getter - too short shipping address first name (1 char)
    public void invalidCheckoutUserShipAddressInputDataTooShortFirstNameGetter() {

        tooShortCheckoutShipFirstName = "J";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address first name): " + "\n");

        logger.info("Too short checkout user first name: " + tooShortCheckoutShipFirstName);
        logger.info("Valid checkout user generated shipping address phone (too short shipping address first name): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address first name): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address first name): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address first name): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address first name): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address first name
    public void inputTooShortCheckoutPageShipAddressFirstNameIntoShipAddressFirstNameInputField() {checkoutPageShipAddressFirstNameInputField.fill(tooShortCheckoutShipFirstName);}

    //invalid checkout user shipping address data getter - too short shipping address last name (1 char)
    public void invalidCheckoutUserShipAddressInputDataTooShortLastNameGetter() {

        tooShortCheckoutShipLastName = "K";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address last name): " + "\n");

        logger.info("Too short checkout user last name: " + tooShortCheckoutShipLastName);
        logger.info("Valid checkout user generated shipping address phone (too short shipping address last name): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address last name): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address last name): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address last name): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address last name): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address last name
    public void inputTooShortCheckoutPageShipAddressLastNameIntoShipAddressLastNameInputField() {checkoutPageShipAddressLastNameInputField.fill(tooShortCheckoutShipLastName);}

    //invalid checkout user shipping address data getter - too short shipping address email (1 char -> name, domain)
    public void invalidCheckoutUserShipAddressInputDataTooShortEmailGetter() {

        tooShortCheckoutShipEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address email): " + "\n");

        logger.info("Too short checkout user email: " + tooShortCheckoutShipEmail);
        logger.info("Valid checkout user generated shipping address phone (too short shipping address email): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address email): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address email): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address email): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address email): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address email
    public void inputTooShortCheckoutPageShipAddressEmailIntoShipAddressEmailInputField() {checkoutPageShipAddressEmailInputField.fill(tooShortCheckoutShipEmail);}

    //invalid checkout user shipping address data getter - too short shipping address phone (2 digits)
    public void invalidCheckoutUserShipAddressInputDataTooShortPhoneGetter() {

        tooShortCheckoutShipPhone = "65";
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address phone): " + "\n");

        logger.info("Too short checkout shipping address phone: " + tooShortCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address phone): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address phone): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address phone): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address phone): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address phone
    public void inputTooShortCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(tooShortCheckoutShipPhone);}

    //invalid checkout user shipping address data getter - too short shipping address (3 chars)
    public void invalidCheckoutUserShipAddressInputDataTooShortAddressGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        tooShortCheckoutShipAddress = "4 G";
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too short shipping address): " + validCheckoutShipPhone);
        logger.info("Too short checkout shipping address: " + tooShortCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address
    public void inputTooShortCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(tooShortCheckoutShipAddress);}

    //invalid checkout user shipping address data getter - too short shipping address city (1 char)
    public void invalidCheckoutUserShipAddressInputDataTooShortCityGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        tooShortCheckoutShipCity = "V";
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address city): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too short shipping address city): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address city): " + validCheckoutShipAddress);
        logger.info("Too short checkout shipping address city: " + tooShortCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address city): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address city): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address city
    public void inputTooShortCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(tooShortCheckoutShipCity);}

    //invalid checkout user shipping address data getter - too short shipping address state (1 char)
    public void invalidCheckoutUserShipAddressInputDataTooShortStateGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        tooShortCheckoutShipState = "D";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address state): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too short shipping address state): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address state): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address state): " + validCheckoutShipCity);
        logger.info("Too short checkout shipping address state: " + tooShortCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address state): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address state
    public void inputTooShortCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(tooShortCheckoutShipState);}

    //invalid checkout user shipping address data getter - too short shipping address post code (4 digits)
    public void invalidCheckoutUserShipAddressInputDataTooShortPostCodeGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        tooShortCheckoutShipPostCode = "6754";

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address post code): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too short shipping address post code): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address post code): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address post code): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address post code): " + validCheckoutShipState);
        logger.info("Too short checkout shipping address post code: " + tooShortCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - too short user shipping address post code
    public void inputTooShortCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(tooShortCheckoutShipPostCode);}

    //invalid checkout user shipping address data getter - too short shipping address country (2 chars)
    public void invalidCheckoutUserShipAddressInputDataTooShortCountryGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        tooShortCheckoutShipCountry = "Fg";

        System.out.println("Invalid checkout user shipping address generated data (too short shipping address country): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (too short shipping address country): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (too short shipping address country): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (too short shipping address country): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (too short shipping address country): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (too short shipping address country): " + validCheckoutShipPostCode);
        logger.info("Too short shipping address country: " + tooShortCheckoutShipCountry);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - too short user shipping address country
    public void inputTooShortCheckoutPageShipAddressCountryIntoShipAddressCountryInputField() {checkoutPageShipAddressCountryInputField.fill(tooShortCheckoutShipCountry);}

    //valid checkout user shipping address data input methods (for remaining inputs)
    public void inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(validCheckoutShipPhone);}
    public void inputCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(validCheckoutShipAddress);}
    public void inputCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(validCheckoutShipCity);}
    public void inputCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(validCheckoutShipState);}
    public void inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(validCheckoutShipPostCode);}


    //invalid checkout user credit card data getter - too short credit cardholder name (3 chars)
    public void invalidCheckoutUserCredCardInputDataTooShortCardholderNameGetter() {

        tooShortCheckoutCreditCardholderName = "D A";
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (too short credit cardholder name): " + "\n");

        logger.info("Too short checkout user credit cardholder name: " + tooShortCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated credit card number (too short credit cardholder name): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (too short credit cardholder name): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too short credit cardholder name): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too short user credit cardholder name
    public void inputTooShortCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(tooShortCheckoutCreditCardholderName);}

    //invalid checkout user credit card data getter - too short credit card number (15 digits)
    public void invalidCheckoutUserCredCardInputDataTooShortCardNumberGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        tooShortCheckoutCreditCardNumber = "453267547865983";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (too short credit card number): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too short credit card number): " + validCheckoutCreditCardholderName);
        logger.info("Too short checkout credit card number: " + tooShortCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (too short credit card number): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too short credit card number): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too short user credit card number
    public void inputTooShortCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(tooShortCheckoutCreditCardNumber);}

    //invalid checkout user credit card data getter - too short credit card expiration date (4 chars)
    public void invalidCheckoutUserCredCardInputDataTooShortCardExpDateGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        tooShortCheckoutCreditCardExpiryDate = "12/3";
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (too short credit card expiration date): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too short credit card expiration date): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (too short credit card expiration date): " + validCheckoutCreditCardNumber);
        logger.info("Too short checkout credit card expiration date: " + tooShortCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too short credit card expiration date): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too short user credit card expiration date
    public void inputTooShortCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(tooShortCheckoutCreditCardExpiryDate);}

    //invalid checkout user credit card data getter - too short credit card CVV number (2 digits)
    public void invalidCheckoutUserCredCardInputDataTooShortCardCVVGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        tooShortCheckoutCreditCardCVV = "56";

        System.out.println("Invalid checkout user credit card generated data (too short credit card CVV number): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too short credit card CVV number): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (too short credit card CVV number): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated user credit card expiration date (too short credit card CVV number): " + validCheckoutCreditCardExpiryDate);
        logger.info("Too short checkout credit card CVV number: " + tooShortCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - too short user credit card CVV number
    public void inputTooShortCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(tooShortCheckoutCreditCardCVV);}

    //valid checkout user credit card data input methods (for remaining inputs)
    public void inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(validCheckoutCreditCardholderName);}
    public void inputCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(validCheckoutCreditCardNumber);}
    public void inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(validCheckoutCreditCardExpiryDate);}
    public void inputCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(validCheckoutCreditCardCVV);}

}