package org.example;

import Other.BasePage;
import Other.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RoomsCreation {
    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\drivers\\chromedriver.exe");

    }
    @Test(priority = 0)
    public void CreateOpenRoom() throws InterruptedException {
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
        driver.findElement(BasePage.ROOM_PAGE).click();
        driver.findElement(BasePage.CREATE_ROOM_BUTTON).click();
        WebElement searchUserByName = driver.findElement(By.xpath("//input[@id=\"room-create-form_name\"]"));
        searchUserByName.sendKeys("Open room");
        driver.findElement(BasePage.CREATE_ROOM_MODAL_SUBMIT_BUTTON).click();
        Thread.sleep(1000);
    }
}
