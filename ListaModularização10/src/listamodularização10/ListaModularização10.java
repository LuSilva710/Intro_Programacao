/*
Faça um programa que leia 20 valores e armazene-os num vetor de inteiros. Imprima na tela o
vetor na ordem lida e depois em ordem crescente.
A seguir, um exemplo para um vetor de tamanho 5.
Entrada: v = {10, 4, 7, 1, 8}
Saída: v = {10, 4, 7, 1, 8}
v = {1, 4, 7, 8, 10}
 */
package listamodularização10;

import java.util.Random;
import java.util.Scanner;

public class ListaModularização10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[20];
        Random gerador = new Random();

        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + "° | ");
           v[i] = gerador.nextInt(20);
        }

        System.out.print("\nv = {");
        for (int j = 0; j < 20; j++) {
            if (j < 19) {
                System.out.print(v[j] + ", ");
            } else {
                System.out.print(v[j]);
            }
        }
        System.out.print("}");

        for (int i = 0; i < 20; i++) {
            for (int j = i + 1; j < 20; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        System.out.print("\nVetor em ordem crescente = {");
        for (int i = 0; i < 20; i++) {
            if (i < 19) {
                System.out.print(v[i] + ", ");
            } else {
                System.out.print(v[i]);
            }
        }
        System.out.println("}");
    }
}
