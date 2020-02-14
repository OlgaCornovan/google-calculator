package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CalcPageObject;

public class CalcPageStep extends BaseSteps{
    private CalcPageObject calcPage = new CalcPageObject(driver);

    public CalcPageStep() throws Exception {
    }

    @Given("^I navigate to google site$")
    public void iNavigateToGoogleSite() {
        calcPage.navigateToGoogleSite();
    }

    @And("^I type word \"([^\"]*)\"$")
    public void iSearchForWord(String word) {
        calcPage.searchForWord(word);
    }

    @And("^I click google search button$")
    public void iClickGoogleSearchButton() {
        calcPage.clickGoogleSearchBtn();
    }

    @Then("^I should see google calculator$")
    public void iShouldSeeGoogleCalculator() {
        calcPage.seeGoogleCalculator();
    }

    @Given("^I navigate to google calculator$")
    public void iNavigateToCalculator() {
        calcPage.navigateToCalculator();
    }

    @And("^I click \"([^\"]*)\"$")
    public void iClickButton(String button)  {
        calcPage.clickOnButton(button);
    }

    @Then("^I get result \"([^\"]*)\"$")
    public void iGetResult(String result) {
        calcPage.getResult(result);
    }

    @Then("^I see result \"([^\"]*)\"$")
    public void iSeeResult(String number) {
        calcPage.seeResult(number);
    }
}
