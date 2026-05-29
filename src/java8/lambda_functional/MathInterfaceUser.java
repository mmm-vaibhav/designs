package java8.lambda_functional;

public class MathInterfaceUser {
    public static void main(String[] args) {
        MathOperation addOperation = (int a, int b) -> a + b;
        MathOperation mulOperation = (int a, int b) -> a * b;

        int a = 10;
        int b = 20;

        System.out.println(addOperation.operation(a, b));
        System.out.println(mulOperation.operation(a, b));
    }
}
