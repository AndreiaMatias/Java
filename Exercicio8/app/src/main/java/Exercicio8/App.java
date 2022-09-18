/*
 Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares 
disponíveis com ousuário;
 */
package Exercicio8;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double real = 0;
        
        System.out.println("Informe a quantidade de dólares em seu poder: ");
        double quantiaDolar = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar em reais: ");
        double dolar = leitor.nextDouble();
        
        real = dolar * quantiaDolar;
        
        System.out.println("R$: " +  String.format("%,.2f", real));
        
        
        
    }
}
