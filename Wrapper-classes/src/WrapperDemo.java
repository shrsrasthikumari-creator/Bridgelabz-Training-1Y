import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int primitiveInt = scanner.nextInt();

        Integer wrappedInt = Integer.valueOf(primitiveInt);

        System.out.println("\n--- Conversion Results ---");
        System.out.println("Primitive int value: " + primitiveInt);
        System.out.println("Wrapper Integer object value: " + wrappedInt);

        scanner.close();
    }
}
