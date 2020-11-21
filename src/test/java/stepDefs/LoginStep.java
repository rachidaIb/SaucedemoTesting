package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginStep {

    public static WebDriver driver;



    LoginPage loginPage;

    String URL = "https://www.saucedemo.com/";

   @Given("User is on sauceDemo page")
  public void user_is_on_sauce_demo_page() {

       System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get(URL);
   }

    @Given("User Logs with {string} and {string}")
   public void user_logs_with_and(String username, String password) {
           loginPage= new LoginPage(driver);
           loginPage.insertusernName(username);
           loginPage.insertPassWord(password);
           loginPage.login();
}

    @Then("user should see the error button")
    public void userShouldSeeTheErrorButton() {
       Assert.assertTrue(loginPage.errorButton());



    }
}









