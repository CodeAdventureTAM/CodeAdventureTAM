package org.example;

import dev.failsafe.spi.ExecutionResult;
import org.apache.cassandra.streaming.StreamOut;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static dev.failsafe.spi.ExecutionResult.exception;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Practice test = new Practice();
        //test.performTest(driver);
        test.tearDown(driver);
        //test.exception();
    }


    private void performTest(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("Title is"+driver.getTitle());
        System.out.println("Verifying Checkbox");
        driver.findElement(By.className("radioButton")).click();

        // AutoSelect Verification
        System.out.println("Now verifying autocomplete");
        WebElement suggestion = driver.findElement(By.id("autocomplete"));
        suggestion.sendKeys("Ind");
        List <WebElement> auto = driver.findElements(By.className("ui-menu-item"));


        for(WebElement a : auto)
        {
            if (a.getText().equalsIgnoreCase("India"))
                a.click();
            Thread.sleep(2000);
        }

        WebElement AutoComplete = driver.findElement(By.id("ui-id-80"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(AutoComplete));


        /*AutoComplete.click();
        System.out.println("AutoComplete Works");*/


        /*Dropdown dropdownObject = new Dropdown(dropdown);
        Dropdown dropdown = new Dropdown(driver.findElement(By.id("dropdown-class-example")));*/
        WebElement dropdown_ele = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(dropdown_ele);
        dropdown.selectByVisibleText("Option1");
        String dropdownValue = dropdown_ele.getText();
        System.out.println(dropdownValue+ "is selected in dropdown");

        //CheckBox verification

        System.out.println("Verifying Checkbox");
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        if (checkbox.isSelected())
            System.out.println("Checkbox already selected");
        else
        {
            checkbox.click();
            System.out.println("Checkbox is selected now");
        }

        //Window Handling
        driver.findElement(By.className("btn-style")).click();
        Set <String> windows = driver.getWindowHandles();
        Iterator <String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow= it.next();
        driver.switchTo().window(parentWindow);
        System.out.println("Switched to Parent Window "+driver.getTitle());
        driver.switchTo().window(childWindow);
        System.out.println("Switched to Child Window "+driver.getTitle());
        driver.manage().window().minimize();
        driver.switchTo().window(parentWindow);

        //Alert verificaiton
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("name")).sendKeys("TestAlert");
        driver.findElement(By.id("confirmbtn")).click();
        String AlertOutput = driver.switchTo().alert().getText();
        Assert.assertEquals(AlertOutput,"Hello TestAlert, Are you sure you want to confirm?");
        driver.switchTo().alert().dismiss();

        //Verify Element displayed
        System.out.println("Element displayed status "+driver.findElement(By.id("displayed-text")).isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println("Element displayed status "+driver.findElement(By.id("displayed-text")).isDisplayed());
        driver.findElement(By.id("show-textbox")).click();
        System.out.println("Element displayed status "+driver.findElement(By.id("displayed-text")).isDisplayed());


        //MouseHover Verification
        WebElement mouse = driver.findElement(By.id("mousehover"));
        Actions a = new Actions(driver);
        a.moveToElement(mouse);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[4]/div/fieldset/div/div/a[1]"));


        //frames Switch
        driver.switchTo().frame(driver.findElement(By.className("theme-btn")));

        driver.findElement(By.className("fa-lock")).click();
        Thread.sleep(2000);

        ArrayList <String> names = new ArrayList<>();
        names.add("green");
        names.add("Yellow");

        ArrayList green = names.sort();
        for (String nameIt : names)
            if (officename = <office locaiton>)




    }

    /*private void exception() {
        try {
            int a = (1/0);
            System.out.println(a);
        }catch (Ex e){System.err.println();
        e.getStackTrace();
        }
    }*/

    public void tearDown(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

}

