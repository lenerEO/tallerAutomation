import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.ProductsPage;
import pageobjects.SearchPage;

public class Automation {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void testSearch() throws InterruptedException {
        SearchPage search = new SearchPage(driver);
        search.writeText("blouse");
        search.clickSearch();

        ProductsPage products = new ProductsPage(driver);
        products.clickList();
        String resultado = products.getPrice();

        Assert.assertEquals(resultado, "$27.00");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
