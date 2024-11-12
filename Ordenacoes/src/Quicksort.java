public class Quicksort {
    public void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particao(array, inicio, fim);

            quickSort(array, inicio, pivo - 1);
            quickSort(array, pivo + 1, fim);
        }
    }
    private  int particao(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;

        for (int a = inicio; a < fim; a++) {
            if (array[a] < pivo) {
                i++;
                int temp = array[i];
                array[i] = array[a];
                array[a] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }
}
