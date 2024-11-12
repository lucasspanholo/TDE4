import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String arquivoCSV = "src\\aleatorio_100.csv";
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        Bubblesort bubbleSort = new Bubblesort();
        Quicksort quickSort = new Quicksort();
        InsertionSort insertionSort = new InsertionSort();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoCSV))) {
            leitor.readLine();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                listaNumeros.add(Integer.parseInt(linha));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] numeros = listaNumeros.stream().mapToInt(i -> i).toArray();

        System.out.println("Array Original:");


        int[] arrayBubble = numeros.clone();
        long tempoInicial = System.nanoTime();
        bubbleSort.sort(arrayBubble);
        long tempoFinal = System.nanoTime();
        System.out.println("\nTempo de execução do Bubble Sort: " + (tempoFinal - tempoInicial) + " ns");


        int[] arrayInsertion = numeros.clone();
        tempoInicial = System.nanoTime();
        insertionSort.insertionSort(arrayInsertion);
        tempoFinal = System.nanoTime();
        System.out.println("\nTempo de execução do Insertion Sort: " + (tempoFinal - tempoInicial) + " ns");


        int[] arrayQuick = numeros.clone();
        tempoInicial = System.nanoTime();
        quickSort.quickSort(arrayQuick, 0, arrayQuick.length - 1);
        tempoFinal = System.nanoTime();
        System.out.println("\nTempo de execução do QuickSort: " + (tempoFinal - tempoInicial) + " ns");
    }
}

