/*
 Faça um programa que leia uma matriz de números inteiros de dimensões 4x5 e imprima a
soma dos valores de cada linha e a soma de todos os elementos da matriz.
Entrada:  10 - 3 - 5 - 8
                9 - 2 - 4 - 5
                7 - 5 - 10 - 0
                9 - 3 - 5 - 8
                1 - 4 - 8 - 2
Saída: 26, 20, 22, 25, 15
104
 */
package listamodularização14;

import java.util.Scanner;

public class ListaModularização14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m[][] = new int[5][4];
        int somaTotal = 0;

        System.out.println("Valores da matriz 5x4: ");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                m[linha][coluna] = teclado.nextInt();
            }
        }
        for (int linha = 0; linha < 5; linha++) {
            int somaLinha = 0;
            for (int coluna = 0; coluna < 4; coluna++) {
                somaLinha = somaLinha + m[linha][coluna];
            }
            System.out.print(somaLinha + " ");
            somaTotal += somaLinha;
        }
        System.out.println("\n" + somaTotal);
    }
}
