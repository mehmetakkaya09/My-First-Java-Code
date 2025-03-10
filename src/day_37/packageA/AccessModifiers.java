package day_37.packageA;

public class AccessModifiers {

    //nur innerhalb klasse können wir zugreifen. Ausser dieser Klasse ist es nicht sichtbar/erreichbar
    private String privateModifierField;

    //nur innerhalb selber/gleiche Pakette können wir zugreifen
    int defaultModifierField;

    protected boolean protectedModifierField;

    public Double publicModifierField;

    private void privateModifierMethod() {}

    void defaultModifierMethod() {
        privateModifierField = "private";
        privateModifierMethod();
    }

    protected void protectedModifierMethod() {}

    public void publicModifierMethod() {}

}





