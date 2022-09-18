/*
 A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
package Exercicio10;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
       int prestacoes = 5;
       double valorPrestacoes = 0;
       
       Scanner leitor = new Scanner(System.in);
       System.out.println("Informe o valor da compra: ");
       double valorCompra = leitor.nextDouble();
       
       valorPrestacoes = valorCompra / prestacoes;
       
       System.out.print("Valor das prestações: R$" + String.format("%,.2f", valorPrestacoes));
       
    }
}
