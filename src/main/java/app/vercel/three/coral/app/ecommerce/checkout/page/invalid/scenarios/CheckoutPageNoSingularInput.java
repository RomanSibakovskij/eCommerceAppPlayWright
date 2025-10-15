package app.vercel.three.coral.app.ecommerce.checkout.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.SignUpPage;
import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class CheckoutPageNoSingularInput extends BasePage {

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

    //invalid checkout shipping address input data - no singular input
    private String noCheckoutShipFirstName;
    private String noCheckoutShipLastName;
    private String noCheckoutShipEmail;
    private String noCheckoutShipPhone;
    private String noCheckoutShipAddress;
    private String noCheckoutShipCity;
    private String noCheckoutShipState;
    private String noCheckoutShipPostCode;
    private String noCheckoutShipCountry;

    //valid checkout shipping address input data (for remaining inputs)
    private String validCheckoutShipFirstName;
    private String validCheckoutShipLastName;
    private String validCheckoutShipEmail;
    private String validCheckoutShipPhone;
    private String validCheckoutShipAddress;
    private String validCheckoutShipCity;
    private String validCheckoutShipState;
    private String validCheckoutShipPostCode;


    //invalid checkout credit card input data - no singular input
    private String noCheckoutCreditCardholderName;
    private String noCheckoutCreditCardNumber;
    private String noCheckoutCreditCardExpiryDate;
    private String noCheckoutCreditCardCVV;

    //valid checkout credit card input data (for remaining inputs)
    private String validCheckoutCreditCardholderName;
    private String validCheckoutCreditCardNumber;
    private String validCheckoutCreditCardExpiryDate;
    private String validCheckoutCreditCardCVV;

    public CheckoutPageNoSingularInput(Page page) {
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

    //invalid checkout user shipping address data getter - no shipping address first name
    public void invalidCheckoutUserShipAddressInputDataNoFirstNameGetter() {

        noCheckoutShipFirstName = "";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address first name): " + "\n");

        logger.info("No checkout user first name: " + noCheckoutShipFirstName);
        logger.info("Valid checkout user generated shipping address phone (no shipping address first name): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address first name): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address first name): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address first name): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address first name): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address first name
    public void inputNoCheckoutPageShipAddressFirstNameIntoShipAddressFirstNameInputField() {checkoutPageShipAddressFirstNameInputField.fill(noCheckoutShipFirstName);}

    //invalid checkout user shipping address data getter - no shipping address last name
    public void invalidCheckoutUserShipAddressInputDataNoLastNameGetter() {

        noCheckoutShipLastName = "";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address last name): " + "\n");

        logger.info("No checkout user last name: " + noCheckoutShipLastName);
        logger.info("Valid checkout user generated shipping address phone (no shipping address last name): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address last name): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address last name): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address last name): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address last name): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address last name
    public void inputNoCheckoutPageShipAddressLastNameIntoShipAddressLastNameInputField() {checkoutPageShipAddressLastNameInputField.fill(noCheckoutShipLastName);}

    //invalid checkout user shipping address data getter - no shipping address email
    public void invalidCheckoutUserShipAddressInputDataNoEmailGetter() {

        noCheckoutShipEmail = "";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address email): " + "\n");

        logger.info("No checkout user email: " + noCheckoutShipEmail);
        logger.info("Valid checkout user generated shipping address phone (no shipping address email): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address email): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address email): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address email): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address email): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address email
    public void inputNoCheckoutPageShipAddressEmailIntoShipAddressEmailInputField() {checkoutPageShipAddressEmailInputField.fill(noCheckoutShipEmail);}

    //invalid checkout user shipping address data getter - no shipping address phone
    public void invalidCheckoutUserShipAddressInputDataNoPhoneGetter() {

        noCheckoutShipPhone = "";
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address phone): " + "\n");

        logger.info("No checkout shipping address phone: " + noCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address phone): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address phone): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address phone): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address phone): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address phone
    public void inputNoCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(noCheckoutShipPhone);}

    //invalid checkout user shipping address data getter - no shipping address
    public void invalidCheckoutUserShipAddressInputDataNoAddressGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        noCheckoutShipAddress = "";
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (no shipping address): " + validCheckoutShipPhone);
        logger.info("No checkout shipping address (no shipping address): " + noCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address
    public void inputNoCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(noCheckoutShipAddress);}

    //invalid checkout user shipping address data getter - no shipping address city
    public void invalidCheckoutUserShipAddressInputDataNoCityGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        noCheckoutShipCity = "";
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address city): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (no shipping address city): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address city): " + validCheckoutShipAddress);
        logger.info("No checkout shipping address city: " + noCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address city): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address city): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address city
    public void inputNoCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(noCheckoutShipCity);}

    //invalid checkout user shipping address data getter - no shipping address state
    public void invalidCheckoutUserShipAddressInputDataNoStateGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        noCheckoutShipState = "";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (no shipping address state): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (no shipping address state): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address state): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address state): " + validCheckoutShipCity);
        logger.info("No checkout shipping address state: " + noCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address state): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address state
    public void inputNoCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(noCheckoutShipState);}

    //invalid checkout user shipping address data getter - no shipping address post code
    public void invalidCheckoutUserShipAddressInputDataNoPostCodeGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        noCheckoutShipPostCode = "";

        System.out.println("Invalid checkout user shipping address generated data (no shipping address post code): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (no shipping address post code): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address post code): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address post code): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address post code): " + validCheckoutShipState);
        logger.info("No checkout shipping address post code: " + noCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address post code
    public void inputNoCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(noCheckoutShipPostCode);}

    //invalid checkout user shipping address data getter - no shipping address country
    public void invalidCheckoutUserShipAddressInputDataNoCountryGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        noCheckoutShipCountry = "";

        System.out.println("Invalid checkout user shipping address generated data (no shipping address country): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (no shipping address country): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (no shipping address country): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (no shipping address country): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (no shipping address country): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (no shipping address country): " + validCheckoutShipPostCode);
        logger.info("No shipping address country: " + noCheckoutShipCountry);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - no user shipping address country
    public void inputNoCheckoutPageShipAddressCountryIntoShipAddressCountryInputField() {checkoutPageShipAddressCountryInputField.fill(noCheckoutShipCountry);}

    //valid checkout user shipping address data input methods (for remaining inputs)
    public void inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(validCheckoutShipPhone);}
    public void inputCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(validCheckoutShipAddress);}
    public void inputCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(validCheckoutShipCity);}
    public void inputCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(validCheckoutShipState);}
    public void inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(validCheckoutShipPostCode);}


    //invalid checkout user credit card data getter - no credit cardholder name
    public void invalidCheckoutUserCredCardInputDataNoCardholderNameGetter() {

        noCheckoutCreditCardholderName = "";
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (no credit cardholder name): " + "\n");

        logger.info("No checkout user credit cardholder name: " + noCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated credit card number (no credit cardholder name): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (no credit cardholder name): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (no credit cardholder name): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - no user credit cardholder name
    public void inputNoCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(noCheckoutCreditCardholderName);}

    //invalid checkout user credit card data getter - no credit card number
    public void invalidCheckoutUserCredCardInputDataNoCardNumberGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        noCheckoutCreditCardNumber = "";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (no credit card number): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (no credit card number): " + validCheckoutCreditCardholderName);
        logger.info("No checkout credit card number: " + noCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (no credit card number): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (no credit card number): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - no user credit card number
    public void inputNoCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(noCheckoutCreditCardNumber);}

    //invalid checkout user credit card data getter - no credit card expiration date
    public void invalidCheckoutUserCredCardInputDataNoCardExpDateGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        noCheckoutCreditCardExpiryDate = "";
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (no credit card expiration date): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (no credit card expiration date): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (no credit card expiration date): " + validCheckoutCreditCardNumber);
        logger.info("No checkout credit card expiration date: " + noCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (no credit card expiration date): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - no user credit card expiration date
    public void inputNoCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(noCheckoutCreditCardExpiryDate);}

    //invalid checkout user credit card data getter - no credit card CVV number
    public void invalidCheckoutUserCredCardInputDataNoCardCVVGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        noCheckoutCreditCardCVV = "";

        System.out.println("Invalid checkout user credit card generated data (no credit card CVV number): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (no credit card CVV number): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (no credit card CVV number): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated user credit card expiration date (no credit card CVV number): " + validCheckoutCreditCardExpiryDate);
        logger.info("No checkout credit card CVV number: " + noCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - no user credit card CVV number
    public void inputNoCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(noCheckoutCreditCardCVV);}

    //valid checkout user credit card data input methods (for remaining inputs)
    public void inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(validCheckoutCreditCardholderName);}
    public void inputCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(validCheckoutCreditCardNumber);}
    public void inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(validCheckoutCreditCardExpiryDate);}
    public void inputCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(validCheckoutCreditCardCVV);}

}
