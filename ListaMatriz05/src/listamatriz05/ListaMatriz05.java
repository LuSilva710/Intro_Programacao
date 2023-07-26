/*
 Leia uma matriz 5 x 5. Leia também um valor X. 
O programa devera fazer uma busca desse valor na matriz e, ao final, 
escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”. */
package listamatriz05;

import java.util.Scanner;

public class ListaMatriz05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m[][] = new int[5][5];
        int X;
        boolean encontrado = false;

        System.out.println("Valores da matriz: ");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                m[linha][coluna] = teclado.nextInt();
            }
        }
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(m[linha][coluna] + " ");
            }
            System.out.println();
        }

        System.out.println("\nBuscar valor: ");
        X = teclado.nextInt();

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (X == m[linha][coluna]) {
                    System.out.println("O valor se encontra na linha = " + (linha + 1) + " | Coluna = " + (coluna + 1));
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado!");
        }
    }
}
