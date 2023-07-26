/*
 Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos
elementos de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor
resultante.
Entrada: A = {4, 6, 9, 2, 0, 12, 2, 10, 8, 2}
B = {6, 3, 8, 5, 1, 0, 8, 4, 1, 6}
Saída: C = {24, 18, 72, 10, 0, 0, 16, 40, 8, 12}
 */
package listamodularização05;

import java.util.Scanner;

public class ListaModularização05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vA[] = new int[10];
        int vB[] = new int[10];
        int vMult[] = new int[10];

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
            vMult[i] = vA[i] * vB[i];
        }
        System.out.print("Vetor C = {");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vMult[i] + ", ");
            } else {
                System.out.print(vMult[i]);
            }
        }
        System.out.println("}");
    }

}
