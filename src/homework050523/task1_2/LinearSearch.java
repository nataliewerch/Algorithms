package homework050523.task1_2;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 7, 2, 1, 9};
        System.out.println(getIndex(arr, 4));
        System.out.println(getSumOfSquare(arr));

    }

        //task 1
    public static int getIndex(int[] arr, int num) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // task 2
    public static int getSumOfSquare(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num * num;
        }
        return sum;
    }
}
