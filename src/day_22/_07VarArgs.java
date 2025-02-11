package day_22;

public class _07VarArgs {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        sum1(arr);

        sum2(arr);

        //sum2(2,5,8,9); fehler
        sum1(2,5,8,9);




    }

    public static void sum1(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        System.out.println(sum);
    }
    public static void sum2(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        System.out.println(sum);
    }

}
