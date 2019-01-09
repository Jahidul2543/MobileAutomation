import base.MobileAPI;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    @Test
    public void homePageTest(){
        HomePage obj = new HomePage();
        obj.sendUrl();
        System.out.println("Passed");
    }
}
