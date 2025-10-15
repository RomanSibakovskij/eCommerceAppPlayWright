package app.vercel.three.coral.app.ecommerce.signin.page.invalidscenarios;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import app.vercel.three.coral.app.ecommerce.SignUpPage;
import com.microsoft.playwright.*;

public class SignInPageInvalidSingularInput extends BasePage {

    //relevant web elements
    private Locator signInPageEmailInputField;
    private Locator signInPagePasswordInputField;

    //valid login input data (for remaining inputs)
    private String loginEmail;
    private String loginPassword;

    //invalid login input data - no singular input
    private String noLoginEmail;
    private String noLoginPassword;

    //invalid login input data - invalid singular input
    private String invalidLoginEmail;
    private String invalidLoginEmailFormat;
    private String invalidLoginPassword;

    public SignInPageInvalidSingularInput(Page page) {
        super(page);

        signInPageEmailInputField = page.locator("//input[@id='email']");
        signInPagePasswordInputField = page.locator("//input[@id='password']");

    }

    //invalid sign in input data getter - no login email
    public void invalidSignInInputDataNoEmailGetter(SignUpPage signUpPage) {

        noLoginEmail = "";
        loginPassword = signUpPage.getPassword();

        System.out.println("Invalid user login input data (no login email): " + "\n");

        logger.info("No user login email: " + noLoginEmail);
        logger.info("Valid user login password (no login email): " + loginPassword);

        System.out.println("\n");

    }

    //invalid sign in data input method - no login email
    public void inputNoSignInEmailIntoSignInEmailInputField() {signInPageEmailInputField.fill(noLoginEmail);}

    //invalid sign in input data getter - no login password
    public void invalidSignInInputDataNoPasswordGetter(SignUpPage signUpPage) {

        loginEmail = signUpPage.getEmail();
        noLoginPassword = "";

        System.out.println("Invalid user login input data (no login password): " + "\n");

        logger.info("Valid user login email (no login password): " + loginEmail);
        logger.info("No user login password: " + noLoginPassword);

        System.out.println("\n");

    }

    //invalid sign in data input method - no login password
    public void inputNoSignInPasswordIntoSignInPasswordInputField() {signInPagePasswordInputField.fill(noLoginPassword);}

    //invalid sign in input data getter - invalid login email
    public void invalidSignInInputDataInvalidEmailGetter(SignUpPage signUpPage) {

        invalidLoginEmail = "fsdfsdf@fakemail.com";
        loginPassword = signUpPage.getPassword();

        System.out.println("Invalid user login input data (invalid login email): " + "\n");

        logger.info("Invalid user login email: " + invalidLoginEmail);
        logger.info("Valid user login password (invalid login email): " + loginPassword);

        System.out.println("\n");

    }

    //invalid sign in data input method - invalid login email
    public void inputInvalidSignInEmailIntoSignInEmailInputField() {signInPageEmailInputField.fill(invalidLoginEmail);}

    //invalid sign in input data getter - invalid login email format (missing '@')
    public void invalidSignInInputDataInvalidEmailFormatGetter(SignUpPage signUpPage) {

        invalidLoginEmailFormat = "fsdfsdffakemail.com";
        loginPassword = signUpPage.getPassword();

        System.out.println("Invalid user login input data (invalid login email format): " + "\n");

        logger.info("Invalid user login email format: " + invalidLoginEmailFormat);
        logger.info("Valid user login password (invalid login email format): " + loginPassword);

        System.out.println("\n");

    }

    //invalid sign in data input method - invalid login email format
    public void inputInvalidSignInEmailFormatIntoSignInEmailInputField() {signInPageEmailInputField.fill(invalidLoginEmailFormat);}

    //invalid sign in input data getter - invalid login password
    public void invalidSignInInputDataInvalidPasswordGetter(SignUpPage signUpPage) {

        loginEmail = signUpPage.getEmail();
        invalidLoginPassword = "K7@!$@#dfd";

        System.out.println("Invalid user login input data (invalid login password): " + "\n");

        logger.info("Valid user login email (invalid login password): " + loginEmail);
        logger.info("Invalid user login password: " + invalidLoginPassword);

        System.out.println("\n");

    }

    //invalid sign in data input method - invalid login password
    public void inputInvalidSignInPasswordIntoSignInPasswordInputField() {signInPagePasswordInputField.fill(invalidLoginPassword);}

    //valid sign in input data getter
    public void validSignInInputDataGetter(SignUpPage signUpPage) {

        loginEmail = signUpPage.getEmail();
        loginPassword = signUpPage.getPassword();

        System.out.println("Valid user login input data: " + "\n");

        logger.info("Valid user login email: " + loginEmail);
        logger.info("Valid user login password: " + loginPassword);

        System.out.println("\n");

    }

    //valid sign in data input methods
    public void inputSignInEmailIntoSignInEmailInputField() {signInPageEmailInputField.fill(loginEmail);}
    public void inputSignInPasswordIntoSignInPasswordInputField() {signInPagePasswordInputField.fill(loginPassword);}

}
