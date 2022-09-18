/*
 Faça um algoritmo que receba o preço de custo
e o preço de venda de 40 produtos.

Mostre como resultado se houve lucro, prejuízo ou empate
para cada produto.

Informe o valor de custo de cada produto, o valor de venda e 
a média dos preços de custo e de venda.
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
            System.out.println("Informe o preço de custo: ");
            precoCusto = leitor.nextFloat();
            System.out.println("Informe o preço de venda: ");
            precoVenda = leitor.nextFloat();
            resultado = precoVenda - precoCusto;
            System.out.println("Produto: "+ produto + " - Preço de custo: " + precoCusto + " - Preço de venda: " + precoVenda);
            if(resultado > 0){
                System.out.println("Houve lucro.");
            }else if (resultado == 0){
                System.out.println("Houve empate.");
            }else{
                System.out.println("Houve prejuízo.");
            }
            totalCusto += precoCusto;
            totalVenda += precoVenda;  
        }
        mediaCusto = totalCusto / quantidade;
        mediaVenda = totalVenda / quantidade;
        
        System.out.println("Média do custo: " + mediaCusto);
        System.out.println("Média da venda: " + mediaVenda);
    }
}
