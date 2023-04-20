import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesoon1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://dev.mysql.com/doc/refman/8.0/en/examples.html");

        //Поиск элемента по id
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        //ez-accept-all
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("globe")).click();
    }

}
