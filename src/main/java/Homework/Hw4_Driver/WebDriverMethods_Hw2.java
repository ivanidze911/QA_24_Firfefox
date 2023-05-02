package Homework.Hw4_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class WebDriverMethods_Hw2 {
    //2) Написать метод в параметры которого принимаются два ВебЭлемента.
    //метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
    //какой из элементов располагается левее на странице,
    //а также какой из элементов занимает большую площадь.
    //Параметры метода могут также включать в себя другие аргументы, если это необходимо.
    static class Locastors {
        static final By tutorials = By.id("navbtn_tutorials");
        private static final By search = By.id("search2");
    }
    private static class Url{
        private static final String w3schools = "https://www.w3schools.com";
    }

    static void webElements(WebElement webElement1, WebElement webElement2){
        if ((webElement1.getLocation().y - webElement2.getLocation().y) < 0) {
            System.out.println("элемент webElement1 находится выше елемента webElement2 ");
        } else if ((webElement1.getLocation().y - webElement2.getLocation().y) > 0){
            System.out.println("элемент webElement1 находится ниже елемента webElement2 ");
        }
        if ((webElement2.getLocation().x - webElement1.getLocation().x) > 0) {
            System.out.println("элемент webElement1 находится левее елемента webElement2 ");
        } else if ((webElement2.getLocation().x - webElement1.getLocation().x) < 0){
            System.out.println("элемент webElement1 находится правее елемента webElement2 ");
        }
        if ((webElement1.getSize().height*webElement1.getSize().width) < (webElement2.getSize().height*webElement2.getSize().width)) {
            System.out.println("элемент tutorials меньше елемента search ");
        }
    }
    public static void main(String[] args) {


        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(Url.w3schools);
        WebElement webElement1 = driver.findElement(Locastors.tutorials);
        WebElement webElement2 = driver.findElement(Locastors.search);
        webElements(webElement1,webElement2);

//        System.out.println("Координата y верхнего левого угла элемента webElement1" );
//        System.out.println(webElement1.getLocation().y);
//        System.out.println("Координата y верхнего левого угла элемента webElement2" );
//        System.out.println(webElement2.getLocation().y);
//        System.out.println("Координата x верхнего левого угла элемента webElement1" );
//        System.out.println(webElement1.getLocation().x);
//        System.out.println("Координата x верхнего левого угла элемента webElement2" );
//        System.out.println(webElement2.getLocation().x);
//        System.out.println("Высота элемента webElement1");
//        System.out.println(webElement1.getSize().height);
//        System.out.println("Ширина элемента webElement1");
//        System.out.println(webElement1.getSize().width);
//        System.out.println("Высота элемента webElement2");
//        System.out.println(webElement2.getSize().height);
//        System.out.println("Ширина элемента webElement2");
//        System.out.println(webElement2.getSize().width);
//
//
//
//        if ((webElement1.getLocation().y - webElement2.getLocation().y) < 0) {
//            System.out.println("элемент webElement1 находится выше елемента webElement2 ");
//        } else if ((webElement1.getLocation().y - webElement2.getLocation().y) > 0){
//            System.out.println("элемент webElement1 находится ниже елемента webElement2 ");
//        }
//        if ((webElement2.getLocation().x - webElement1.getLocation().x) > 0) {
//            System.out.println("элемент webElement1 находится левее елемента webElement2 ");
//        } else if ((webElement2.getLocation().x - webElement1.getLocation().x) < 0){
//            System.out.println("элемент webElement1 находится правее елемента webElement2 ");
//        }
//        if ((webElement1.getSize().height*webElement1.getSize().width) < (webElement2.getSize().height*webElement2.getSize().width)) {
//            System.out.println("элемент webElement1 меньше елемента webElement2 ");
//        }
       // driver.quit();


    }



}
