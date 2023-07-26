/*
Faça um programa em Java, que leia dois vetores ordenados, de 5 posições cada. Gere um
terceiro vetor, também ordenado, com todos os elementos dos vetores anteriores.
Entrada: v1 = {1, 4, 5, 9, 111}
v2 = (3, 3, 5, 8, 300}
Saída: v3 = {1, 3, 3, 4, 5, 5, 8, 9, 111, 300}
 */
package listamodularização11;

import java.util.Scanner;

public class ListaModularização11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[10];

        System.out.println("Vetor 1:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "°: ");
            v1[i] = teclado.nextInt();
        }
        System.out.println("Vetor 2:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "°: ");
            v2[i] = teclado.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            v3[i] = v1[i];
            v3[i + 5] = v2[i];
        }
        System.out.print("v3 = {");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(v3[i] + ", ");
            } else {
                System.out.print(v3[i]);
            }
        }
        System.out.println("}");
    }

}
