package kushan;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.NotConnectedException;
import org.testng.Assert;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;



public class testone {
    
    //WebDriver driver;
	WebDriver driver;
@Test
public void testSearch()
    {
    try {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.lk");
        
        
        driver.findElement(By.id("lst-ib1")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
        
        String webTitle = driver.getTitle();
        
        Assert.assertEquals(webTitle, "Selenium - Web Browser Automation");
        driver.close();
        driver.quit();
      }
    
  
        catch (NoSuchElementException e) 
        {
            System.out.println("Element was not found sorry");
        }
        catch (NoAlertPresentException e) 
        {
            System.out.println("Alert was not found sorry");
        }
        catch (NoSuchWindowException e) 
        {
            System.out.println("Window was not found sorry");
        }
        
    }

}