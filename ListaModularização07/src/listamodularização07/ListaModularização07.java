/*
 Escreva um algoritmo que leia um vetor inteiro de 12 posições e crie um segundo vetor,
substituindo os valores nulos por 1. Mostre os 2 vetores.
Entrada: V1 = {4, 0, 9, 2, 0, 12, 2, 0, 8, 2, 1, 7}
Saída: V1 = {4, 0, 9, 2, 0, 12, 2, 0, 8, 2, 1, 7}
V2 = {4, 1, 9, 2, 1, 12, 2, 1, 8, 2, 1, 7}
*/
package listamodularização07;
import java.util.Scanner;
public class ListaModularização07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int V1[] = new int[12];
        int V2[] = new int[12];
        
        for(int i = 0; i < 12;  i++){
            System.out.print((i + 1) + "°: ");
            V1[i] = teclado.nextInt();
            }
            
          for(int i = 0; i < 12; i++){
               if(V1[i] != 0){
                V2[i] = V1[i];
          }
               else {
                   V2[i] = 1;
               }
        }
        System.out.print("V1 = {");
        for(int i = 0; i < 12; i++){
            if(i<11){
                System.out.print(V1[i] + ", ");
            }
            else {
               System.out.print(V1[i]); 
            }
        }
        System.out.println("}");
        
        System.out.print("V2 = {");
        for(int i = 0; i < 12; i++){
            if(i<11){
                System.out.print(V2[i] + ", ");
            }
            else {
               System.out.print(V2[i]); 
            }
        }
        System.out.println("}");
    }
}
