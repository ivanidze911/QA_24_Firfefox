package Hw10_TestNG2;

import Homework.Hw_AUTO_Waiters.Hw_MyWaiters;
import lesson9.ActionClass;
import lesson9.Assertions;

import lesson9.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class searchFoxtrot {
    static class Locastors {
        private static final By ok = By.xpath("//div[@id='user-location-popup']/div//a[@class='button user-confirm-location-button']");
        static final By search = By.xpath("//div[@class='header-search evinent-search-container']//input[@type='search']");
        static final By searchClear = By.xpath("//i[@id='searchClear']/../following-sibling::input");
        private static final By searchBoxTitle = By.xpath("//div[@class='search-page__box-title']");

    }
    private static class Url {
        private static final String foxtrot = "https://www.foxtrot.com.ua/";
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
    public void searchFoxtrotTest() {
        driver.get(Url.foxtrot);
        Hw_MyWaiters waiters = new Hw_MyWaiters(driver);
//        MyWaiters myWaiters = new MyWaiters(driver);
        Elements elements = new Elements(driver);
        ActionClass action = new ActionClass(driver);
        Assertions asserts = new Assertions(driver);
        WebElement icon = driver.findElement(Locastors.ok);
        waiters.waitVisabilityOfWebElent(icon);
        System.out.println(icon.getText());
        icon.click();
        String text1 = "машина";
        String text2 = "input";
        String text3 = "смысл";
        String textResult1 = "Знайдено по запиту «машина»";
        String textResult2 = "Знайдено по запиту «input»";
        String textResult3 = "Знайдено по запиту";
        String textBoxTitle = "За запитом «смысл» нічого не знайдено";

        WebElement search1 = waiters.waitVisabilityOfWebElentReturn(Locastors.search);
        search1.sendKeys(text1);
        WebElement searchClear1 = waiters.waitElementToBeClickableReturn(Locastors.searchClear);
        searchClear1.click();
        WebElement searchResultText1 = driver.findElement(By.tagName("h1"));
        System.out.println(searchResultText1.getText());
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains(searchResultText1.getText()),"слово" +text1+ " оттствует в сообщении о результатах поиска");

        WebElement search2 = waiters.waitVisabilityOfWebElentReturn(Locastors.search);
        search2.sendKeys(text2);
        WebElement searchClear2 = waiters.waitElementToBeClickableReturn(Locastors.searchClear);
        System.out.println(searchClear2.getText());
        searchClear2.click();
        WebElement searchResultText2 = driver.findElement(By.tagName("h1"));
        System.out.println(searchResultText2.getText());
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains(searchResultText2.getText()),"слово" +text2+ " оттствует в сообщении о результатах поиска");

        WebElement search3 = waiters.waitVisabilityOfWebElentReturn(Locastors.search);
        search3.sendKeys(text3);
        WebElement searchClear3 = waiters.waitElementToBeClickableReturn(Locastors.searchClear);
        System.out.println(searchClear3.getText());
        searchClear3.click();
        WebElement searchResultText3 = driver.findElement(By.tagName("h1"));
        System.out.println(searchResultText3.getText());
        System.out.println(driver.getTitle());
        assertFalse(driver.getTitle().contains(searchResultText3.getText()),"слово " +text3+ " оттствует в сообщении о результатах поиска");

        WebElement searchBoxTitle = driver.findElement(Locastors.searchBoxTitle);
        System.out.println(searchBoxTitle.getText());


//        assertNotEquals(driver.getTitle(), textBoxTitle, "Название не соответствует ожидаемому.\n +" +
//                "я ожидал " + textBoxTitle+" а получил" +driver.getTitle());
    }

}
