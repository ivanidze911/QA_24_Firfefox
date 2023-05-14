package Homework.Hw_Frames_WindowHandle_Alert;


import Homework.Hw_SELECT_ACTION.SelectAction_Hw1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public class Hw_Frames_Chrome {
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
        private static final By textConsole1 = By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']/p");// для вывода текста
        private static final By lastNameNew = By.xpath("//input[@id='LastName']");
        private static final By firstNameNew = By.xpath("//input[@id='FirstName']");
        private static final By dateOfBirthDay = By.xpath("//input[@id='DateOfBirthDay']");
        private static final By dateOfBirthMonth = By.xpath("//input[@id='DateOfBirthMonth']");
        private static final By dateOfBirthYear = By.xpath("//input[@id='DateOfBirthYear']");
        private static final By countryRegion = By.xpath("//select[@id='Country']");
        private static final By Ukraine = By.xpath("//option[text() ='Ukraine']");
        private static final By Australia = By.xpath("//option[text() ='Australia']");
        private static final By countryState = By.xpath("//input[@id='State']");
        private static final By AustralianCapitalTerritory = By.xpath("//option[text() ='Australian Capital Territory']");
        private static final By email = By.xpath("//input[@id='EmailAddress']");
        private static final By confirmEmail = By.xpath("//input[@id='ConfirmEmailAddress']");
        private static final By password = By.xpath("//input[@id='Password']");
        private static final By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
        private static final By textConsole2 = By.xpath("//span[@for='ConfirmPassword']"); // для вывода текста
        private static final By сlickAlertBox = By.xpath("//button[@id='alertBox']");
        private static final By alertBox1 = By.xpath("//div[@id='output']"); //Alert1
        private static final By сlickConfirmBox = By.xpath("//button[@id='confirmBox']");
        private static final By сlickPromptBox = By.xpath("//button[@id='promptBox']");
        private static final By popupBoxOutput = By.xpath("//div[@id='output']");








        private static class Url {
            private static final String google = "https://www.google.com/search";
            private static final String guinnessWorldRecords = "https://www.guinnessworldrecords.com/account/register";
            private static final String hyrtutorials = "https://www.hyrtutorials.com/p/alertsdemo.html";
            private static final String w3schools = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit";

            public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // время ожидания драйвером элемента
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // ожидание загрузки страницы
                driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10)); // неявное ожидание отработки скриптов
                Actions actions = new Actions(driver);
                driver.get(google);
                Thread.sleep(5000);

                WebElement search1 = driver.findElement(Locastors.googleSearch);
                String descr1 = driver.getWindowHandle();
                search1.sendKeys(Url.guinnessWorldRecords);
                Thread.sleep(3000);
                search1.submit();
                Thread.sleep(3000);
                WebElement createAccount = driver.findElement(Locastors.createAccount);

                Set<String> firstDescriptors = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (окно там будет только одно)

                actions.moveToElement(createAccount)
                        .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

                Set<String> setSecond = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (тепрь их два)
                setSecond.removeAll(firstDescriptors);                 // удаляем дубликаты дескрипторов
                String descriptors2 = setSecond.iterator().next(); // проходим по элементам, находящемися во множестве setSecond и получить следующий next
                Thread.sleep(3000);


                WebElement clear = driver.findElement(Locastors.clear);
                clear.click();

                WebElement search2 = driver.findElement(Locastors.googleSearch);
                search2.sendKeys( Url.hyrtutorials);
                Thread.sleep(3000);
                search2.submit();

                Thread.sleep(3000);
                WebElement tutorials = driver.findElement(Locastors.tutorials);
                Set<String> firstDescriptorsNew = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон
                actions.moveToElement(tutorials)
                        .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

                Set<String> setSecondNew = driver.getWindowHandles(); // Получаем set из дескрипторов открытых окон (тепрь их 3)
                setSecondNew.removeAll(firstDescriptorsNew);           // удаляем дубликаты дескрипторов
                String descriptors3 = setSecondNew.iterator().next();  // проходим по элементам, находящемися во множестве setSecond и получить следующий next
                Thread.sleep(3000);

                WebElement clear2 = driver.findElement(Locastors.clear);
                clear2.click();
                Thread.sleep(3000);
                WebElement search3 = driver.findElement(Locastors.googleSearch);
                search3.sendKeys(Url.w3schools);
                Thread.sleep(3000);
                search3.submit();
                Thread.sleep(3000);

                driver.get(w3schools);
                Thread.sleep(3000);
                WebElement frame1 = driver.findElement(Locastors.iframe);
                Thread.sleep(3000);
                driver.switchTo().frame(frame1);
                Thread.sleep(3000);
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
                //выводит на консоль Note: This tutorial will not teach you how servers are processing input. Processing input is explained in our PHP tutorial.

                driver.switchTo().window(descriptors2);

                WebElement lastNameNew = driver.findElement(Locastors.lastNameNew);
                lastNameNew.sendKeys("Borisenko");
                WebElement firstNameNew = driver.findElement(Locastors.firstNameNew);
                firstNameNew.sendKeys("Vitalij");
                WebElement day = driver.findElement(Locastors.dateOfBirthDay);
                day.sendKeys("10");
                WebElement dateOfBirthMonth = driver.findElement(Locastors.dateOfBirthMonth);
                dateOfBirthMonth.sendKeys("01");
                WebElement dateOfBirthYear = driver.findElement(Locastors.dateOfBirthYear);
                dateOfBirthYear.sendKeys("1980");
                WebElement countryRegion = driver.findElement(Locastors.countryRegion);
                Select selectCountryRegion = new Select(countryRegion);
                actions.moveToElement(countryRegion).click().build().perform();
                Thread.sleep(2000);
                selectCountryRegion.selectByVisibleText("Ukraine");
                WebElement countryState = driver.findElement(Locastors.countryState);
