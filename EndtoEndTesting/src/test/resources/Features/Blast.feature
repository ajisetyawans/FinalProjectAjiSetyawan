@Blast
Feature: Automation Blast Feature
  Background: User Already on Homepage Menu Staging Cicle

  @FPAS-6(PositiveCase)
  Scenario: User Success Create Blast
    Given User click Blast Menu
    When User click Create Blast
    And User type a title blast "Final Project Aji"
    And User type description blast "Deskripsinya Gak Ada"
    And User click Publish
    Then New Blast will be created

  @FPAS-7(PositiveCase)
  Scenario: User Success Add Comment on Blast
    Given User click Blast Menu
    When User click Blast Post
    And User click on comment field blast
    And User add comment "wish me luck" on blast
    And User click Post Button comment blast
    Then New comment will be appear on blast

  @FPAS-8(PositiveCase)
  Scenario: User Success Add Cheers
    Given User click Blast Menu
    When User click Blast Post
    And User click Cheers Button
    And User input message cheers "yuhuu"
    And User click checklist
    Then New Cheers will be appear

  @FPAS-9(NegativeCase)
  Scenario: User Failed to Create Empty Blast
    Given User click Blast Menu
    When User click Create Blast
    And User click Publish
    Then Empty Blast failed to create

  @FPAS-10(NegativeCase)
  Scenario: User Failed to Create Empty Cheers
    Given User click Blast Menu
    When User click Blast Post
    And User click Cheers Button
    And User click checklist
    Then Empty Cheers failed to create
