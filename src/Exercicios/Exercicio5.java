package Exercicios;

import Estruturas.*;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha(5);
        Fila fila = new Fila();

        int opcaoGeral;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Testar Lista");
            System.out.println("2 - Testar Pilha");
            System.out.println("3 - Testar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcaoGeral = entrada.nextInt();

            switch (opcaoGeral) {
                case 1 -> menuLista(lista, entrada);
                case 2 -> menuPilha(pilha, entrada);
                case 3 -> menuFila(fila, entrada);
                case 0 -> System.out.println("Encerrando programa...");
                default -> System.out.println("Opcao invalida!");
            }

        } while (opcaoGeral != 0);

        entrada.close();
    }

    // ---------------- LISTA ----------------
    private static void menuLista(Lista lista, Scanner entrada) {
        int opcao;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Mostrar lista");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para inserir: ");
                    int valor = entrada.nextInt();
                    lista.inserir(valor);
                }
                case 2 -> lista.mostrar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }

    // ---------------- PILHA ----------------
    private static void menuPilha(Pilha pilha, Scanner entrada) {
        int opcao;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar elemento");
            System.out.println("2 - Desempilhar elemento");
            System.out.println("3 - Mostrar pilha");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para empilhar: ");
                    int valor = entrada.nextInt();
                    pilha.empilhar(valor);
                }
                case 2 -> pilha.desempilhar();
                case 3 -> pilha.mostrar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }

    // ---------------- FILA ----------------
    private static void menuFila(Fila fila, Scanner entrada) {
        int opcao;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Enfileirar elemento");
            System.out.println("2 - Desenfileirar elemento");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para enfileirar: ");
                    int valor = entrada.nextInt();
                    fila.enfileirar(valor);
                }
                case 2 -> fila.desenfileirar();
                case 3 -> fila.mostrar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }
}
