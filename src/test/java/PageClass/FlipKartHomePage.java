package PageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.util.Set;

public class FlipKartHomePage
{
    WebDriver driver;
    @FindBy(name = "q")
    WebElement searchBox;
    @FindBy(xpath = "//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']")
    WebElement iphone;
    @FindBy(xpath = "//span[@class='B_NuCI']")
    WebElement iphoneTitle;
    @FindBy(xpath = "//button[text()='GO TO CART']")
    WebElement goToCart;
    @FindBy(xpath = "//span[text()=' ₹74,059']")
    WebElement totalAmount;



    public FlipKartHomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void purchaseIphone() throws InterruptedException {
        searchBox.sendKeys("iphone", Keys.ENTER);
        Thread.sleep(1000);
        iphone.click();
        String parent = driver.getWindowHandle();
        Set<String> childs = driver.getWindowHandles();
        for(String child:childs)
        {
            driver.switchTo().window(child);
        }
        String title = iphoneTitle.getText();
        System.out.println(title);
        goToCart.click();
        Thread.sleep(1000);
        System.out.println("Total Amount is : ");
        System.out.println(totalAmount.getText());
        driver.switchTo().window(parent);
        driver.navigate().refresh();

    }


}
