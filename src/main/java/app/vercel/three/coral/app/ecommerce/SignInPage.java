package app.vercel.three.coral.app.ecommerce;

import app.vercel.three.coral.app.ecommerce.utilities.BasePage;
import app.vercel.three.coral.app.ecommerce.SignUpPage;
import com.microsoft.playwright.*;

public class SignInPage extends BasePage {

    //sign in page web elements
    private Locator signInPageIcon;
    private Locator signInPageTitle;
    private Locator signInPageSubtitle;
    //input form
    private Locator signInPageEmailIcon;
    private Locator signInPageEmailSubtext;
    private Locator signInPageEmailInputField;
    private Locator signInPagePasswordIcon;
    private Locator signInPagePasswordSubtext;
    private Locator signInPagePasswordInputField;
    private Locator signInPageViewPasswordBtn;
    //buttons
    private Locator signInPageSignInBtn;
    private Locator signInPageCreateAccountText;
    private Locator signInPageCreateNewAccountBtn;
    //invalid singular input error
    private Locator signInPageInvalidSingularInputError;

    //valid login input data
    private String loginEmail;
    private String loginPassword;

    public SignInPage(Page page) {
        super(page);

        signInPageIcon = page.locator("//div[@class='MuiBox-root css-6acnen']");
        signInPageTitle = page.locator("//h1[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-1b3up7u']");
        signInPageSubtitle = page.locator("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter css-1ytmhd']");
        //input form
        signInPageEmailIcon = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][1]//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signInPageEmailSubtext = page.locator("//label[@id='email-label']");
        signInPageEmailInputField = page.locator("//input[@id='email']");
        signInPagePasswordIcon = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][2]//div[@class='MuiInputAdornment-root MuiInputAdornment-positionStart MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1f6kg7i']");
        signInPagePasswordSubtext = page.locator("//label[@id='password-label']");
        signInPagePasswordInputField = page.locator("//input[@id='password']");
        signInPageViewPasswordBtn = page.locator("//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-lykdrp'][2]//button[@aria-label='toggle password visibility']");
        //buttons
        signInPageSignInBtn = page.locator("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary MuiButton-fullWidth css-4exh2o']");
        signInPageCreateAccountText = page.locator("//span[@class='MuiDivider-wrapper css-163llxe']");
        signInPageCreateNewAccountBtn = page.locator("//div[@class='MuiBox-root css-xi606m']/a");
        //invalid singular input error
        signInPageInvalidSingularInputError = page.locator("//div[@role='alert']");

    }

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

    //click "View password" button method
    public void clickSignInViewPasswordBtn() {signInPageViewPasswordBtn.click();}

    //click "Sign in" button method
    public void clickSignInBtn() {signInPageSignInBtn.click();}

    //sign in page text element getters
    public String getSignInPageTitle() {return signInPageTitle.innerText();}
    public String getSignInPageSubtitle() {return signInPageSubtitle.innerText();}
    //input form
    public String getSignInPageEmailSubtext() {return signInPageEmailSubtext.innerText();}
    public String getSignInPagePasswordSubtext() {return signInPagePasswordSubtext.innerText();}
    //buttons
    public String getSignInPageSignInBtnText() {return signInPageSignInBtn.innerText();}
    public String getSignInPageCreateAccountText() {return signInPageCreateAccountText.innerText();}
    public String getSignInPageCreateNewAccountBtnText() {return signInPageCreateNewAccountBtn.innerText();}

    //invalid singular input error getter
    public String getSignInPageInvalidSingularInputErrorMsg() {return signInPageInvalidSingularInputError.innerText();}

    //sign in page web element assert methods
    public boolean isSignInPageIconVisible() {return signInPageIcon.isVisible();}
    public boolean isSignInPageTitleVisible() {return signInPageTitle.isVisible();}
    public boolean isSignInPageSubtitleVisible() {return signInPageSubtitle.isVisible();}
    //input form
    public boolean isSignInPageEmailIconVisible() {return signInPageEmailIcon.isVisible();}
    public boolean isSignInPageEmailSubtextVisible() {return signInPageEmailSubtext.isVisible();}
    public boolean isSignInPageEmailInputFieldVisible() {return signInPageEmailInputField.isVisible();}
    public boolean isSignInPagePasswordIconVisible() {return signInPagePasswordIcon.isVisible();}
    public boolean isSignInPagePasswordSubtextVisible() {return signInPagePasswordSubtext.isVisible();}
    public boolean isSignInPagePasswordInputFieldVisible() {return signInPagePasswordInputField.isVisible();}
    public boolean isSignInPageViewPasswordBtnVisible() {return signInPageViewPasswordBtn.isVisible();}
    //buttons
    public boolean isSignInPageSignInBtnVisible() {return signInPageSignInBtn.isVisible();}
    public boolean isSignInPageCreateAccountTextVisible() {return signInPageCreateAccountText.isVisible();}
    public boolean isSignInPageCreateNewAccountBtnVisible() {return signInPageCreateNewAccountBtn.isVisible();}

}
