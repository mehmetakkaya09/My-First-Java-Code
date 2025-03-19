package day_43.browser;

public abstract class RemoteWebDriver implements WebDriver, TakeScreenshot, JavaScriptExecuter{
    private BrowserType browserName;

    public RemoteWebDriver(BrowserType browserName) {
        this.browserName = browserName;
        System.out.println("Öffnen des Browsers: " + browserName.name());
    }

    public BrowserType getBrowserName() {
        return browserName;
    }

    public void setBrowserName(BrowserType browserName) {
        this.browserName = browserName;
    }

    @Override
    public void executeScript(String script) {
        System.out.println("Ausführen des Skripts \"" + script + "\" im Browser " + browserName);
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Screenshot aufnehmen im Browser: " + browserName);
    }

    @Override
    public void get(String url) {
        System.out.println("Abrufen der URL: " + url + " im Browser " + browserName);
    }

    @Override
    public void close() {
        System.out.println("Schließen des Tabs im Browser: " + browserName);
    }

    @Override
    public void quit() {
        System.out.println("Beenden des Browsers: " + browserName);
    }

    @Override
    public String getTitle() {
        return browserName + "-Treiber ruft den Titel ab";
    }

    @Override
    public void findElement(String locator) {
        System.out.println(browserName + "-Treiber lokalisiert ein Element mit " + locator);
    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName + "-Treiber lokalisiert mehrere Elemente mit " + locator);
    }
}
