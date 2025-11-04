package Estruturas;

public class Lista {
    // Vetor com capacidade para 5 inteiros
    private final int[] vetor = new int[5];
    private int tamanho = 0;

    // Metodo para inserir valor na lista
    public void inserir(int valor) {
        if (tamanho < vetor.length) {
            vetor[tamanho++] = valor;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    // Metodo para mostrar os elementos da lista
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("A lista esta vazia.");
            return;
        }

        System.out.print("Elementos: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
