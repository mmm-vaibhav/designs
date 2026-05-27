package Arrays.operations;

import java.util.Arrays;

public class ForwardInsertion2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2, element = 111;
        int n = arr.length;
        int[] arr1 = new int[n + 1];
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = i < pos ? arr[i] : (i == pos ? element : arr[i-1]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}

