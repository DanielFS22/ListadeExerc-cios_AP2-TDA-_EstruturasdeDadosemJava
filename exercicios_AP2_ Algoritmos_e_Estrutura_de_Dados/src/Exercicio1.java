 /*1.) Implemente uma classe Lista que use um vetor de inteiros para armazenar até 5 elementos.
         Adicione os métodos inserir(int valor) e mostrar().*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

// Classe que representa uma lista simples capaz de armazenar até 5 números inteiros
class Lista {
    // Declara um vetor de inteiros com tamanho fixo de 5 posições
    private final int[] vetor = new int[5];

    // Guarda a quantidade atual de elementos inseridos na lista
    private int tamanho = 0;

    // Metodo responsável por inserir um novo valor na lista
    public void inserir(int valor) {
        // Verifica se ainda há espaço livre no vetor
        if (tamanho < vetor.length) {
            vetor[tamanho++] = valor; // Armazena o valor e incrementa o tamanho
        } else {
            System.out.println("Lista cheia!");
        }
    }

    // Metodo que exibe todos os elementos armazenados na lista
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
            return;
        }

        System.out.print("Elementos: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Quebra de linha no final
    }
}

// Classe principal que executa o programa
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o leitor de dados do teclado
        Lista lista = new Lista(); // Cria uma nova lista

        System.out.println("Digite até 5 números inteiros para inserir na lista:");

        // Laço para permitir que o usuário insira até 5 valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int valor = entrada.nextInt(); // Lê um número inteiro digitado pelo usuário
            lista.inserir(valor);          // Insere o número na lista
        }

        // Exibe os elementos inseridos
        System.out.println("\nConteúdo final da lista:");
        lista.mostrar();

        entrada.close(); // Fecha o Scanner (boa prática)
    }
}
