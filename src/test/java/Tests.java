import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class Tests {
    @Test
    public void runTestOnDocker() throws Exception {
        DesiredCapabilities dcap = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        dcap.setCapability(ChromeOptions.CAPABILITY, options);
        dcap.setCapability("enableVNC", true);
        dcap.setBrowserName("chrome");
        dcap.setVersion("61.0");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        URL url = new URL("http://localhost:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, dcap);

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
    }
}
