package Homework.Hw_Frames_WindowHandle_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class Hw_Frames_1 {
    //Необходимо автоматизировать сценарий, который показан на видео “Сценарий для автоматизации.mp4”.

    private static class Locastors {
        private static final By lastName = By.xpath("//input[@id='LastName']");
        private static final By firstName = By.xpath("//input[@id='FirstName']");
        private static final By day = By.xpath("//input[@id='DateOfBirthDay']");
        private static final By month = By.xpath("//input[@id='DateOfBirthMonth']");
        private static final By year = By.xpath("//input[@id='DateOfBirthYear']");
        private static final By country = By.xpath("//select[@id='Country']");




        private static class Url {
            private static final String google = "https://www.google.com/search";
            private static final String guinnessWorldRecords = "https://www.guinnessworldrecords.com/account/register";
            private static final String hyrtutorials = "https://www.hyrtutorials.com/p/alertsdemo.html";
            private static final String w3schools = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit";

            public static void main(String[] args) throws InterruptedException {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--disable-notifications");
                System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // время ожидания драйвером элемента
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // ожидание загрузки страницы
                driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10)); // неявное ожидание отработки скриптов
                Actions actions = new Actions(driver);
                driver.get(guinnessWorldRecords);
                Thread.sleep(8000);

                driver.findElement(By.id("ez-accept-all")).click();




















            }
        }
    }

}
