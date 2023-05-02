package Homework.Hw4_Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Set;

public class WebDriverMethods_Hw1 {
    //1)  Написать программу, которая будет открывать пять различных страниц в новых окнах:
    //    https://uhomki.com.ua/
    //    https://zoo.kiev.ua/
    //    https://www.w3schools.com/
    //    https://taxi838.ua/ru/dnepr/
    //    https://klopotenko.com/
    //
    //Прописать цикл, который будет переключаться поочередно через все страницы,
    //для каждой страницы выводить в консоль название и ссылку на эту страницу.
    //И будет закрывать ту страницу в названии которой есть слово зоопарк.

    private static final String w3schools = "https://www.w3schools.com";
    private static final String uhomki = "https://uhomki.com.ua";
    private static final String zoo = "https://zoo.kiev.ua/";
    private static final String taxi838 = "https://taxi838.ua/ru/dnepr/";
    private static final String klopotenko = "https://klopotenko.com/";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // время ожидания драйвером элемента
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // ожидание загрузки страницы
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10)); // неявное ожидание отработки скриптов

        driver.get(uhomki);
        String descr1 = driver.getWindowHandle();
        Set<String> firstDescriptors = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (окно там будет только одно)
        ((JavascriptExecutor)driver).executeScript("window.open()"); // открываем новое окно
        Set<String> setSecond = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон
        setSecond.removeAll(firstDescriptors); // все что есть setFirst, для исключения дубликатов
        String Descr2 = setSecond.iterator().next(); // проходим по элементам, находящемися во множестве setSecond и получить следующий next
        driver.switchTo().window(Descr2);
        driver.get(zoo);
        ((JavascriptExecutor)driver).executeScript("window.open()"); // открываем новое окно
        Set<String> setSecond1 = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон
        setSecond1.removeAll(firstDescriptors);
        setSecond1.removeAll(setSecond);
        String Descr3 = setSecond1.iterator().next();
        driver.switchTo().window(Descr3);
        driver.get(w3schools);
        ((JavascriptExecutor)driver).executeScript("window.open()"); // открываем новое окно
        Set<String> setSecond2 = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон
        setSecond2.removeAll(firstDescriptors);
        setSecond2.removeAll(setSecond);
        setSecond2.removeAll(setSecond1);
        String Descr4 = setSecond2.iterator().next();
        driver.switchTo().window(Descr4);
        driver.get(taxi838);
        ((JavascriptExecutor)driver).executeScript("window.open()"); // открываем новое окно
        Set<String> setSecond3 = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон
        setSecond3.removeAll(firstDescriptors);
        setSecond3.removeAll(setSecond);
        setSecond3.removeAll(setSecond1);
        setSecond3.removeAll(setSecond2);
        String Descr5 = setSecond3.iterator().next();
        driver.switchTo().window(Descr5);
        driver.get(klopotenko);


        Set<String> Descriptors = driver.getWindowHandles();
        for (String descriptors:Descriptors) {
            driver.switchTo().window(descriptors);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());

        }

//        Навигация по окнам без цыкла
//        driver.switchTo().window(Descr2);
//        Thread.sleep(2000);
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(Descr3);
//        Thread.sleep(2000);
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(Descr4);
//        Thread.sleep(2000);
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(Descr5);
//        Thread.sleep(2000);
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(descr1);
//        Thread.sleep(2000);
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());

        driver.quit();

    }
}
