package Homework.Hw_SELECT_ACTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class SelectAction_Hw2 {
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

                WebElement start = driver.findElement(Locastors.startingPoint);
                WebElement end = driver.findElement(Locastors.endPoint);
                //1-й вариант
                actions.dragAndDrop(start,end).build().perform();
                Thread.sleep(4000);
                actions.release().perform();

                //2-й вариант
                actions.moveToElement(start).clickAndHold().moveToElement(end).build().perform();
                Thread.sleep(4000);
                actions.release().perform();

                for (int i =0; i<10; i++){
                    actions.moveToElement(start).clickAndHold().moveToElement(end).build().perform();
                    Thread.sleep(3000);
                    actions.release().perform();
                    Thread.sleep(2000);
                }


                //4-й вариант
                System.out.println("Размер нашей кнопки "+ start.getSize()); //Размер нашей кнопки (34, 25)
                System.out.println("Размер нашей кнопки "+ end.getSize()); //Размер нашей кнопки (17, 17)
                System.out.println("Местонахождение верхнего левого угла элемента " + start.getLocation()); //(609, 218)
                System.out.println("Местонахождение верхнего левого угла элемента " + end.getLocation());  // (760, 685)
                int start_x = start.getLocation().x +(start.getSize().width)/2;
                int start_y = start.getLocation().y+(start.getSize().height)/2;
                int end_x = end.getLocation().x+(end.getSize().width)/2;
                int end_y = end.getLocation().y+(end.getSize().height)/2;
                System.out.println("start_x = " + start_x); //626
                System.out.println("start_y = " + start_y); //230
                System.out.println("end_x = " + end_x);     //768
                System.out.println("end_y = " + end_y);     //693
                Thread.sleep(3000);
                actions.moveByOffset(start_x,start_y).clickAndHold().moveByOffset(end_x,end_y).release().build().perform();
                Thread.sleep(3000);
                //actions.release().perform();



                //Thread.sleep(5000);

                //driver.quit();

            }
        }
    }



}
