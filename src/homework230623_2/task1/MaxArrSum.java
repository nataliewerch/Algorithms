package homework230623_2.task1;

public class MaxArrSum {

    public static void main(String[] args) {
        int[] array = {11, 12, 4, 30, 10, 40, 36};
        System.out.println(findMaxSum(array));
    }

    public static int findMaxSum(int[] arr) {
        int n = arr.length;

        if (n <= 2) {
            return Math.max(arr[0], arr[1]);
        }

        int maxSum = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 2; j < n; j++) {
                int sum = arr[i] + arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }


}

