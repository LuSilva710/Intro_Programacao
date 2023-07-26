/*
Faça um algoritmo que construa uma matriz de nome MAT de 10 linhas e 15 colunas contendo números inteiros. 
Em seguida escreva a soma dos elementos de cada linha e se a soma dos elementos é par ou ímpar. 
Por fim escreva a soma dos elementos de cada coluna e se a soma dos elementos é par ou ímpar
 */
package listamatriz01;

import java.util.Random;
import java.util.Scanner;

public class ListaMatriz01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        int MAT[][] = new int[10][15];
        int somaLinha = 0;
        String infoLinha;
        int somaColuna = 0;
        String infoColuna;

        System.out.println("Valores da matriz: ");
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 15; coluna++) {
                MAT[linha][coluna] = gerador.nextInt(10);
                System.out.print(MAT[linha][coluna] + " ");
            }
            System.out.println();
        }
      System.out.println("\n*************************************************");

        for (int linha = 0; linha < 10; linha++) {
            somaLinha = 0;
            for (int coluna = 0; coluna < 15; coluna++) {
                somaLinha += MAT[linha][coluna];
            }
            if (somaLinha % 2 == 0) {
                infoLinha = "Par";
            } else {
                infoLinha = "Ímpar";
            }
            System.out.println("Soma dos elementos da linha  " + (linha + 1) + " = " + somaLinha + " | Linha " + infoLinha);
        }
        System.out.println("\n*************************************************");

        for (int coluna = 0; coluna < 15; coluna++) {
            somaColuna = 0;
            for (int linha = 0; linha < 10; linha++) {
                somaColuna += MAT[linha][coluna];
            }
            if (somaColuna % 2 == 0) {
                infoColuna = "Par";
            } else {
                infoColuna = "Ímpar";
            }
            System.out.println("Soma dos elementos coluna  " + (coluna + 1) + " = " + somaColuna + " | Coluna " + infoColuna);
        }
    }
}
