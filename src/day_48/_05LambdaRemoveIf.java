package day_48;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class _05LambdaRemoveIf {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(11);
        nums.add(112);
        nums.add(32);
        nums.add(5);
        nums.add(51);
        nums.add(65);
        nums.add(12);

//        for (Integer num : nums) {
//            if (num > 11) {
//                nums.remove(num);
//            }
//        }

//        Iterator<Integer> it = nums.iterator();

//        while (it.hasNext()){
//            if (it.next() > 11) {
//                it.remove();
//            }
//        }



        nums.removeIf((num) -> {
            System.out.println("num = " + num);
            return num > 11;
        });

        System.out.println(nums);


    }

}
