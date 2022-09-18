/*
 Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda. Sabe-se que o 
pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio;
 */
package Exercicios11;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double valorVenda = 0;
        
        System.out.print("Informe o pre�o de custo: ");
        double precoCusto = leitor.nextDouble();
        System.out.print("Informe o acr�scimo no formato 10 para 10%): ");
        double acrescimo = leitor.nextDouble();
        
        valorVenda = precoCusto * (1 + (acrescimo / 100));
        
        System.out.print("Valor de venda: " + String.format("%,.2f", valorVenda));
        
    }
}
