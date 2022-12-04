package Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static StepDefinitions.Hook.driver;

public class GroupChatFunction {

    public GroupChatFunction(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


// Create New Message

    @FindBy(xpath = "//*[@id='root']/div[3]/div[1]/div[1]/a/div/div/h1['Group Chat']")
    private WebElement groupChatBtn;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    private WebElement inputMessage;

    @FindBy(xpath = "//div[@class='MainGroupChatSection_create__2hsB_']/div/div[3]/div")
    private WebElement sendMessageBtn;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]/div/div/div/div[2]/div/p")
    private WebElement appearMessage;

// Deleted Message

    @FindBy(css = ".Message_container__3maDl:nth-child(1) [class='Message_balloonMessage__3dmkS']")
    private WebElement messageHover;

    @FindBy(css = ".Message_container__3maDl:nth-child(1) [data-testid='ExpandMoreOutlinedIcon']")
    private WebElement messageOption;

    @FindBy(xpath = "//body/div[@id='root']/div[@class='GroupChatPage_container__2cpwQ']" +
            "/div[@class='MainGroupChatSection_container__3-P_S']/div[@class='MainGroupChatSection_dropzone__1nSfG'" +
            "]/div[@class='MainGroupChatSection_box__1a2DO']/div[@class='MainGroupChatSection_messages__1wQ0n']" +
            "/div[@class='OverlayButton_container__3kxDV']/div[@class='OverlayButton_box__2jFLd']" +
            "/div[@id='list-groupChat-messages-section']/div[@class='infinite-scroll-component__outerdiv']" +
            "/div[contains(@class,'infinite-scroll-component')]/div[1]/div[1]/div[1]/div[1]/div[1]//*[name()='svg']")
    private WebElement optionMessage;

    @FindBy(xpath = "//div[@class='MessageMenuPopUp_menu__1rkRG']/p")
    private WebElement deleteMessage;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement confirmDelete;

    @FindBy(xpath = "//*[contains(text(),'Delete group chat message success')]")
    private WebElement textSuccessDeletedMessage;

// Mention Member

    @FindBy(xpath = "//div[@class='tribute-container']/ul/li[2]")
    private WebElement member;

    @FindBy(id = "mentioned-user")
    private WebElement mentionedMessage;

// Upload attachment

    @FindBy(xpath = "//div[@class='AttachFileContainer_container__3U9Wh']")
    private WebElement attachBtn;

    @FindBy(xpath = "//div[@class='AttachFileContainer_container__3U9Wh']/input")
    private WebElement chooseFile;

    @FindBy(name = "Open")
    private WebElement openFile;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessUploadFile;



// Create New Message Method

    public void clickGroupChatBtn() {
        WebElement clickGroupChat = wait.until(ExpectedConditions.visibilityOf(groupChatBtn));
        clickGroupChat.click();
    }

    public void setInputMessage(String message) {
        WebElement typeMessage = wait.until(ExpectedConditions.visibilityOf(inputMessage));
        typeMessage.sendKeys(message);
    }

    public void clickSendMessageBtn() {
        WebElement sendMessage = wait.until(ExpectedConditions.visibilityOf(sendMessageBtn));
        sendMessage.click();
    }

    public void verifyAppearMessage() {
        WebElement validationMessage = wait.until(ExpectedConditions.visibilityOf(appearMessage));
        validationMessage.getText();
    }

// Deleted Message Method

    public void clickMessageOption() {
        Actions action = new Actions(driver);
        action.moveToElement(messageHover).perform();
        messageOption.click();
    }

    public void clickDeleteMessage() {
        WebElement messageDelete = wait.until(ExpectedConditions.visibilityOf(deleteMessage));
        messageDelete.click();
    }

    public void setConfirmDelete() {
        WebElement confirmDelMessage = wait.until(ExpectedConditions.visibilityOf(confirmDelete));
        confirmDelMessage.click();
    }

    public void verifySuccessDeletedMessage() {
        WebElement textSuccessDelete = wait.until(ExpectedConditions.visibilityOf(textSuccessDeletedMessage));
        Assert.assertEquals("Delete group chat message success", textSuccessDeletedMessage.getText());
        textSuccessDelete.getText();
    }

// Mention Member Method

    public void clickMember() {
        WebElement memberClick = wait.until(ExpectedConditions.visibilityOf(member));
        memberClick.click();
    }

    public void verifyMentionedMember() {
        WebElement mentionMember = wait.until(ExpectedConditions.visibilityOf(mentionedMessage));
        mentionMember.equals(mentionedMessage);
    }

// Upload attachment method

    public void clickAttachment() {
        WebElement clickAttachBtn = wait.until(ExpectedConditions.visibilityOf(attachBtn));
        clickAttachBtn.click();
    }

    public void setAttachBtn() {
        chooseFile.sendKeys("C:\\pemandangan.jpg");
    }

    public void verifyTextSuccessUploadfile() {
        WebElement validationText = wait.until(ExpectedConditions.visibilityOf(textSuccessUploadFile));
        Assert.assertEquals("Upload attachments is success", textSuccessUploadFile.getText());
        validationText.getText();
    }

}
