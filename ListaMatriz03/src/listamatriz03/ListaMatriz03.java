/*
 Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna)
do maior valor
 */
package listamatriz03;

import java.util.Scanner;

public class ListaMatriz03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m[][] = new int[4][4];
        int maiorValor = 0;
        int maiorLinha = 0;
        int maiorColuna = 0;

        System.out.println("Valores da matriz: ");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                m[linha][coluna] = teclado.nextInt();
            }
        }
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(m[linha][coluna] + " ");
            }
            System.out.println();
        }
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (m[linha][coluna] > maiorValor) {
                    maiorValor = m[linha][coluna];
                    maiorLinha = linha;
                    maiorColuna = coluna;
                }
            }
        }
        System.out.println("\nMaior valor da matriz.....: " + maiorValor);
        System.out.println("Localização do maior valor: linha " + (maiorLinha + 1) + ", coluna " + (maiorColuna + 1) + ".");
    }
}
