package app.vercel.three.coral.app.ecommerce.checkout.page.invalidscenarios;

import app.vercel.three.coral.app.ecommerce.SignUpPage;
import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class CheckoutPageInvalidSingularInputFormat extends BasePage{

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

    //invalid checkout shipping address input data - invalid singular input format
    private String invalidCheckoutShipFirstNameFormat;
    private String invalidCheckoutShipLastNameFormat;
    private String invalidCheckoutShipEmailFormat;
    private String invalidCheckoutShipPhoneFormat;
    private String invalidCheckoutShipAddressFormat;
    private String invalidCheckoutShipCityFormat;
    private String invalidCheckoutShipStateFormat;
    private String invalidCheckoutShipPostCodeFormat;
    private String invalidCheckoutShipCountryFormat;

    //valid checkout shipping address input data (for remaining inputs)
    private String validCheckoutShipFirstName;
    private String validCheckoutShipLastName;
    private String validCheckoutShipEmail;
    private String validCheckoutShipPhone;
    private String validCheckoutShipAddress;
    private String validCheckoutShipCity;
    private String validCheckoutShipState;
    private String validCheckoutShipPostCode;

    //invalid checkout credit card input data - invalid singular input format
    private String invalidCheckoutCreditCardholderNameFormat;
    private String invalidCheckoutCreditCardNumberFormat;
    private String invalidCheckoutCreditCardExpiryDateFormat;
    private String invalidCheckoutCreditCardCVVFormat;

    //valid checkout credit card input data (for remaining inputs)
    private String validCheckoutCreditCardholderName;
    private String validCheckoutCreditCardNumber;
    private String validCheckoutCreditCardExpiryDate;
    private String validCheckoutCreditCardCVV;

    public CheckoutPageInvalidSingularInputFormat(Page page) {
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

    //invalid checkout user shipping address data getter - invalid shipping address first name format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidFirstNameFormatGetter() {

        invalidCheckoutShipFirstNameFormat = "!#@#$%$";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address first name format): " + "\n");

        logger.info("Invalid checkout user first name format: " + invalidCheckoutShipFirstNameFormat);
        logger.info("Valid checkout user generated shipping address phone (invalid shipping address first name format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address first name format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address first name format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address first name format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address first name format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address first name format
    public void inputInvalidCheckoutPageShipAddressFirstNameFormatIntoShipAddressFirstNameInputField() {checkoutPageShipAddressFirstNameInputField.fill(invalidCheckoutShipFirstNameFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address last name format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidLastNameFormatGetter() {

        invalidCheckoutShipLastNameFormat = "(@#@%$%^";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address last name format): " + "\n");

        logger.info("Invalid checkout user last name format: " + invalidCheckoutShipLastNameFormat);
        logger.info("Valid checkout user generated shipping address phone (invalid shipping address last name format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address last name format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address last name format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address last name format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address last name format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address last name format
    public void inputInvalidCheckoutPageShipAddressLastNameFormatIntoShipAddressLastNameInputField() {checkoutPageShipAddressLastNameInputField.fill(invalidCheckoutShipLastNameFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address email format (missing '@')
    public void invalidCheckoutUserShipAddressInputDataInvalidEmailFormatGetter() {

        invalidCheckoutShipEmailFormat = "ergdfgfdgfakemail.com";
        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address email format): " + "\n");

        logger.info("Invalid checkout user email format: " + invalidCheckoutShipEmailFormat);
        logger.info("Valid checkout user generated shipping address phone (invalid shipping address email format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address email format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address email format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address email format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address email format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address email format
    public void inputInvalidCheckoutPageShipAddressEmailFormatIntoShipAddressEmailInputField() {checkoutPageShipAddressEmailInputField.fill(invalidCheckoutShipEmailFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address phone format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidPhoneFormatGetter() {

        invalidCheckoutShipPhoneFormat = "!@#$%$^";
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address phone format): " + "\n");

        logger.info("Invalid checkout shipping address phone format: " + invalidCheckoutShipPhoneFormat);
        logger.info("Valid checkout user generated shipping address (invalid shipping address phone format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address phone format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address phone format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address phone format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address phone format
    public void inputInvalidCheckoutPageShipAddressPhoneFormatIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(invalidCheckoutShipPhoneFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidAddressFormatGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        invalidCheckoutShipAddressFormat = "@#$%&^%^";
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address format): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (invalid shipping address format): " + validCheckoutShipPhone);
        logger.info("Invalid checkout shipping address format: " + invalidCheckoutShipAddressFormat);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address format
    public void inputInvalidCheckoutPageShipAddressFormatIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(invalidCheckoutShipAddressFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address city format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidCityFormatGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        invalidCheckoutShipCityFormat = "!@#$%$%^";
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address city format): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (invalid shipping address city format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address city format): " + validCheckoutShipAddress);
        logger.info("Invalid checkout shipping address city format: " + invalidCheckoutShipCityFormat);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address city format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address city format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address city format
    public void inputInvalidCheckoutPageShipAddressCityFormatIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(invalidCheckoutShipCityFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address state format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidStateFormatGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        invalidCheckoutShipStateFormat = "!#@%$$^";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address state format): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (invalid shipping address state format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address state format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address state format): " + validCheckoutShipCity);
        logger.info("Invalid checkout shipping address state format: " + invalidCheckoutShipStateFormat);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address state format): " + validCheckoutShipPostCode);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address state format
    public void inputInvalidCheckoutPageShipAddressStateFormatIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(invalidCheckoutShipStateFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address post code format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidPostCodeFormatGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        invalidCheckoutShipPostCodeFormat = "675439";

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address post code format): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (invalid shipping address post code format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address post code format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address post code format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address post code format): " + validCheckoutShipState);
        logger.info("Invalid checkout shipping address post code format: " + invalidCheckoutShipPostCodeFormat);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input method - invalid user shipping address post code format
    public void inputInvalidCheckoutPageShipAddressPostCodeFormatIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(invalidCheckoutShipPostCodeFormat);}

    //invalid checkout user shipping address data getter - invalid shipping address country format (special symbols only)
    public void invalidCheckoutUserShipAddressInputDataInvalidCountryFormatGetter() {

        validCheckoutShipPhone = TestDataGenerator.generatePhoneNumber(8);
        validCheckoutShipAddress = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipCity = TestDataGenerator.getRandomCity();
        validCheckoutShipState = "Illinois";
        validCheckoutShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        invalidCheckoutShipCountryFormat = "!@#%$";

        System.out.println("Invalid checkout user shipping address generated data (invalid shipping address country format): " + "\n");

        logger.info("Valid checkout user generated shipping address phone (invalid shipping address country format): " + validCheckoutShipPhone);
        logger.info("Valid checkout user generated shipping address (invalid shipping address country format): " + validCheckoutShipAddress);
        logger.info("Valid checkout user generated shipping address city (invalid shipping address country format): " + validCheckoutShipCity);
        logger.info("Valid checkout user generated shipping address state (invalid shipping address country format): " + validCheckoutShipState);
        logger.info("Valid checkout user generated shipping address post code (invalid shipping address country format): " + validCheckoutShipPostCode);
        logger.info("Invalid shipping address country format: " + invalidCheckoutShipCountryFormat);

        System.out.println("\n");

    }

    //invalid checkout user shipping address data input methods - invalid user shipping address country
    public void inputInvalidCheckoutPageShipAddressCountryFormatIntoShipAddressCountryInputField() {checkoutPageShipAddressCountryInputField.fill(invalidCheckoutShipCountryFormat);}

    //valid checkout user shipping address data input methods (for remaining inputs)
    public void inputCheckoutPageShipAddressPhoneIntoShipAddressPhoneInputField() {checkoutPageShipAddressPhoneInputField.fill(validCheckoutShipPhone);}
    public void inputCheckoutPageShipAddressIntoShipAddressTextarea() {checkoutPageShipAddressTextarea.fill(validCheckoutShipAddress);}
    public void inputCheckoutPageShipAddressCityIntoShipAddressCityInputField() {checkoutPageShipAddressCityInputField.fill(validCheckoutShipCity);}
    public void inputCheckoutPageShipAddressStateIntoShipAddressStateInputField() {checkoutPageShipAddressStateInputField.fill(validCheckoutShipState);}
    public void inputCheckoutPageShipAddressPostCodeIntoShipAddressPostCodeInputField() {checkoutPageShipAddressPostCodeInputField.fill(validCheckoutShipPostCode);}


    //invalid checkout user credit card data getter - invalid credit cardholder name (special symbols only)
    public void invalidCheckoutUserCredCardInputDataInvalidCardholderNameFormatGetter() {

        invalidCheckoutCreditCardholderNameFormat = "!#@$ @!$#%$#%";
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (invalid credit cardholder name format): " + "\n");

        logger.info("Invalid checkout user credit cardholder name format: " + invalidCheckoutCreditCardholderNameFormat);
        logger.info("Valid checkout user generated credit card number (invalid credit cardholder name format): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated credit card expiration date (invalid credit cardholder name format): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (invalid credit cardholder name format): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - invalid user credit cardholder name format
    public void inputInvalidCheckoutPageCredCardCardholderNameFormatIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(invalidCheckoutCreditCardholderNameFormat);}

    //invalid checkout user credit card data getter - invalid credit card number format (special symbols only)
    public void invalidCheckoutUserCredCardInputDataInvalidCardNumberFormatGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        invalidCheckoutCreditCardNumberFormat = "#$%^%$#$%^&*()(*";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (invalid credit card number format): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (too long credit card number): " + validCheckoutCreditCardholderName);
        logger.info("Invalid checkout credit card number format: " + invalidCheckoutCreditCardNumberFormat);
        logger.info("Valid checkout user generated credit card expiration date (too long credit card number): " + validCheckoutCreditCardExpiryDate);
        logger.info("Valid checkout user generated credit card CVV number (too long credit card number): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - invalid user credit card number format
    public void inputInvalidCheckoutPageCredCardNumberFormatIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(invalidCheckoutCreditCardNumberFormat);}

    //invalid checkout user credit card data getter - invalid credit card expiration date (special symbols only)
    public void invalidCheckoutUserCredCardInputDataInvalidCardExpDateFormatGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        invalidCheckoutCreditCardExpiryDateFormat = "#$/%^";
        validCheckoutCreditCardCVV = TestDataGenerator.generateCVV();

        System.out.println("Invalid checkout user credit card generated data (invalid credit card expiration date format): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (invalid credit card expiration date format): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (invalid credit card expiration date format): " + validCheckoutCreditCardNumber);
        logger.info("Invalid checkout credit card expiration date format: " + invalidCheckoutCreditCardExpiryDateFormat);
        logger.info("Valid checkout user generated credit card CVV number (invalid credit card expiration date format): " + validCheckoutCreditCardCVV);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - invalid user credit card expiration date format
    public void inputInvalidCheckoutPageCredCardExpiryDateFormatIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(invalidCheckoutCreditCardExpiryDateFormat);}

    //invalid checkout user credit card data getter - invalid credit card CVV number format (special symbols only)
    public void invalidCheckoutUserCredCardInputDataInvalidCardCVVFormatGetter(SignUpPage signUpPage) {

        validCheckoutCreditCardholderName = signUpPage.getFirstName() + " " + signUpPage.getLastName();
        validCheckoutCreditCardNumber = "4532675478659832";
        validCheckoutCreditCardExpiryDate = TestDataGenerator.generateExpirationDate();
        invalidCheckoutCreditCardCVVFormat = "&*^";

        System.out.println("Invalid checkout user credit card generated data (invalid credit card CVV number format): " + "\n");

        logger.info("Valid checkout user generated user credit cardholder name (invalid credit card CVV number format): " + validCheckoutCreditCardholderName);
        logger.info("Valid checkout user generated user credit card number (invalid credit card CVV number format): " + validCheckoutCreditCardNumber);
        logger.info("Valid checkout user generated user credit card expiration date (invalid credit card CVV number format): " + validCheckoutCreditCardExpiryDate);
        logger.info("Invalid checkout credit card CVV number format: " + invalidCheckoutCreditCardCVVFormat);

        System.out.println("\n");

    }

    //invalid checkout user credit card data input method - invalid user credit card CVV number format
    public void inputInvalidCheckoutPageCredCardCVVFormatIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(invalidCheckoutCreditCardCVVFormat);}

    //valid checkout user credit card data input methods (for remaining inputs)
    public void inputCheckoutPageCredCardCardholderNameIntoCredCardCardholderNameInputField() {checkoutPageCredCardCardholderNameInputField.fill(validCheckoutCreditCardholderName);}
    public void inputCheckoutPageCredCardNumberIntoCredCardNumberInputField() {checkoutPageCredCardNumberInputField.fill(validCheckoutCreditCardNumber);}
    public void inputCheckoutPageCredCardExpiryDateIntoCredCardExpiryDateInputField() {checkoutPageCredCardExpiryDateInputField.fill(validCheckoutCreditCardExpiryDate);}
    public void inputCheckoutPageCredCardCVVIntoCredCardCVVInputField() {checkoutPageCredCardCVVInputField.fill(validCheckoutCreditCardCVV);}

}