public class Sorting {

    public static int[] selectiveSortMethod(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int lowestNumber = Integer.MAX_VALUE;
            int lowestNumberIndex = i;


            for (int j = i; j < array.length; j++) {
                if (array[j] < lowestNumber) {
                    lowestNumber = array[j];
                    lowestNumberIndex = j;
                }
            }

            array[lowestNumberIndex] = array[i];
            array[i] = lowestNumber;
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) break;

        }
        return array;
    }
}
