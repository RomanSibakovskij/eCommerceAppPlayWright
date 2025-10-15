package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.*;
import com.microsoft.playwright.*;

public class SignUpPage extends BasePage {

    //sign up page web elements
    private Locator signUpPageIcon;
    private Locator signUpPageTitle;
    private Locator signUpPageSubtitle;
    //input form
    private Locator signUpPageFirstNameIcon;
    private Locator signUpPageFirstNameSubtext;
    private Locator signUpPageFirstNameInputField;
    private Locator signUpPageLastNameIcon;
    private Locator signUpPageLastNameSubtext;
    private Locator signUpPageLastNameInputField;
    private Locator signUpPageEmailIcon;
    private Locator signUpPageEmailSubtext;
    private Locator signUpPageEmailInputField;
    private Locator signUpPagePasswordIcon;
    private Locator signUpPagePasswordSubtext;
    private Locator signUpPagePasswordInputField;
    private Locator signUpPageViewPasswordBtn;
    private Locator signUpPageConfirmPasswordIcon;
    private Locator signUpPageConfirmPasswordSubtext;
    private Locator signUpPageConfirmPasswordInputField;
    private Locator signUpPageViewConfirmPasswordBtn;
    //buttons
    private Locator signUpPageCreateAccountBtn;
    private Locator signUpPageHaveAccountText;
    private Locator signUpPageSignUpBtn;
    //invalid singular input error
    private Locator signUpPageInvalidSingularInputError;

    //valid user input data
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String password;

