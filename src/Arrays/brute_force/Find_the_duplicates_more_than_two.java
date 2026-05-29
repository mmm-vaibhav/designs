package Arrays.brute_force;

public class Find_the_duplicates_more_than_two {
    // find the duplicates they occurs more than 2 times.

    public static void main(String[] args) {
        int[] arr = {10, 40, 60, 40, 10, 50, 80, 40, 10, 50};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isDuplicate = false;
            int element = arr[i];
            for (int k = 0; k < i; k++) {
                if (arr[k] == element) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue;
            }
            for (int j= i+1; j<n; j++) {
                if (element == arr[j]) {
                    System.out.println(element);
                    break;
                }
            }
        }

    }
}
