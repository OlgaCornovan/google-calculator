package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CalcPageObject extends BasePage{
    private WebDriver driver;

    @FindBy(xpath = "//*[@class='PaQdxb mF5fo']/*[@aria-label='minus']")
    public WebElement minus;

//    @FindBy(xpath = "//*[@class='VlcLAe']//*[@class='gNO89b']")
//    public WebElement googleSearchButton;

    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
//    @FindBy(className = "#fakebox-input")
    public WebElement searchField;

    @FindBy(className = "tyYmIf")
    public WebElement googleCalculator;

    @FindBy(xpath = "//*[@class='PaQdxb mF5fo G7BHUb']/*[@aria-label='equals']")
    public WebElement equal;

    @FindBy(id = "cwos")
    public WebElement calcResult;

    @FindBy(xpath = "//*[@class='PaQdxb UpZIS']//*[@aria-label='all clear']")
    public WebElement buttonAC;

    @FindBy(xpath = "//*[@class='PaQdxb UpZIS']//*[@aria-label='clear entry']")
    public WebElement buttonCE;

    // AE watches locators

    @FindBy(xpath = "//a[text()= 'Log In']")
    public WebElement loginBtn;

    @FindBy(id = "email")
    public WebElement fillInField;


//    @FindBy(className = "amazonpay-button-inner-image")
//    public WebElement loginAmazonBtn;
//
////    @FindBy (xpath = "h1.a-spacing-small")
//    @FindBy (xpath = "//h1[@class='a-spacing-small']")
//    public WebElement amazonText;



//    [title='Log In']

    public CalcPageObject(WebDriver driver) throws Exception {
        super(driver);
        this.driver = driver;
    }

    public void navigateToGoogleSite() {
        driver.navigate().to("https://www.google.com");
    }

    public void searchForWord(String word) {
        searchField.sendKeys(word);
    }

    public void clickGoogleSearchBtn() {
//        googleSearchButton.click();
        searchField.sendKeys(Keys.RETURN);
    }

    public void seeGoogleCalculator() {
        googleCalculator.isDisplayed();
    }

    public void navigateToCalculator() {
        driver.navigate().to("https://www.google.com/search?q=calculator");
    }

    public void clickOnButton(String button) {
        char[] n = button.toCharArray();
        for (int i = 0; i < n.length; i++) {
            if (button.equals("plus") || button.equals("minus") || button.equals("multiply") || button.equals("divide")) {
                driver.findElement(By.xpath("//*[@class='PaQdxb mF5fo']/*[@aria-label='" + button + "']")).click();
            } else if (n[i] == '-') {
                minus.click();
            } else if (n[i] == '.') {
                driver.findElement(By.xpath("//*[@class='PaQdxb mF5fo G7BHUb']//div[contains(text(),'" + n[i] + "')]")).click();
            } else if (button.equals("all clear")) {
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", buttonAC);
            } else if (button.equals("clear entry")) {
                buttonCE.click();
            } else {
                driver.findElement(By.xpath("//*[@class='PaQdxb A2W7l']//div[contains(text(),'" + n[i] + "')]")).click();
            }
        }
    }

    public void getResult(String result) {
        equal.click();
        String res = calcResult.getText();
        Assert.assertEquals(res, result);
    }

    public void seeResult(String number) {
        String res = calcResult.getText();
        Assert.assertEquals(res, number);
    }

    // AE methods
    public void navigateToAeSite() {
        driver.navigate().to("https://www.aandewatches.com");
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void fillInInvalidEmail(String word) {
        waitForElementToBeVisible(fillInField);
        fillInField.sendKeys(word);
    }





//    public void clickLoginAmazonBtn() {
//         loginAmazonBtn.click();
//    }

//    public void verifyText (String text){
//        String expText = amazonText.getText();
//        Assert.assertEquals(expText, text);
//    }
}
