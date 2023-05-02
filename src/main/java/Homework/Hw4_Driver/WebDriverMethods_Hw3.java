package Homework.Hw4_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverMethods_Hw3 {
//    3) Написать метод который выводит сообщение об айди элемента,
//    значении тэга элемента , значении класса элемента,
//    значении атрибута name элемента, текста данного элемента,
//    а также о координатах центра контейнера данного элемента.
//    Создать свой тип исключений, который будет вызываться если у элемента
//    нет определенного атрибута и на экран будет выводиться сообщение об отсутствии данного атрибута.
    static class Locastors {
        private static final By tutorials = By.id("navbtn_tutorials");
        private static final By search = By.id("search2");
        private static final By learnToCode = By.xpath("//h1 [@class='learntocodeh1']");


    }
    private static class Url{
        private static final String w3schools = "https://www.w3schools.com";
    }
    // метод работать не хочет
    public static void displaysMessageElements (WebElement webElement1, WebElement webElement2, WebElement webElement3) throws NoAttributeValueException_Id, NoAttributeValueException_name {
        System.out.println("id webElement1 = " + webElement1.getAttribute("id"));
        System.out.println("id webElement2 = " + webElement2.getAttribute("id"));
        System.out.println("id webElement3 = " + webElement3.getAttribute("id"));
        if (webElement3.getAttribute("id") == null){
            throw new NoAttributeValueException_Id("Значение id элемента не найдено");
        }
        System.out.println("значение тэга webElement1 = " + webElement1.getTagName());
        System.out.println("значение тэга webElement2 = " + webElement2.getTagName());
        System.out.println("значение тэга webElement3 = " + webElement3.getTagName());
        System.out.println("значение класса webElement1 = " + webElement1.getAttribute("class"));
        System.out.println("значение класса webElement2 = " + webElement2.getAttribute("class"));
        System.out.println("значение класса webElement3 = " + webElement3.getAttribute("class"));
        System.out.println("значении атрибута name webElement1 = " + webElement1.getAttribute("name"));
        System.out.println("значении атрибута name webElement2 = " + webElement2.getAttribute("name"));
        System.out.println("значении атрибута name webElement3 = " + webElement3.getAttribute("name"));
        if (webElement3.getAttribute("name")==null){
            throw new NoAttributeValueException_name("Значение атрибута name webElement1не найдено");
        }
        System.out.println("текст внктри элемента webElement1 = " + webElement1.getText());
        System.out.println("текст внктри элемента webElement2 = " + webElement2.getText());
        System.out.println("текст внктри элемента webElement3 = " + webElement3.getText());
        System.out.println("координаты центра контейнера элемента webElement1 по оси х = " + webElement1.getSize().height/2);
        System.out.println("координаты центра контейнера элемента webElement1 по оси у = " + webElement1.getSize().width/2);

    }
    public static void main(String[] args) throws NoAttributeValueException_Id, NoAttributeValueException_name, InterruptedException {


        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(Url.w3schools);
        WebElement webElement1 = driver.findElement(Locastors.tutorials);
        WebElement webElement2 = driver.findElement(Locastors.search);
        WebElement webElement3 = driver.findElement(Locastors.learnToCode);

        displaysMessageElements(webElement1, webElement2, webElement3);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.getMessage();
//            try {
//                displaysMessageElements(webElement1, webElement2, webElement3);
//            } catch (NoAttributeValueException_name ex) {
//                ex.getMessage();
//            }
//
//
//        }
    }



}
