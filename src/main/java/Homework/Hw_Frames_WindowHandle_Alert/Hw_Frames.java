package Homework.Hw_Frames_WindowHandle_Alert;

import Homework.Hw4_Driver.WebDriverMethods_Hw5;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class Hw_Frames {
    //Необходимо автоматизировать сценарий, который показан на видео “Сценарий для автоматизации.mp4”.

    private static class Locastors {
        private static final By googleSearch = By.id("APjFqb");
        private static final By createAccount = By.xpath("//h3[text()='Create account | Guinness World Records']");
        private static final By tutorials = By.xpath("//h3[text()='AlertsDemo - H Y R Tutorials']");
        private static final By clear = By.xpath("//span[@class='ExCKkf z1asCe rzyADb']");//кнопка"очистить"
        private static final By w3schools = By.xpath("//h3[text()='HTML Forms - W3Schools Tryit Editor']");
        private static final By iframe = By.xpath("//iframe[@id='iframeResult']");
        private static final By firstName = By.xpath("//input[@id='fname']");
        private static final By lastName = By.xpath("//input[@id='lname']");
        private static final By submit = By.xpath("//input[@type='submit']");
        private static final By textConsole1 = By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']/p");//вывод текста






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
                driver.get(google);
                Thread.sleep(8000);

                WebElement search1 = driver.findElement(Locastors.googleSearch);
                String descr1 = driver.getWindowHandle();
                search1.sendKeys(Url.guinnessWorldRecords);
                Thread.sleep(5000);
                search1.submit();
                Thread.sleep(5000);
                WebElement createAccount = driver.findElement(Locastors.createAccount);

                Set<String> firstDescriptors = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (окно там будет только одно)

                actions.moveToElement(createAccount)
                        .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

                Set<String> setSecond = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (тепрь их два)
                setSecond.removeAll(firstDescriptors);                 // удаляем дубликаты дескрипторов
                String descriptors2 = setSecond.iterator().next(); // проходим по элементам, находящемися во множестве setSecond и получить следующий next
                Thread.sleep(5000);


                WebElement clear = driver.findElement(Locastors.clear);
                clear.click();

                WebElement search2 = driver.findElement(Locastors.googleSearch);
                search2.sendKeys( Url.hyrtutorials);
                Thread.sleep(5000);
                search2.submit();

                //Set<String> firstWindowsUp = driver.getWindowHandles();
                Set<String> firstDescriptorsNew = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (окно там будет только одно)

                Thread.sleep(5000);
                WebElement tutorials = driver.findElement(Locastors.tutorials);
                actions.moveToElement(tutorials)
                        .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

                Set<String> setSecondNew = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (тепрь их 3)
                setSecondNew.removeAll(firstDescriptors);           // удаляем дубликаты дескрипторов
                setSecondNew.removeAll(firstDescriptorsNew);           // удаляем дубликаты дескрипторов
                String descriptors3 = setSecondNew.iterator().next();  // проходим по элементам, находящемися во множестве setSecond и получить следующий next

                Thread.sleep(5000);

                WebElement clear2 = driver.findElement(Locastors.clear);
                clear2.click();
                Thread.sleep(5000);
                WebElement search3 = driver.findElement(Locastors.googleSearch);
                search3.sendKeys(Url.w3schools);
                Thread.sleep(5000);
                driver.get(w3schools);
                search3.submit();
                Thread.sleep(5000);

                WebElement frame1 = driver.findElement(Locastors.iframe);
                driver.switchTo().frame(frame1);
                Thread.sleep(4000);
                WebElement firstName = driver.findElement(Locastors.firstName);
                firstName.clear();
                Thread.sleep(3000);
                firstName.sendKeys("Vitalij");
                Thread.sleep(3000);
                WebElement lastName = driver.findElement(Locastors.lastName);
                Thread.sleep(3000);
                lastName.clear();
                lastName.sendKeys("Borisenko");
                Thread.sleep(3000);
                WebElement submit = driver.findElement(Locastors.submit);
                submit.submit();
                Thread.sleep(3000);
                System.out.println(driver.findElement(By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']/p")).getText());

                driver.switchTo().window(descriptors2);
                //driver.switchTo().window(descriptors3);

















            }
        }
    }

}
