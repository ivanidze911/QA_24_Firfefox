package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jetbrains.com/idea");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id= 'js-menu-second-desktop']/child::div/ following-sibling::a/ following-sibling::a/ following-sibling::a/ following-sibling::a/ following-sibling::a/ following-sibling::a")).click();

//        driver.quit();
    }



}
