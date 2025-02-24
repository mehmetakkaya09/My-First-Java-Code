package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class _02FilterRange {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,5,8,0,3,56,232,7,8,232,2,4,9,5));
        // schreib ein method
        // m nimmt ein (ArrayList<Integer> nums, int min, int max) als parameter
        // m gibt auch ein ArrayList<Integer> zurück
        // diese zurückgegebene ArrayList<Integer> beinhaltet die Zahlen, die nur zwischen min und max Grenze Zahlen befinden 5, 8, 5, 8, 9, 5

    }

    public static ArrayList<Integer> filterRange(ArrayList<Integer> nums, int min, int max) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(Integer n : nums){
            if(n >= min && n <= max){
                temp.add(n);
            }
        }
        return temp;
    }





}
