package Exercicios;

import Estruturas.*;

public class Exercicio4 {
    public static void main(String[] args) {
        // Testando Lista
        Lista lista = new Lista();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.mostrar();

        // Testando Pilha
        Pilha pilha = new Pilha(3);
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.mostrar();

        // Testando Fila
        Fila fila = new Fila();
        fila.enfileirar(100);
        fila.enfileirar(200);
        fila.enfileirar(300);
        fila.mostrar();
    }
}
