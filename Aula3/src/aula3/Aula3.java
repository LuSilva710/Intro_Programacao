
package aula3;

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int idade;
       System.out.print("Informe idade: ");
       idade = in.nextInt();
       
       if( (idade < 18) || (idade > 70)) {
           System.out.print("Voto Opcional! ");
       }else{
           System.out.print("Voto Obrigatório!");
       }
    }
}
