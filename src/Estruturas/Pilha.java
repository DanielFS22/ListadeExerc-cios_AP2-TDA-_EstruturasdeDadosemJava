package Estruturas;

public class Pilha {
    private final int[] elementos;
    private int topo;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public void empilhar(int valor) {
        if (topo < capacidade - 1) {
            topo++;
            elementos[topo] = valor;
            System.out.println("Empilhado: " + valor);
        } else {
            System.out.println("Erro: a pilha esta cheia!");
        }
    }

    public int desempilhar() {
        if (topo >= 0) {
            int valor = elementos[topo];
            topo--;
            System.out.println("Desempilhado: " + valor);
            return valor;
        } else {
            System.out.println("Erro: a pilha esta vazia!");
            return -1;
        }
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    public void mostrar() {
        if (estaVazia()) {
            System.out.println("A pilha esta vazia.");
        } else {
            System.out.print("Elementos da pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
