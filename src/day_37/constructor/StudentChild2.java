package day_37.constructor;

import day_37.packageA.StudentChild;

public class StudentChild2 extends Student{

    //Weil Elternklasse in gleiche Pakette befindet, kann man default Constructor zugreifen.
     protected StudentChild2(String name){
        super(name);
    }


    public StudentChild2(String name, int age) {
        super(name, age);
    }

    public void method() {

         super.geschlecht = 'F';
         super.nummer = 5;

    }
}
