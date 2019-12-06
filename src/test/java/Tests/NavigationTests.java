package Tests;

import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.StringUtilities;

public class NavigationTests {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String gotitle= driver.getTitle();
        System.out.println(gotitle);

        driver.get(" https://etsy.com");
        String etsTitle = driver.getTitle();
        System.out.println(etsTitle);

        driver.navigate().back();
        String actualgotitle= driver.getTitle();
        StringUtilities.verifyEquals(gotitle,actualgotitle);

        driver.navigate().forward();

        String actualetstitle = driver.getTitle();
        StringUtilities.verifyEquals(etsTitle,actualetstitle);

        driver.quit();
















    }

}
