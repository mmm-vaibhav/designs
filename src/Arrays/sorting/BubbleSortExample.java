package Arrays.sorting;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] arr = {60, 10, 50, 40, 20, 30};

        System.out.println("Before sorting" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            System.out.println("pass " + i);
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("after pass "+ i +"\nArray looks :" + Arrays.toString(arr));
        }
    }
}
