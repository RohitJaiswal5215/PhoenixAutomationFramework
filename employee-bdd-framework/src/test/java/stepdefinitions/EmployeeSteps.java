package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import java.time.Duration;

public class EmployeeSteps {

    WebDriver driver;

    @Given("HR Admin is logged into the Employee Management system")
    public void hr_admin_is_logged_into_the_employee_management_system() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
   
    @When("HR Admin searches for an employee by ID")
    public void hr_admin_searches_for_an_employee_by_id() {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("empsearch_id")).sendKeys("0001");
        driver.findElement(By.id("searchBtn")).click();
    }

    @When("HR Admin edits the personal details")
    public void hr_admin_edits_the_personal_details() {
        driver.findElement(By.linkText("0001")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("John");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Doe");
        driver.findElement(By.id("btnSave")).click();
    }

    @Then("the updated details should be saved successfully")
    public void the_updated_details_should_be_saved_successfully() {
        boolean isDisabled = driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("disabled") != null;
        if (isDisabled) {
            System.out.println("Employee details updated successfully!");
        } else {
            System.out.println("Employee update failed!");
        }
        driver.quit();
    }
}
