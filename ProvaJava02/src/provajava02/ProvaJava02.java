/*
Crie um programa Java que imprima a soma de todos os valores ímpares entre dois números inteiros lidos (X e Y), não incluindo X e Y. Por exemplo:
Se na entrada for informado 2 e 8, a saída será 15.  
Entrada: 
A entrada é composta de dois inteiros X e Y, sendo que em algumas situações X > Y ou X < Y. 
Saída:
Na saída será impresso a soma de todos os números ímpares entre X e Y.
 */
package provajava02;

import java.util.Scanner;

public class ProvaJava02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois números inteiros X e Y:");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        // Garante que X é menor que Y
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int sum = 0;
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("A soma dos números ímpares entre " + x + " e " + y + " é: " + sum);
    }
}

