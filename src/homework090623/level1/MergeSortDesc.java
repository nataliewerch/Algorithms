package homework090623.level1;

import java.util.Arrays;

//У вас есть список из n элементов, которые представляют собой оценки студентов по математике. Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
//Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает новый список, отсортированный в порядке убывания.
//{3, 8, 1, 9, 4, 2, 7, 6, 5 };

public class MergeSortDesc {
    public static void main(String[] args) {
        int[] gradeStudents = {3, 8, 1, 9, 4, 2, 7, 6, 5};
        System.out.println(Arrays.toString(gradeStudents));
        mergeSortDesc(gradeStudents);
        System.out.println(Arrays.toString(gradeStudents));

    }

    public static void mergeSortDesc(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int arrLeftLength = arr.length / 2;
        int arrRightLength = arr.length - arrLeftLength;

        int[] arrLeft = new int[arrLeftLength];
        int[] arrRight = new int[arrRightLength];

        for (int i = 0; i < arrLeftLength; ++i) {
            arrLeft[i] = arr[i];
        }
        for (int j = 0; j < arrRightLength; ++j) {
            arrRight[j] = arr[j + arrLeftLength];
        }
        mergeSortDesc(arrLeft);
        mergeSortDesc(arrRight);

        merge(arr, arrLeft, arrRight);
    }

    public static void merge(int[] arr, int[] arrLeft, int[] arrRight) {
        int leftArrIndex = 0;
        int rightArrIndex = 0;
        int arrIndex = 0;

        while (leftArrIndex < arrLeft.length && rightArrIndex < arrRight.length) {
            if (arrLeft[leftArrIndex] > arrRight[rightArrIndex]) {
                arr[arrIndex] = arrLeft[leftArrIndex];
                arrIndex++;
                leftArrIndex++;
            } else {
                arr[arrIndex] = arrRight[rightArrIndex];
                arrIndex++;
                rightArrIndex++;
            }
        }
            while (leftArrIndex < arrLeft.length) {
                arr[arrIndex] = arrLeft[leftArrIndex];
                arrIndex++;
                leftArrIndex++;
            }
            while (rightArrIndex < arrRight.length) {
                arr[arrIndex] = arrRight[rightArrIndex];
                arrIndex++;
                rightArrIndex++;
        }
    }
}
