/*
 Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 elapossui.
*/
package listamatriz02;
import java.util.Scanner;
public class ListaMatriz02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int m[][] = new int[4][4];
        int vMaior = 0;
        
        System.out.println("Valores da matriz: ");
        for(int linha = 0; linha < 4; linha++ ){
            for(int coluna = 0; coluna <4; coluna++){
                m[linha][coluna] = teclado.nextInt();
            }
        }
        
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(m[linha][coluna] + " ");
            }
            System.out.println();
        }
        
        for(int linha = 0; linha < 4; linha++ ){
            for(int coluna = 0; coluna <4; coluna++){
                if(m[linha][coluna] > 10){
                    vMaior++;
                } 
            }
    } 
     System.out.println("Há " + vMaior + " valores maiores que 10. ");  
}
}
