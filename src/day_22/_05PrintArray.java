package day_22;

public class _05PrintArray {

    public static void main(String[] args) {

        String[] autosArr = {"Toyota", "Opel", "Honda", "Mercedes", "BYD"};

        ArrayUtil.printArray(autosArr);

        int[] nums = {1, 2, 3, 4, 5};
        ArrayUtil.printArray(nums);

        double[] prozente = {1.4, 4.6, 7.9};

        ArrayUtil.printArray(prozente);

        String reversedArray[] = ArrayUtil.reverseArray(autosArr);
        ArrayUtil.printArray(reversedArray);

    }
}
