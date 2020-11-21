package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {


    WebDriver driver;

    public cartPage(WebDriver driver){
        this.driver= driver;

    }

    public boolean ckeckItemDisplayed(){
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
        return true;
    }


    public boolean checkOutButton(){
        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).isDisplayed();
        return true;
    }

    public void checkOut(){
        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
    }


    public void ContinueShopping(){
        driver.findElement(By.xpath("//a[text()='Continue Shopping']")).click();

    }

      public void removeItem() {
          driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
      }

}


