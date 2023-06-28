package homework230623.task2;

//Level 2
//Дан односвязный список. Написать функцию или блок схему, определяющую, образуют ли его элементы симметричную последовательность. 
// Для решения задачи использовать стек и очередь. Функция будет возвращать значение true, если список является симметричным, false – в противном случае.
//По определению пустой список является симметричным. Поэтому, если список пуст, то возвращаем значение true. 
// Для проверки симметричности списка нужно проверить на равенство все пары элементов, равноотстоящих от середины списка.
// Каждая пара содержит один элемент из первой половины списка и один – из второй.
// Элементы первой половины списка последовательно заносятся в очередь, второй половины в стек. 
// Если количество элементов списка будет нечетным, то серединный элемент будет симметричен сам себе и не будет помещен ни в очередь, ни в стек.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricSequence {

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(1);
        queue.add(1);
        queue.add(3);
        queue.add(1);
        queue.add(1);
        queue.add(3);
        System.out.println(queue);
        System.out.println(isValid(queue));

        LinkedList<String> queueString = new LinkedList<>();
        queueString.add("A");
        queueString.add("B");
        queueString.add("C");
        queueString.add("D");
        queueString.add("C");
        queueString.add("B");
        System.out.println(queueString);
        System.out.println(isValid(queueString));
    }

    public static <T> boolean isValid(LinkedList<T> list) {
        Queue<T> queue = new LinkedList<>();
        Stack<T> stack = new Stack<>();
        int queueSize = list.size() / 2;
        for (int i = 0; i < queueSize; i++) {
            queue.add(list.get(i));
        }
        System.out.println(queue);
        for (int i = queueSize + (list.size() % 2); i <= list.size() - 1; i++) {
            stack.add(list.get(i));
        }
        System.out.println(stack);

        if (list.isEmpty()) {
            return true;
        }
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }
}
