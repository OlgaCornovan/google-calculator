package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CalcPageObject;

public class AESteps extends BaseSteps{
    private CalcPageObject calcPage = new CalcPageObject(driver);

    public AESteps() throws Exception {
    }

    @Given("^I navigate to ae website$")
    public void iNavigateToGoogleSite() {
        calcPage.navigateToAeSite();
    }

    @And("^I click login button$")
    public void iClickLoginButton(){
        calcPage.clickLoginBtn();
    }

    @And ("^I fill in with my email \"([^\"]*)\"$")
    public void iFillInInvalidEmail (String email) {
        calcPage.fillInInvalidEmail(email);
    }

    @And("^I fill in with my password \"([^\"]*)\"$")
    public void IFillInValidPassword (String password) {
        calcPage.fillInValidPassword(password);
    }

    @Then("^I click on LogIn button2$")
    public void iClickLogInButton2(){
        calcPage.clickLogInButton2();
    }

    @Then("^I verify error message \"([^\"]*)\"$")
    public void iVerifyErrorMessage (String message){
        calcPage.verifyErrorMessage(message);
    }
    //////////////////////////////////

    @And("^I enter search window \"([^\"]*)\"$")
    public void iEnterSearchWindow(String SKU) {
        calcPage.EnterSearchWindow(SKU);
    }

    @And("^I click ae search button$")
    public void iClickAeSearchButton(){
        calcPage.clickAeSearchBtn();
    }
    @Then("^I verify the PR801text is displayed \"([^\"]*)\"$")
    public void iVerifyPR801Text (String text){
        calcPage.verifyItemIsDisplayed(text);
    }

    @Then("^I verify the \"([^\"]*)\" item is displayed$")
    public void iVerifyTheItemIsDisplayed(String item) {
        calcPage.verifyItemIsDisplayed(item);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        calcPage.clickAddToCartBtn();
    }

    @And("^I click on go to shopping cart$")
    public void iClickOnGoToShoppingCart() {
        calcPage.clickGoToShoppingCart();
    }

    @Then("^I verify that I have one item in the cart$")
    public void iVerifyThatIHaveOneItemInTheCart() {
        calcPage.verifyThatIHaveOneItemInCart();


    }


//    @And("I Fill in with my valid email\"([^\"]*)\"$")
//    public void IFillInValidEmail (String email) {
//        calcPage.fillInInvalidEmail(email);
//
//    }




//    @And("^I click login amazon button$")
//    public void iClickLoginAmazonButton(){
//        calcPage.clickLoginAmazonBtn();
//    }

//    @Then("^I get verifytext \"([^\"]*)\"$")
//    public void IverifyText (String text) {
//        calcPage.verifyText(text);
//    }

 }
