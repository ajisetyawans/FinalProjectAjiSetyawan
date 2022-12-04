package Base;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.description.type.TypeDescription;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hook.driver;

public class BoardFunction {

    public BoardFunction(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

// Add List
    @FindBy(xpath = "//*[@id='root']/div[3]/div[2]/div[1]/a/div")
    private WebElement boardBtn;

    @FindBy(xpath = "//*[contains(text(),'Add List')]")
    private WebElement addListBtn;

    @FindBy(xpath = "//input[@placeholder='Input list name...']")
    private WebElement inputListName;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement createListBtn;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessCreateList;

// Add Card
    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]/div/div/div[4]/a")
    private WebElement addCard;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[@class='List_List__30q9z']" +
            "[last()]/div/div/div[4]/a")
    private WebElement addCardLastList;

    @FindBy(css = "input[placeholder='Card name']")
    private WebElement inputCardName;

    @FindBy(css = "div[class='Button_container__1WNuB']")
    private WebElement addCardButton;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessAddCard;


// Add Comment Card
    @FindBy(xpath = "//*[@id='listcard_content-0']/div[1]/div/div/a")
    private WebElement card1;

    @FindBy(css = "[placeholder='Add new comment...']")
    private WebElement commentField;

    @FindBy(xpath = "//div[@class='fr-element fr-view']//p")
    private WebElement inputComment;

    @FindBy(xpath = "//h1[.='Post']")
    private WebElement postButton;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessAddComment;


// Rename Card
    @FindBy(xpath = "//div[@id='listcard_content-0']/div/div/div[1]/div[1]")
    private WebElement editCardButton;

    @FindBy(xpath = "//p[@id='editCardMenuButton__Name__text']")
    private WebElement changeName;

    @FindBy(xpath = "//input[@class='ChangeNameForm_teamName__VbXNI form-control']")
    private WebElement fieldRenameCard;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement saveButtonRenameCard;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessRenameCard;

// Rename Empty Comment

    @FindBy(xpath = "//div[@class='More_container__2VGML']")
    private WebElement point3EditComment;

    @FindBy(xpath = "//*[contains(text(),'Edit')]")
    private WebElement editCommentButton;

    @FindBy(xpath = "//div[@class='CommentItem_commentTextContainer__8Gd1V']/div/p")
    private WebElement currentCommentText;

// Move Card

    @FindBy(id = "editCardMenuButton__Move__text")
    private WebElement moveCard;

    @FindBy(xpath = "//div[@class='ManageMoveCard_listSection__2sf4E']/div[1]/a")
    private WebElement list;

    @FindBy(xpath = "//div[@class='ListNameOption_mainSection__3QQi6']/div/div/div[3]/a")
    private WebElement selectedList;

    @FindBy(xpath = "//div[@class='ManageMoveCard_listSection__listPosition__1IK-_']/a")
    private WebElement position;

    @FindBy(xpath = "//div[@class='ListPositionOption_mainSection__3ojOe']/div[last()]")
    private WebElement selectedPosition;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']/div")
    private WebElement moveBtn;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessMovedCard;

// Rename List

    @FindBy(css = "[class='List_List__30q9z']:nth-child(1) [class='ListContainer_headerSection__title__text__36H_r']")
    private WebElement fieldRenameList;

    @FindBy(css = "[class='List_List__30q9z']:nth-child(1) [class='form-control']")
    private WebElement renameListTitle;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessUpdateList;



                    //-------------------------------METHOD-------------------------------\\


// Add List Method
    public void clickBoardBtn(){
        WebElement clickBoardBtn = wait.until(ExpectedConditions.visibilityOf(boardBtn));
        clickBoardBtn.click();
    }

    public void clickListBtn(){
        WebElement clickListBtn = wait.until(ExpectedConditions.visibilityOf(addListBtn));
        clickListBtn.click();
    }

    public void setInputListName(String listName){
        WebElement typeListName = wait.until(ExpectedConditions.visibilityOf(inputListName));
        typeListName.sendKeys(listName);
    }

    public void clickCreateListBtn(){
        WebElement clickCreateListBtn = wait.until(ExpectedConditions.visibilityOf(createListBtn));
        clickCreateListBtn.click();
    }

    public void verifySuccessCreateList(){
        WebElement validationTextCreateList = wait.until(ExpectedConditions.visibilityOf(textSuccessCreateList));
        Assert.assertEquals("Creating list is success",textSuccessCreateList.getText());
        validationTextCreateList.getText();
    }


// Add Card Method
    public void clickAddCard() {
        WebElement clickAddCard = wait.until(ExpectedConditions.visibilityOf(addCard));
        clickAddCard.click();
    }

    public void setInputCardName(String namecard) {
        WebElement typeCardName = wait.until(ExpectedConditions.visibilityOf(inputCardName));
        typeCardName.sendKeys(namecard);
    }

    public void clickAddCardButton() {

        WebElement clickAddCardBtn = wait.until(ExpectedConditions.visibilityOf(addCardButton));
        clickAddCardBtn.click();
    }

    public void verifySuccessAddCard() {
        WebElement validationTextAddCard = wait.until(ExpectedConditions.visibilityOf(textSuccessAddCard));
        Assert.assertEquals("Creating card is success",textSuccessAddCard.getText());
        validationTextAddCard.getText();
    }


