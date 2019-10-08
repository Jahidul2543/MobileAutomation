import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MobileAPI {
    HomePage objHomePage;


    @BeforeMethod
    public void initializationOfObjects() {

       // PageFactory.initElements(new AppiumFieldDecorator(ad), HomePage.class);
        objHomePage = PageFactory.initElements(ad, HomePage.class);

    }

    @Test
    public void testMenu() {
       objHomePage.clickAccessibility();

       // objHomePage.clickApp();
      //  objHomePage.contentClcik();
      //  objHomePage.tapApp();
    }
}
