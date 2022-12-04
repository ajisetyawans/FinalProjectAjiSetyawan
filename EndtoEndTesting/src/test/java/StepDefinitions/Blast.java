package StepDefinitions;

import Base.BlastFunction;
import Base.BoardFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Blast {

    private WebDriver driver;

    public Blast() {
        super();
        this.driver=Hook.driver;
    }

    @Given("User click Blast Menu")
    public void userClickBlastMenu() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickBlastBtn();
    }

    @When("User click Create Blast")
    public void userClickCreateBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickCreateBlast();
    }

    @And("User type a title blast {string}")
    public void userTypeATitleBlast(String blastTitle) throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.setTypeTitleBlast(blastTitle);
    }

    @And("User type description blast {string}")
    public void userTypeDescriptionBlast(String blastDesc) throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.setTypeDescBlast(blastDesc);
    }

    @And("User click Publish")
    public void userClickPublish() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickPublishBlast();
    }

    @Then("New Blast will be created")
    public void newBlastWillBeCreated() throws InterruptedException {
        BlastFunction blastFunction = new BlastFunction(driver);
        blastFunction.verifyTextSuccessCreateBlast();
        Thread.sleep(3000);
    }

    @When("User click Blast Post")
    public void userClickBlastPost() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickBlastPost();
    }

    @And("User click on comment field blast")
    public void userClickOnCommentFieldBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickCommentBlast();
    }

    @And("User add comment {string} on blast")
    public void userAddCommentOnBlast(String commentBlast) throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.setTypeCommentBlast(commentBlast);
    }

    @And("User click Post Button comment blast")
    public void userClickPostButtonCommentBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickPostAddCommentBlast();
    }

    @Then("New comment will be appear on blast")
    public void newCommentWillBeAppearOnBlast() throws InterruptedException {
        BlastFunction blastFunction = new BlastFunction(driver);
        blastFunction.verifyTextSuccessAddCommentBlast();
        Thread.sleep(3000);
    }

    @And("User click Cheers Button")
    public void userClickCheersButton() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickCheersBtn();
    }

    @And("User input message cheers {string}")
    public void userInputMessageCheers(String addCheers) throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.setInputCheers(addCheers);
    }

    @And("User click checklist")
    public void userClickChecklist() throws InterruptedException {
        Thread.sleep(2000);
        BlastFunction blastFunction = new BlastFunction(driver);
        Thread.sleep(2000);
        blastFunction.clickCheckListCheers();
    }

    @Then("New Cheers will be appear")
    public void newCheersWillBeAppear() throws InterruptedException {
        BlastFunction blastFunction = new BlastFunction(driver);
        blastFunction.verifyTextSuccessAddCheers();
        Thread.sleep(3000);
    }

    @Then("Empty Blast failed to create")
    public void emptyBlastFailedToCreate() throws InterruptedException {
        BlastFunction blastFunction = new BlastFunction(driver);
        blastFunction.verifyTextFailedCreateBlast();
        Thread.sleep(3000);
    }

    @Then("Empty Cheers failed to create")
    public void emptyCheersFailedToCreate() throws InterruptedException {
        BlastFunction blastFunction = new BlastFunction(driver);
        blastFunction.verifyTextFailedCreateCheers();
        Thread.sleep(3000);
    }
}
