/*
 Faça um programa que gere uma matriz 4x4 e encontre o produto da diagonal secundária.
Entrada
10 3 5 8
9 2 4 5
7 5 10 0
9 3 5 8
Saída: 26
*/
package listamodularização16;
import java.util.Scanner;
public class ListaModularização16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int v[][] = new int[4][4];
        int somaDiagonalS = 0;
        
         System.out.println("Valores da Matriz 4x4: ");
        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 4; coluna ++){
                v[linha][coluna] = teclado.nextInt();
            }
        }
        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 4; coluna ++){
                System.out.print(v[linha][coluna] + " ");
                if(linha == coluna){
                    somaDiagonalS += v[linha][3 - coluna];
                }
            }
        System.out.println();
        }
        System.out.println("Diagonal Secundária = " +somaDiagonalS);
        }
    }
    
