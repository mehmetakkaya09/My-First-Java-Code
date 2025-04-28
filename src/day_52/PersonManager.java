package day_52;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {

    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir") + "/src/day_52/People";
        System.out.println(filePath);

        Person person1 = new Person("Vadim       ", "+497845145151", "       Frankfurt");
        Person person2 = new Person("       Blagoja", "+497845145152", "     Hamburg");
        Person person3 = new Person("Mehmet", "+905302224444      ", "Aydın         ");

        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3));

        List<Person> updatedPeople = people.stream()
                .map(person -> {
                    person.setName(person.getName().trim());
                    person.setPhone(person.getPhone().trim());
                    person.setAddress(person.getAddress().trim().substring(0, 3)); // Trim sonrası ilk 3 harfi al
                    return person; // Güncellenmiş kişiyi geri döndür
                })
                .collect(Collectors.toList());



        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileOutputStream(filePath, true));

            for (Person person : people) {
                printWriter.println(person.personToStr());
            }

        }catch (FileNotFoundException fnfe) {
            System.out.println("Check your file Path");
        }finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }







    }

}
