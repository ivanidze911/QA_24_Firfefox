package Hw10_TestNG2;

import Homework.Hw_AUTO_Waiters.Hw_MyWaiters;
import lesson9.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class searchFoxtrotDataProvider {
    private static class Locastors {
        private static final By ok = By.xpath("//div[@id='user-location-popup']/div//a[@class='button user-confirm-location-button']");
        private static final By search = By.xpath("//div[@class='header-search evinent-search-container']//input[@type='search']");
        private static final By searchClear = By.xpath("//i[@id='searchClear']/../following-sibling::input");
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

    @Test (dataProvider = "search")
    public void searchFoxtrotTest(String searchParams) {
        driver.get(Url.foxtrot);
        Hw_MyWaiters waiters = new Hw_MyWaiters(driver);
        Assertions asserts = new Assertions(driver);
        WebElement icon = driver.findElement(Locastors.ok);
        waiters.waitVisabilityOfWebElent(icon);
        System.out.println(icon.getText());
        icon.click();
        String text = searchParams;
        WebElement search = waiters.waitVisabilityOfWebElentReturn(Locastors.search);
        search.sendKeys(text);
        WebElement searchClear = waiters.waitPresenceOfElementReturn(Locastors.searchClear);
        System.out.println(searchClear.getText());
        searchClear.click();
        System.out.println(driver.getTitle());
        if ((driver.findElement(By.tagName("h1"))).getText().contains("Найдено по запросу")) {
            String resultOfReach = (driver.findElement(By.tagName("h1")))
                    .getText().replace("Найдено по запросу ", "");
            asserts.equalsOfStrings(resultOfReach, "«"+text+"»" );
        } else if((driver.findElement(By.tagName("h1"))).getText().contains("Результаты поиска")){
            String resultOfReach = (driver.findElement(By.xpath("//div[@class='search-page__box-title']/label")))
                    .getText();
            asserts.equalsOfStrings(resultOfReach, "«"+text+"»" );
        }
    }
    @DataProvider(name = "search")
    public Object[] searchObj() {
        return new Object[]{
                "машина", "input", "смысл"
        };
    }

}
