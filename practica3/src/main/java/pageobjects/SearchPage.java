package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(this.driver, 20);
    }
    //Locators

    @FindBy(id="search_query_top")
    private WebElement txtSearch;

    @FindBy(css = "button.btn.btn-default.button-search")
    private WebElement btnSearch;

    //Actions

    public void setSearch(String term) {
        wait.until(ExpectedConditions.visibilityOf(txtSearch)).sendKeys(term);
    }
    public void clickSearch() {
        wait.until(ExpectedConditions.visibilityOf(btnSearch)).click();
    }
}
