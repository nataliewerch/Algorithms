package homework260523.level1.task1;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        //a) Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//Операцией возведения в степень пользоваться нельзя!
//Ввод: 8
//Вывод: YES
//–––
//Ввод: 3
//Вывод: NO

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if (isPowerOfTwo(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        } else {
            return false;
        }
    }
}
