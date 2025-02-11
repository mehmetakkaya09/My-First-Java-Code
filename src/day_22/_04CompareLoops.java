package day_22;

public class _04CompareLoops {

    public static void main(String[] args) {

        int numbers[] = {2, 5, 7, 9, 3, 6};

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("***************");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println("***************");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }

        System.out.println("***************");
        int[] nums = new int[5];

        for (int num : nums) {
            num = 2;
        }

        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("***************");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2;
        }

        System.out.println("***************");
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("***************");
    }

}
