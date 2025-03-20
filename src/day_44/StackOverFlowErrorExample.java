package day_44;

public class StackOverFlowErrorExample {

    static int counter = 0;

    public static void main(String[] args) {
        try {
            fehlerhafteMethod(); //error
        }catch (StackOverflowError error){
            System.out.println("Stack Overflow Errors kann man nicht handeln");
        }
    }

    public static void fehlerhafteMethod() {
        counter++;
        System.out.println(counter);
        fehlerhafteMethod();
    }
}
