package lab;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex7 {

    public static BigInteger fact(int a){

        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= a; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
       int a=input.nextInt();
        System.out.println(fact(a));
    }
}
