package pagefactory.AlertsPage;

import base.MobileAPI;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Alerts extends MobileAPI{

    @iOSFindBy(xpath = "")
    private MobileElement elemnt;


    public void showActionSheetSimple(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
    }
    public void showActionSheetOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]");
    }
    public void showActionSheetCustom(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]");
    }
    public void showAlertSimple(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]");
    }
    public void showAlertOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
    }
    public void showAlertCustom(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
    }
    public void showSecureTextInput(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[13]");
    }
}
