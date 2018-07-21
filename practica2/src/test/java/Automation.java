import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ProductsPage;
import pageobjects.SearchPage;

public class Automation {

    @Test
    public void Search() throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.get("http://automationpractice.com/index.php");

        SearchPage search = new SearchPage(browser);
        search.writeText("blouse");
        search.clickSearch();
        search.clickList();

        ProductsPage products = new ProductsPage(browser);
        Assert.assertEquals(products.getPrice().trim(), "$27.00", "El precio no es el esperado.");

        browser.quit();
    }
}
