package Arrays;

public class Sliding_Window_Maximum_239_Leetcode {
    public static void main(String[] args) {

        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int n = nums.length;
        int[] result = new int[nums.length - k + 1];


        for  (int i = 0; i <= n-k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }
        for (int var :  result) {
            System.out.print(var + " ");
        }
    }
}
