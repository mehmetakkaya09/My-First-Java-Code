package day_43.browser;

public class ChromeDriver extends RemoteWebDriver {
    public ChromeDriver() {
        super(BrowserType.CHROME);
    }

    public void specialMethodForChrome(){
        System.out.println("Das ist eine spezielle Method für Chrome-Treiber");
    }
}
