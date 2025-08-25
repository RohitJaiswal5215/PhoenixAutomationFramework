package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage {
    private WebDriver driver;

    private By searchBox = By.xpath("//label[text()='Employee Name']/../following-sibling::div//input");
    private By searchBtn = By.xpath("//button[@type='submit']");
    private By employeeNameResult = By.xpath("(//div[@role='row'])[2]//div[3]");

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchEmployee(String name) {
        driver.findElement(searchBox).sendKeys(name);
        driver.findElement(searchBtn).click();
    }

    public String getEmployeeNameFromList() {
        return driver.findElement(employeeNameResult).getText();
    }
}
