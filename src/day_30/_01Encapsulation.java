package day_30;

public class _01Encapsulation {

    // private (eingeschrangte Zufgriff) access modifier verwendet man nur Klassemitgliedern zu erreichen.
    // ausser Klasse können wir diese fields, constructors oder methoden nicht erreichen
    public String name;
    private int age; // 0


    public _01Encapsulation(String name, int age) {
        this.name = name;
        //this.age = age;
        setAge(age);
    }

    // getter methoden verwendet man um eine Field zu lesen
    public int getAge(){
        return age;
    }

    // setter methoden verwendet man um eine Field Info je nach bestimmte Kriterien zu verandern.
    public void setAge(int age){
        if(age < 0 || age > 150){
            System.out.println("Invalid age");
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
