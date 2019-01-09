import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    @Test
    public void homePageTest() {
        HomePage obj = PageFactory.initElements(ad, HomePage.class);

       // obj.contactUs();
        obj.search();

        System.out.println("Passed");
    }
}
