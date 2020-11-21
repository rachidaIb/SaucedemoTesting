package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.checkoutStep2Page;


public class checkoutStep2 {

       static WebDriver driver = cartstp.driver;

       checkoutStep2Page checkout2 = new checkoutStep2Page (driver);

       @Then("User land to checkout-step-two page")
        public void userLandToCheckoutStepTwoPage() {
           checkout2.checkpage();

    }

    @And("user navigate to finish button")
    public void userNavigateToFinishButton() {
        checkout2.finishButton();
    }

    @Then("verify that checkout completed")
    public void verifyThatCheckoutCompleted() {

        checkout2.checkoutComplete();
    }
}
