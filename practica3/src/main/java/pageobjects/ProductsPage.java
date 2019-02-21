package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(this.driver, 20);
    }

    //Locators
    @FindBy(css = "i.icon-th-list")
    private WebElement btnList;

    @FindBy(css="div.content_price.col-xs-5.col-md-12 span[itemprop='price']")
    private WebElement lblPrice;

    @FindBy(css="p.alert.alert-warning")
    private WebElement lblMessage;

    //Actions
    public void clickList() {
        wait.until(ExpectedConditions.visibilityOf(btnList)).click();
    }

    public String getPrice() {
        return wait.until(ExpectedConditions.visibilityOf(lblPrice)).getText().trim();
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOf(lblMessage)).getText().trim();
    }
}
