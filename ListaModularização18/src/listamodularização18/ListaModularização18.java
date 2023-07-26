/*
Uma estação meteorológica registra a temperatura ocorrida em uma cidade a cada hora. 
Faça um programa que leia as temperaturas de uma semana no seguinte formato: dia, hora,
temperatura. A leitura termina com um dia inválido. O programa deve informar para cada hora
consultada, a maior temperatura ocorrida na semana. As consultas terminam com um valor de
hora inválido.
 */
package listamodularização18;

import java.util.Scanner;

public class ListaModularização18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int temperaturaSemana[][] = new int[7][24];

        System.out.println("Dia | Hora | Temperatura: ");
        for (int dia = 0; dia < 7; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                System.out.print("Dia " + (dia + 1) + " -  Hora " + hora + ": ");
                temperaturaSemana[dia][hora] = teclado.nextInt();
            }
        }

        int diaConsultado;
        do {
            System.out.println("Informe o dia (1-7) para consulta da maior temperatura: ");
            diaConsultado = teclado.nextInt();

            if (diaConsultado > 0 && diaConsultado <= 7) {
                int maiorTemperatura = temperaturaSemana[diaConsultado - 1][0];
                for (int hora = 1; hora < 24; hora++) {
                    if (temperaturaSemana[diaConsultado - 1][hora] > maiorTemperatura) {
                        maiorTemperatura = temperaturaSemana[diaConsultado - 1][hora];
                    }
                }
                System.out.println("Maior temperatura no dia " + diaConsultado + ": " + maiorTemperatura);
            }
        } while (diaConsultado >= 1 && diaConsultado <= 7);

    }
}
