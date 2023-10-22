package org.example;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
//import org.junit.Assert;


public class SeleniumBrushUp {


    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunt\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\arunt\\OneDrive\\Documents\\Automation\\msedgedriver.exe");
        SeleniumBrushUp pp = new SeleniumBrushUp();
        WebDriver driver = new ChromeDriver();



         // driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       /* Actions a = new Actions(driver);
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

    //WebDriver driver= new EdgeDriver();
    //WebDriver driver = new ChromeDriver();
/*
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
    System.out.println(driver.findElement(By.xpath("//div/h3")).getText());*/


/*

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunt\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/
       /* driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement source =driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        Actions move = new Actions(driver);
        move.dragAndDrop(source, destination);
        System.out.println("Move complete");*/

/*
        MyWipro mywipro = new MyWipro(driver);
        mywipro.callmywipro();*/
       //


/*

        driver.get("http://google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.click();
        searchbox.sendKeys("true");
        searchbox.sendKeys(Keys.ENTER);
        driver.findElement(new By.ByLinkText("true"));



        Actions a = new Actions(driver);
*/
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.indiumsoftware.com/");

        // Verify that the title of the page is correct
        Assert.assertEquals(driver.getTitle(), "Indium Software | Digital Transformation | Product Engineering | Agile | AI | Cloud | Cybersecurity");

        // Verify that the logo is displayed
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Indium Software Logo']"));
        Assert.assertTrue(logo.isDisplayed());


        // Verify that the navigation bar is displayed
        WebElement navBar = driver.findElement(By.xpath("//nav[@id='main-nav']"));
        Assert.assertTrue(navBar.isDisplayed());




        // Verify that the contact information is displayed
        WebElement contactInfo = driver.findElement(By.xpath("//div[@class='contact-info']"));
        Assert.assertTrue(contactInfo.isDisplayed());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(contactInfo));


        pp.tearDown(driver);


    }


    public void tearDown(WebDriver driver) throws InterruptedException {
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();

        WebElement Email = driver.findElement(By.id("email-input"));
        WebElement password = driver.findElement(By.id("password-input"));
        Email.sendKeys("login@codility.com");

       // WebElement passMessage = driver.findElement(By.xpath("//div[@class=validation error]")).getText();
        //Assert.assertEquals(failuresMessage,"You shall not pass! Arr!");
        //passMessage.isDisplayed
    }
}
