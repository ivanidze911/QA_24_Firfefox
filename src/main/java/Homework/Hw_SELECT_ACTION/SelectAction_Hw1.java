package Homework.Hw_SELECT_ACTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectAction_Hw1 {
    //1) http://only-testing-blog.blogspot.com/2014/01/textbox.html?
    //Написать программу реализующую действие показанное на "видео1.mp4".
    //После выполнения программы на консоли должна выводится информация в следующем виде:
    //
    //Автомобили доступные для выбора:
    //Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
    //Страны из первой таблицы:
    //USA, Russia, Japan, Mexico, India, Malaysia, Greece.
    //Страны из второй таблицы:
    //France, Germany, Italy, Spain.

    private static class Locastors {
        private static final By carlist = By.id("Carlist");
        private static final By сountriesList1 = By.xpath("//select[@name ='FromLB']");
        private static final By сountriesList2 = By.xpath("//select[@name ='ToLB']");
        //private static final By Renault = By.id("car6");
        private static final By Renault = By.xpath("//option[text()= 'Renault']");
        private static final By France = By.xpath("//select[@name ='FromLB']/option/following-sibling::option[2]");
        private static final By Germany = By.xpath("//option[text()= 'Germany']");
        private static final By Italy = By.xpath("//option[text()= 'Italy']");
        private static final By Spain = By.xpath("//option[text()= 'Spain']");
        private static final By click = By.xpath("//input[@onclick ='move(this.form.FromLB,this.form.ToLB)']");






        private static class Url {
            private static final String blogspot = "http://only-testing-blog.blogspot.com/2014/01/textbox.html";



            public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.firefox.driver", "C:\\geckodriver_v0.33.0_win_aarch64\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                Actions actions = new Actions(driver);
                driver.get(blogspot);
                Thread.sleep(2000);
                WebElement carList = driver.findElement(Locastors.carlist);
                Select selectCar = new Select(carList);
                WebElement сountriesList1 = driver.findElement(Locastors.сountriesList1);
                Select selectCountries1 = new Select(сountriesList1);
                WebElement сountriesList2 = driver.findElement(Locastors.сountriesList2);
                Select selectCountries2 = new Select(сountriesList2);



                actions.moveToElement(carList).perform();
                actions.click(carList).perform();
                Thread.sleep(2000);
//                actions.moveToElement(driver.findElement(Locastors.Renault)).click().build().perform();
                selectCar.selectByVisibleText("Renault");
                System.out.println("Автомобили доступные для выбора: ");
                List<WebElement> allCars = selectCar.getOptions();
                for (WebElement cars:allCars){
                   System.out.print(cars.getText() + ", ");
                }
                Thread.sleep(2000);

                actions.moveToElement(сountriesList1).perform();
                //actions.click(сountriesList).perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.France)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.click)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.Germany)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.click)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.Italy)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.click)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.Spain)).click().build().perform();
                Thread.sleep(2000);
                actions.moveToElement(driver.findElement(Locastors.click)).click().build().perform();
                Thread.sleep(2000);

                System.out.println("\nСтраны из первой таблицы: ");
                List<WebElement> сountriesАromTheFirstTable1 = selectCountries1.getOptions();
                for (WebElement сountries:сountriesАromTheFirstTable1){
                    System.out.print(сountries.getText()+ ", ");
                }
                Thread.sleep(2000);

                System.out.println("\nСтраны из второй таблицы: ");
                List<WebElement> сountriesАromTheFirstTable2 = selectCountries2.getOptions();
                for (WebElement сountries:сountriesАromTheFirstTable2){
                    System.out.print(сountries.getText()+ ", ");
                }
                Thread.sleep(2000);

                driver.quit();

            }
        }
    }



}
