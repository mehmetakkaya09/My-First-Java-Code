package day_29;

public class Student {

    // Vorlage

    // field
    public String name; // null
    public int alt; // 0
    public String klasse; // null


    public Student(){
        this.name = "unbekannt";
        this.alt = 0;
        this.klasse = "unbekannt";
    }

    public Student(int alt){

    }


    public Student(String name){
        this();
        this.name = name;
    }

    public Student(String name, int alt, String klasse){
        this(name);
        this.alt = alt;
        this.klasse = klasse;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", alt=" + alt +
                ", klasse='" + klasse + '\'';
    }
}
