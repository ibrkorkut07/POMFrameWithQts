package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advancedButton;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy(linkText = "Log in")
    public WebElement FirstLoginButton;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement SecondLoginButton;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement loginFailText;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLink;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idgroupSelectButton;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement createHotelSaveButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement saveOKButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement roomAdminUsernameBox;


    public void wait(Integer second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
