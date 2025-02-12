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
import java.util.List;

public class MyNotes {
    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\drivers\\chromedriver.exe");
    }
    @Test(priority = 0)
    public void myNotesImage() throws InterruptedException {
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
        driver.findElement(BasePage.USERNAME).click();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("E:\\Work\\Java\\101\\untitled\\files\\1.jpg");
        WebElement submitButton = driver.findElement(By.id("dialog-form-submit-button"));
        submitButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement imageElement = driver.findElement(By.xpath("//div[@class=\"m-1 w-full flex justify-end t-dialog-mine-message x-mine\"]/div"));
        Dimension imageSize = imageElement.getSize();
        int expectedWidth = 180;
        int actualWidth = imageElement.getSize().getWidth();
        int expectedHeight = 75;
        Assert.assertEquals(actualWidth , expectedWidth);
        Assert.assertEquals((imageSize.getHeight()), expectedHeight);
        WebElement messageDate = driver.findElement(BasePage.CHAT_MESSAGE_DATE);
        Assert.assertNotEquals(messageDate.getText(),"3:00 AM, 1.1.1970");
        Assert.assertNotEquals(messageDate.getText(),"Invalid Date");
        WebElement imageName = driver.findElement(BasePage.CHAT_FILE_NAME);
        Assert.assertEquals(imageName.getText(),"1.jpg");
        WebElement imageFileSize = driver.findElement(BasePage.CHAT_FILE_SIZE);
        Assert.assertEquals(imageFileSize.getText(),"2.2 Mb");
        driver.findElement(BasePage.IMAGE_OPENER).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(BasePage.GALLERY_IMAGE).isDisplayed());
        driver.findElement(BasePage.GALLERY_BACK_BUTTON).click();
        Assert.assertTrue(username.isDisplayed());
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(BasePage.IMAGE_OPENER).isDisplayed());
        driver.close();
    }
    @Test(priority = 1)
    public void myNotesVideo() throws InterruptedException {
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
        driver.findElement(BasePage.USERNAME).click();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("E:\\Work\\Java\\101\\untitled\\files\\SampleVideo_1280x720_5mb.mp4");
        WebElement submitButton = driver.findElement(By.id("dialog-form-submit-button"));
        submitButton.click();
        Thread.sleep(3000);
        WebElement videoElement = driver.findElement(By.xpath("//video[@class=\"a-video\"]"));
        int expectedVideoWidth = 448;
        int expectedVideoHeight = 234;
        Assert.assertEquals(videoElement.getSize().getWidth() , expectedVideoWidth);
        Assert.assertEquals(videoElement.getSize().getHeight() , expectedVideoHeight);
        WebElement messageDate = driver.findElement(BasePage.CHAT_MESSAGE_DATE);
        Assert.assertNotEquals(messageDate.getText(),"3:00 AM, 1.1.1970");
        Assert.assertNotEquals(messageDate.getText(),"Invalid Date");
        WebElement imageName = driver.findElement(BasePage.CHAT_FILE_NAME);
        Assert.assertEquals(imageName.getText(),"SampleVideo_1280x720_5mb.mp4");
        WebElement imageFileSize = driver.findElement(BasePage.CHAT_FILE_SIZE);
        Assert.assertEquals(imageFileSize.getText(),"5.2 Mb");
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(BasePage.CHAT_VIDEO).isDisplayed());
        driver.close();
    }
    @Test(priority = 3)
    public void myNotesFile() throws InterruptedException {
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
        driver.findElement(BasePage.USERNAME).click();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("E:\\Work\\Java\\101\\untitled\\files\\About company.pdf");
        WebElement submitButton = driver.findElement(By.id("dialog-form-submit-button"));
        submitButton.click();
        Thread.sleep(1000);
        WebElement messageDate = driver.findElement(BasePage.CHAT_MESSAGE_DATE);
        Assert.assertNotEquals(messageDate.getText(),"3:00 AM, 1.1.1970");
        Assert.assertNotEquals(messageDate.getText(),"Invalid Date");
        WebElement imageName = driver.findElement(BasePage.CHAT_FILE_NAME);
        Assert.assertEquals(imageName.getText(),"About company.pdf");
        WebElement imageFileSize = driver.findElement(BasePage.CHAT_FILE_SIZE);
        Assert.assertEquals(imageFileSize.getText(),"7.9 Kb");
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
        Thread.sleep(1000);
        driver.close();
    }
    @Test(priority = 4)
    public void sidebarScroll(){
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
        driver.findElement(BasePage.USERNAME).click();
        WebElement container = driver.findElement(BasePage.SIDEBAR_LIST);
        List<WebElement> listItems = container.findElements(BasePage.SIDEBAR_LIST_ELEMENT);
        WebElement lastElement = listItems.get(listItems.size()-2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",lastElement);
        Assert.assertTrue(lastElement.isDisplayed());
        driver.close();
    }
    @Test(priority = 5)
    public void myNotesAudio() throws InterruptedException {
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
        driver.findElement(BasePage.USERNAME).click();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("E:\\Work\\Java\\101\\untitled\\files\\Nothing Else Matters.mp3");
        WebElement submitButton = driver.findElement(By.id("dialog-form-submit-button"));
        submitButton.click();
        Thread.sleep(3000);
        WebElement messageDate = driver.findElement(BasePage.CHAT_MESSAGE_DATE);
        Assert.assertNotEquals(messageDate.getText(),"3:00 AM, 1.1.1970");
        Assert.assertNotEquals(messageDate.getText(),"Invalid Date");
        WebElement imageName = driver.findElement(BasePage.CHAT_FILE_NAME);
        Assert.assertEquals(imageName.getText(),"Nothing Else Matters.mp3");
        WebElement imageFileSize = driver.findElement(BasePage.CHAT_FILE_SIZE);
        Assert.assertEquals(imageFileSize.getText(),"6.2 Mb");
        WebElement playIcon = driver.findElement(By.xpath("//*[local-name()='svg' and @class='play-circle w-9']"));
        Assert.assertTrue(playIcon.isDisplayed());
        driver.findElement(BasePage.CHAT_AUDIO_PLAY_BUTTON).click();
        Thread.sleep(3000);
        WebElement pauseIcon = driver.findElement(By.xpath("//*[local-name()='svg' and @class='pause-circle w-9']"));
        Assert.assertTrue(pauseIcon.isDisplayed());
        driver.findElement(BasePage.CHAT_AUDIO_PLAY_BUTTON).click();
        Assert.assertTrue(playIcon.isDisplayed());
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(BasePage.CHAT_AUDIO).isDisplayed());
        driver.close();
    }
    @Test(priority = 6)
    public void myNotesMessage() throws InterruptedException {
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
        driver.findElement(BasePage.USERNAME).click();
        WebElement inputText = driver.findElement(By.xpath("//textarea[@id=\"dialog-input\"]"));
        inputText.sendKeys("AQA text message for test");
        driver.findElement(BasePage.CHAT_TEXT_SUBMIT_BUTTON).click();
        WebElement textMessage = driver.findElement(BasePage.CHAT_TEXT_MESSAGE);
        Assert.assertEquals(textMessage.getText(), "AQA text message for test");
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_EDIT).click();
        WebElement inputTextUpdate = driver.findElement(By.xpath("//textarea[@name=\"dialog_edit[text]\"]"));
        inputTextUpdate.sendKeys(" updated");
        driver.findElement(BasePage.CHAT_TEXT_SUBMIT_EDIT_BUTTON).click();
        Thread.sleep(500);
        WebElement textMessageUpdated = driver.findElement(BasePage.CHAT_TEXT_MESSAGE);
        Assert.assertEquals(textMessageUpdated.getText(), "AQA text message for test updated");
        Thread.sleep(500);
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(BasePage.CHAT_TEXT_MESSAGE).isDisplayed());
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.findElement(BasePage.USERNAME).click();
        WebElement inputLongText = driver.findElement(By.xpath("//textarea[@id=\"dialog-input\"]"));
        inputLongText.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap");
        driver.findElement(BasePage.CHAT_TEXT_SUBMIT_BUTTON).click();
        WebElement textLongMessage = driver.findElement(BasePage.CHAT_TEXT_MESSAGE);
        Assert.assertEquals(textLongMessage.getText(), "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap");
        Thread.sleep(500);
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL).click();
        driver.findElement(BasePage.CHAT_MESSAGE_MODAL_DELETE).click();
        driver.findElement(BasePage.POPUP_DELETE_AGREE_BUTTON).click();
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(BasePage.CHAT_TEXT_MESSAGE).isDisplayed());
        driver.close();
    }
    @Test (priority = 7)
        public void searchUser() throws InterruptedException {
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
        WebElement searchUserByName = driver.findElement(By.xpath("//input[@id=\"search-box_name\"]"));
        searchUserByName.sendKeys("User 9");
        Thread.sleep(1000);
        WebElement userInList = driver.findElement(By.xpath("//div[@class=\"text-sm\"]"));
        Assert.assertEquals(userInList.getText(),"User 9");
        driver.close();
    }

}
