package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CheckoutStp1Page;



public class checkout1Stp {

    static WebDriver driver = cartstp.driver;

     CheckoutStp1Page checkOut1 = new CheckoutStp1Page(driver);


    @Then("User land to checkout-step-one page")
    public void userLandToCheckoutStepOnePage() {
        CheckoutStp1Page checkOut1 = new CheckoutStp1Page(driver);
        checkOut1.checkoutStp1();


    }

    @And("User insert  his first name {string}")
    public void userInsertHisFirstName(String name) {
        checkOut1.insertFirstName(name);

    }

    @And("User insert  his last name {string}")
    public void userInsertHisLastName(String lName) {
        checkOut1.userInsertLastName(lName);

    }

    @And("user insert pstal code {string}")
    public void userInsertPstalCode(String code) {

        checkOut1.insertZipCode(code);

    }

    @Then("user navigate to continue button")
    public void userNavigateToContinueButton() {

        checkOut1.ContinueButton();
    }

    @Then("User can cancel his order")
    public void userCanCancelHisOrder() {
        checkOut1. cancelOrder();
    }
}