/*
 Faça um programa que leia 10 valores e armazene-os num vetor. Calcule e exiba na tela os 3
maiores elementos do vetor.
Entrada: v1 = {4, 6, 9, 2, 0, 12, 2, 10, 7, 1}
Saída: 12, 10, 9
 */
package listamodularização12;

import java.util.Scanner;

public class ListaModularização12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v1[] = new int[10];
        int maiorValor[] = new int[3];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            v1[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if (v1[i] > maiorValor[j]) {
                    for (int x = 2; x > j; x--) {
                        maiorValor[x] = maiorValor[x - 1];
                    }
                    maiorValor[j] = v1[i];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(maiorValor[i] + ", ");
            } else {
                System.out.print(maiorValor[i]);
            }
        }
        System.out.println(" ");
    }
}
