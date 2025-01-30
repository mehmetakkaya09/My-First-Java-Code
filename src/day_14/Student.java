package day_14;

public class Student {

    String firstName;
    String lastName;
    int age;
    String city;
    char gender;
    int lessonCount;
    int homeworkCount;

    public void getLessonInfo(){
        lessonCount++;
        System.out.println(firstName + " " + lastName + " joined " + lessonCount + " lesson") ;
    }

    public void getHomeworkInfo(){
        homeworkCount++;
        System.out.println(firstName + " " + lastName + " did " + homeworkCount + " homework") ;
    }

    public void eat(String mealName){
        System.out.println(firstName + " " + lastName + " ate " + mealName) ;
    }

    public void drink(String drinkName){
        System.out.println(firstName + " " + lastName + " drank " + drinkName) ;
    }

    public void printStudentInfo(){
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("age = " + age);
        System.out.println("city = " + city);
        System.out.println("gender = " + gender);
        System.out.println("lessonCount = " + lessonCount);
        System.out.println("homeworkCount = " + homeworkCount);
    }



}
//vorname
//nachname
//alt
//stadt

//unterrichten
//aufgaben
//essen
//trinken


// sureyya  vadim   blagoja
// nnnnn    bbbbb  vvvvvv
// 34        23    33
// a         f      k
