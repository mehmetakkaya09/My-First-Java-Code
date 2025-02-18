package day_26;

import java.util.ArrayList;
import java.util.Arrays;

public class _07RemoveAll {

    public static void main(String[] args) {

        Integer[] numberArray = {4,7,1,9,45,121,22};

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numberArray));

        System.out.println(numberList);

        ArrayList<Integer> numberList2 = new ArrayList<>(Arrays.asList(45,3,8,2,9,4,0,22,90,231,4,7,1,9,45,121,7));

        System.out.println(numberList2);

        numberList2.removeAll(numberList);

        System.out.println(numberList2);

        ArrayList<Integer> numberList3 = new ArrayList<>(Arrays.asList(45,3,8,1,5,9,0,4,0,22,0,90,231,4,7,1,9,45,121,3,5,7));

        System.out.println(numberList3);

        numberList3.removeAll(Arrays.asList(0,3,5));

        System.out.println(numberList3);

    }

}
