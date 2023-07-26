/*
 Faça um programa em Java, que leia um vetor de 30 posições. Exiba na tela o vetor original e
um segundo vetor na ordem inversa ao primeiro.
A seguir, um exemplo para um vetor de 5 posições.
Exemplo: v1 = {3, 6, 2, 4, 1}
Saída: v1 = {3, 6, 2, 4, 1}
v2 = {1, 4, 2, 6, 3}
 */
package listamodularização08;

import java.util.Random;
import java.util.Scanner;

public class ListaModularização08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[30];
        int v2[] = new int[30];
        Random gerador = new Random();

        for (int i = 0; i < 30; i++) {
            System.out.println((i + 1) + "°: ");
            v1[i] = gerador.nextInt(30);
        }
        for (int i = 0; i < 30; i++) {
            v2[i] = v1[29 - i];
        }
        System.out.print("V1 = {");
        for (int i = 0; i < 30; i++) {
            if (i < 29) {
                System.out.print(v1[i] + ", ");
            } else {
                System.out.print(v1[i]);
            }
        }
        System.out.println("}");

        System.out.print("V2 = {");
        for (int i = 0; i < 30; i++) {
            if (i < 29) {
                System.out.print(v2[i] + ", ");
            } else {
                System.out.print(v2[i]);
            }
        }
        System.out.println("}");
    }
}
