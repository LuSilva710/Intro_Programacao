/*
Faça um algoritmo que construa uma matriz 50 por 50 de números reais e
depois de construída, colocar o conteúdo de sua diagonal principal dentro de um vetor
e depois do vetor montado, imprimir o vetor.
 */
package listamatriz04;

import java.util.Random;
public class ListaMatriz04 {

    public static void main(String[] args) {
        Random gerador =new Random();

        double m[][] = new double[50][50];
        double d[] = new double[50];
        double s[] = new double[50];

        System.out.println("Valores da matriz: ");
        for (int linha = 0; linha < 50; linha++) {
            for (int coluna = 0; coluna < 50; coluna++) {
                m[linha][coluna] = gerador.nextDouble(10);
            }
        }
        for (int linha = 0; linha < 50; linha++) {
            for (int coluna = 0; coluna < 50; coluna++) {
                System.out.print(m[linha][coluna] + " ");
            }
            System.out.println();
        }
        System.out.print("\nElementos da diagonal principal = {");
        for (int i = 0; i < 50; i++) {
            d[i] = m[i][i];
            System.out.print(d[i]);
            if (i < 49) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        
        System.out.print("Elementos da diagonal secundaria = {");
        for (int i = 0; i < 50; i++) {
            d[i] = m[i][49 - i];
            System.out.print(d[i]);
            if (i < 49) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
