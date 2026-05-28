package Arrays.operations;

import java.util.Arrays;

public class ArraysDeletion2 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int element = 40;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                pos = i;
                break;
            }
        }
        if (pos >= 0) {
            for (int i = pos; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

}
