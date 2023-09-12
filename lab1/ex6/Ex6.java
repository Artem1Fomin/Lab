package ru.mirea.lab1.ex6;

public class Ex6 {
    public static void main(String[] args) {
        int n = 10;
        double x = 0;

        for (double i = 1; i <= n; i++)
        {
            x = 1 / i;
            if (i != 1)
                System.out.print("1/" + (int)i);
            if (i != n && i > 1)
                System.out.print(" + ");
            if (i == 1)
                System.out.print((int)x + " + ");
        }

    }
}
