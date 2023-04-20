package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://itstep.dp.ua/ru");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='re-home-banner__ticker-row']/descendant::a[5]")).click();
        System.out.println(driver.findElement(By.xpath("//h1[@class='children-page-new__title']")).getText());


//
//        driver.quit();
    }



}
