package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com");
        Thread.sleep(2000);
        driver.findElement(By.id("search2"))
                .sendKeys("Это поле поиска учебников, напримет по HTML");
        Thread.sleep(2000);
        driver.findElement(By.id("navbtn_tutorials")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("navbtn_references")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("navbtn_exercises")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("w3loginbtn")).click();
        driver.findElement(By.id("modalusername"))
                .sendKeys("Это поле Логина");
        driver.findElement(By.id("current-password"))
                .sendKeys("Это поле Пароля");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='undefined TopBarMenuLegacy2_user_profile_button__Qv+Te']/child::button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("nav_search_btn")).click();
        driver.findElement(By.id("gsc-i-id1"))
                .sendKeys("Это поле поиска");







//
//        driver.quit();
    }



}
