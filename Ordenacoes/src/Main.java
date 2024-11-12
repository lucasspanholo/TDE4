import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Definir o caminho do arquivo CSV
        String arquivoCSV = "src\\aleatorio_100.csv";
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Inicializar instâncias das classes de ordenação
        Bubblesort bubbleSort = new Bubblesort();
        Quicksort quickSort = new Quicksort();
        InsertionSort insertionSort = new InsertionSort();

        // Leitura do arquivo CSV e preenchimento da lista
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoCSV))) {
            leitor.readLine(); // Ignora o cabeçalho do CSV
            String linha;
            while ((linha = leitor.readLine()) != null) {
                listaNumeros.add(Integer.parseInt(linha));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Conversão da lista para um array de inteiros
        int[] numeros = listaNumeros.stream().mapToInt(i -> i).toArray();

        // Exibir o array original
        System.out.println("Array Original:");


        // Ordenação usando Bubble Sort
        int[] arrayBubble = numeros.clone();
        long tempoInicial = System.nanoTime();
        bubbleSort.sort(arrayBubble);
        long tempoFinal = System.nanoTime();
        System.out.println("\nTempo de execução do Bubble Sort: " + (tempoFinal - tempoInicial) + " ns");


        // Ordenação usando Insertion Sort
        int[] arrayInsertion = numeros.clone();
        tempoInicial = System.nanoTime();
        insertionSort.insertionSort(arrayInsertion);
        tempoFinal = System.nanoTime();
        System.out.println("\nTempo de execução do Insertion Sort: " + (tempoFinal - tempoInicial) + " ns");


        // Ordenação usando Quick Sort
        int[] arrayQuick = numeros.clone();
        tempoInicial = System.nanoTime();
        quickSort.quickSort(arrayQuick, 0, arrayQuick.length - 1);
        tempoFinal = System.nanoTime();
        System.out.println("\nTempo de execução do QuickSort: " + (tempoFinal - tempoInicial) + " ns");
    }
}

