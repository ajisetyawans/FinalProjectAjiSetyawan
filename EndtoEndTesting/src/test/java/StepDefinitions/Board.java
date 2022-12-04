package StepDefinitions;

import Base.BoardFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Board {

    private WebDriver driver;

    public Board() {
        super();
        this.driver=Hook.driver;
    }

    @Given("User click Board Menu")
    public void userClickBoardMenu() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickBoardBtn();
    }

    @When("User add new list")
    public void userAddNewList() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickListBtn();
    }

    @And("User input list name {string}")
    public void userInputListName(String listName) throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.setInputListName(listName);
    }

    @And("User Click Create")
    public void userClickCreate() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickCreateListBtn();
    }

    @Then("New List will be created")
    public void newListWillBeCreated() {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifySuccessCreateList();
    }

    @When("User Click Add Card On The List")
    public void userClickAddCardOnTheList() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickAddCard();
    }

    @And("User Input Card Name{string}")
    public void userInputCardName(String namecard) throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.setInputCardName(namecard);
    }

    @And("User Click Add Card Button")
    public void userClickAddCardButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickAddCardButton();
    }

    @Then("New Card will be created")
    public void newCardWillBeCreated() {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifySuccessAddCard();
    }

    @When("User click card")
    public void userClickCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickCard();
    }

    @And("User click on comment field")
    public void userClickOnCommentField() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickCommentField();
    }

    @And("User add comment{string}")
    public void userAddComment(String comments) throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.setInputComment(comments);
    }

    @And("User click Post Button")
    public void userClickPostButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickPostButton();
    }

    @Then("New comment will be showed")
    public void newCommentWillBeShowed() {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifySuccessAddComment();
    }

    @When("User click edit button on card")
    public void userClickEditButtonOnCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickEditCard();
    }

    @And("User click Change Name")
    public void userClickChangeName() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickChangeName();
    }

    @And("User rename card to{string}")
    public void userRenameCardTo(String cardrename) throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clearFieldRename();
        Thread.sleep(2000);
        boardFunction.setFieldRenameCard(cardrename);
    }

    @And("User click save button")
    public void userClickSaveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(2000);
        boardFunction.clickSaveRenameCard();
    }

    @Then("Rename card successfully")
    public void renameCardSuccessfully() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifyTextSuccessRenameCard();
        Thread.sleep(3000);
    }

    @And("User click edit on current comment and clear the comment")
    public void userClickEditOnCurrentCommentAndClearTheComment() throws InterruptedException {
        Thread.sleep(1000);
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.click3PointComment();
        Thread.sleep(1000);
        boardFunction.clickEditButtonComment();
    }

    @Then("User Failed to Comment with Empty Input Value")
    public void userFailedToCommentWithEmptyInputValue() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifyCurrentCommentText();
        Thread.sleep(3000);
    }


    @And("User click Move Card")
    public void userClickMoveCard() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.clickMoveCard();
        Thread.sleep(1000);
    }

    @And("User select list destination")
    public void userSelectListDestination() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.clickSelectList();
        Thread.sleep(1000);
    }

    @And("User select position card")
    public void userSelectPositionCard() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.clickSelectPosition();
        Thread.sleep(1000);
    }

    @And("User click Move")
    public void userClickMove() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.clickMoveButton();
        Thread.sleep(1000);
    }

    @Then("Card has been moved to new list")
    public void cardHasBeenMovedToNewList() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifyTextSuccessMovedCard();
        Thread.sleep(3000);
    }

    @When("User click Name List")
    public void userClickNameList() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.clickListTitle();
        Thread.sleep(1000);
    }

    @And("User rename list {string}")
    public void userRenameList(String listrename) throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.setFieldRenameList(listrename);
        Thread.sleep(1000);
    }

    @And("User click enter")
    public void userClickEnter() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        Thread.sleep(1000);
        boardFunction.enter();
        Thread.sleep(1000);
    }

    @Then("List successfully renamed")
    public void listSuccessfullyRenamed() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(driver);
        boardFunction.verifyTextSuccessUpdateList();
        Thread.sleep(3000);
    }
}
