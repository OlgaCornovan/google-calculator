package steps;

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

}
