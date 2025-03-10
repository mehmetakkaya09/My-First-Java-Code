package day_37.packageA;

import day_37.constructor.Student;

public class StudentChild extends Student {

     public StudentChild(String name, int age) {
        super(name, age);
    }


    public void method() {
         super.nummer = 5;
         super.adresse = "Berlin";
         super.protectedField = 9;
         super.publicField = 7;
         super.protectedMethod();

    }


//    public StudentChild(String name) {
//        super(name);
//    }
}
