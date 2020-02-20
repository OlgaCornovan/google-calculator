package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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
    public void iFillInInvalidEmail (String word) {
        calcPage.fillInInvalidEmail(word);
    }





//    @And("^I click login amazon button$")
//    public void iClickLoginAmazonButton(){
//        calcPage.clickLoginAmazonBtn();
//    }

//    @Then("^I get verifytext \"([^\"]*)\"$")
//    public void IVerifyText (String text) {
//        calcPage.verifyText(text);
//    }

}
