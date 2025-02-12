package org.example;

import Other.BasePage;
import Other.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class UsersListAssist {
    private String name;
    public UsersListAssist(String name){
        this.name=name;
    }
public String getName(){
        return name;
}
@Override
    public String toString(){
        return name;
}
}
class UserListCreation {
    public static void main(String[] args) {
        List<UsersListAssist> users = new ArrayList<>();
        for (int i = 1; i < 26; i++) {
            UsersListAssist usersList = new UsersListAssist("User " + i);
            users.add(usersList);

            if (i != 25) {
                WebDriver driver = new ChromeDriver();
                Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                driver.get(Constants.HOME_URL);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
                driver.findElement(BasePage.LOGIN_NEW_USER).sendKeys(usersList.getName());
                driver.findElement(BasePage.LOGIN_BUTTON).click();
                WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"note\"]"));
                wait.until(d -> checkbox.isDisplayed());
                driver.findElement(BasePage.LOGIN_CHECKBOX).click();
                WebElement username = driver.findElement(BasePage.USERNAME);
                Assert.assertNotEquals(username.getText(), "User 25");
                driver.close();
            } else {
                WebDriver driver = new ChromeDriver();
                Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                driver.get(Constants.HOME_URL);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
                driver.findElement(BasePage.LOGIN_NEW_USER).sendKeys((CharSequence) usersList);
                driver.findElement(BasePage.LOGIN_BUTTON).click();
                WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"note\"]"));
                wait.until(d -> checkbox.isDisplayed());
                driver.findElement(BasePage.LOGIN_CHECKBOX).click();
                WebElement username = driver.findElement(BasePage.USERNAME);
                Assert.assertEquals(username.getText(), "User 25");
                driver.close();
            }
        }

    }
}