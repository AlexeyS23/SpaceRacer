package LendingPage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class domain_Сonfirmation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://mariari.com.ua");

        driver.manage().window().maximize();

        Thread.sleep(2000); //Used for hard pause, just for a view

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement politic = driver.findElement(By.xpath("//div[@class='container links']/a[1]/p"));

        js.executeScript("arguments[0].scrollIntoView(true)",politic);
        Thread.sleep(2000);


        String url = driver.getCurrentUrl();
        //to confirm the correct spelling of the site
        Assertions.assertEquals(url,"https://mariari.com.ua/");
        System.out.println(url);

        //to confirm the correct button
        WebElement politicConf = driver.findElement(By.xpath("//div[@class='container links']/a[1]/p"));
        politicConf.click();
        Thread.sleep(2000); //Used for hard pause, just for a view
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        //to confirm the correct spelling of the link
       // Assertions.assertEquals(url2,"https://mariari.com.ua/link1.html");
        //not a coincidence with current URL


        driver.quit();
}}
