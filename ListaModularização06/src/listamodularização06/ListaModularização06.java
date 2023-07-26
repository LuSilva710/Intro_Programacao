/*
 Escreva um algoritmo que leia um vetor de 10 posições de números inteiros e imprima-o na
tela. Em seguida, gerar 2 vetores a partir dele, um contendo os elementos de posições ímpares
do vetor e o outro os elementos de posições pares. Imprimi-los no final.
Entrada: V = {4, 6, 9, 2, 0, 12, 2, 10, 8, 2}
Saída: P = {4, 9, 0, 2, 8}
I = {6, 2, 12, 10, 2}
 */
package listamodularização06;

import java.util.Scanner;

public class ListaModularização06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v[] = new int[10];
        int P[] = new int[5];
        int I[] = new int[5];
        int contP = 0;
        int contI = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            v[i] = teclado.nextInt();

            if (i % 2 == 0) {
                P[contP] = v[i];
                contP++;
            } else {
                I[contI] = v[i];
                contI++;
            }
        }
        System.out.print("Vetor Par = {");
        for (int i = 0; i < contP; i++) {
            if (i < contP - 1) {
                System.out.print(P[i] + ", ");
            } else {
                System.out.print(P[i]);
            }
        }
        System.out.println("}");

        System.out.print("Vetor Ímpar = {");
        for (int i = 0; i < contI; i++) {
            if (i < contI - 1) {
                System.out.print(I[i] + ", ");
            } else {
                System.out.print(I[i]);
            }
        }
        System.out.println("}");
    }
}
