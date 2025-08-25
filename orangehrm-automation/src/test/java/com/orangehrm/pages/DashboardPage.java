package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    // Locators
    private By pimMenu = By.xpath("//span[text()='PIM']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPIM() {
        driver.findElement(pimMenu).click();
    }

    public AddEmployeePage goToAddEmployee() {
        clickPIM();
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        return new AddEmployeePage(driver);
    }

    public EmployeeListPage goToEmployeeList() {
        clickPIM();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        return new EmployeeListPage(driver);
    }
}
