package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public DashboardPage clickLogin() {
        driver.findElement(loginBtn).click();
        return new DashboardPage(driver);
    }

    public DashboardPage login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        return clickLogin();
    }
}
