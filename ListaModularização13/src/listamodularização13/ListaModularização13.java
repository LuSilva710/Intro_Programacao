/*
Faça um programa que leia um conjunto de 10 valores inteiros para um vetor A. Em seguida,
leia mais 10 valores inteiros para um vetor B. Seu programa deve substituir por 0, todos os
valores que existem no vetor A e que não existem no vetor B.
Entrada: A = {10, 3, 5, 8, 9, 2, 4, 5, 7, 12}
B = {13, 5, 9, 6, 15, 2, 7, 20, 9, 10}
Saída: A = {10, 0, 5, 0, 9, 2, 0, 5, 7, 0}
B = {13, 5, 9, 6, 15, 2, 7, 20, 9, 10}
 */
package listamodularização13;

import java.util.Scanner;

public class ListaModularização13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vA[] = new int[10];
        int vB[] = new int[10];

        System.out.println("Vetor A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            vA[i] = teclado.nextInt();
        }

        System.out.println("Vetor B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            vB[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean existeEmB = false;
            for (int j = 0; j < 10; j++) {
                if (vA[i] == vB[j]) {
                    existeEmB = true;
                }
            }
            if (!existeEmB) {
                vA[i] = 0;
            }
        }
        System.out.print("A = {");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vA[i] + ", ");
            } else {
                System.out.print(vA[i]);
            }
        }
        System.out.println("} ");

        System.out.print("B = {");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vB[i] + ", ");
            } else {
                System.out.print(vB[i]);
            }
        }
        System.out.println("} ");
    }
}
