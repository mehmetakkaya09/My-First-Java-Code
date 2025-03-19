package day_43.browser;

import java.util.ArrayList;

public class DriverTest {
    public static void main(String[] args) {

        //WebDriver chrome = new ChromeDriver();

        RemoteWebDriver chrome = new ChromeDriver();

        RemoteWebDriver firefox = new FirefoxDriver();

        RemoteWebDriver edge = new EdgeDriver();

        RemoteWebDriver safari = new SafariDriver();

        RemoteWebDriver opera = new OperaDriver();

        ArrayList<RemoteWebDriver> drivers = new ArrayList<>();
        drivers.add(chrome);
        drivers.add(firefox);
        drivers.add(edge);
        drivers.add(safari);
        drivers.add(opera);

        System.out.println();

        for (RemoteWebDriver driver : drivers) {

            System.out.println(driver.getBrowserName().name());
            System.out.println();

            if (driver instanceof ChromeDriver chromeDriver) {
                //((ChromeDriver)driver).specialMethodForChrome();
                chromeDriver.specialMethodForChrome();// Pattern Matching
            }


            driver.get("https://www.amazon.de/");

            System.out.println(driver.getTitle());

            driver.findElement("nav-global-location-popover-link");

            driver.findElements("nav-belt");

            driver.executeScript("window.scrollBy(0,250)");

            driver.takeScreenShot();

            driver.close();

            driver.quit();

            System.out.println("**************************************");
            System.out.println();
        }


    }
}
