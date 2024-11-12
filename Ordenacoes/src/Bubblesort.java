public class Bubblesort {
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        int i = 0; // Inicializa o índice para o laço `while`

        while (i < n - 1) {
            swapped = false;
            int a = 0;

            while (a < n - 1 - i) {
                if (array[a] > array[a + 1]) {
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                    swapped = true;
                }
                a++; // Incrementa o índice `j`
            }

            if (!swapped) {
                break; // Interrompe o laço se não houver trocas
            }
            i++; // Incrementa o índice `i`
        }
    }
}