// Add Comment Card Method
    public void clickCard() {
        WebElement clickCard = wait.until(ExpectedConditions.visibilityOf(card1));
        clickCard.click();
    }

    public void clickCommentField() {
        WebElement clickCommentField = wait.until(ExpectedConditions.visibilityOf(commentField));
        clickCommentField.click();
    }

    public void setInputComment(String comments) {

        WebElement typeComment = wait.until(ExpectedConditions.visibilityOf(inputComment));
        typeComment.sendKeys(comments);
    }

    public void clickPostButton() {
        WebElement clickPostBtn = wait.until(ExpectedConditions.visibilityOf(postButton));
        clickPostBtn.click();
    }

    public void verifySuccessAddComment() {
        WebElement validationTextAddComment = wait.until(ExpectedConditions.visibilityOf(textSuccessAddComment));
        Assert.assertEquals("Create comment is success",textSuccessAddComment.getText());
        validationTextAddComment.getText();
    }


// Rename Card Method
    public void clickEditCard() {
        WebElement clickEditCard = wait.until(ExpectedConditions.visibilityOf(editCardButton));
        clickEditCard.click();
    }

    public void clickChangeName() {
        WebElement clickChangeName = wait.until(ExpectedConditions.visibilityOf(changeName));
        clickChangeName.click();
    }

    public void clearFieldRename() {

        WebElement clearFieldRename = wait.until(ExpectedConditions.visibilityOf(fieldRenameCard));
        clearFieldRename.clear();
    }

    public void setFieldRenameCard(String cardrename) {

        WebElement inputRename = wait.until(ExpectedConditions.visibilityOf(fieldRenameCard));
        inputRename.sendKeys(cardrename);
    }

    public void clickSaveRenameCard() {

        WebElement clickSaveRename = wait.until(ExpectedConditions.visibilityOf(saveButtonRenameCard));
        clickSaveRename.click();
    }

    public void verifyTextSuccessRenameCard() {
        WebElement validationTextRenameCard = wait.until(ExpectedConditions.visibilityOf(textSuccessRenameCard));
        Assert.assertEquals("Update card is success",textSuccessRenameCard.getText());
        validationTextRenameCard.getText();
    }

// Rename Empty Comment Method
    public void click3PointComment() {
        WebElement click3Point = wait.until(ExpectedConditions.visibilityOf(point3EditComment));
        click3Point.click();
    }

    public void clickEditButtonComment() {
        WebElement editCommentBtn = wait.until(ExpectedConditions.visibilityOf(editCommentButton));
        editCommentBtn.click();

        WebElement clearComment = wait.until(ExpectedConditions.visibilityOf(inputComment));
        clearComment.clear();
    }

    public void verifyCurrentCommentText() {
        WebElement validationTextRenameCard = wait.until(ExpectedConditions.visibilityOf(currentCommentText));
        Assert.assertEquals("Hala Madrid",currentCommentText.getText());
        validationTextRenameCard.getText();
    }

// Move Card Method

    public void clickMoveCard() {
        WebElement movecard = wait.until(ExpectedConditions.visibilityOf(moveCard));
        movecard.click();
    }

    public void clickSelectList() {
        WebElement selectlist = wait.until(ExpectedConditions.visibilityOf(list));
        selectlist.click();

        WebElement selectedlist = wait.until(ExpectedConditions.visibilityOf(selectedList));
        selectedlist.click();
    }

    public void clickSelectPosition() {
        WebElement positions = wait.until(ExpectedConditions.visibilityOf(position));
        positions.click();

        WebElement selectedpositions = wait.until(ExpectedConditions.visibilityOf(selectedPosition));
        selectedpositions.click();
    }

    public void clickMoveButton() {
        WebElement movebtn = wait.until(ExpectedConditions.visibilityOf(moveBtn));
        movebtn.click();
    }

    public void verifyTextSuccessMovedCard() {
        WebElement validations = wait.until(ExpectedConditions.visibilityOf(textSuccessMovedCard));
        Assert.assertEquals("Success!", textSuccessMovedCard.getText());
        validations.getText();
    }

// Rename List Method

    public void clickListTitle() {
        WebElement titleList = wait.until(ExpectedConditions.visibilityOf(fieldRenameList));
        titleList.click();
    }

    public void setFieldRenameList(String listrename) {
        WebElement renameList = wait.until(ExpectedConditions.visibilityOf(renameListTitle));
        renameList.clear();
        renameList.sendKeys(listrename);
    }

    public void enter() {
        WebElement enterlist = wait.until(ExpectedConditions.visibilityOf(renameListTitle));
        enterlist.sendKeys(Keys.ENTER);
    }

    public void verifyTextSuccessUpdateList() {
        WebElement validationsrename = wait.until(ExpectedConditions.visibilityOf(textSuccessUpdateList));
        Assert.assertEquals("Update list is success", textSuccessUpdateList.getText());
        validationsrename.getText();
    }


}
