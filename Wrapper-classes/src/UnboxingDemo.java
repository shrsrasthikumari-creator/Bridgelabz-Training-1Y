public class UnboxingDemo {
    public static void main(String[] args) {
        Double wrappedDouble = 45.67;

        double primitiveDouble = wrappedDouble.doubleValue();
        int primitiveInt = (int) primitiveDouble;

        System.out.println("Wrapper Double object: " + wrappedDouble);
        System.out.println("Primitive double value: " + primitiveDouble);
        System.out.println("Primitive int value (after casting): " + primitiveInt);
    }
}
