package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    // When we open a page class, the first thing we need to do is
    // create a parameterless constructor and
    // assign the first value to the driver with PageFactory in this constructor.

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonSearchBox;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement resultText;

    @FindBy(xpath = "(//button[@value='1'])[3]")
    public WebElement amazonAllowButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement amazonSigninEmailBox;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement amazonSigninPasswordBox;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement amazonLoginButton;

    @FindBy(xpath = "//a[text()='Find your account and log in.']")
    public WebElement amazonLoginFailText;
}
