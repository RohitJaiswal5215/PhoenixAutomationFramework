Feature: Employee Management
  As an HR Admin, I want to edit an existing employee's personal details so that the records are updated correctly.

  Scenario: Edit employee personal details
    Given HR Admin is logged into the Employee Management system
    When HR Admin searches for an employee by ID
    And HR Admin edits the personal details
    Then the updated details should be saved successfully
