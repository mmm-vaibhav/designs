package Arrays.techniques_algo.kadanes_algo;

public class Sliding_win_max_sum_sub_arrays {

    public static void main(String[] args) {
        int[] arr = {100, 90, 120, 140, 80, 150, 110, 130};
        int k = 3;
        int total = 0;
        for (int i = 0; i < k; i++) {
            total = total + arr[i];
        }
        int max = total;
        for (int i = 1; i <= arr.length-k; i++) {
            total = total + (arr[i+k-1]-arr[i-1]);
            max = Math.max(max, total);
        }
        System.out.println("Max Sub array sum:: " + max);
    }

}
