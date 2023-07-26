/*
 Uma empresa pretende pagar a participação nos lucros para seus 18 funcionários lotados em
suas 3 lojas (3 lojas x 6 funcionários). O valor será proporcional ao salário mensal do
funcionário e ao Índice de Produtividade atribuído a cada um deles. Faça um programa que:
● Receba os salários mensais dos funcionários por loja e armazene em uma matriz
3x6.
● Receba os índices de produtividade dos funcionários por loja e armazene em uma
matriz 3x6.
● Calcule a participação nos lucros dos funcionários por loja e armazene em uma
matriz 3x6. Participação nos Lucros = Salário Mensal x Índice de Produtividade.
● Calcule e exiba a média da participação nos lucros dos funcionários.
● Exiba os valores de participação nos lucros superiores à média.
 */
package listamodularização20;

import java.util.Scanner;

public class ListaModularização20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float salarioMensal[][] = new float[3][6];
        float indiceProdutividade[][] = new float[3][6];
        float partLucro[][] = new float[3][6];
        float media = 0;
        float somaPartLucro = 0;
        int cont = 0;

        System.out.println("Salário dos funcionários: ");
        for (int loja = 0; loja < 3; loja++) {
            for (int funcionario = 0; funcionario < 6; funcionario++) {
                System.out.print("Loja " + (loja + 1) + " - Funcionário " + (funcionario + 1) + ": ");
                salarioMensal[loja][funcionario] = teclado.nextFloat();
            }
        }
        System.out.println("\nÍndice de produtividade dos funcionários (1.0 a 10.0): ");
        for (int loja = 0; loja < 3; loja++) {
            for (int funcionario = 0; funcionario < 6; funcionario++) {
                System.out.print("Loja " + (loja + 1) + " - Funcionário " + (funcionario + 1) + ": ");
                indiceProdutividade[loja][funcionario] = teclado.nextFloat();
            }
        }
        for (int loja = 0; loja < 3; loja++) {
            for (int funcionario = 0; funcionario < 6; funcionario++) {
                partLucro[loja][funcionario] = salarioMensal[loja][funcionario] * indiceProdutividade[loja][funcionario];
                somaPartLucro += partLucro[loja][funcionario];
                cont++;
            }
        }

        media = somaPartLucro / cont;
        System.out.printf("\nMédia da participação nos lucros: R$%.2f.", media);
        
        System.out.println("\n\nValores de participações nos lucros acima da média: ");
        for(int loja = 0; loja < 3; loja++){
            for(int funcionario = 0; funcionario < 6; funcionario ++){
                if(partLucro[loja][funcionario] > media){
                    System.out.println("Loja" + (loja + 1) + "- Funcionário" + (funcionario + 1) + ": " + partLucro[loja][funcionario]);
                }
            }
        }

    }
}
