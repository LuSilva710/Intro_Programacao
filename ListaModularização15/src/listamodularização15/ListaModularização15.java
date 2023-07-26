/*
 Faça um programa que gere uma matriz 4 x 4 e encontre a soma de sua diagonal principal.
Entrada
10 3 5 8
9 2 4 5
7 5 10 0
9 3 5 8
Saída: 30

 */
package listamodularização15;

import java.util.Scanner;

public class ListaModularização15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m[][] = new int[4][4];
        int somaD = 0;
        System.out.println("Valores da Matriz 4x4: ");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                m[linha][coluna] = teclado.nextInt();
            }
        }
        System.out.println("Matriz 4x4: ");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(m[linha][coluna] + " ");
                if (linha == coluna) {
                    somaD += m[linha][coluna];
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal principal: " +somaD);
        }
    }
