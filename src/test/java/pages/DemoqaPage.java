package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {

    public DemoqaPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement headerElement;

    @FindBy(xpath = "//div[@class='rt-resizable-header-content']")
    public List<WebElement> headerList;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement allBody;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> allBodyElements;

    @FindBy(xpath = "(//div[@class='rt-tr -odd'])[1]")
    public List<WebElement> firstRowDataList;

    @FindBy(xpath = "//div[@role='row']")
    public List<WebElement> rowList;

    public void writeColomn(int colomn) {
        // ((//div[@class='rt-tr-group'])[1]//div[@class='rt-td'])[3]
    }
}
