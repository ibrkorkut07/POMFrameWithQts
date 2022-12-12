package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//thead//tr[1]//th")
    public List<WebElement> headerFirstRowData;

    @FindBy(xpath = "//tbody")
    public WebElement AllBodyWebElement;


    @FindBy(xpath = "//tbody//td")
    public List<WebElement> AllBodyDataList;


    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> rowList;


    public WebElement returnRow(int rowNo){

        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        String rowDinamicXpath= "//tbody//tr["+ rowNo +"]";
        WebElement rowElement=Driver.getDriver().findElement(By.xpath(rowDinamicXpath));

        return rowElement;
    }


    public String  returnCellWebelement(int row, int colomn) {
        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        String dinamicCellXpath="//tbody//tr["+ row  +"]//td["+ colomn  +"]";
        WebElement DemandedCellElement=Driver.getDriver().findElement(By.xpath(dinamicCellXpath));
        String cellData=DemandedCellElement.getText();

        return cellData;
    }


    public void writeColomn(int colomn) {

        // her bir satirdaki istenen sutun elementini yazdirabilmek icin
        // once satir sayisini bilmeye ihtiyacim var

        int numberofRows=rowList.size();

        for (int i=1 ; i<=numberofRows ; i++ ){
            System.out.println(returnCellWebelement(i, colomn));
        }
    }
}