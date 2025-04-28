package day_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 45, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8));
        System.out.println(list);

        //ohne Duplikaten
        //ergebnisse müssen wir zu einer bestimmten Type umwandeln (Collection Type oder Array)
        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 45, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8};

        System.out.println(Arrays.toString(arr));

        int[] resArr = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(resArr));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list2);

        // ab n'th index kann man alle werten erhalten
        List<Integer> skipList = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipList);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr2));
        int[] skipArray = Arrays.stream(arr2).skip(3).toArray();
        System.out.println(Arrays.toString(skipArray));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 4, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list3);

        //bis n'th lange(index + 1) kann man etwas machen
        List<Integer> limitList = list3.stream().limit(7).skip(4).collect(Collectors.toList());
        System.out.println(limitList);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr3));
        int[] limitArray = Arrays.stream(arr3).limit(5).skip(2).toArray();
        System.out.println(Arrays.toString(limitArray));

        //um über jede Element etwas zu machen/andern
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> mapList = list4.stream().map(num -> num * 10).toList();
        System.out.println(mapList);

        List<String> names = new ArrayList<>(Arrays.asList("   Vadim     ", "   Blagoja      ", "      Süreyya       ", "       Mehmet       "));
        System.out.println(names);
        List<String> mapTrim = names.stream().map(name -> name.trim()).toList();
        System.out.println(mapTrim);

        List<String> surnames = new ArrayList<>(Arrays.asList("Jack", "     Yılmaz", "Lee     ", "Jo", "x", "", "               "));
        System.out.println(surnames);

        //um je nach bestimmte Bedingungen Filter zu machen
        List<String> passedSurnames = surnames.stream().filter(surname -> surname.trim().length() > 1).toList();
        System.out.println(passedSurnames);

        passedSurnames = passedSurnames.stream().map(s -> s.trim()).toList();
        System.out.println(passedSurnames);

        List<String> javaList = new ArrayList<>(Arrays.asList("java", "Java", "JaVa", "  Java     ", "Python", "C#","Javascript","Ruby"));

        // um List oder Element zahl zu bekommen
        long javaCount = javaList.stream().filter(el -> el.trim().equalsIgnoreCase("java")).count();
        System.out.println(javaCount);

        //forEach loop
        javaList.stream().filter(p -> p.trim().equalsIgnoreCase("java")).forEach(System.out::println);

        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        boolean b1 = numList.stream().allMatch(num -> num % 2 == 0);
        System.out.println(b1);
        boolean b2 = numList.stream().allMatch(num -> num < 100);
        System.out.println(b2);

        boolean b3 = numList.stream().anyMatch(num -> num % 2 != 0);
        System.out.println(b3);

        boolean b4 = numList.stream().anyMatch(num -> num == 50);
        System.out.println(b4);

        boolean b5 = numList.stream().noneMatch(num -> num > 100);
        System.out.println(b5);

        boolean b6 = numList.stream().noneMatch(num -> num == 2);
        System.out.println(b6);


    }


}
