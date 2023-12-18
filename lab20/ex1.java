package lab20;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("CLASS NAMES");
        Example<Integer, String, Animal> test1 = new Example<>(21, "тим", new Animal("Алекс", "лев"));
        test1.printClassNames();
        System.out.println();


        System.out.println("ARRAY OF INTEGERS");
        Integer[] array = {1212,243,-24234,66,3424,457567,24234,769};
        MinMax<Integer> test2 = new MinMax<>(array);
        System.out.println("Max: " + test2.getMax() + "\nMin: " + test2.getMin());

        System.out.println("ARRAY OF DOUBLES");
        Double[] array2 = {5345.6, 98990.8, 32.1};
        MinMax<Double> test3 = new MinMax<>(array2);
        System.out.println("Max: " + test3.getMax() + "\nMin: " + test3.getMin());
        System.out.println();


        System.out.println("CALCULATOR OF NUMBERS OF DIFFERENT TYPES");
        System.out.println(Calculator.sum(2.3, -2.2));
        System.out.println(Calculator.subtract(5.23, -3.11));
        System.out.println(Calculator.multiply(5, 24));
        System.out.println(Calculator.divide(10, -0.15));
        System.out.println();
    }
}

