import base.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.jvm.hotspot.opto.HaltNode;

public class HomePage extends MobileAPI {

    TouchAction touchAction = new TouchAction(ad);

    @FindBy(how = How.XPATH, xpath = "//XCUIElementTypeOther[@name=\"banner\"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private WebElement searchBox;
    @FindBy(how = How.XPATH, xpath = "//XCUIElementTypeStaticText[@name=\"Contact us\"]")
    private WebElement contactUs;

   public void contactUs()  {
      // contactUs.click();
       touchAction.tap(297, 112);

       System.out.println("Clicked contact us");
   }

    public void search(){
      findElementByAccesablityId("Type search keywords").sendKeys("Shoes");
    }

}
