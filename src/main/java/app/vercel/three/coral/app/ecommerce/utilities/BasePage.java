package app.vercel.three.coral.app.ecommerce.utilities;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

import org.slf4j.*;

public class BasePage {

    protected Page page;
    public static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public BasePage(Page page) {this.page = page;}

    //wait method for elements to load
    public void waitForPageLoad(int timeoutSeconds) {
        page.waitForLoadState(LoadState.NETWORKIDLE,
                new Page.WaitForLoadStateOptions().setTimeout(timeoutSeconds));
    }

}
