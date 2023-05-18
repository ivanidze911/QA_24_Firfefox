package Hw9_TestNG.suite;

import Homework.Hw_AUTO_Waiters.Hw_MyWaiters;
import Homework.Hw_SELECT_ACTION.SelectAction_Hw1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.List;

import static org.testng.Assert.*;

public class HwTestNG1 {
    private static class Locastors {

        //Для @Test checkTheNumberOfOpenWindows
        private static final By sphereIT = By.xpath("//div[@class='pop-up-text']"); //рекламное окно
        private static final By closeSphereIT = By.xpath("//button[@class='pop-up-close']"); //рекламное окно
        private static final By pageTab1 = By.xpath("//a[text()='Для дорослих']");
        private static final By pageTab2 = By.xpath("//a[text()='Програмування']");
        private static final By frontEnd = By.xpath("//a[text()='FrontEnd']");
        private static final By java = By.xpath("//a[text()='Java']");
        private static final By pageTab3 = By.xpath("//a[text()='Тестування']");
        private static final By QA = By.xpath("//a[text()='Quality Assurance (QA)']");

        //Для @Test clickButtonPageOpened
        private static final By paymentAndDelivery = By.xpath("// span[@class='site-menu__item']//a[text()='Оплата и доставка']");

        //Для @Test checkPresenceInSearchResults
        private static final By search = By.xpath("//input[@class='search__input']");
        private static final By searchResults = By.xpath("//h1[@id='j-catalog-header']");

        //Для @Test checkboxIsNotSelected
        private static final By rememberMe = By.xpath("//input[@id='RememberMe']");

        //Для @Test textInModalWindow
        private static final By showMeAlert = By.xpath("//input[@value='Show Me Alert']");


}
    WebDriver driver;
    @BeforeMethod
    public void driverInitialisation(){
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void checkTheNumberOfOpenWindows(){
//        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/uk/");
        Hw_MyWaiters waiters = new Hw_MyWaiters(driver);
        Actions actions = new Actions(driver);
        WebElement pageTab1 = driver.findElement(Locastors.pageTab1);
        WebElement pageTab2 = driver.findElement(Locastors.pageTab2);
        WebElement pageTab3 = driver.findElement(Locastors.pageTab3);
        WebElement frontEnd = driver.findElement(Locastors.frontEnd);
        WebElement java = driver.findElement(Locastors.java);
        WebElement QA = driver.findElement(Locastors.QA);
        //System.out.println(driver.getTitle());
        actions.moveToElement(pageTab1).perform();
        actions.moveToElement(pageTab2).click().build().perform();
        actions.moveToElement(java).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(frontEnd).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(pageTab3).perform();
        actions.moveToElement(QA).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

        assertTrue(driver.getWindowHandles().size()==4,"Количество открытых окон = "
                + driver.getWindowHandles().size()+ " шт. " + "Требуемое количество открытых окон - 4 шт.");
        System.out.println("Количество открытых окон = " + driver.getWindowHandles().size() + " шт. " + "Требуемое количество открытых окон - 4 шт.");

        //driver.quit();

    }
    @Test
    public void clickButtonPageOpened(){
//        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        Hw_MyWaiters waiters = new Hw_MyWaiters(driver);
        Actions actions = new Actions(driver);
        WebElement paymentAndDelivery = driver.findElement(Locastors.paymentAndDelivery);
        actions.moveToElement(paymentAndDelivery).click().build().perform();
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
        assertEquals(driver.getCurrentUrl(), "https://uhomki.com.ua/ru/oplata-i-dostavka/", "Ссылка не соответствует требуемой странице");

 //       driver.quit();

    }
    @Test
    public void checkPresenceInSearchResults() {
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        Actions actions = new Actions(driver);

        WebElement search = driver.findElement(Locastors.search);
        String text1 = "смесь";
        String text2 = "спесь";
        String text3 = "ересь";
        search.sendKeys(text1);
        search.submit();

 //       WebElement searchResults = driver.findElement(By.xpath("//h1[@id='j-catalog-header']"));
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains(text1),"слово “смесь” оттствует в сообщении о результатах поиска");

        WebElement search2 = driver.findElement(Locastors.search);
        search2.clear();
        search2.sendKeys(text2);
        search2.submit();
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains(text2),"слово “спесь” оттствует в сообщении о результатах поиска");

        WebElement search3 = driver.findElement(Locastors.search);
        search3.clear();
        search3.sendKeys(text3);
        search3.submit();
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains(text3),"слово “ересь” оттствует в сообщении о результатах поиска");

//        driver.quit();

    }
    @Test
    public void checkboxIsNotSelected(){
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebElement rememberMe =driver.findElement(Locastors.rememberMe);
        //rememberMe.click();

        System.out.println(rememberMe.isDisplayed()); // на консоль выводится "true"
        assertTrue(rememberMe.isDisplayed()); // чек-бокс “RememberMe” не выбран
        rememberMe.click();
        assertTrue(rememberMe.isSelected(), "Чек-бокс “RememberMe” не выбран");
        rememberMe.click();
        assertFalse(rememberMe.isSelected(), "Чек-бокс “RememberMe” выбран");
        rememberMe.click();
        assertTrue(rememberMe.isSelected(), "Чек-бокс “RememberMe” не выбран");

//        driver.quit();
    }
    @Test
    public void textInModalWindow(){
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        Hw_MyWaiters waiters = new Hw_MyWaiters(driver);
        String textModalWindow  = "Hi.. This is alert message!";
        WebElement showMeAlert = driver.findElement(Locastors.showMeAlert);
        showMeAlert.click();
        System.out.println(waiters.waitForAlertAndSwitchToIt().getText()); //выводим текст из модального окна
        Alert alertWindow1 = driver.switchTo().alert();
        System.out.println(alertWindow1.getText()); //то же вариант
        assertEquals(alertWindow1.getText(), textModalWindow, "Название не соответствует ожидаемому.\n +" +
                "я ожидал" + textModalWindow +" а получил" + alertWindow1.getText());

  //      driver.quit();

    }





}
