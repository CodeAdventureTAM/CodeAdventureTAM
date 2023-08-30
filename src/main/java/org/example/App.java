package org.example;
import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import javax.swing.*;
import java.util.Iterator;
import java.util.Set;


public class App {

    public static void main(String[] args) throws InterruptedException {
    /*  //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunt\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        Thread.sleep(1500);
        driver.findElement(By.linkText("Top")).click();
        a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        driver.findElement(By.linkText("Reload")).click();

//        driver.findElement(By.xpath("//input[@class='radioButton']"));
//        //        System.out.println(driver.getTitle());
//        driver.close();
        WebElement inputElement = driver.findElement(By.xpath("//input[@autocomplete='off']"));
        inputElement.sendKeys("Test");
        if (inputElement.isDisplayed())
            System.out.println("input text displayed");
        else
            System.out.println("INput text not displayed.");
        Actions inputElementa =new Actions(driver);
        inputElementa.moveToElement(driver.findElement(By.xpath("//input[@autocomplete='off']"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("tset");
        Thread.sleep(1000);

        WebElement checkboxstatus = driver.findElement(By.id("checkBoxOption1"));
        if (checkboxstatus.isSelected())
            System.out.println("Checked Already");
        else {
            checkboxstatus.click();
            System.out.println("Just checked the box");
            }

        Select dropdown =new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText("Option1");
        System.out.println("Option1 selected");
        dropdown.selectByVisibleText("Option2");
        System.out.println("Option2 selected");

        driver.findElement(By.linkText("Open Tab")).click();
       *//* Set <String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Main Page Title"))
                break;
        }*//*
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentwindow = it.next();
        String childwindow = it.next();
        driver.switchTo().window(parentwindow);
        Thread.sleep(2000);
        driver.switchTo().window(childwindow);
        Thread.sleep(2000);
        driver.switchTo().window(childwindow);
        Thread.sleep(2000);


*/

    WebDriver driver= new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.findElement(By.linkText("Multiple Windows")).click();
    driver.findElement(By.linkText("Click Here")).click();
    //System.out.println(driver.getTitle());
    Set<String> windows = driver.getWindowHandles();
    Iterator <String> it = windows.iterator();
    String parentwindow = it.next();
    String childwindow = it.next();
    driver.switchTo().window(childwindow);
    System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
    driver.switchTo().window(parentwindow);
    System.out.println(driver.findElement(By.xpath("//div/h3")).getText());







        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();

    }
}