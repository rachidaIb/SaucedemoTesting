package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.cartPage;


public class cartstp {

       static WebDriver driver =inventorySteps.driver;

       cartPage CartPage = new cartPage(driver);



       @And("user can navigate to check out button")
    public void userCanNavigateToCheckOutButton() {

          Assert.assertTrue(CartPage.checkOutButton());

    }

    @And("User able to click checkout button")
    public void userAbleToClickCheckoutButton() {

        CartPage.checkOut();
    }

       @And("the item information displayed on cart")

       public void theItemInformationDisplayedOnCart() {

       Assert.assertTrue( CartPage.ckeckItemDisplayed());
       }


    @Then("verify that user can Continue Shopping")
    public void verifyThatUserCanAddMoreItemToCart() {

        CartPage .ContinueShopping();

    }
    @Then("User can remove item in cart")
    public void userCanRemoveItemInCart() {

        CartPage.removeItem();
    }


}
