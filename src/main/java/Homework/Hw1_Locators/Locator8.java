package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://itstep.dp.ua/ru");
        Thread.sleep(2000);
        //Находим элемент "Университет" //img[@class='re-home-adult__img re-home-adult__img--university']
        driver.findElement(By.xpath("//img[@class='re-home-adult__img re-home-adult__img--university']"));
        //Используем навигацию для поиска элемента "Програмирование".
//        driver.findElement(By.xpath("//img[@class='re-home-adult__img re-home-adult__img--university']/../../../../ancestor::div/child::div/child::div/child::div/following-sibling::a/child::h3/following-sibling::h3/following-sibling::div/child::picture/child::source/following-sibling::img")).click();
        //Второй элемент "Програмирование" можно найти альтернативным способом
//        driver.findElements(By.xpath("//div[@class='re-home-adult__image-box']/child::picture/child::source/following-sibling::img")).get(2).click();

//        driver.quit();
    }



}
