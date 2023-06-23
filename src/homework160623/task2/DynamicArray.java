package homework160623.task2;

import java.util.*;

//b. Рассмотрите задачу динамического увеличения массива.
// Реализуйте функцию, которая принимает на вход массив и число элементов, и возвращает новый массив,
// который содержит все элементы исходного массива и заданное число новых элементов.

public class DynamicArray {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(arrayList);
        getNewList(arrayList, 5);
        System.out.println(arrayList);

    }

    public static List<Integer> getNewList(List<Integer> arrayList, int element) {
        for (int i = 0; i < element; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        return arrayList;
    }
}
