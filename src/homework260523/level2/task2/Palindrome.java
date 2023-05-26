package homework260523.level2.task2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //b) Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().trim();
        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}
