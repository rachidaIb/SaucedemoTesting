package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStp1Page {

    public static WebDriver driver;

    public CheckoutStp1Page(WebDriver driver){
        this.driver = driver;

    }

   public void checkoutStp1(){
       Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-one"));

   }
    public void insertFirstName(String name){

        driver.findElement(By.id("first-name")).sendKeys(name);
    }
      public void userInsertLastName(String lName){
        driver.findElement(By.id("last-name")).sendKeys(lName);

  }

    public void insertZipCode(String code){
        driver.findElement(By.id("postal-code")).sendKeys(code);

   }
    public void ContinueButton() {

        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
    }
    public void cancelOrder(){

        driver.findElement(By.xpath("//a[text()='CANCEL']")).click();
    }
}
