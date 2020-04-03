package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class CalcPageObject extends BasePage {
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

    ///////////////////////////////////// AE watches locators

    @FindBy(xpath = "//a[text()= 'Log In']")
    public WebElement loginBtn;

    @FindBy(id = "email")
    public WebElement fillInField;

    @FindBy(id = "pass")
    public WebElement fillInPassword;

    //    @FindBy(xpath = "//button[@id = 'send2']")
    @FindBy(id = "send2")
    public WebElement LogInButton;

    @FindBy(xpath = "//*[@class='error-msg']")
    public WebElement errormessage;

    ////////////////////////////////////locators
    @FindBy(id = "search")
    public WebElement fillInSKU;

    @FindBy(css = ".button[title='Search']")
    public WebElement btnSearch;

    @FindBy(css = ".box-item")
    public WebElement boxItem;

    @FindBy(css = "h2.product-name")
    public WebElement productName;

    @FindBy(css = "div.item-inner")
    public WebElement itemInner;

    @FindBy(css = ".btn-cart")
    public WebElement addBtnCart;

    @FindBy(css = "a#shopping_cart")
    public WebElement addToShoppingCart;

    @FindBy(css = "span.top-cart-title")
    public WebElement itemInCart;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    public WebElement myAcc;

    @FindBy(xpath = "//span[text()='Create an Account']")
    public WebElement createAcc;

    @FindBy(css = "input#firstname")
    public WebElement firstname;

    @FindBy(css ="input#lastname")
    public WebElement lastname;

    @FindBy(css = "input[id^=email_a]" )
    public WebElement idemail;

    @FindBy(css = "input#password")
    public WebElement inputpass;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement bttnsubmit;

    @FindBy(css = "div.validation-advice")
    public WebElement validation;



    //a[contains(text(),"Rolex Day-Date President 80's Model 18038")]

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
                JavascriptExecutor executor = (JavascriptExecutor) driver;
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

    public void fillInValidPassword(String word) {
        waitForElementToBeVisible(fillInPassword);
        fillInPassword.sendKeys(word);
    }

    public void clickLogInButton2() {
        LogInButton.click();
    }

    public void verifyErrorMessage(String text) {
        String expText = errormessage.getText();
        Assert.assertEquals(expText, text);
    }

    /////////////////////////////
    public void EnterSearchWindow(String SKU) {
        waitForElementToBeVisible(fillInSKU);
        fillInSKU.isDisplayed();
        fillInSKU.sendKeys(SKU);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickAeSearchBtn() {
        btnSearch.click();
    }

    public void verifyItemIsDisplayed(String item) {
        // Verify that box item locator is displayed
        boxItem.isDisplayed();
        // Get text from the productName locator and store it in the string variable expText
        String expText = productName.getText();
        // Print out the text from String expText (Left it as example)
        System.out.println(expText);
        // Assert that expText is as expected equal with variable item
        Assert.assertEquals(expText, item);
    }

    public void clickAddToCartBtn() {
        waitForElementToBeVisible(itemInner);
        Actions action = new Actions(driver);
        action.moveToElement(itemInner).perform();
        waitForElementToBeVisible(addBtnCart);
        addBtnCart.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void clickGoToShoppingCart() {
        addToShoppingCart.click();
    }

    public void verifyThatIHaveOneItemInCart() {
        itemInCart.isDisplayed();
    }

    public void clickToMyAcc() {
        myAcc.click();
    }

    public void clickOnCreateAnAccount() {
        createAcc.click();
    }

    public void fillInMyFirstName(String text) {
        waitForElementToBeVisible(firstname);
        firstname.isDisplayed();
        firstname.sendKeys(text);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public void fillInMyLastName (String text){
            waitForElementToBeVisible(lastname);
            lastname.isDisplayed();
            lastname.sendKeys(text);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public void fillInEmailOnCreateAccountPage(String email) {
            waitForElementToBeVisible(idemail);
            idemail.isDisplayed();
            idemail.sendKeys(email);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

        public void fillInPasswordWith (String text){
            waitForElementToBeVisible(inputpass);
            inputpass.isDisplayed();
            inputpass.sendKeys(text);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
     public void clickOnSubmitBttn(){
        waitForElementToBeVisible(bttnsubmit);
         bttnsubmit.click();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     }

//    public void verifyErrorIsDisplayed(String error) {
//        String expText = validation.getText();
//        Assert.assertEquals(expText, error);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public void verifyErrorIsDisplayed(String error, String field) {
        String expText = validation.getText();
//        driver.findElement(By.xpath("//*[@class='PaQdxb mF5fo']/*[@aria-label='" + button + "']")).click();
        String fieldLocator = driver.findElement(By.id("advice-required-entry-" + field)).getText();

        Assert.assertEquals(fieldLocator, error);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





    // don't delete
    }

//    String expText = itemInCart.getText();
////        Assert.assertEquals();
//    WebElement btnAddToCart = driver.findElement(By.cssSelector("div.item-inner"));

//     public void
//     WebElement iteminner = driver.findElement(By.cssSelector("div.item-inner"));
//     Actions builder = new Actions(driver);
//     builder.moveToElement(iteminner).build().perform().
//     act.moveToElement(getmenu).perform();
//     Thread.sleep(3000);
//     driver.close();
//     }


//     WebElement clickElement= driver.findElement()
////    Actions builder = new Actions(WebDriver);
//      WebElement boxinner = driver.findElement(By.cssSelector("div.item-inner"));
//      Actions action = new Actions(driver);
//      action.moveToElement(boxinner).build.()perform.();

//    builder.moveToElement(boxinner).build().perform()


//    WebElement section= driver.findElement(By.xpath("//div[@class='box-item']//a[@class='product-image']//img");
//    WebElement image= section.findElement(By.xpath(""))

////        public void verifyImg (String image){
////        String expImage = pr801.get.Image();
//          Assert.assertEquals(expImage, image);
//
//        }


    //assert that element is visible
//        searchFieldAe.sendKeys(Keys.RETURN);
//        driver.findElement(By.className(buttonSearch)).click();


//    public void clickLoginAmazonBtn() {
//         loginAmazonBtn.click();
//    }

//    public void verifyText (String text){
//        String expText = amazonText.getText();
//        Assert.assertEquals(expText, text);
//    }

