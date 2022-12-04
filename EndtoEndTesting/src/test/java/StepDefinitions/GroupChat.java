package StepDefinitions;

import Base.GroupChatFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinitions.Hook.driver;

public class GroupChat {
    @Given("User click Group Chat Menu")
    public void userClickGroupChatMenu() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.clickGroupChatBtn();
    }

    @When("User type message on comment field {string}")
    public void userTypeMessageOnCommentField(String message) throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.setInputMessage(message);
    }

    @And("User click send button")
    public void userClickSendButton() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.clickSendMessageBtn();
    }

    @Then("New message will be appear")
    public void newMessageWillBeAppear() throws InterruptedException {
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        gcfunction.verifyAppearMessage();
        Thread.sleep(3000);
    }

    @When("User click message option")
    public void userClickMessageOption() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.clickMessageOption();
    }

    @And("User click delete message")
    public void userClickDeleteMessage() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.clickDeleteMessage();
    }

    @And("User confirm to delete message")
    public void userConfirmToDeleteMessage() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.setConfirmDelete();
    }

    @Then("Message will be deleted")
    public void messageWillBeDeleted() throws InterruptedException {
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(3000);
        gcfunction.verifySuccessDeletedMessage();
        Thread.sleep(3000);
    }

    @And("User choose the member")
    public void userChooseTheMember() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.clickMember();
    }

    @Then("Message with mentioned member will be appear")
    public void messageWithMentionedMemberWillBeAppear() throws InterruptedException {
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        gcfunction.verifyMentionedMember();
        Thread.sleep(3000);
    }

    @When("User click attach button")
    public void userClickAttachButton() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.clickAttachment();
    }

    @And("User choose the file")
    public void userChooseTheFile() throws InterruptedException {
        Thread.sleep(2000);
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.setAttachBtn();
        Thread.sleep(2000);
    }

    @Then("Attachment file will be uploaded")
    public void attachmentFileWillBeUploaded() throws InterruptedException {
        GroupChatFunction gcfunction = new GroupChatFunction(driver);
        Thread.sleep(2000);
        gcfunction.verifyTextSuccessUploadfile();
        Thread.sleep(5000);
    }
}
