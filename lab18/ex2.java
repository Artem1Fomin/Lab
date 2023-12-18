package lab18;
import java.util.*;
public class ex2 {
        public static void exceptionDemo1() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(10 / i);
        }

        public static void exceptionDemo2() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(10 / i);
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            exceptionDemo2();
        }
}
