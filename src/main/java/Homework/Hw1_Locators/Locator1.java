package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(2000);

        //Запускать по одному
//        driver.findElement(By.xpath("//span[text()='Вход']")).click();
//        driver.findElement(By.xpath("//span[@class='userbar__button-text']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Вход')][1]")).click();


//        driver.quit();
    }


}
