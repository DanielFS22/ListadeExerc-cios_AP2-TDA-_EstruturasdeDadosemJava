package Exercicios;

import Estruturas.Pilha;

public class Exercicio2 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);

        pilha.mostrar();

        pilha.desempilhar();
        pilha.mostrar();

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
    }
}
