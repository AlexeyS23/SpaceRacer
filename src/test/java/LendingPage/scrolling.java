package LendingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://mariari.com.ua");
        driver.manage().window().maximize();

        Thread.sleep(2000); //Used for hard pause, just for a view

        //scroll down and up
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //down
        js.executeScript("window.scrollBy(0,1000)");
        //wait
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0,1500)");
        //up
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-2000)");
        Thread.sleep(2000);

        WebElement politic = driver.findElement(By.xpath("//div[@class='container links']/a[1]/p"));

        js.executeScript("arguments[0].scrollIntoView(true)",politic);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-3500)");
        Thread.sleep(2000);

        driver.quit();
    }

}

