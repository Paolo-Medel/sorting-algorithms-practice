public class SelectiveSort {
    public int[] selectiveSortMethod(int[] array) {

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
}
