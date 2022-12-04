@GroupChat
Feature: Automation Group Chat Feature
  Background: User Already on Homepage Menu Staging Cicle

  @FPAS-11(PositiveCase)
  Scenario: User Success Create New Message on Group Chat
    Given User click Group Chat Menu
    When User type message on comment field "Halo saya Aji"
    And User click send button
    Then New message will be appear

  @FPAS-13(PositiveCase)
  Scenario: User Success Mention Member
    Given User click Group Chat Menu
    When User type message on comment field "@"
    And User choose the member
    And User click send button
    Then Message with mentioned member will be appear

  @FPAS-12(PositiveCase)
  Scenario: User Success Deleted Chat
    Given User click Group Chat Menu
    When User click message option
    And User click delete message
    And User confirm to delete message
    Then Message will be deleted

  @FPAS-14(PositiveCase)
  Scenario: User Success Attach a File to Group Chat
    Given User click Group Chat Menu
    When User click attach button
    And User choose the file
    Then Attachment file will be uploaded