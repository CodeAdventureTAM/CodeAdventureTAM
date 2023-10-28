package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class MyWipro  {

    WebDriver driver;
    public MyWipro(WebDriver driver) {

        this.driver = driver;
    }

    public void callmywipro(){
        driver.get("https://mywipro.wipro.com");
        driver.findElement(By.id("i0116")).sendKeys("aarulmu@wipro.com");
       //driver.findElement(By.ByLinkText("Other ways to sign in")).click();



        WebElement mywiproLanding = driver.findElement(By.className("ufs-apps-and-tools-carousel__item__title line-clamp--2"));
        mywiproLanding.click();
        int timeout = 15;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(mywiproLanding));


        Set windows = driver.getWindowHandles();
        Iterator <String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);

        driver.findElement(By.xpath("//*[contains(@class, 'employeeDasboardMyTimesheetBtn-panel')]"));
        driver.findElement(By.cssSelector("[class*='style_for_leave buttonhover_effect']")).isEnabled();

        //System.err.println("An error occurred: " + e.getMessage());
        //WebDriver wait1 = new WebDriverWait(driver, Duration.ofSeconds());






    }
}