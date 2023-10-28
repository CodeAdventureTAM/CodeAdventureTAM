package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
/*

        WebDriver driver = new ChromeDriver();
        Practice test = new Practice();
        SeleniumAssignment1CreateAccount(driver);
        SeleniumAssignment2AddtoCard(driver);
        //test.performTest(driver);
        test.tearDown(driver);
*/

        //test.exception();
    }

    private static <Dropdown> void SeleniumAssignment2AddtoCard(WebDriver driver) {
        WebElement componentMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a"));
        Actions a = new Actions(driver);
        a.moveToElement(componentMenu);
        WebElement monitors = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a"));
        monitors.click();
        WebElement addtoCart = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]"));
        addtoCart.click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"input-option218\"]/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"input-option208\"]")).sendKeys("test");
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"input-option217\"]"));
       // Dropdown selectDropdown = new Dropdown(dropdown);
        Select dropdown1 =new Select(dropdown);
        dropdown1.selectByVisibleText("Blue");



        driver.findElement(By.xpath("//*[@id=\"input-option209\"]")).sendKeys("test");
        //driver.findElement(By.xpath("//*[@id=\"button-upload222\"]")).sendKeys("C:\Users\arunt\My Drive\Profile\Profile_pes23_o.pdf");




    }

    private static void SeleniumAssignment1CreateAccount(WebDriver driver) throws InterruptedException {
        driver.get("https://naveenautomationlabs.com/opencart/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement MyAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
        //WebElement MyAccount = driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"));
        wait.until(ExpectedConditions.visibilityOf(MyAccount));
        System.out.println(MyAccount.isDisplayed());
        MyAccount.click();
        //Thread.sleep(5000);
        WebElement login = driver.findElement(By.linkText("Register"));
        wait.until(ExpectedConditions.visibilityOf(login));
        System.out.println(login.isDisplayed());
        login.click();
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstName.sendKeys("test1");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastName.sendKeys("lasttest");
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        Instant now = Instant.now();
        long currentTimeNumber = now.getEpochSecond();
        Email.sendKeys("test"+currentTimeNumber+"@test.com");
        WebElement Tele = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
        Tele.sendKeys("98765432100");
        WebElement Pass = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        Pass.sendKeys("Test@123");
        WebElement passConfirm = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        passConfirm.sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Your Account Has Been Created!");
        String successMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
        Assert.assertEquals(successMessage, "Your Account Has Been Created");


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
        //button1.getLocation()
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
        ArrayList <Integer> num = new ArrayList<Integer>();
       // ArrayList green = names.sort();





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

