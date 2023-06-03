package homework250523;


public class ArraySort {

    //Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
    //
    //Массив 1 - 100 112 256 349 770
    //Массив 2 - 72 86 113 119 265 445 892
    //к = 7
    //Вывод : 256

    public static void main(String[] args) {
        int[] arrayOne = {100, 112, 256, 349, 770};
        int[] arrayTwo = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(findElement(arrayOne, arrayTwo, 7));
    }

    public static int findElement(int[] arrayOne, int[] arrayTwo, int index) {
        int[] resultArray = new int[(arrayOne.length + arrayTwo.length) - 1];
        int i = 0;
        int j = 0;
        int k = 0;
      while (i < arrayOne.length && j < arrayTwo.length) {
          if (arrayOne[i] <= arrayTwo[j]) {
              resultArray[k] = arrayOne[i];
              i++;
          }else {
              resultArray[k] = arrayTwo[j];
              j++;
          }
          k++;
      }
      index = index - 1;

        return resultArray[index];
    }
}
