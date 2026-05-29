package java8;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Maximum_Arrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        OptionalInt max = Arrays.stream(arr).filter()..max(Integer::max);
        OptionalInt max = IntStream.of(arr).max();
        System.out.println(max.getAsInt());

//        Optional<int[]> max1 = Stream.of(arr).max(Integer::compareTo).orElseThrow();

//        int max1 = Stream.of(arr).max(Integer::compareTo).orElseThrow();

        int Max1 = Arrays.stream(arr).max().orElseThrow();


    }
}
