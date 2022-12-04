package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hook {

    public static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Before
    public static void openBrowser() throws InterruptedException {


        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\ajise\\AppData\\Local\\Google\\Chrome\\User Data");
        chrome_options.addArguments("--profile-directory=default");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver(chrome_options);
        driver.manage().window().maximize();
        driver.get("https://staging.cicle.app");
        Thread.sleep(5000);
        WebElement team = driver.findElement(By.xpath("//*[contains(text(),'Testing API Di Sini Lur')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickTeam = wait.until(ExpectedConditions.visibilityOf(team));
        clickTeam.click();
        Thread.sleep(3000);

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

}
