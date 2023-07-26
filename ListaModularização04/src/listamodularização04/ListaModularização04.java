/*
 Faça um programa que recebe 2 vetores A e B de tamanho 8. Em seguida, troque os valores
entre A e B, ou seja, passe os valores de A para B e os valores de B para A. Imprima os vetores
resultantes.
Entrada: A = {4, 6, 9, 2, 0, 12, 2, 10}
B = {6, 3, 8, 5, 1, 0, 8, 4}
Saída: A = {6, 3, 8, 5, 1, 0, 8, 4}
B = {4, 6, 9, 2, 0, 12, 2, 10}
 */
package listamodularização04;

import java.util.Scanner;

public class ListaModularização04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vA[] = new int[8];
        int vB[] = new int[8];
        int invertV[] = new int[8];

        System.out.println("Vetor A: ");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "°: ");
            vA[i] = teclado.nextInt();
        }

        System.out.println("Vetor B:  ");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "°: ");
            vB[i] = teclado.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            invertV[i] = vA[i];
            vA[i] = vB[i];
            vB[i] = invertV[i];
        }

        System.out.print("Vetor A: {");
        for (int i = 0; i < 8; i++) {
            if (i < 7) {
                System.out.print(vA[i] + ", ");
            } else {
                System.out.print(vA[i]);
            }
        }
        System.out.println("}");

        System.out.print("Vetor B: {");
        for (int i = 0; i < 8; i++) {
            if (i < 7) {
                System.out.print(vB[i] + ", ");
            } else {
                System.out.print(vA[i]);
            }
        }
        System.out.println("}");
    }
}
