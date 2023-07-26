/*
 Uma empresa de recrutamento e seleção aplicou uma bateria de 4 testes em 5 candidatos.
Faça um programa que:
● Carregue em um vetor o nome dos 5 candidatos.
● Carregue em uma matriz 4 x 5 as notas obtidas pelos 5 candidatos em cada um dos
testes.
● Carregue em um vetor a maior nota obtida por cada um dos 5 candidatos nos
testes.
● Exiba o nome do candidato e a maior nota obtida.
Veja um exemplo abaixo:
Paulo  Ana  Rafael    Rodrigo Luana
9,0       9,5     10             8,7       3,4
8,5       9,6     8,6            4,5        7,2
9,5       9,1     8,4            3,5       4,9
7,6       5,4     6,3            4,9       8,0

Maiores notas
9,5        9,6    10             8,7       8,0

 */
package listamodularização21;

import java.util.Scanner;

public class ListaModularização21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String candidatos[] = new String[5];
        float notas[][] = new float[4][5];
        float maiorNota[] = new float[5];
        float maiorNotaGeral = 0;

        for (int candidato = 0; candidato < 5; candidato++) {
            System.out.print("Candidato " + (candidato + 1) + ": ");
            candidatos[candidato] = teclado.nextLine();
        }

        for (int teste = 0; teste < 4; teste++) {
            for (int candidato = 0; candidato < 5; candidato++) {
                System.out.print("Teste " + (teste + 1) + " -  Candidato " + (candidato + 1) + ": ");
                notas[teste][candidato] = teclado.nextFloat();
            }
        }
        for (int candidato = 0; candidato < 5; candidato++) {
            maiorNota[candidato] = notas[0][candidato];
            for (int teste = 1; teste < 4; teste++) {
                if (notas[teste][candidato] > maiorNota[candidato]) {
                    maiorNota[candidato] = notas[teste][candidato];
                }
            }
            if (maiorNota[candidato] > maiorNotaGeral) {
                maiorNotaGeral = maiorNota[candidato];
            }
        }
        System.out.println("\nMaiores notas");
        for (int i = 0; i < 5; i++) {
            System.out.println(candidatos[i] + ": " + maiorNota[i]);
        }
        System.out.println("\nMaior nota geral entre todos os candidatos: " + maiorNotaGeral);
    }
}
