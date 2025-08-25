package com.orangehrm.tests;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.EmployeeListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest extends BaseTest {

    @Test
    public void testAddEmployeeAndVerify() {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboard = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

        // Add Employee
        AddEmployeePage addEmployeePage = dashboard.goToAddEmployee();
        EmployeeListPage employeeListPage = addEmployeePage.addEmployee("John", "Doe");

        // Search Employee
        employeeListPage = dashboard.goToEmployeeList();
        employeeListPage.searchEmployee("John Doe");

        Assert.assertEquals(employeeListPage.getEmployeeNameFromList(), "John Doe", "Employee not found!");
    }
}
