package tek.tdd.base;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait()  {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_TIME_IN_SECOND));
    }
}
