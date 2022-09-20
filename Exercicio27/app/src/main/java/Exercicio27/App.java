/*
 A concession�ria de ve�culos �CARANGO� est� vendendo os seus ve�culos com desconto. Fa�a um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto dever� ser 
calculado sobre o valor do ve�culo de acordo com o combust�vel (�lcool � 25%, gasolina � 21% ou diesel 
�14%). Com valor do ve�culo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes;
 */
package Exercicio27;

import java.util.Scanner;

public class App {
    
    
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double valorCarro = -99999;
        String combustivel;
        double percentualDesconto = 0;
        double valorDesconto = 0;
        double valorFinal = 0;
        double totalDesconto = 0;
        double totalPago = 0;
        
        while(valorCarro != 0){
            System.out.println("Informe o valor do autom�vel. Para sair, informe 0. ");
            valorCarro = leitor.nextDouble();
            if(valorCarro == 0){
                break;
            }
            System.out.println("Informe o combust�vel(�lcool/gasolina/diesel): ");
            combustivel = leitor.next();
            
            
            switch(combustivel){
                case "alcool":
                    percentualDesconto = 0.25;
                    break;
                case "gasolina":
                    percentualDesconto = 0.21;
                    break;
                case "diesel":
                    percentualDesconto = 0.14;
                    break;
            }   
            valorDesconto = valorCarro * percentualDesconto;
            valorFinal = valorCarro - valorDesconto;
            totalDesconto += valorDesconto;
            totalPago += valorFinal;
            System.out.printf("O valor do desconto � de %s e o valor pago � de %s.", 
                    String.format("%,.2f", valorDesconto), 
                    String.format("%,.2f", valorFinal));
            System.out.println("");
        }
        System.out.println("Valor total do desconto: " + totalDesconto);
        System.out.println("Valor total pago: " + totalPago);
    }
}
