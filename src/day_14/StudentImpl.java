package day_14;

public class StudentImpl {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.firstName = "Sureyya";
        student1.lastName = "Durak";
        student1.age = 37;
        student1.city = "Dinslaken";
        student1.gender = 'F';
        student1.getLessonInfo();
        student1.getHomeworkInfo();
        student1.getHomeworkInfo();
        student1.printStudentInfo();


        Student student2 = new Student();
        student2.firstName = "Vadim";
        student2.lastName = "Dokuchaev";
        student2.age = 27;
        student2.city = "Frankfurt";
        student2.gender = 'M';
        student2.getLessonInfo();
        student2.getHomeworkInfo();
        student2.eat("apple");
        student2.printStudentInfo();

        Student student3 = new Student();
        student3.firstName = "Blagoja";
        student3.lastName = "Andreevski";
        student3.age = 46;
        student3.city = "Walsrode";
        student3.gender = 'M';
        student3.getLessonInfo();
        student3.getLessonInfo();
        student3.getHomeworkInfo();
        student3.drink("boza");
        student3.printStudentInfo();


    }


}
