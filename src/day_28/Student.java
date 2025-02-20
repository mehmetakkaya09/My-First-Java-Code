package day_28;

public class Student {

    public String vorname;
    public String nachname;
    public int age;
    public int id;

    public Student(){
        System.out.println("Parameterlose Konstruktor funktioniert...");
        this.vorname = "UNBEKANNT";
        this.nachname = "unbekannt";
        this.age = 0;
        this.id = 1000;
    }
    // Constructor Overloading bedeutet unterschiedliche Constructors mit unterschiedliche Parameters
    public Student(String vorname){
        this();
        System.out.println("Ein parameterisierte Konstructor funktioniert");
        this.vorname = vorname;
    }

    public Student(String vorname, String nachname){
        this(vorname);
        System.out.println("Zwei parameterisierte Konstructor funktioniert");
        this.nachname = nachname;
    }

    public Student(String vorname, String nachname, int age, int id) {
        this(vorname,nachname);
        System.out.println("Drei parameterisierte Konstructor funktioniert");
        this.age = age;
        this.id = id;
    }

    public void showInfo(){
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

//    public String toString(){
//        String res = vorname + " " + nachname + " " + age + " " + id;
//        return res;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
