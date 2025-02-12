package org.example;

import Other.BasePage;
import Other.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Chats {
    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\drivers\\chromedriver.exe");

    }
    public static void mainFF(String[] args){

    }
    @Test(priority = 0)
    public void openRoom() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get(Constants.HOME_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(BasePage.LOGIN_BY_KEY).click();
        driver.findElement(BasePage.LOGIN_BY_KEY_SEND).sendKeys("E:\\Work\\Java\\101\\untitled\\files\\AQA user.data");
        driver.findElement(BasePage.LOGIN_BY_KEY_PASSWORD_FIELD).sendKeys(Constants.userpassword);
        driver.findElement(BasePage.LOGIN_BY_KEY_SUBMIT).click();
        WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"note\"]"));
        wait.until(d -> checkbox.isDisplayed());
        driver.findElement(BasePage.LOGIN_CHECKBOX).click();
        Thread.sleep(500);
        driver.findElement(BasePage.ROOM_PAGE).click();
        Thread.sleep(500);
        driver.findElement(BasePage.FIRST_ROOM).click();
        Thread.sleep(500);
        while (true) {
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BasePage.FIRST_ROOM));
                element.click();
            } catch (Exception e) {
                break;
            }
        }
        Thread.sleep(500);
        WebElement inputText = driver.findElement(By.xpath("//textarea[@id=\"room-input\"]"));
        inputText.sendKeys("AQA text message for test");
        driver.findElement(BasePage.CHAT_TEXT_SUBMIT_BUTTON_ROOM).click();
        Thread.sleep(500);
        WebElement textMyFirstMessage = driver.findElement(BasePage.MY_FIRST_MESSAGE);
        Assert.assertEquals(textMyFirstMessage.getText(), "AQA text message for test");
        //FF short message
        System.setProperty("webdriver.gecko.driver", "E:\\Work\\Java\\101\\untitled\\drivers\\geckodriver.exe");
//        WebDriver driverFF = new FirefoxDriver();
//        Thread.sleep(1000);
//        driverFF.get(Constants.HOME_URL);
//        driverFF.manage().window().maximize();
//        driverFF.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//        driverFF.findElement(BasePage.LOGIN_BY_KEY).click();
//        driverFF.findElement(BasePage.LOGIN_BY_KEY_SEND).sendKeys("E:\\Work\\Java\\101\\untitled\\files\\Additional AQA user.data");
//        driverFF.findElement(BasePage.LOGIN_BY_KEY_PASSWORD_FIELD).sendKeys(Constants.userpassword);
//        driverFF.findElement(BasePage.LOGIN_BY_KEY_SUBMIT).click();
//        Thread.sleep(500);
//        driverFF.findElement(BasePage.LOGIN_CHECKBOX).click();
//        driverFF.findElement(BasePage.ROOM_PAGE).click();
//        driverFF.findElement(BasePage.FIRST_ROOM).click();
//        Thread.sleep(1000);
//        driverFF.navigate().refresh();
//        driverFF.findElement(BasePage.ROOM_PAGE).click();
//        driverFF.findElement(BasePage.FIRST_ROOM).click();
//        Thread.sleep(500);
//        WebElement inputTextFF = driverFF.findElement(By.xpath("//textarea[@id=\"room-input\"]"));
//        inputTextFF.sendKeys("Additional AQA text message for test");
//        driverFF.findElement(BasePage.CHAT_TEXT_SUBMIT_BUTTON_ROOM).click();
//        Thread.sleep(500);
//        WebElement textMyFirstMessageFF = driverFF.findElement(BasePage.MY_FIRST_MESSAGE);
//        Assert.assertEquals(textMyFirstMessageFF.getText(), "Additional AQA text message for test");
        //Chrome short message edit
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_EDIT).click();
        Thread.sleep(500);
        WebElement inputTextUpdate = driver.findElement(By.xpath("//textarea[@id=\"room-edit-input\"]"));
        inputTextUpdate.sendKeys(" Updated ");
        driver.findElement(BasePage.ROOM_TEXT_SUBMIT_EDIT_BUTTON).click();
//        Thread.sleep(500);
//        WebElement textMessageUpdated = driver.findElement(BasePage.CHAT_TEXT_MESSAGE);
//        Assert.assertEquals(textMessageUpdated.getText(), "AQA text message for test updated");
//        Thread.sleep(500);
//        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
//        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
//        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
//        Thread.sleep(1000);
        //Chrome short message
//        Object[] windowHandles=driver.getWindowHandles().toArray();
//        driver.switchTo().window((String) windowHandles[0]);
//
//
//        inputText.sendKeys("Technology is advancing rapidly, shaping how we interact, work, and live. Artificial Intelligence, automation, and big data are revolutionizing industries, improving efficiency, and creating innovative solutions. Embracing these tools can unlock new opportunities, streamline processes, and drive growth.");
//        driver.findElement(BasePage.CHAT_TEXT_SUBMIT_BUTTON).click();
//        WebElement textLongMessage = driver.findElement(BasePage.CHAT_TEXT_MESSAGE);
//        Assert.assertEquals(textLongMessage.getText(), "Technology is advancing rapidly, shaping how we interact, work, and live. Artificial Intelligence, automation, and big data are revolutionizing industries, improving efficiency, and creating innovative solutions. Embracing these tools can unlock new opportunities, streamline processes, and drive growth.");

    }
}
