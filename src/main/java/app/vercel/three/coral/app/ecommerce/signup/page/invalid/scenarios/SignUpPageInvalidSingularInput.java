package app.vercel.three.coral.app.ecommerce.signup.page.invalid.scenarios;

import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class SignUpPageInvalidSingularInput extends BasePage {

    //relevant web elements
    private Locator signUpPageFirstNameInputField;
    private Locator signUpPageLastNameInputField;
    private Locator signUpPageEmailInputField;
    private Locator signUpPagePasswordInputField;
    private Locator signUpPageConfirmPasswordInputField;

    //valid user input data (for remaining inputs)
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //invalid user signup input data - no singular input
    private String noFirstName;
    private String noLastName;
    private String noEmail;
    private String noPassword;

    //invalid user signup input data - too short singular input
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortEmail;
    private String tooShortPassword;

    //invalid user signup input data - too long singular input
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooLongEmail;
    private String tooLongPassword;

    //invalid user signup input data - invalid singular input format
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;
    private String invalidEmailFormat;
    private String existingEmail;
    private String mismatchingConfirmPassword;

    public SignUpPageInvalidSingularInput(Page page) {
        super(page);

        signUpPageFirstNameInputField = page.locator("//input[@id='firstName']");
        signUpPageLastNameInputField = page.locator("//input[@id='lastName']");
        signUpPageEmailInputField = page.locator("//input[@id='email']");;
        signUpPagePasswordInputField = page.locator("//input[@id='password']");
        signUpPageConfirmPasswordInputField = page.locator("//input[@id='confirmPassword']");

    }

    //invalid user sign up input data getter method - no first name
    public void invalidUserSignUpDataNoFirstNameGetter(){

        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (no first name): " + "\n");

        logger.info("No user first name: " + noFirstName);
        logger.info("Valid user last name (no first name): " + lastName);
        logger.info("Valid user email (no first name): " + email);
        logger.info("Valid user password (no first name): " + password);
        logger.info("Valid matching user confirm password (no first name): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - no user first name
    public void inputNoFirstNameIntoFirstNameInputField(){signUpPageFirstNameInputField.fill(noFirstName);}

    //invalid user sign up input data getter method - no last name
    public void invalidUserSignUpDataNoLastNameGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (no last name): " + "\n");

        logger.info("Valid user first name (no last name): " + firstName);
        logger.info("No user last name: " + noLastName);
        logger.info("Valid user email (no last name): " + email);
        logger.info("Valid user password (no last name): " + password);
        logger.info("Valid matching user confirm password (no last name): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - no user last name
    public void inputNoLastNameIntoLastNameInputField(){signUpPageLastNameInputField.fill(noLastName);}

    //invalid user sign up input data getter method - no email
    public void invalidUserSignUpDataNoEmailGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noEmail = "";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (no email): " + "\n");

        logger.info("Valid user first name (no email): " + firstName);
        logger.info("Valid user last name (no email): " + lastName);
        logger.info("No user email: " + noEmail);
        logger.info("Valid user password (no email): " + password);
        logger.info("Valid matching user confirm password (no email): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - no user email
    public void inputNoEmailIntoEmailInputField(){signUpPageEmailInputField.fill(noEmail);}

    //invalid user sign up input data getter method - no password/confirm password
    public void invalidUserSignUpDataNoPasswordGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        noPassword = "";

        System.out.println("Invalid generated user sign up data (no password): " + "\n");

        logger.info("Valid user first name (no password): " + firstName);
        logger.info("Valid user last name (no password): " + lastName);
        logger.info("Valid user email (no password): " + email);
        logger.info("No user password: " + noPassword);
        logger.info("No matching user confirm password (no password): " + noPassword);

        System.out.println("\n");

    }

    //invalid user sign up data input method - no user password/confirm password
    public void inputNoPasswordIntoPasswordInputField(){signUpPagePasswordInputField.fill(noPassword);}
    public void inputNoConfirmPasswordIntoConfirmPasswordInputField(){signUpPageConfirmPasswordInputField.fill(noPassword);}

    //invalid user sign up input data getter method - too short first name (1 char)
    public void invalidUserSignUpDataTooShortFirstNameGetter(){

        tooShortFirstName = "K";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (too short first name): " + "\n");

        logger.info("Too short user first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short first name): " + lastName);
        logger.info("Valid user email (too short first name): " + email);
        logger.info("Valid user password (too short first name): " + password);
        logger.info("Valid matching user confirm password (too short first name): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too short user first name
    public void inputTooShortFirstNameIntoFirstNameInputField(){signUpPageFirstNameInputField.fill(tooShortFirstName);}

    //invalid user sign up input data getter method - too short last name (1 char)
    public void invalidUserSignUpDataTooShortLastNameGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "D";
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (too short last name): " + "\n");

        logger.info("Valid user first name (too short last name): " + firstName);
        logger.info("Too short user last name: " + tooShortLastName);
        logger.info("Valid user email (too short last name): " + email);
        logger.info("Valid user password (too short last name): " + password);
        logger.info("Valid matching user confirm password (too short last name): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too short user last name
    public void inputTooShortLastNameIntoLastNameInputField(){signUpPageLastNameInputField.fill(tooShortLastName);}

    //invalid user sign up input data getter method - too short email (1 char -> name, domain)
    public void invalidUserSignUpDataTooShortEmailGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooShortEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (too short email): " + "\n");

        logger.info("Valid user first name (too short email): " + firstName);
        logger.info("Valid user last name (too short email): " + lastName);
        logger.info("Too short user email: " + tooShortEmail);
        logger.info("Valid user password (too short email): " + password);
        logger.info("Valid matching user confirm password (too short email): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too short user email
    public void inputTooShortEmailIntoEmailInputField(){signUpPageEmailInputField.fill(tooShortEmail);}

    //invalid user sign up input data getter method - too short password/confirm password (5 chars)
    public void invalidUserSignUpDataTooShortPasswordGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        tooShortPassword = "K$4%$";

        System.out.println("Invalid generated user sign up data (too short password): " + "\n");

        logger.info("Valid user first name (too short password): " + firstName);
        logger.info("Valid user last name (too short password): " + lastName);
        logger.info("Valid user email (too short password): " + email);
        logger.info("Too short user password: " + tooShortPassword);
        logger.info("Too short matching user confirm password (too short password): " + tooShortPassword);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too short user password/confirm password
    public void inputTooShortPasswordIntoPasswordInputField(){signUpPagePasswordInputField.fill(tooShortPassword);}
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField(){signUpPageConfirmPasswordInputField.fill(tooShortPassword);}

    //invalid user sign up input data getter method - too long first name (100 chars)
    public void invalidUserSignUpDataTooLongFirstNameGetter(){

        tooLongFirstName = "Ksdfdhgfddfdfghguyyyijkukhjhfghgdsfsadwrewtrryuiyoiupkhjhlkjgffgdfdfdsretewrwwxcbvnvbmcvxxzfsdfssete";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (too long first name): " + "\n");

        logger.info("Too long user first name: " + tooLongFirstName);
        logger.info("Valid user last name (too long first name): " + lastName);
        logger.info("Valid user email (too long first name): " + email);
        logger.info("Valid user password (too long first name): " + password);
        logger.info("Valid matching user confirm password (too long first name): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too long user first name
    public void inputTooLongFirstNameIntoFirstNameInputField(){signUpPageFirstNameInputField.fill(tooLongFirstName);}

    //invalid user sign up input data getter method - too long last name (100 chars)
    public void invalidUserSignUpDataTooLongLastNameGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "Dsdfdhgfddfdfghguyyyijkukhjhfghgdsfsadwrewtrryuiyoiupkhjhlkjgffgdfdfdsretewrwwxcbvnvbmcvxxzfsdfssete";
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (too long last name): " + "\n");

        logger.info("Valid user first name (too long last name): " + firstName);
        logger.info("Too long user last name: " + tooLongLastName);
        logger.info("Valid user email (too long last name): " + email);
        logger.info("Valid user password (too long last name): " + password);
        logger.info("Valid matching user confirm password (too long last name): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too long user last name
    public void inputTooLongLastNameIntoLastNameInputField(){signUpPageLastNameInputField.fill(tooLongLastName);}

    //invalid user sign up input data getter method - too long email (100 chars -> name, domain)
    public void invalidUserSignUpDataTooLongEmailGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooLongEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (too long email): " + "\n");

        logger.info("Valid user first name (too long email): " + firstName);
        logger.info("Valid user last name (too long email): " + lastName);
        logger.info("Too long user email: " + tooLongEmail);
        logger.info("Valid user password (too long email): " + password);
        logger.info("Valid matching user confirm password (too long email): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too long user email
    public void inputTooLongEmailIntoEmailInputField(){signUpPageEmailInputField.fill(tooLongEmail);}

    //invalid user sign up input data getter method - too long password/confirm password (75 chars)
    public void invalidUserSignUpDataTooLongPasswordGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        tooLongPassword = "CsdfdhgfddfdfghguyyyijDFShjhfghgdsfsadwr598rryuiyoiupk%^$lkjgffgdfdfdsretew";

        System.out.println("Invalid generated user sign up data (too long password): " + "\n");

        logger.info("Valid user first name (too long password): " + firstName);
        logger.info("Valid user last name (too long password): " + lastName);
        logger.info("Valid user email (too long password): " + email);
        logger.info("Too long user password: " + tooShortPassword);
        logger.info("Too long matching user confirm password (too long password): " + tooShortPassword);

        System.out.println("\n");

    }

    //invalid user sign up data input method - too long user password/confirm password
    public void inputTooLongPasswordIntoPasswordInputField(){signUpPagePasswordInputField.fill(tooLongPassword);}
    public void inputTooLongConfirmPasswordIntoConfirmPasswordInputField(){signUpPageConfirmPasswordInputField.fill(tooLongPassword);}


    //invalid user sign up input data getter method - invalid first name format (special symbols only)
    public void invalidUserSignUpDataInvalidFirstNameFormatGetter(){

        invalidFirstNameFormat = "@$#$^$%&";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (invalid first name format): " + "\n");

        logger.info("Invalid user first name format: " + invalidFirstNameFormat);
        logger.info("Valid user last name (invalid first name format): " + lastName);
        logger.info("Valid user email (invalid first name format): " + email);
        logger.info("Valid user password (invalid first name format): " + password);
        logger.info("Valid matching user confirm password (invalid first name format): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - invalid user first name format
    public void inputInvalidFirstNameFormatIntoFirstNameInputField(){signUpPageFirstNameInputField.fill(invalidFirstNameFormat);}

    //invalid user sign up input data getter method - invalid last name format (special symbols only)
    public void invalidUserSignUpDataInvalidLastNameFormatGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        invalidLastNameFormat = "!#@$%$%^";
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (invalid last name format): " + "\n");

        logger.info("Valid user first name (invalid last name format): " + firstName);
        logger.info("Invalid user last name format: " + invalidLastNameFormat);
        logger.info("Valid user email (invalid last name format): " + email);
        logger.info("Valid user password (invalid last name format): " + password);
        logger.info("Valid matching user confirm password (invalid last name format): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - invalid user last name format
    public void inputInvalidLastNameFormatIntoLastNameInputField(){signUpPageLastNameInputField.fill(invalidLastNameFormat);}

    //invalid user sign up input data getter method - invalid user email format (missing '@')
    public void invalidUserSignUpDataInvalidEmailFormatGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        invalidEmailFormat = "dsdfdsffakemail.com";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (invalid email format): " + "\n");

        logger.info("Valid user first name (invalid email format): " + firstName);
        logger.info("Valid user last name (invalid email format): " + lastName);
        logger.info("Invalid user email format: " + invalidEmailFormat);
        logger.info("Valid user password (invalid email format): " + password);
        logger.info("Valid matching user confirm password (invalid email format): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - invalid user email format
    public void inputInvalidEmailFormatIntoEmailInputField(){signUpPageEmailInputField.fill(invalidEmailFormat);}

    //invalid user sign up input data getter method - existing user email (used beforehand in manual testing)
    public void invalidUserSignUpDataExistingEmailGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        existingEmail = "m0@example.com";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user sign up data (existing email): " + "\n");

        logger.info("Valid user first name (existing email): " + firstName);
        logger.info("Valid user last name (existing email): " + lastName);
        logger.info("Existing user email: " + existingEmail);
        logger.info("Valid user password (existing email): " + password);
        logger.info("Valid matching user confirm password (existing email): " + password);

        System.out.println("\n");

    }

    //invalid user sign up data input method - existing user email
    public void inputExistingEmailIntoEmailInputField(){signUpPageEmailInputField.fill(existingEmail);}

    //invalid user sign up input data getter method - mismatching confirm password
    public void invalidUserSignUpDataMismatchingConfirmPasswordGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        mismatchingConfirmPassword = "$^fddfgd$#%$";

        System.out.println("Invalid generated user sign up data (mismatching confirm password): " + "\n");

        logger.info("Valid user first name (mismatching confirm password): " + firstName);
        logger.info("Valid user last name (mismatching confirm password): " + lastName);
        logger.info("Valid user email (mismatching confirm password): " + email);
        logger.info("Valid user password: " + password);
        logger.info("Mismatching user confirm password: " + mismatchingConfirmPassword);

        System.out.println("\n");

    }

    //invalid user sign up data input method - mismatching user password/confirm password
    public void inputMismatchingConfirmPasswordIntoConfirmPasswordInputField(){signUpPageConfirmPasswordInputField.fill(mismatchingConfirmPassword);}



    //valid user sign up data input methods (for remaining inputs)
    public void inputFirstNameIntoFirstNameInputField(){signUpPageFirstNameInputField.fill(firstName);}
    public void inputLastNameIntoLastNameInputField(){signUpPageLastNameInputField.fill(lastName);}
    public void inputEmailIntoEmailInputField(){signUpPageEmailInputField.fill(email);}
    public void inputPasswordIntoPasswordInputField(){signUpPagePasswordInputField.fill(password);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){signUpPageConfirmPasswordInputField.fill(password);}

}
