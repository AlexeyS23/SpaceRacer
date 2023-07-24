package LendingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonResalt {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://mariari.com.ua");

        driver.manage().window().maximize();

        //not unic
        WebElement but1 = driver.findElement(By.xpath("/html/body/section[5]/div/a"));
        but1.click();
        Thread.sleep(2000);
        WebElement but2 = driver.findElement(By.xpath("/html/body/section[9]/div/a"));
        but2.click();

        //go next
        WebElement name = driver.findElement(By.xpath("//input[@name='name'][@type='text']"));
        name.sendKeys("Yo");
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone'][@type='tel']"));
        phone.sendKeys("1234567");

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//button[@class='button-m']"));
        button.click();

        Thread.sleep(2000);

        //without order
        WebElement back = driver.findElement(By.xpath("//section[@class='check']/div/a"));
        back.click();

        driver.quit();

}}
