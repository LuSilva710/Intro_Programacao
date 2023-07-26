/*
 Elabore um programa que leia valores para um vetor de 10 posições. Calcular e exibir a média
dos elementos armazenados nas posições ímpares.
Entrada: v = {4, 6, 9, 2, 0, 12, 2, 10, 7, 3}
Saída: 6.6 
 */
package listamodularização02;

import java.util.Scanner;

public class ListaModularização02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[10];
        int soma = 0;
        double media = 0;
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            v[i] = teclado.nextInt();
        }
        for (int i = 1; i < 10; i += 2) {
            soma += v[i];
            cont++;
        }
        media = soma / cont;
        System.out.printf("Média: %.2f\n", media);
    }
}
