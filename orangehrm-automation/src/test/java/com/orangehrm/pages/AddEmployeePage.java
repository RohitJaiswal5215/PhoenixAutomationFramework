package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
    private WebDriver driver;

    // Locators
    private By firstName = By.name("firstName");
    private By lastName = By.name("lastName");
    private By saveBtn = By.xpath("//button[@type='submit']");

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public EmployeeListPage clickSave() {
        driver.findElement(saveBtn).click();
        return new EmployeeListPage(driver);
    }

    public EmployeeListPage addEmployee(String fName, String lName) {
        enterFirstName(fName);
        enterLastName(lName);
        return clickSave();
    }
}
