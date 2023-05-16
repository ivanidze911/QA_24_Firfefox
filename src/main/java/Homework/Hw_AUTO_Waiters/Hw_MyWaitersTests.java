package Homework.Hw_AUTO_Waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw_MyWaitersTests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //presenceOfElementLocated(), textToBePresentInElementValue(), invisibilityOf(),
        //titleContains(), titleIs()
        //https://www.guinnessworldrecords.com/Account/Login");
        //span[text()='Please fill in the Email field.']
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        Hw_MyWaiters waiters = new Hw_MyWaiters(driver);
//        //======================================================================================================
//      В поле "Email" ни чего не вводить, просто нажать Enter. После этого в поле "Password" введется "qwerty"
        WebElement pass = driver.findElement(By.xpath("//input[ @id='Password']"));
        WebElement userName = driver.findElement(By.xpath("//input[ @id='Username']"));
        WebElement checkBox = driver.findElement(By.xpath("//input[ @id='RememberMe']"));
        //новая реализация
        waiters.waitingPresenceOfElementLocated(By.xpath("//span[text()='Please fill in the Email field.']"));
        pass.sendKeys("qwerty");

        //старая реализация
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Please fill in the Email field.']")));
        //pass.sendKeys("qwerty");
//        //=======================================================================================================
//        В поле "Email" ввести слово "text". После этого в поле "Password" введется "qwerty"
        //новая реализация
//        waiters.waitingTextToBePresentInElementValue(userName,"text");
//        pass.sendKeys("qwerty");

        //=======================================================================================================
//        В поле "Email" очищается методом clear(). После этого в "Email" ввести любую букву.
//        userName.clear();
//        userName.submit();
//        //новая реализация
//        waiters.waitingForAnElementToDisappear(By.xpath("//span[text()='Please fill in the Email field.']"));
//        driver.navigate().to("https://itstep.dp.ua/");//контрольный ридерект
//        System.out.println(driver.getTitle());

//        //=======================================================================================================

          //новая реализация
//        waiters.waitingForPageTitle("IT курси у Дніпрі з працевлаштуванням | Академія IT STEP");
//        driver.findElement(By.xpath("//div[@class='header__wrap']//a[text()=' Блог ']")).click(); //контрольный ридерект

//        //новая реализация
//        waiters.waitTitleContainsText("Академія IT STEP");
//        driver.findElement(By.xpath("//div[@class='header__wrap']//a[text()=' Блог ']")).click(); //контрольный ридерект


    }
}
