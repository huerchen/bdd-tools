package ua.com.mcgray.bdd.tools.pages;

import org.openqa.selenium.WebDriver;

/**
 * @author orezchykov
 * @since 01.03.13
 */
public class Page {

    private WebDriver webDriver;

    public Page(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}