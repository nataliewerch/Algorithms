package homework260523.level2.task1;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        //a) Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print(getFibonacci(i) + " ");
    }

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
