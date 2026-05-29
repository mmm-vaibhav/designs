package Arrays.brute_force;

public class Find_the_duplicates {

    public static void main(String[] args) {
        int[] arr = {10, 40, 60, 20, 10, 50, 40, 80};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int element = arr[i];
            for (int j= i+1; j<n; j++) {
                if (element == arr[j]) {
                    System.out.println(element);
                    break;
                }
            }
        }

    }

}
