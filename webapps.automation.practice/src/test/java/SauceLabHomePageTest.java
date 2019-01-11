import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLabHomePageTest extends MobileAPI {

    SauceLabHomePage sauceLabHomePage;
    @BeforeMethod
    public void intiElements(){
        sauceLabHomePage = PageFactory.initElements(ad, SauceLabHomePage.class);
    }

    @Test
    public void loginTest() {
        sauceLabHomePage.comment();
        Assert.assertEquals("I am a div", sauceLabHomePage.getTextFromDiv());
    }

}
