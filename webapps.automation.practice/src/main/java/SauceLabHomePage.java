import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SauceLabHomePage extends MobileAPI {

    @FindBy(id="i_am_an_id")
     WebElement div;
    @FindBy(id="comments")
     WebElement commentsBox;



    public void comment(){

        commentsBox.sendKeys("My Comment");
    }

    public String getTextFromDiv(){

        return div.getText();

    }



}
