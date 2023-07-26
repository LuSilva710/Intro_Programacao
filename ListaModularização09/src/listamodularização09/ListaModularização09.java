/*
 Faça um programa que leia uma sequência de 10 números e armazene-os num vetor. Informe o
total de ocorrências do último número lido.
Entrada: V = {12, 38, 4, 23, 5, 6, 7, 4, 12, 4}
Saída: O número 4 foi informado 3 vezes
 */
package listamodularização09;

import java.util.Scanner;

public class ListaModularização09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[10];
        int ultimoValor;
        int ocorrencia = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: ");
            v[i] = teclado.nextInt();
        }

        ultimoValor = v[9];

        for (int i = 0; i < 10; i++) {
            if (v[i] == ultimoValor) {
                ocorrencia++;
            }
        }
        System.out.println("O valor " + ultimoValor + " foi informado " + ocorrencia + " vezes.");
    }
}
