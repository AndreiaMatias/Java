/*
 Fa�a um algoritmo que receba o pre�o de custo
e o pre�o de venda de 40 produtos.

Mostre como resultado se houve lucro, preju�zo ou empate
para cada produto.

Informe o valor de custo de cada produto, o valor de venda e 
a m�dia dos pre�os de custo e de venda.
 */
package Exercicio22;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String produto;
        float precoCusto, precoVenda, resultado;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;
        int quantidade = 4;
        
        for (int i = 1; i <= quantidade; i++){
            System.out.println("Informe o produto: ");
            produto = leitor.next();
            leitor.nextLine();
            System.out.println("Informe o pre�o de custo: ");
            precoCusto = leitor.nextFloat();
            System.out.println("Informe o pre�o de venda: ");
            precoVenda = leitor.nextFloat();
            resultado = precoVenda - precoCusto;
            System.out.println("Produto: "+ produto + " - Pre�o de custo: " + precoCusto + " - Pre�o de venda: " + precoVenda);
            if(resultado > 0){
                System.out.println("Houve lucro.");
            }else if (resultado == 0){
                System.out.println("Houve empate.");
            }else{
                System.out.println("Houve preju�zo.");
            }
            totalCusto += precoCusto;
            totalVenda += precoVenda;  
        }
        mediaCusto = totalCusto / quantidade;
        mediaVenda = totalVenda / quantidade;
        
        System.out.println("M�dia do custo: " + mediaCusto);
        System.out.println("M�dia da venda: " + mediaVenda);
    }
}
