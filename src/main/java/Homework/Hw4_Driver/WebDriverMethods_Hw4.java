package Homework.Hw4_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WebDriverMethods_Hw4 {
    //4)https://uhomki.com.ua/
    //Написать метод, который будет выводить в консоль тексты всех
    //элементов, которые можно найти по заданнму параметру.
    //Например при помощи него можно будет получить значения всех элементов
    //из списков заданных на "Рисунок 4.png" и "Рисунок 5.png".

    static class Locastors {
        static final By productsMenu = By.xpath("//a[@class='products-menu__title-link']");
        static final By catalog = By.xpath("//div[text()='Каталог']/following-sibling::ul/li");
        static final By clients = By.xpath("//div[text()='Клиентам']/following-sibling::ul/li");
        static final By contactInformation = By.xpath("//div[@class='footer__contacts-item']");

        private static final String uhomki = "https://uhomki.com.ua";

        public static void outputTextsElements(List<WebElement> webElements) {
            for (WebElement webElement : webElements) {
                System.out.println(webElement.getText());
            }
        }

        public static void main(String[] args) throws InterruptedException {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--disable-notifications");
            System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(uhomki);
            Thread.sleep(2000);

            System.out.println("Тексты всех элементов из списка на Рисунке 4.png");
            outputTextsElements(driver.findElements(Locastors.productsMenu));
            System.out.println("Тексты всех элементов из списка 'Каталог' на Рисунке 5.png");
            outputTextsElements(driver.findElements(Locastors.catalog));
            System.out.println("Тексты всех элементов из списка 'Клиентам' на Рисунке 5.png");
            outputTextsElements(driver.findElements(Locastors.clients));
            System.out.println("\n Тексты всех элементов из списка 'Контактная информация' на Рисунке 5.png");
            outputTextsElements(driver.findElements(Locastors.contactInformation));


            //driver.quit();

        }
    }
}
