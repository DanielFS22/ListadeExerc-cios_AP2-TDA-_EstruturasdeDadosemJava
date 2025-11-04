 /*1.) Implemente uma classe Estruturas.Lista que use um vetor de inteiros para armazenar até 5 elementos.
         Adicione os métodos inserir(int valor) e mostrar().*/

 package Exercicios;

 import Estruturas.Lista;
 import java.util.Scanner;

 public class Exercicio1 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         Lista lista = new Lista();

         System.out.println("Digite ate 5 numeros inteiros para inserir na lista:");

         for (int i = 0; i < 5; i++) {
             System.out.print("Digite o numero " + (i + 1) + ": ");
             int valor = entrada.nextInt();
             lista.inserir(valor);
         }

         System.out.println("\nConteudo final da lista:");
         lista.mostrar();

         entrada.close();
     }
 }
