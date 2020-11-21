package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory_itemPage {


    public static WebDriver driver;

     public Inventory_itemPage(WebDriver driver){

         this.driver= driver;
     }



     public boolean  ItemIsVisible(){

        return driver.findElement(By.xpath("//div[text()='29.99']")).isDisplayed();


     }
      public void AddToCart() {

          driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

      }

      public boolean ItemIsVsible(){
          driver.findElement(By.xpath("//span[text()='1']")).isDisplayed();

          return true;
      }


      public boolean removeItem(){
         driver.findElement(By.xpath("//button[text()='REMOVE']")).click();

          return true;
      }

      public void navigateBack(){

         driver.findElement(By.xpath("//button[text()='<- Back']")).click();


      }


      public void cart(){
          driver.findElement(By.id("shopping_cart_container")).click();

      }
}





