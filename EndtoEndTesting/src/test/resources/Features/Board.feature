@Board
Feature: Automation Board Feature Including Card And List
  Background: User Already on Homepage Menu Staging Cicle

  @FPAS-1(PositiveCase)
  Scenario: User Success Create List
    Given User click Board Menu
    When User add new list
    And User input list name "Board Final Project"
    And User Click Create
    Then New List will be created

  @FPAS-2(PositiveCase)
  Scenario: User Success Add Card
    Given User click Board Menu
    When User Click Add Card On The List
    And User Input Card Name"First Card"
    And User Click Add Card Button
    Then New Card will be created

  @FPAS-3(PositiveCase)
  Scenario: User Success Add Comment
    Given User click Board Menu
    When User click card
    And User click on comment field
    And User add comment"Hala Madrid"
    And User click Post Button
    Then New comment will be showed

  @FPAS-4(PositiveCase)
  Scenario: User Success Rename Card
    Given User click Board Menu
    When User click edit button on card
    And User click Change Name
    And User rename card to"Debit Card"
    And User click save button
    Then Rename card successfully

  @FPAS-5(NegativeCase)
  Scenario: User Cannot Rename Current Comment with Empty Input
    Given User click Board Menu
    When User click card
    And User click edit on current comment and clear the comment
    And User click Post Button
    Then User Failed to Comment with Empty Input Value

  @FPAS-15(PositiveCase)
  Scenario: User Success Move Card to Other List
    Given User click Board Menu
    When User click edit button on card
    And User click Move Card
    And User select list destination
    And User select position card
    And User click Move
    Then Card has been moved to new list

  @FPAS-16(PositiveCase)
  Scenario: User Success Rename List
    Given User click Board Menu
    When User click Name List
    And User rename list "This list has been renamed"
    And User click enter
    Then List successfully renamed