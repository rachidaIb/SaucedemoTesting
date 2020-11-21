package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Inventory_itemPage;


public class inventoryItemStep {


     static WebDriver driver =LoginStep.driver=inventorySteps.driver;
    Inventory_itemPage invotory_itemPage= new Inventory_itemPage(driver);


    @Then("Item information is displayed")
    public void itemInformationIsDisplayed() {
        Inventory_itemPage invotory_itemPage= new Inventory_itemPage(driver);
        Assert.assertTrue(invotory_itemPage.ItemIsVisible());


    }

    @And("user can add item to cart")
    public void userCanAddItemToCart() {

        invotory_itemPage.AddToCart();

    }

    @And("one item desplayed on cart")
    public void oneItemDesplayedOnCart() {


       Assert.assertTrue(invotory_itemPage.ItemIsVsible());

    }

        @And("user can remove item in cart")
        public void userCanRemoveItemInCart(){

       invotory_itemPage.removeItem();

    }


    @And("User can navigate back to invotory page")
    public void userCanNavigateBackToInvotoryPage() {

        invotory_itemPage.navigateBack();
    }

    @Then("user can click on cart")
    public void userCanClickOnCart() {
        invotory_itemPage.cart();

    }


}


