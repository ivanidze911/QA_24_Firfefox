package Homework.Hw4_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WebDriverMethods_Hw5 {
    //5) Написать программу, которая повторит действия на видео "Задание 5.mp4".

    static class Locastors {
        static final By search = By.xpath("//input[@class='search__input']");
        static final By paste = By.xpath("//a[@href='/ru/vitaminy-beafar-pasta-malt-s-dvoynym-deystviem-dlya-khorkov-100g/'][contains(text(), 'Витамины Беафар ПАСТА')]");
        static final By comparisonВutton = By.xpath("//span[contains(text(), 'К сравнению')]");
        static final By windowСomparison = By.xpath("//span[contains(text(), 'Сравнение')]");
        static final By belyyMedved = By.xpath("//a[contains(text(), 'Белый медведь 6х5х6см')]");
        static final By headerLogoImg = By.xpath("//img[@class='header-logo-img']");
        static final By katalog = By.xpath("//a[@class='site-menu__link'][1]");


        private static class Url {
            private static final String uhomki = "https://uhomki.com.ua";



            public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
                Actions actions = new Actions(driver);
                driver.manage().window().maximize();
                driver.get(uhomki);
                Thread.sleep(2000);

                WebElement search = driver.findElement(Locastors.search);
                search.sendKeys("Хорек");
                Thread.sleep(4000);
                search.submit();
                Thread.sleep(4000);
                driver.findElement(Locastors.paste).click();
                Thread.sleep(4000);
                driver.findElement(Locastors.comparisonВutton).click();
                Thread.sleep(4000);
                WebElement search2 = driver.findElement(Locastors.search);
                search2.sendKeys("Медведь");
                Thread.sleep(4000);
                search2.submit();
                Thread.sleep(4000);
                driver.findElement(Locastors.belyyMedved).click();
                Thread.sleep(4000);
                driver.findElement(Locastors.comparisonВutton).click();
                Thread.sleep(4000);
                driver.findElement(Locastors.windowСomparison).click();
                Thread.sleep(4000);

                driver.quit();

            }
        }
    }
}
