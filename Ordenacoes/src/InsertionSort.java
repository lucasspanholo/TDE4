public class InsertionSort {
    public void insertionSort(int[] array) {
        int i = 1;

        while (i < array.length) {
            int key = array[i];
            int a = i - 1;


            while (a >= 0 && array[a] > key) {
                array[a + 1] = array[a];
                a--;
            }
            array[a + 1] = key;
            i++;
        }
    }
}
