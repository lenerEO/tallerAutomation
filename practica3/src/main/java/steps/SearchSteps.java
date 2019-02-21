package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.ProductsPage;
import pageobjects.SearchPage;

public class SearchSteps {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Given("^User is in homepage$")
    public void userIsInHomepage() {
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^User performs a search with the term \"([^\"]*)\"$")
    public void userPerformsASearchWithTheTerm(String term) {
        SearchPage search = new SearchPage(driver);
        search.setSearch(term);
        search.clickSearch();
    }

    @Then("^Product is shown with price \"([^\"]*)\"$")
    public void productIsShownWithPrice(String price) {
        ProductsPage products = new ProductsPage(driver);
        products.clickList();
        String resultado = products.getPrice();
        Assert.assertEquals(resultado, price);
    }

    @Then("^System shows the message: \"([^\"]*)\"$")
    public void systemShowsTheMessage(String message) {
        ProductsPage products = new ProductsPage(driver);
        String resultado = products.getMessage();
        Assert.assertTrue(resultado.contains(message));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}