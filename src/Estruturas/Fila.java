package Estruturas;

public class Fila {
    private final int[] elementos = new int[5]; // capacidade fixa
    private int inicio = 0; // indice do primeiro elemento
    private int fim = 0;    // indice onde o proximo sera inserido
    private int tamanho = 0; // quantidade de elementos na fila

    // Metodo para adicionar um elemento na fila
    public void enfileirar(int valor) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia! Nao e possivel enfileirar " + valor);
            return;
        }

        elementos[fim] = valor;
        fim = (fim + 1) % elementos.length; // movimenta de forma circular
        tamanho++;
        System.out.println("Enfileirado: " + valor);
    }

    // Metodo para remover o primeiro elemento da fila
    public int desenfileirar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia! Nada para desenfileirar.");
            return -1;
        }

        int valorRemovido = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valorRemovido;
    }

    // Metodo para exibir o conteudo da fila
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % elementos.length;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }
}
