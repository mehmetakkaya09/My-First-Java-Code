package day_37.constructor;

public class Student {

    private int privateField;
    int defaultField;
    protected int protectedField;
    public int publicField;

    public void method() {
        privateField = 0;
        protectedField = 9;
        publicField = 7;
        defaultField = 5;
    }


    protected void protectedMethod() {
    }
    // private --> nur innerhalb gleiche klasse kann mann erreichbar. ---> Student
    // default --> nur innerhalb gleiche Pakette kann mann erreichbar. ---> constructor.StudentChild2, constructor.StudentTest
    // protected --> sowohl innerhalb gleiche Pakette als auch innerhalb andere Pakette, die es ein Inheritence Abhangigkeit gibt, kann mann erreichbar ---> constructor.StudentChild2, constructor.StudentTest, packageA.StudentChild
    // public

    private String name;
    private int age;

    char geschlecht;

    protected int nummer;

    public String adresse;

    protected Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name) {
        this.name = name;
    }

    public Student(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
