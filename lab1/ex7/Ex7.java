package ru.mirea.lab1.ex7;

import java.util.Scanner;

public class Ex7 {

    public static int fact(int a){
        int u = 1;
        for (int i = 1; i <= a; i++)
            u *= i;
        return u;
    }
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
       int a=input.nextInt();
        System.out.println(fact(a));
    }
}
