package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#search_query_top")
    private WebElement txtSearch;

    @FindBy(css = "button[name='submit_search']")
    private WebElement btnSearch;

    @FindBy(css = "i.icon-th-list")
    private WebElement btnListView;

    public void writeText(String term){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(txtSearch));
        txtSearch.sendKeys(term);
    }

    public void clickSearch(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(btnSearch));
        btnSearch.click();
    }

    public void clickList(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(btnListView));
        btnListView.click();
    }
}
