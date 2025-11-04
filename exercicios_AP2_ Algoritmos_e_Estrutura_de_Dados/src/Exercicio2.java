/* 2-) Crie uma classe Pilha que permita empilhar e desempilhar valores inteiros.
   Use os métodos empilhar(int valor) e desempilhar(). */

public class Exercicio2 {

    // Classe Pilha dentro da classe principal (para evitar warnings de não uso)
    static class Pilha {
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
                System.out.println("Erro: a pilha está cheia!");
            }
        }

        public int desempilhar() {
            if (topo >= 0) {
                int valor = elementos[topo];
                topo--;
                System.out.println("Desempilhado: " + valor);
                return valor;
            } else {
                System.out.println("Erro: a pilha está vazia!");
                return -1;
            }
        }

        public boolean estaVazia() {
            return topo == -1;
        }

        public boolean estaCheia() {
            return topo == capacidade - 1;
        }

        public void exibirPilha() {
            if (estaVazia()) {
                System.out.println("A pilha está vazia.");
            } else {
                System.out.print("Elementos da pilha: ");
                for (int i = 0; i <= topo; i++) {
                    System.out.print(elementos[i] + " ");
                }
                System.out.println();
            }
        }
    }

    // Método principal — usa todos os métodos da Pilha
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);

        pilha.exibirPilha();

        pilha.desempilhar();
        pilha.exibirPilha();

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
    }
}
