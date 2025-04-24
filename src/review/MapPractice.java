package review;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000); //123000
        map.put("Antony", 100000);//123000
        map.put("Jimmy", 115000);//123000
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);//123000
        map.put("Steven", 135000);

        String maxSalaryName = "";
        Integer maxSalary = Integer.MIN_VALUE;

        //    1.1 Wer hat das höchste Gehalt?

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            String eachKey = each.getKey();
            Integer eachValue = each.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                maxSalaryName = eachKey;
            }

        }

        System.out.println(maxSalaryName + " verdient " + maxSalary);

        //    1.2 Wer hat das Mindestgehalt?

        String minSalaryName = "";
        Integer minSalary = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            String eachKey = each.getKey();
            Integer eachValue = each.getValue();

            if (eachValue < minSalary) {
                minSalary = eachValue;
                minSalaryName = eachKey;
            }
        }

        System.out.println(minSalaryName + " verdient " + minSalary);

        //    1.3 Wie viele Mitarbeiter haben ein Gehalt zwischen 120k und 150k?

        int count = 0;

        for (Integer eachSalary : map.values()) {
            if (eachSalary >= 120000 && eachSalary <= 150000) {
                count++;
            }
        }

        System.out.println(count + " Mitarbeiter verdient ein Gehalt zwischen 120k und 150k");

        //    1.4 Zeige die Namen der Mitarbeiter, die weniger als 118k verdienen?

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            Integer salary = each.getValue();
            if (salary < 118000){
                System.out.println(each.getKey() + " verdient " + salary);
            }
        }

        System.out.println("*******************************");

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            Integer salary = each.getValue();
            if (salary <= 120000){
                each.setValue(salary + 10000);
            }
        }

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            System.out.println(each.getKey() + " verdient " + each.getValue());
        }

//    1.5 Erhöhen Sie das Gehalt eines jeden Mitarbeiters, wer weniger als 120000 verdienen, um 10.000

    }
}
//1. Gegeben sei die folgende map, die den Namen des Mitarbeiters und sein Gehalt enthält:
//     Map<String, Integer> map = new LinkedHashMap<>();
//        map.put("John", 123000);
//        map.put("Antony", 100000);
//        map.put("Jimmy", 115000);
//        map.put("James", 110000);
//        map.put("Conor", 85000);
//        map.put("Josh", 117000);
//        map.put("Cory", 118000);
//        map.put("Anderson",125000);
//        map.put("Steven", 135000);
//
//
//    1.1 Wer hat das höchste Gehalt?
//    1.2 Wer hat das Mindestgehalt?
//    1.3 Wie viele Mitarbeiter haben ein Gehalt zwischen 120k und 150k?
//    1.4 Zeige die Namen der Mitarbeiter, die weniger als 118k verdienen?
//    1.5 Erhöhen Sie das Gehalt eines jeden Mitarbeiters um 10.000