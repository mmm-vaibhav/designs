package java8;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfTheArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = IntStream.of(arr).sum();
        System.out.println("*************** sum *****************");
        System.out.println(sum);
        OptionalDouble average = IntStream.of(arr).average();
        System.out.println("*************** avg *****************");
        System.out.println(average.getAsDouble());
    }
}
