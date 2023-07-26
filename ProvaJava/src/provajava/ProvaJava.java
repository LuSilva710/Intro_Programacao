/*
A IFMGShoes é uma empresa do ramo de calçados e precisa de um programa para gerenciar as vendas realizadas 
em suas 3 filiais, localizadas nos bairros Centro, Pioneiros e Bandeirantes. Assim, sabendo que a empresa possui 5 vendedores 
e que eles atendem em ambas as lojas, crie um programa Java que leia para uma matriz 5 x 3 a quantidade de calçados vendidos por cada 
vendedor em cada filial, conforme exemplificado na tabela a seguir. Em seguida, o programa deve calcular o total de vendas para cada vendedor, 
considerando as 3 filiais. Posteriormente, calcular também a quantidade média de vendas realizadas em geral. Ao final, deve ser exibido o número de 
vendedores que venderam acima ou igual a média. Veja o exemplo:

A entrada é composta de 5 sequências de 3 números inteiros, variando entre 0 e 1000, 
compondo a quantidade de vendas realizadas por cada vendedor nas 3 filiais. Sendo a primeira 
sequência de valores inteiros as vendas do primeiro vendedor, a segunda as vendas do segundo vendedor e assim por diante.  

3 8 10

1 2 5

7 5 6 

5 6 9 

1 1 0

Saída:
Na saída é impresso um único número inteiro, que corresponde ao número de 
vendedores cuja quantidade vendida por eles seja maior ou igual a média vendida no geral. 
Para a entrada apresentada anteriormente a saída será: 3.

*/

import java.util.Scanner;

public class ProvaJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] vendasPorVendedorEFilial = new int[5][3];

        for (int vendedor = 0; vendedor < 5; vendedor++) {
            for (int filial = 0; filial < 3; filial++) {
                vendasPorVendedorEFilial[vendedor][filial] = teclado.nextInt();
            }
        }

        int[] totalVendasPorVendedor = new int[5];
        for (int vendedor = 0; vendedor < 5; vendedor++) {
            int totalVendasVendedor = 0;
            for (int filial = 0; filial < 3; filial++) {
                totalVendasVendedor += vendasPorVendedorEFilial[vendedor][filial];
            }
            totalVendasPorVendedor[vendedor] = totalVendasVendedor;
        }

        int totalVendasGeral = 0;
        for (int vendedor = 0; vendedor < 5; vendedor++) {
            totalVendasGeral += totalVendasPorVendedor[vendedor];
        }
        double mediaVendasGeral = (double) totalVendasGeral / (5);

        int vendedoresAcimaOuIgualMedia = 0;
        for (int vendedor = 0; vendedor < 5; vendedor++) {
            if (totalVendasPorVendedor[vendedor] >= mediaVendasGeral) {
                vendedoresAcimaOuIgualMedia++;
            }
        }

        System.out.println(vendedoresAcimaOuIgualMedia);
    }
}