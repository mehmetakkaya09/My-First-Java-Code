package day_43.browser;

public interface SearchContext {

    void findElement(String locator);
    void findElements(String locator);

    // Vorlage von Klassen
    // Ein Klass kann mehrere interface implementieren
    // Ein Klass kann nur eine Klasse vererben (Inheritence)
    // Interfaces verwendet man für %100 abstraction
}
/**
 * Browser-Aufgabe:
 * 	1. Erstellen Sie ein Interface namens SearchContext
 * 				Abstrakte Methoden:
 * 					findElement(String locator);    //twotabsearchtextbox
 * 					findElements(String locator);
 *
 * 	2. Erstellen Sie ein untergeordnetes Interface von SearchContext namens WebDriver
 * 				Abstrakte Methoden (Rückgabetyp ist void):
 * 					get(String url);
 * 					close();
 * 					quit();
 * 					getTitle();
 *
 * 	3. Erstellen Sie ein Interface namens TakeScreenShot:
 * 				Abstrakte Methoden:
 * 					takeScreenShot();
 *
 * 	4. Erstellen Sie ein Interface namens JavaScriptExecuter
 * 				Abstrakte Methoden:
 * 					executeScript(String script);
 *
 * 	5. Erstellen Sie eine Klasse namens RemoteWebDriver, die die Interfaces WebDriver, TakeScreenShot und JavaScriptExecuter implementiert:
 * 				Variablen:
 * 					browserName (final)
 *
 * 				Kapseln Sie alle Felder ein
 *
 * 				Fügen Sie einen Konstruktor hinzu, der das Feld setzen kann und die folgende Nachricht anzeigt:
 * 						"Öffnen des Browsers: "+ browserName
 *
 * 				Überschriebene Methoden und deren Implementierungen:
 * 					get(String url):
 * 						"Abrufen der URL: "+url+" im Browser " + browserName
 *
 * 					findElement(String locator):
 * 						browserName+"-Treiber lokalisiert ein Element mit " + locator
 *
 * 					findElements(String locator):
 * 						browserName+"-Treiber lokalisiert mehrere Elemente mit " + locator
 *
 * 					close():
 * 						"Schließen des Tabs im Browser: "+browserName
 *
 * 					quit():
 * 						"Beenden des Browsers: "+browserName
 *
 * 					getTitle():
 * 						browserName + "-Treiber ruft den Titel ab"
 *
 * 					takeScreenShot():
 * 						"Screenshot aufnehmen im Browser: " + browserName
 *
 * 					executeScript(String script):
 * 						"Ausführen des Skripts \"" + script + "\" im Browser " + browserName
 *
 *
 * 	6. Erstellen Sie die folgenden Unterklassen von RemoteDriver:
 * 				1. ChromeDriver
 * 				2. FireFoxDriver
 * 				3. EdgeDriver
 * 				4. SafariDriver
 * 				5. OperaDriver
 *
 *
 * 	7. Erstellen Sie eine Klasse namens DriverObjects:
 * 				Erstellen Sie Objekte für jeden Treiber
 *
 * 				Testen Sie alle Methoden jedes Treibers
 */