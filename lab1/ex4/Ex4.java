package ru.mirea.lab1.ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Размер-");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = input.nextInt();
        int sum = 0, max = 0, min = 10000;
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        int i = 0;
        do {
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            i++;
        } while (i != size);
        System.out.println("\nsum - " + sum + "\nmax - " + max + "\nmin - " + min);

    }
}