    public SignUpPage(Page page) {
        super(page);

        signUpPageIcon = page.locator("//div[@class='MuiBox-root css-6acnen']");
        signUpPageTitle = page.locator("//h1[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-1b3up7u']");
        signUpPageSubtitle = page.locator("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter css-1ytmhd']");
        //input form
        signUpPageFirstNameIcon = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[1]//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signUpPageFirstNameSubtext = page.locator("//label[@id='firstName-label']");
        signUpPageFirstNameInputField = page.locator("//input[@id='firstName']");
        signUpPageLastNameIcon = page.locator("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row MuiGrid-spacing-xs-3 css-177xvbk']/div[2]//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signUpPageLastNameSubtext = page.locator("//label[@id='lastName-label']");
        signUpPageLastNameInputField = page.locator("//input[@id='lastName']");
        signUpPageEmailIcon = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-1sv499f']//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signUpPageEmailSubtext = page.locator("//label[@id='email-label']");
        signUpPageEmailInputField = page.locator("//input[@id='email']");
        signUpPagePasswordIcon = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][1]//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signUpPagePasswordSubtext = page.locator("//label[@id='password-label']");
        signUpPagePasswordInputField = page.locator("//input[@id='password']");
        signUpPageViewPasswordBtn = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][1]//button");
        signUpPageConfirmPasswordIcon = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][2]//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signUpPageConfirmPasswordSubtext = page.locator("//label[@id='confirmPassword-label']");
        signUpPageConfirmPasswordInputField = page.locator("//input[@id='confirmPassword']");
        signUpPageViewConfirmPasswordBtn = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][2]//button");
        //buttons
        signUpPageCreateAccountBtn = page.locator("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary MuiButton-fullWidth css-4exh2o']");
        signUpPageHaveAccountText = page.locator("//span[@class='MuiDivider-wrapper css-163llxe']");
        signUpPageSignUpBtn = page.locator("//div[@class='MuiBox-root css-xi606m']/a");
        //invalid singular input error
        signUpPageInvalidSingularInputError = page.locator("//div[@role='alert']");

    }

    //valid user input data getter method
    public void validUserSignUpDataGetter(){

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid generated user sign up data: " + "\n");

        logger.info("Valid user first name: " + firstName);
        logger.info("Valid user last name: " + lastName);
        logger.info("Valid user email: " + email);
        logger.info("Valid user password: " + password);
        logger.info("Valid matching user confirm password: " + password);

        System.out.println("\n");

    }

    //valid user sign up data input methods
    public void inputFirstNameIntoFirstNameInputField(){signUpPageFirstNameInputField.fill(firstName);}
    public void inputLastNameIntoLastNameInputField(){signUpPageLastNameInputField.fill(lastName);}
    public void inputEmailIntoEmailInputField(){signUpPageEmailInputField.fill(email);}
    public void inputPasswordIntoPasswordInputField(){signUpPagePasswordInputField.fill(password);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){signUpPageConfirmPasswordInputField.fill(password);}

    //click "View password" button method
    public void clickViewPasswordBtn(){signUpPageViewPasswordBtn.click();}

    //click "View confirm password" button method
    public void clickViewConfirmPasswordBtn(){signUpPageViewConfirmPasswordBtn.click();}

    //click "Create Account" button method
    public void clickCreateAccountBtn(){signUpPageCreateAccountBtn.click();}

    //sign up page text element getters
    public String getSignUpPageTitle() {return signUpPageTitle.innerText();}
    public String getSignUpPageSubtitle() {return signUpPageSubtitle.innerText();}
    //input form
    public String getSignUpPageFirstNameSubtext() {return signUpPageFirstNameSubtext.innerText();}
    public String getSignUpPageLastNameSubtext() {return signUpPageLastNameSubtext.innerText();}
    public String getSignUpPageEmailSubtext() {return signUpPageEmailSubtext.innerText();}
    public String getSignUpPagePasswordSubtext() {return signUpPagePasswordSubtext.innerText();}
    public String getSignUpPageConfirmPasswordSubtext() {return signUpPageConfirmPasswordSubtext.innerText();}
    //buttons
    public String getSignUpPageCreateAccountBtnText() {return signUpPageCreateAccountBtn.innerText();}
    public String getSignUpPageHaveAccountText() {return signUpPageHaveAccountText.innerText();}
    public String getSignUpPageSignUpBtnText() {return signUpPageSignUpBtn.innerText();}

    //invalid singular input error getter
    public String getSignUpPageInvalidSingularInputErrorMsg() {return signUpPageInvalidSingularInputError.innerText();}

    //private data getters
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}

    //sign up page web element assert methods
    public boolean isSignUpPageIconVisible() {return signUpPageIcon.isVisible();}
    public boolean isSignUpPageTitleVisible() {return signUpPageTitle.isVisible();}
    public boolean isSignUpPageSubtitleVisible() {return signUpPageSubtitle.isVisible();}
    //input form
    public boolean isSignUpPageFirstNameIconVisible() {return signUpPageFirstNameIcon.isVisible();}
    public boolean isSignUpPageFirstNameSubtextVisible() {return signUpPageFirstNameSubtext.isVisible();}
    public boolean isSignUpPageFirstNameInputFieldVisible() {return signUpPageFirstNameInputField.isVisible();}
    public boolean isSignUpPageLastNameIconVisible() {return signUpPageLastNameIcon.isVisible();}
    public boolean isSignUpPageLastNameSubtextVisible() {return signUpPageLastNameSubtext.isVisible();}
    public boolean isSignUpPageLastNameInputFieldVisible() {return signUpPageLastNameInputField.isVisible();}
    public boolean isSignUpPageEmailIconVisible() {return signUpPageEmailIcon.isVisible();}
    public boolean isSignUpPageEmailSubtextVisible() {return signUpPageEmailSubtext.isVisible();}
    public boolean isSignUpPageEmailInputFieldVisible() {return signUpPageEmailInputField.isVisible();}
    public boolean isSignUpPagePasswordIconVisible() {return signUpPagePasswordIcon.isVisible();}
    public boolean isSignUpPagePasswordSubtextVisible() {return signUpPagePasswordSubtext.isVisible();}
    public boolean isSignUpPagePasswordInputFieldVisible() {return signUpPagePasswordInputField.isVisible();}
    public boolean isSignUpPageViewPasswordBtnVisible() {return signUpPageViewPasswordBtn.isVisible();}
    public boolean isSignUpPageConfirmPasswordIconVisible() {return signUpPageConfirmPasswordIcon.isVisible();}
    public boolean isSignUpPageConfirmPasswordSubtextVisible() {return signUpPageConfirmPasswordSubtext.isVisible();}
    public boolean isSignUpPageConfirmPasswordInputFieldVisible() {return signUpPageConfirmPasswordInputField.isVisible();}
    public boolean isSignUpPageViewConfirmPasswordBtnVisible() {return signUpPageViewConfirmPasswordBtn.isVisible();}
    //buttons
    public boolean isSignUpPageCreateAccountBtnVisible() {return signUpPageCreateAccountBtn.isVisible();}
    public boolean isSignUpPageHaveAccountTextVisible() {return signUpPageHaveAccountText.isVisible();}
    public boolean isSignUpPageSignUpBtnVisible() {return signUpPageSignUpBtn.isVisible();}

}