/*
Laços de repetição e vetores
*/
package aula5;
import java.util.Scanner;
public class Aula5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float soma = 0;
        float temp[] = new float[7];
        for(int i  = 0; i < temp.length; i++){
            System.out.print("Temperatura (dia "+(i+1) +"): ");
            temp[i] = teclado.nextFloat();
            soma = soma + temp[i];
        }
        float media = soma/temp.length;
        System.out.print("A temperatura média da semana foi de "+media+"°C.\n");
        for (int i = 0; i < temp.length; i++){
            if(temp[i] > media){
                System.out.print("As temperaturas acima da média foram no " +(i + 1)+"° dia: " +temp[i]+"°C.\n");
            }
        } 
    }
}
