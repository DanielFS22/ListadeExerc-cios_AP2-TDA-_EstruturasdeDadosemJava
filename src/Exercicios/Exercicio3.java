package Exercicios;

import Estruturas.Fila;

public class Exercicio3 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);
        fila.enfileirar(50);

        fila.mostrar();

        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Desenfileirando: " + fila.desenfileirar());

        fila.mostrar();

        fila.enfileirar(60);
        fila.mostrar();
    }
}
