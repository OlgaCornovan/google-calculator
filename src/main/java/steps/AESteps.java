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

    @And ("^I fill in with my invalid email \"([^\"]*)\"$")
    public void iFillInInvalidEmail (String email) {
        calcPage.fillInInvalidEmail(email);
    }

    @And("^I fill in with my valid password \"([^\"]*)\"$")
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






//    @And("^I click login amazon button$")
//    public void iClickLoginAmazonButton(){
//        calcPage.clickLoginAmazonBtn();
//    }

//    @Then("^I get verifytext \"([^\"]*)\"$")
//    public void IverifyText (String text) {
//        calcPage.verifyText(text);
//    }

}
