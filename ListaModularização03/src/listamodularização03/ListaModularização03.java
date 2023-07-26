/*
 Faça um programa em Java que leia 10 valores inteiros e armazene-os num vetor. Depois, gere
um segundo vetor que deve ser o dobro do primeiro. Imprima na tela os 2 vetores.
Entrada: v1 = {4, 6, 9, 2, 0, 12, 2, 10, 7, 3}
Saída: v2 = {8, 12, 18, 4, 0, 24, 4, 20, 14, 6}
 */
package listamodularização03;

import java.util.Scanner;

public class ListaModularização03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[10];
        int v2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            v1[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            v2[i] = v1[i] * 2;
            System.out.print(v2[i] + ", ");
        }
    }

}
