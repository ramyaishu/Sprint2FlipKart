package TestCases;

import Common.BaseClass;
import PageClass.FlipKartHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Base64;

public class FlipCartTestCase extends BaseClass
{
    FlipKartHomePage flipKartHomePage;

    @BeforeClass
    public void init()
    {
        flipKartHomePage = PageFactory.initElements(driver,FlipKartHomePage.class);
    }
    @Test
    public void verifyPurchaseItem() throws InterruptedException {
        flipKartHomePage.purchaseIphone();
    }
}
