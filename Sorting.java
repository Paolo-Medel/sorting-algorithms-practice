import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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

    public static int[] mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

            int[] left = mergeSort(leftArray);
            int[] right = mergeSort(rightArray);

            int[] merged = new int[array.length];

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] > right[j]) {
                    merged[k] = right[j];
                    j++;
                } else {
                    merged[k] = left[i];
                    i++;
                }
                k++;
            }

            while (i < left.length) {
                merged[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length) {
                merged[k] = right[j];
                j++;
                k++;
            }

            return merged;
        }
        return array;
    }

    public static int[] QuickSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        //pick a random pivot
        Random randomObj = new Random();
        int randomIndex = randomObj.nextInt(array.length);
        int randomValueFromArray = array[randomIndex];

        //move the pivot to the end
        int temp = array[array.length - 1];
        array[array.length - 1] = randomValueFromArray;
        array[randomIndex] = temp;

        // Count elements less and greater - making sure not to include the pivot to itself
        int lessCount = 0, greaterCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < randomValueFromArray) lessCount++;
            else greaterCount++;
        }

        // initialize the array's with the correct size
        int[] less = new int[lessCount];
        int[] greater = new int[greaterCount];

        // use pointers to input values into the above arrays
        int l = 0, g = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < randomValueFromArray) less[l++] = array[i];
            else greater[g++] = array[i];
        }

        // recursive step
        int[] sortedLess = QuickSort(less);
        int[] sortedGreater = QuickSort(greater);

        // concatenate less, pivot, more values
        int[] result = new int[array.length];
        System.arraycopy(sortedLess, 0, result, 0, sortedLess.length);
        result[sortedLess.length] = randomValueFromArray;
        System.arraycopy(sortedGreater, 0, result, sortedLess.length + 1, sortedGreater.length);

        return result;
    }
}
