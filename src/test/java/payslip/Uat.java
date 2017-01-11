package payslip;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.AfterTest;
        import static org.testng.Assert.*;

public class Uat {
    private WebDriver driver;
    @Test
    public void testEasy() {
        driver.get("http://jenserver2016.centralus.cloudapp.azure.com:8080/payslip-0.0.1/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("PAY SLIP"));
    }
    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}   