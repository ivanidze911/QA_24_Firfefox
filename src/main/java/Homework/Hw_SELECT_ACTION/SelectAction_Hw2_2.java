package Homework.Hw_SELECT_ACTION;

import hw24.Ex2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SelectAction_Hw2_2 {
    //2) http://www.ashortjourney.com/
    // Написать программу, которая будет автоматизировать
    // сценарий показанный на видео "Сценарий для автоматизии.mp4".

    private static class Locastors {
        //        private static final By startingPoint = By.xpath("//div[@id='fb-root']/following-sibling::*[1]/child::*[1]/following-sibling::*[1]/following-sibling::*[1]/following-sibling::*[1]/following-sibling::*[1]/following-sibling::*[1]/following-sibling::*[1]");
//        private static final By startingPoint = By.xpath("//div[@id='fb-root']/following-sibling::*[1]/child::*[1]/following-sibling::*[1]/following-sibling::*[1]/following-sibling::*[1]/following-sibling::*[1]");
        private static final By startingPoint = By.xpath("//*[local-name() ='text']");

        //private static final By endPoint = By.xpath("//li[@id='ui-sound']");
        private static final By endPoint = By.xpath("//*[local-name() ='circle'][1]");
        private static final By OrContiniueTheStory = By.xpath("//a[@id ='postcard-continue-button']"); // для страницы с конвертом
        private static final By r40 = By.cssSelector("[r = '40']");
        private static final By r8 = By.cssSelector("[r = '8']");
        private static final By textArea = By.cssSelector("textarea");


        private static class Url {
            private static final String hortjourney = "http://www.ashortjourney.com";

            public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                Actions actions = new Actions(driver);
                driver.get(hortjourney);
                Thread.sleep(10000);
                //System.out.println(driver.getPageSource());
                Ex2 ex2 = new Ex2();

                WebElement r40 = driver.findElement(Ex2.Locators.r40);
                WebElement r8 = driver.findElement(Ex2.Locators.r8);
                int x = r8.getLocation().x + r8.getSize().width / 2;
                int y = r8.getLocation().y + r8.getSize().height / 2;
                actions.moveToElement(r40).clickAndHold().moveByOffset(x, y).release().build().perform();
                Thread.sleep(5000);

                ex2.dragAndDrop(driver, actions, Ex2.Locators.r40, Ex2.Locators.r8);
                ex2.dragAndDrop(driver, actions, Ex2.Locators.r40, Ex2.Locators.r8);
                ex2.dragAndDrop(driver, actions, Ex2.Locators.r40, Ex2.Locators.r8);
                ex2.dragAndDrop(driver, actions, Ex2.Locators.r40, Ex2.Locators.r8);
                ex2.dragAndDrop(driver, actions, Ex2.Locators.r40, Ex2.Locators.r8);
                ex2.dragAndDrop(driver, actions, Ex2.Locators.r40, Ex2.Locators.r8);

                WebElement textArea = driver.findElement(Ex2.Locators.textArea);
                textArea.sendKeys("Mission accomplished!");
                Thread.sleep(5000);

                driver.quit();
            }

            public void dragAndDrop(WebDriver driver, Actions actions, By locator1, By locator2) throws InterruptedException {
                WebElement element1 = driver.findElement(locator1);
                WebElement element2 = driver.findElement(locator2);
                actions.dragAndDrop(element1, element2).perform();
                Thread.sleep(5000);
            }
        }
    }



}
