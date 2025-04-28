package day_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,3,4,4,4,45,5,5,5,5,6,7,7,7,7,8));
        System.out.println(list);

        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        int[] arr = {1,1,1,2,2,3,3,3,3,4,4,4,45,5,5,5,5,6,7,7,7,7,8};

        System.out.println(Arrays.toString(arr));

        int[] resArr = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(resArr));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list2);
        List<Integer> skipList = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipList);

        int[] arr2= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr2));
        int[] skipArray = Arrays.stream(arr2).skip(3).toArray();
        System.out.println(Arrays.toString(skipArray));




    }


}
