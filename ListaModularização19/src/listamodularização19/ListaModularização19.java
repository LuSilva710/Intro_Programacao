/*
 Faça um programa que leia uma matriz de inteiros A quadrada de ordem 100 e calcule a sua
transposta AT. Exemplo para matriz de ordem 4 (apenas um outro exemplo!!!): 
*/
package listamodularização19;
import java.util.Random;
import java.util.Scanner;
public class ListaModularização19 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       Random gerador = new Random();
       
        int m[][]= new int[10][10];
       
       System.out.println("Valores da matriz: ");
        for (int linha= 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                m[linha][coluna] = gerador.nextInt(10); 
                System.out.print(m[linha][coluna]+" ");
            }
            System.out.println();
            }
        
        System.out.println("\nValores da matriz transposta: ");
        for (int linha= 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                System.out.print(m[coluna][linha]+" ");
            }
            System.out.println();
            }
        }
    }
   
