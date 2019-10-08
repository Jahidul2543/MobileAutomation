import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends MobileAPI {

    @FindBy(className = "android.widget.TextView")
    public List<WebElement> menuContents = new ArrayList<>();

public void clcikAccessAbility(){
    findElementByAccesablityId("Access'ibility").click();
  }

  public void goToAnimation(){
    menuContents.get(3).click();
  }

}
