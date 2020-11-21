package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;

    }



    public boolean CheckElementIsVisible() {
        return driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();

    }

    public boolean MenuIsDisplayed(){
        return driver.findElement(By.xpath("//button[text()='Open Menu']")).isDisplayed();
    }

    public void OpenMenu(){
        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
    }

      public int MenuItems() {
          List<WebElement> items = driver.findElements(By.xpath("//nav/a"));
          return items.size();
      }


      public void navigateToLink(String link) {
        driver.findElement(By.linkText("All Items")).click();
      }

      public int checkProduct(){
          List<WebElement>checkProduct=driver.findElements(By.xpath("//div[@class='inventory_item']"));
          return checkProduct.size();

      }

      public void sortProducts(String option){
          WebElement dropdown= driver.findElement(By.xpath("//select"));
          Select select= new Select(dropdown);
          select.selectByVisibleText(option);



      }

    public String checkFirstProduct() {
       WebElement first= driver.findElements(By.xpath("//div[@class='inventory_item']")).get(1);
        return first.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
    }

      public void OpenItem(String item){
          driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

      }







   public void AddToCart(){
       List<WebElement>AddToCart = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
        AddToCart=driver.findElements(By.id("item_5_img_link"));

    }




}
