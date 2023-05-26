package homework260523.level1.task2;


import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        //b) Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
//Ввод: 179
//Вывод: 17

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.println(calculateSum(n));
    }

    public static int calculateSum(int n) {
        if (n < 10) {
            return n;
        } else {
            int endDigit = n % 10;
            int digit = n / 10;
            int sum = endDigit + calculateSum(digit);
            return sum;
        }
    }
}
