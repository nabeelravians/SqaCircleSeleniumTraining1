import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SqaCircleTest {
    public static WebDriver driver;
    @Test
    void test()
    {
        WebDriverManager.firefoxdriver().setup();
      //  WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://sqacircle.com/");
        driver.findElement(By.xpath("//*[@title='jobs']")).click();
        String actualTitle;
        actualTitle=driver.findElement(By.className("page__title")).getText();
        Assert.assertEquals(actualTitle,"career");
    }
}
