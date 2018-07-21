import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automation {

    @Test
    public void Search() throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.get("http://automationpractice.com/index.php");

        WebElement txtSearch = browser.findElement(By.cssSelector("input#search_query_top"));
        txtSearch.sendKeys("blouse");

        WebElement btnSearch = browser.findElement(By.cssSelector("button[name='submit_search']"));
        btnSearch.click();

        Thread.sleep(3000);
        browser.quit();
    }
}
