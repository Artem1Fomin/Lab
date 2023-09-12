package ru.mirea.lab1.ex3;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum/arr.length);
        System.out.println(sum);
    }
}
