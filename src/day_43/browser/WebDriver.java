package day_43.browser;

public interface WebDriver extends SearchContext {

    void get(String url);
    void close();
    void quit();
    String getTitle();

    // normalerweise sollen wir "implements" keyword benutzen, um für eine Klasse eine Interface zu implementieren
    // aber wenn wir in eine Interface eine andere Interface implementieren wollen, sollen wir "extends" keyword benutzen

    // klasse zu klasse          = extends
    // interface zu interface    = extends
    // klasse zu interface       = implements

}
