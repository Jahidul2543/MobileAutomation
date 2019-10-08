import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage objHomePage;
  //  SelectRoutePage objSelectRoutePage;

    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
    }

  /*  @Test
    public void homePageButtonTest(){
        objHomePage.clcikAccessAbility();
    }*/
    @Test
    public void goToAnimationTest(){
        objHomePage.goToAnimation();
        System.out.println("Passed");
    }
}
