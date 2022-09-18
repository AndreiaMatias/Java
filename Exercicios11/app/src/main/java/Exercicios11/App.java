/*
 Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package Exercicios11;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double valorVenda = 0;
        
        System.out.print("Informe o preço de custo: ");
        double precoCusto = leitor.nextDouble();
        System.out.print("Informe o acréscimo no formato 10 para 10%): ");
        double acrescimo = leitor.nextDouble();
        
        valorVenda = precoCusto * (1 + (acrescimo / 100));
        
        System.out.print("Valor de venda: " + String.format("%,.2f", valorVenda));
        
    }
}
