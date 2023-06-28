package homework230623.task1;

import java.util.Stack;

// 1 уровень сложности: Level 1
//Последовательность ([{}]) является правильной, а последовательности ([)], {()] правильными не являются.
// Докажите это используя стек!
public class StackQueueApp {

    public static void main(String[] args) {
        String trueString = "([{}])";
        String falseString = "([)]";

        System.out.println(trueString + " is valid " + isValid(trueString));
        System.out.println(falseString + " is valid " + isValid(falseString));
    }

    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (char ch : string.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
