package Arrays.techniques_algo.kadanes_algo;

public class Maximum_sum_sub_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, -6, -4, 7, 1};

        int[] arr1 = {-3, 4, -1, -2, 7, -8};

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        System.out.println(maxSum);
    }
}
