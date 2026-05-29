package Arrays.basic;

public class Maximum_Arrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }

        System.out.println(MAX);
    }
}
