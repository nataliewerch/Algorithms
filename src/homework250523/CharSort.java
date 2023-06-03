package homework250523;

public class CharSort {

    //Расставьте в алфавитном порядке буквы. Разрешается использование техники Разделяй и властвуй. Полученные данные напечатайте.
    //На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
    //На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)

    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";
        char[] letters = input.toCharArray();
        bubbleSort(letters);
        String output = new String(letters).toUpperCase();
        System.out.println(output);
    }


    private static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
