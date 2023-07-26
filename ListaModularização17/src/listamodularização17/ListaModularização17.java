/*
 Faça um programa capaz de corrigir provas de múltipla escolha. Cada prova terá 10 questões,
valendo 1 ponto cada uma. O programa deve inicialmente ler o gabarito da prova. Ele será
constituído de um conjunto de dez caracteres representando a resposta para cada uma das
questões. Cada questão pode ter uma das seguintes respostas: 'a', 'b', 'c', 'd' ou 'e'.
Após a leitura do gabarito, o programa deverá ler as respostas dos alunos. Para cada aluno
deverá ser lido o seu número de matrícula e suas respostas. O programa deverá calcular a nota
do aluno e imprimi-la de acordo com o gabarito. A leitura termina com um código de matrícula
negativo. Ao final, o programa deverá imprimir a percentagem de aprovação, sabendo-se que a
nota mínima é 5.
 */
package listamodularização17;

import java.util.Scanner;

public class ListaModularização17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char gabarito[] = new char[10];
        String teste = teclado.nextLine();

        char questAlunos[][] = new char[3][10];
        String sequencia;

        int nota[] = new int[3];
        int media = 6;
        int somaNotaAlunos = 0;
        int notasAcimaMedia = 0;

        for (int i = 0; i < 10; i++) {
            gabarito[i] = teste.charAt(i);
        }

        for (int i = 0; i < 3; i++) {
            sequencia = teclado.nextLine();
            for (int j = 0; j < 10; j++) {
                questAlunos[i][j] = sequencia.charAt(j);
            }
        }
       
        for(int aluno = 0; aluno < 3; aluno++){
            nota[aluno] = 0;
            for(int i = 0; i < 10; i++) {
                if (questAlunos[aluno][i] == gabarito[i]) {
                    nota[aluno]++;
                }
            }
        }
        
        for(int aluno = 0; aluno < 3; aluno++){
            System.out.println("Nota do Aluno " + (aluno + 1) + ": " + nota[aluno]);
        }
            
        somaNotaAlunos = 0; 
        for(int aluno = 0; aluno < 3; aluno++){
            if (nota[aluno] >= media) {
                notasAcimaMedia++; 
            }
        }
        
        System.out.println("Número de notas acima da média: " + notasAcimaMedia);
    }
}