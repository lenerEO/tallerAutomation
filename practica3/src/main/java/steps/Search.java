package steps;

import cucumber.api.PendingException;
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

public class Search {
    WebDriver driver;

    @Given("^Se carga la página de búsqueda$")
    public void seCargaLaPáginaDeBúsqueda() throws Throwable {
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^Buscamos el término \"([^\"]*)\"$")
    public void buscamosElTérmino(String term) throws Throwable {
        SearchPage search = new SearchPage(driver);
        search.writeText(term);
        search.clickSearch();
    }

    @Then("^Se muestra el mesaje \"([^\"]*)\"$")
    public void seMuestraElMesaje(String mensaje) throws Throwable {
        ProductsPage products = new ProductsPage(driver);
        Assert.assertEquals(products.getMensaje(), mensaje + " \"microsoft\"", "El mensaje no es el esperado.");
    }

    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
