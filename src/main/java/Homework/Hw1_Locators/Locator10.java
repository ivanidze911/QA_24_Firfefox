package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        Thread.sleep(2000);
        //Запускать по одному
//        driver.findElement(By.xpath("//div[@class='wt-col_align-self_end wt-col-inline wt-offset-top-24']/child::span/child::a")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='chooseYourEdition']/../../../child::div/child::div/ following-sibling::div/child::div/child::div/child::div/ following-sibling::div/child::div/child::div/ following-sibling::div//child::span/child::a")).click();

//        driver.quit();
    }



}