//                Select selectStateCountry = new Select(countryState);
//                actions.moveToElement(countryState).click().build().perform();
                Thread.sleep(2000);
                countryState.sendKeys("Dnipro");
                //selectStateCountry.selectByVisibleText("Dnipro");
                //actions.moveToElement(driver.findElement(Locastors.AustralianCapitalTerritory)).click().build().perform();

                WebElement email = driver.findElement(Locastors.email);
                email.sendKeys("borisenko@gmail.biz");
                WebElement confirmEmail = driver.findElement(Locastors.confirmEmail);
                confirmEmail.sendKeys("borisenko@gmail.biz");
                WebElement password =driver.findElement(Locastors.password);
                password.sendKeys("qwertyuiop");
                WebElement confirmPassword =driver.findElement(Locastors.confirmPassword);
                confirmPassword.sendKeys("asdfghjkll");
                confirmPassword.sendKeys(Keys.ENTER);
                System.out.println(driver.findElement(Locastors.textConsole2).getText());

                driver.switchTo().window(descriptors3); // до сюда отработало
                WebElement сlickAlertBox = driver.findElement(Locastors.сlickAlertBox);
                сlickAlertBox.click();
                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
                Alert alertWindow1 = wait.until(ExpectedConditions.alertIsPresent());
                alertWindow1.accept();
                Thread.sleep(2000);
                System.out.println(driver.findElement(Locastors.alertBox1).getText());
                Thread.sleep(2000);
                WebElement сlickConfirmBox = driver.findElement(Locastors.сlickConfirmBox);
                сlickConfirmBox.click();
                Alert alertWindow2 = wait.until(ExpectedConditions.alertIsPresent());
                alertWindow2.accept();
                Thread.sleep(2000);
                System.out.println(driver.findElement(Locastors.alertBox1).getText());
                Thread.sleep(2000);
                WebElement сlickPromptBox =driver.findElement(Locastors.сlickPromptBox);
                сlickPromptBox.click();
                Thread.sleep(2000);
                Alert popupBoxOutput = wait.until(ExpectedConditions.alertIsPresent());
                popupBoxOutput.sendKeys("\'Final step of this task\'");
                popupBoxOutput.accept();
                System.out.println(driver.findElement(Locastors.popupBoxOutput).getText());
                Thread.sleep(5000);
                driver.quit();































            }
        }
    }

}
