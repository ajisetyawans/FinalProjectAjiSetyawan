package Base;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hook.driver;

public class BlastFunction {

    public BlastFunction(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

// Create New Blast

    @FindBy(xpath = "//*[@id='root']/div[3]/div/div[2]/a/div/div[1]/h1['Blast']")
    private WebElement blastBtn;

    @FindBy(css = "div[class='GlobalActionButton_text__31ND7']")
    private WebElement createBlastBtn;

    @FindBy(css = "[placeholder='Type a title...']")
    private WebElement typeTitleBlast;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p")
    private WebElement typeDescBlast;

    @FindBy(xpath = "//*[contains(text(),'Publish')]")
    private WebElement publishBlast;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessCreateBlast;

// Add New Comment on Blast

    @FindBy(xpath = "//*[@id='root']/div[3]/div[2]/div/div/div/div/div/div[1]")
    private WebElement blast1;

    @FindBy(css = "[placeholder='Add new comment...']")
    private WebElement fieldCommentBlast;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p")
    private WebElement typeCommentBlast;

    @FindBy(xpath = "//div[@class='Main_iconText__f-xVC Main_iconDefault__3fDo9 Main_iconPositionStart__IWQqT']/h1")
    private  WebElement postButtonAddCommentBlast;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessAddCommentBlast;

// Add New Cheers

    @FindBy(css = ".PostBlastPage_cheersSection__1pXFk .CheersButton_buttonCheers__2mJix")
    private WebElement cheersBtn;

    @FindBy(css = "[placeholder=\"Give'em cheers!\"]")
    private WebElement inputCheers;

    @FindBy(css = "div[class='CheersButton_action__1NBRj'] :nth-child(2)")
    private WebElement checklistCheers;

    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessAddCheers;

// Create Empty Blast

    @FindBy(id = "notistack-snackbar")
    private WebElement textFailedCreateBlast;

// Create Empty Cheers

    @FindBy(id = "notistack-snackbar")
    private WebElement textFailedCreateCheers;


// Create Blast Method

    public void clickBlastBtn() {
        WebElement clickBlastBtn = wait.until(ExpectedConditions.visibilityOf(blastBtn));
        clickBlastBtn.click();
    }

    public void clickCreateBlast() {
        WebElement clickCreateBlastBtn = wait.until(ExpectedConditions.visibilityOf(createBlastBtn));
        clickCreateBlastBtn.click();
    }

    public void setTypeTitleBlast(String blastTitle) {
        WebElement inputTitleBlast = wait.until(ExpectedConditions.visibilityOf(typeTitleBlast));
        inputTitleBlast.sendKeys(blastTitle);
    }

    public void setTypeDescBlast(String blastDesc) {
        WebElement inputBlastDesc = wait.until(ExpectedConditions.visibilityOf(typeDescBlast));
        inputBlastDesc.sendKeys(blastDesc);
    }

    public void clickPublishBlast() {
        WebElement clickPublishBlastBtn = wait.until(ExpectedConditions.visibilityOf(publishBlast));
        clickPublishBlastBtn.click();
    }

    public void verifyTextSuccessCreateBlast() {
        WebElement validationTextSuccessCreateBlast = wait.until(ExpectedConditions.visibilityOf(textSuccessCreateBlast));
        Assert.assertEquals("Create post successful",textSuccessCreateBlast.getText());
        validationTextSuccessCreateBlast.getText();
    }

// Add New Comment on Blast Method

    public void clickBlastPost() {
        WebElement clickBlastPost = wait.until(ExpectedConditions.visibilityOf(blast1));
        clickBlastPost.click();
    }

    public void clickCommentBlast() {

        WebElement clickFieldComment = wait.until(ExpectedConditions.visibilityOf(fieldCommentBlast));
        clickFieldComment.click();
    }

    public void setTypeCommentBlast(String blastComment) {

        WebElement inputCommentBlast = wait.until(ExpectedConditions.visibilityOf(typeCommentBlast));
        inputCommentBlast.sendKeys(blastComment);
    }

    public void clickPostAddCommentBlast() {

        WebElement clickPostComment = wait.until(ExpectedConditions.visibilityOf(postButtonAddCommentBlast));
        clickPostComment.click();
    }

    public void verifyTextSuccessAddCommentBlast() {
        WebElement validationTextSuccessAddCommentBlast = wait.until(ExpectedConditions.visibilityOf(textSuccessAddCommentBlast));
        Assert.assertEquals("Create comment on blast post successful",textSuccessAddCommentBlast.getText());
        validationTextSuccessAddCommentBlast.getText();
    }

// Add New Cheers Method

    public void clickCheersBtn() {
        WebElement clickCheers = wait.until(ExpectedConditions.visibilityOf(cheersBtn));
        clickCheers.click();
    }

    public void setInputCheers(String addCheers) {
        WebElement typeCheers = wait.until(ExpectedConditions.visibilityOf(inputCheers));
        typeCheers.sendKeys(addCheers);
    }

    public void clickCheckListCheers() {
        WebElement checkCheers = wait.until(ExpectedConditions.visibilityOf(checklistCheers));
        checkCheers.click();
    }

    public void verifyTextSuccessAddCheers() {
        WebElement validationCheckList = wait.until(ExpectedConditions.visibilityOf(textSuccessAddCheers));
        Assert.assertEquals("Create cheers on post successful",textSuccessAddCheers.getText());
        validationCheckList.getText();
    }

// Create Empty Blast Method

    public void verifyTextFailedCreateBlast() {
        WebElement validationFailedCreateBlast = wait.until(ExpectedConditions.visibilityOf(textFailedCreateBlast));
        Assert.assertEquals("Field parameter not complete.",textFailedCreateBlast.getText());
        validationFailedCreateBlast.getText();
    }

// Create Empty Cheers Method

    public void verifyTextFailedCreateCheers() {
        WebElement validationFailedCreateCheers = wait.until(ExpectedConditions.visibilityOf(textFailedCreateCheers));
        Assert.assertEquals("Cheer cannot be empty",textFailedCreateCheers.getText());
        validationFailedCreateCheers.getText();
    }
}
