package Arrays.operations;

import java.util.Arrays;

public class ForwardInsertion {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2, element = 111;
        int n = arr.length;
        int[] arr1 = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            arr1[i] = arr[i];
        }
        arr1[pos] = element;
        for (int i = pos; i < n; i++) {
            arr1[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
