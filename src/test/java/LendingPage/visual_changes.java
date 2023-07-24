package LendingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class visual_changes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mariari.com.ua");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //clicking to view product images
        WebElement gif = driver.findElement(By.xpath("//*[@id='slider_nav']/div/div/div[2]/div/div/img"));
        gif.click();
        Thread.sleep(2000);
        WebElement pic3 = driver.findElement(By.xpath("//*[@id='slider_nav']/div/div/div[3]/div/div/img"));
        pic3.click();
        Thread.sleep(2000);
        WebElement pic4 = driver.findElement(By.xpath("//*[@id='slider_nav']/div/div/div[4]/div/div/img"));
        pic4.click();
        Thread.sleep(2000);
        WebElement pic5 = driver.findElement(By.xpath("//*[@id='slider_nav']/div/div/div[5]/div/div/img"));
        pic5.click();
        Thread.sleep(2000);
        WebElement pic1 = driver.findElement(By.xpath("//*[@id='slider_nav']/div/div/div[1]/div/div/img"));
        pic1.click();

        //opinion
        WebElement rightBut = driver.findElement(By.xpath("//section[11]/div/div/button[2]"));
        rightBut.click();
        Thread.sleep(2000);
        rightBut.click();
        Thread.sleep(2000);
        WebElement leftBut = driver.findElement(By.xpath("//section[11]/div/div/button[1]"));
        leftBut.click();
        Thread.sleep(2000);
        leftBut.click();

        driver.quit();


    }
}
