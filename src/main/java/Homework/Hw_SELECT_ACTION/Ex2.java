package hw24;

//        http://www.ashortjourney.com/
//        Написать программу, которая будет автоматизировать сценарий показанный на видео "Сценарий для автоматизации.mp4".

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2 {
    private static class Url {
        private static final String ashortjourney = "http://www.ashortjourney.com/";
    }

    public static class Locators {
        public static final By r40 = By.cssSelector("[r = '40']");
        public static final By r8 = By.cssSelector("[r = '8']");
        public static final By textArea = By.cssSelector("textarea");
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        Ex2 ex2 = new Ex2();
        driver.manage().window().maximize();
        driver.get(Url.ashortjourney);
        Thread.sleep(10000);

        WebElement r40 = driver.findElement(Locators.r40);
        WebElement r8 = driver.findElement(Locators.r8);
        int x = r8.getLocation().x + r8.getSize().width / 2;
        int y = r8.getLocation().y + r8.getSize().height / 2;
        actions.moveToElement(r40).clickAndHold().moveByOffset(x, y).release().build().perform();
        Thread.sleep(5000);

        ex2.dragAndDrop(driver, actions, Locators.r40, Locators.r8);
        ex2.dragAndDrop(driver, actions, Locators.r40, Locators.r8);
        ex2.dragAndDrop(driver, actions, Locators.r40, Locators.r8);
        ex2.dragAndDrop(driver, actions, Locators.r40, Locators.r8);
        ex2.dragAndDrop(driver, actions, Locators.r40, Locators.r8);
        ex2.dragAndDrop(driver, actions, Locators.r40, Locators.r8);

        WebElement textArea = driver.findElement(Locators.textArea);
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