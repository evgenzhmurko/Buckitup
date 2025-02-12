package org.example;
import Other.BasePage;
import Other.Constants;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Date;


public class Login {
    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\drivers\\chromedriver.exe");
       }
@Test (priority = 0)
        public void elementsCheck(){
    WebDriver driver = new ChromeDriver();
    driver.get(Constants.HOME_URL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    Assert.assertTrue(driver.findElement(BasePage.LOGO).isDisplayed());
    Assert.assertTrue(driver.findElement(BasePage.LOGIN_HEADER).isDisplayed());
    WebElement login_header =driver.findElement(BasePage.LOGIN_HEADER);
    Assert.assertEquals(login_header.getText(),"Log In");
    driver.close();
        }
@Test (priority =1)
    public void loginQR(){
    WebDriver driver = new ChromeDriver();
    Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(3));
    driver.get(Constants.HOME_URL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    driver.findElement(BasePage.LOGIN_BY_QR).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    Assert.assertTrue(driver.findElement(BasePage.LOGIN_QR_HEADER).isDisplayed());
    WebElement login_header =driver.findElement(BasePage.LOGIN_QR_HEADER);
    Assert.assertEquals(login_header.getText(),"Login with QR code");
    driver.findElement(BasePage.QR_IMG).click();
    Object[] windowHandles=driver.getWindowHandles().toArray();
    driver.switchTo().window((String) windowHandles[1]);
    WebElement qr_message = driver.findElement(By.xpath("//p[@class=\"mt-2.5 font-inter text-sm text-white/50\"]"));
    wait.until(d -> qr_message.isDisplayed());
    Assert.assertTrue(driver.findElement(BasePage.QR_MESSAGE).isDisplayed());
    Assert.assertEquals(qr_message.getText(),"Your identity and all rooms access will be copied to another client, that supplied this link and code to you.");
    driver.close();
        }
    @Test (priority = 2)
    public void loginKey(){
        WebDriver driver = new ChromeDriver();
        driver.get(Constants.HOME_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(BasePage.LOGIN_BY_KEY).click();
        WebElement key_message = driver.findElement(BasePage.LOGIN_BY_KEY_HEADER);
        Assert.assertEquals(key_message.getText(),"Import the recovery keys");
        driver.close();
        }
    @Test (priority = 3)
        public void loginSharing(){
        WebDriver driver = new ChromeDriver();
        driver.get(Constants.HOME_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(BasePage.LOGIN_BY_SHARING).click();
        WebElement sharing_message = driver.findElement(BasePage.LOGIN_BY_KEY_HEADER);
        Assert.assertEquals(sharing_message.getText(),"Recover key from Social Sharing");
        driver.close();
        }
    @Test(priority = 4)
        public void loginNewUser(){
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        driver.get(Constants.HOME_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(BasePage.LOGIN_NEW_USER).sendKeys(Constants.username);
        driver.findElement(BasePage.LOGIN_BUTTON).click();
        WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"note\"]"));
        wait.until(d -> checkbox.isDisplayed());
        driver.findElement(BasePage.LOGIN_CHECKBOX).click();
        WebElement username = driver.findElement(BasePage.USERNAME);
        Assert.assertEquals(username.getText(),"AQA new user");
        driver.close();
        }
    @Test(priority = 5)
    public void loginByKey(){
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(3));
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
        WebElement username = driver.findElement(BasePage.USERNAME);
        Assert.assertEquals(username.getText(),"AQA user");



    }
    }
