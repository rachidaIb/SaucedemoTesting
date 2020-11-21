package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver= driver;
    }



   public void insertusernName(String username) {

        driver.findElement(By.id("user-name")).sendKeys(username);
   }
    public void insertPassWord(String password) {

        driver.findElement(By.id("password")).sendKeys(password);
     }

    public void login(){

        driver.findElement(By.id("login-button")).click();
    }

    public boolean errorButton(){

        return driver.findElement(By.xpath("//button[@class='error-button']")).isDisplayed();

    }
  public void menuOptionIsVisible(){



  }

     }