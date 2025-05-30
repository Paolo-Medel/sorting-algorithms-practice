public class Main {
    public static void main(String[] args){
        int[] dataset =
                {42, 7, 93, 18, 56, 81, 23, 66, 3, 77, 31, 10, 95, 2, 38, 84, 26, 59, 13, 99,
                        5, 71, 48, 62, 20, 36, 89, 12, 68, 25, 53, 33, 90, 46, 74, 40, 9, 16, 64, 85, 29, 1, 55, 78, 14, 50, 34, 8, 97, 21};

//        Sorting sortAlgsObj = new Sorting();
        int[] selectiveSorted = Sorting.mergeSort(dataset);

        for (int j : selectiveSorted) {
            System.out.println(j);
        }
    }
}
