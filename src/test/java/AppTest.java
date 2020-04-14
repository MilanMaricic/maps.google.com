import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
    private String siteURL = "https://maps.google.com";
    private String projectLocation = System.getProperty("user.dir");

    @Test
    public void loadPageTest(){
        //initialize test environment
        System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        //executing test
        driver.get(siteURL);
        Assert.assertEquals(driver.getTitle(), "Google мапе");
        driver.quit();

    }
}
