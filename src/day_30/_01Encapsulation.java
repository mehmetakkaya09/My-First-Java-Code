package day_30;

public class _01Encapsulation {

    // private (eingeschrangte Zufgriff) access modifier verwendet man nur Klassemitgliedern zu erreichen.
    // ausser Klasse können wir diese fields, constructors oder methoden nicht erreichen
    private String name;
    private int age; // 0


    public _01Encapsulation(String name, int age) {
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        name = name.trim(); //     mehmet
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i))) {
                return;
            }
        }

        this.name = name;
    }

    // es gibt eine bestimmte Namensstandard, die in jeder OOP Sprachen benutzt werden
    // überall verwendet man diese Namensstandard für getter und setter methoden
//    public String lesName(){
//        return name;
//    }



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



}
