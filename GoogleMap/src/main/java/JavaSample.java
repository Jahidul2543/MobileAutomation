import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

    public class JavaSample {

        public static final String USERNAME = "mislam1";
        public static final String AUTOMATE_KEY = "fLT1od64aNyhBBcxr7Ki";
        public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

        public static void main(String[] args) throws Exception {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserName", "android");
            caps.setCapability("device", "Google Nexus 5");
            caps.setCapability("realMobile", "true");
            caps.setCapability("os_version", "4.4");
            caps.setCapability("name", "Bstack-[Java] Sample Test");

            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
            driver.get("http://www.google.com");
            WebElement element = driver.findElement(By.name("q"));

            element.sendKeys("BrowserStack");
            element.submit();

            System.out.println(driver.getTitle());
            driver.quit();

        }
    }
