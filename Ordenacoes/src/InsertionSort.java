public class InsertionSort {
    public void insertionSort(int[] array) {
        int i = 1; // Inicializa o índice `i`

        while (i < array.length) {
            int key = array[i];
            int a = i - 1;

            // Move os elementos maiores que `key` uma posição à frente
            while (a >= 0 && array[a] > key) {
                array[a + 1] = array[a];
                a--;
            }
            array[a + 1] = key; // Insere `key` na posição correta
            i++; // Incrementa `i` para continuar a iteração
        }
    }
}
