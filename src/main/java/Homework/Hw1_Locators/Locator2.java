package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/koshki/1074/");

        //xpath поиск по тексту
        driver.findElement(By.xpath("//a[text()='Каталог']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Собаки/кошки общее']")).click();
//        Thread.sleep(2000);
//        driver.quit();
    }



}
