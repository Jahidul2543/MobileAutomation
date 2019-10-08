import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends MobileAPI {

    /**
     * No possible solution --> issue is open
     * issue link: https://github.com/appium/java-client/issues/770
     *
     * */

   /* @AndroidFindBy(accessibility = "Access'ibility")
   private MobileElement accessibility;*/

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
   private WebElement app;

    @FindBy(className = "android.widget.TextView")
    private List<WebElement> elementsWithClassName = new ArrayList<>();

    public void clickAccessibility(){
      findElementByAccesablityId("Access'ibility");
    }
    public void clickApp(){
        app.click();
    }

    public void contentClcik(){
        elementsWithClassName.get(5).click();
    }

    public void tapApp(){
        ad.tap(1,174,465, 5);
    }
}
