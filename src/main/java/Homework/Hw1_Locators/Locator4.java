package Homework.Hw1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/koshki/1074/");

        Thread.sleep(2000);
        driver.findElements(By.xpath("//div[@class='products-menu__title']")).get(7).click();
        driver.findElement(By.xpath("//li[@class='products-menu__item __active j-submenu-item']/div/a")).click();
//      Объекты нашел. Навести на "Аквариумистика", чтобы успеть кликнуть "Аквариумы" не получается
//        WebElement akvariumistikaElement = driver.findElement(By.xpath("//div[@class='products-menu__title'][7]"));
//        Select akvariumistikaSelect = new Select(akvariumistikaElement);
//        //selectByVisibleText(); выбор элемента с определенным тесктом
//        akvariumistikaSelect.selectByVisibleText("Аквариумы");

//
//        driver.quit();
    }



}
