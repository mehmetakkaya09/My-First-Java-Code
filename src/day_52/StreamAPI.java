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

        //ab n'th lange kann man etwas machen
        List<Integer> limitList = list3.stream().limit(7).skip(4).collect(Collectors.toList());
        System.out.println(limitList);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr3));
        int[] limitArray = Arrays.stream(arr3).limit(5).skip(2).toArray();
        System.out.println(Arrays.toString(limitArray));

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> mapList = list4.stream().map(num -> num * 10).toList();
        System.out.println(mapList);

        List<String> names = new ArrayList<>(Arrays.asList("   Vadim     ", "   Blagoja      ", "      Süreyya       ", "       Mehmet       "));
        System.out.println(names);
        List<String> mapTrim = names.stream().map(name -> name.trim()).toList();
        System.out.println(mapTrim);

        List<String> surnames = new ArrayList<>(Arrays.asList("Jack", "     Yılmaz", "Lee     ", "Jo", "x", "", "               "));

        System.out.println(surnames);
        List<String> passedSurnames = surnames.stream().filter(surname -> surname.trim().length() > 1).toList();
        System.out.println(passedSurnames);

        passedSurnames = passedSurnames.stream().map(s -> s.trim()).toList();
        System.out.println(passedSurnames);




    }


}
