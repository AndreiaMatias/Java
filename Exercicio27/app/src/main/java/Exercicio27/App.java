/*
 A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
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
            System.out.println("Informe o valor do automóvel. Para sair, informe 0. ");
            valorCarro = leitor.nextDouble();
            if(valorCarro == 0){
                break;
            }
            System.out.println("Informe o combustível(álcool/gasolina/diesel): ");
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
            System.out.printf("O valor do desconto é de %s e o valor pago é de %s.", 
                    String.format("%,.2f", valorDesconto), 
                    String.format("%,.2f", valorFinal));
            System.out.println("");
        }
        System.out.println("Valor total do desconto: " + totalDesconto);
        System.out.println("Valor total pago: " + totalPago);
    }
}
