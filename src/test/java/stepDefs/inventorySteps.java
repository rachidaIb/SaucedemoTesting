package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.InventoryPage;
import pages.LoginPage;




public class inventorySteps {

    static WebDriver driver=LoginStep.driver;

    InventoryPage inventoryPage;


    @Then("user should land on the invontory page")
    public void user_should_land_on_the_invontory_page() {
        InventoryPage inventoryPage= new InventoryPage(driver);

        Assert.assertTrue(inventoryPage.CheckElementIsVisible());
    }



    @And("navigation menu should be visible")
    public void navigationMenuShouldBeVisible() {

        InventoryPage inventoryPage= new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.MenuIsDisplayed());

    }

    @Then("user should see open menu")
    public void userShoulSeeOpenMenu() {
        InventoryPage inventoryPage= new InventoryPage(driver);
        inventoryPage.OpenMenu();

    }


    @And("user can see menu options")
    public void userCanSeeMenuOptions() {
        InventoryPage inventoryPage= new InventoryPage(driver);
       Assert.assertTrue (inventoryPage.MenuItems()==4);


    }

    @Then("user navigate to {string}")
    public void userNavigateTo(String link) {
        InventoryPage inventoryPage= new InventoryPage(driver);
        inventoryPage.navigateToLink(link);

    }


    @Then("all prodect should be available")
    public void allProdectShouldBeAvailable() {
        InventoryPage inventoryPage= new InventoryPage(driver);
        Assert.assertTrue (inventoryPage.checkProduct()==6);

    }


    @And("sort by {string}")
    public void sortBy(String option) {
        InventoryPage inventoryPage= new InventoryPage(driver);
        inventoryPage.sortProducts(option);

    }


    @And("the the first law price product name{string} displayed")
    public void theTheFirstLawPriceProductNameDisplayed(String name) {
        InventoryPage inventoryPage= new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.checkFirstProduct().equals(name));

    }

    @And("user can navigate to {string}items")
    public void userCanNavigateToItems(String item) {
        InventoryPage inventoryPage= new InventoryPage(driver);
        inventoryPage.OpenItem(item);
    }









}
