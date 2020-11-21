package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutStep2Page {

    WebDriver driver;
    public checkoutStep2Page (WebDriver driver){
         this.driver= driver;

     }

    public boolean checkpage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two"));
        return true;
    }
    public void finishButton(){

        driver.findElement(By.xpath("//a[text()='FINISH']")).click();
    }
     public void checkoutComplete(){

        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete"));
     }

  }
