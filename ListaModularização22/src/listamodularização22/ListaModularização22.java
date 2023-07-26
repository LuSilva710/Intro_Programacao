/*
 * A Loja XPTO possui em seu quadro de funcionários, 7 vendedores, identificados por um código
numérico inteiro de 3 dígitos (ex: 100, 200, 300, etc). Elabore um programa que leia o código
de cada vendedor e o valor de venda diária do mesmo, considerando-se 6 dias semanais de
trabalho. Exemplo:
Determine e imprima:
● A média de vendas de cada vendedor.
● Qual o código do vendedor que vendeu mais?
● Qual o código do vendedor que vendeu menos?
 */
package listamodularização22;

import java.util.Scanner;

public class ListaModularização22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vendedores[] = new int[7];
        int venda[][] = new int[7][6];
        int somaVendas = 0;
        int mediaVendas = 0;
        int maiorVenda = 0;
        int menorVenda = 0;

        for (int funcionario = 0; funcionario < 7; funcionario++) {
            for (int vendaDiaria = 0; vendaDiaria < 6; vendaDiaria++) {
                System.out.print("Código Funcionário: ");
                vendedores[funcionario] = teclado.nextInt();
                System.out.print("Venda Diária " + (vendaDiaria + 1) + ": ");
                venda[funcionario][vendaDiaria] = teclado.nextInt();
            }
        }
        for (int funcionario = 0; funcionario < 7; funcionario++) {
            int somaVendasFuncionario = 0;
            for (int vendaDiaria = 0; vendaDiaria < 6; vendaDiaria++) {
                somaVendasFuncionario = somaVendasFuncionario + venda[funcionario][vendaDiaria];
            }
            int mediaVendasFuncionario = somaVendasFuncionario / 6;
            System.out.println("Média de vendas do vendedor " + vendedores[funcionario] + ": " + mediaVendasFuncionario);
            if (mediaVendasFuncionario > maiorVenda) {
                maiorVenda = mediaVendasFuncionario;
                maiorVenda = vendedores[funcionario];
            }

            if (mediaVendasFuncionario < menorVenda) {
                menorVenda = mediaVendasFuncionario;
                menorVenda = vendedores[funcionario];
            }
        }
        System.out.println("Código do vendedor que vendeu mais: " + maiorVenda);
        System.out.println("Código do vendedor que vendeu menos: " + menorVenda);
    }
}
