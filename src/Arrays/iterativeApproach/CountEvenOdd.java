package Arrays.iterativeApproach;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 63, 7};

        int evens = 0, odds = 0;

        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 2 == 0){
               ++evens;
           } else {
               ++odds;
           }
        }

        System.out.println("Even Count: " +evens);
        System.out.println("Odd Count: " +odds);
    }
}
