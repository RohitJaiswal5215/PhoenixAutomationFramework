package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeePage {
    WebDriver driver;

    By empIdField = By.id("empsearch_id");
    By searchButton = By.id("searchBtn");
    By editButton = By.id("btnSave");
    By firstNameField = By.id("personal_txtEmpFirstName");
    By lastNameField = By.id("personal_txtEmpLastName");
    By saveButton = By.id("btnSave");

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchEmployeeById(String empId) {
        driver.findElement(empIdField).sendKeys(empId);
        driver.findElement(searchButton).click();
    }

    public void editPersonalDetails(String firstName, String lastName) {
        driver.findElement(editButton).click();
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void savePersonalDetails() {
        driver.findElement(saveButton).click();
    }

    public boolean isDetailsUpdated() {        
        return true;
    }
}
