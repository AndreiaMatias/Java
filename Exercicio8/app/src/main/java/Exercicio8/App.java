/*
 Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) de um valorlido em 
d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m aquantidade de d�lares 
dispon�veis com ousu�rio;
 */
package Exercicio8;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double real = 0;
        
        System.out.println("Informe a quantidade de d�lares em seu poder: ");
        double quantiaDolar = leitor.nextDouble();
        System.out.println("Informe a cota��o do d�lar em reais: ");
        double dolar = leitor.nextDouble();
        
        real = dolar * quantiaDolar;
        
        System.out.println("R$: " +  String.format("%,.2f", real));
        
        
        
    }
}
