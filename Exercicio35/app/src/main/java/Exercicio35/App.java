/*
 Fa�a um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o c�lculo da conta de 
luz segue a tabela abaixo: 
Tipo de Cliente Valor do KW/h
a. (Resid�ncia) 0,60;
b. (Com�rcio) 0,48;
c. (Ind�stria) 1,29
 */
package Exercicio35;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String tipoCliente;
        double consumo;
        double valorConta;
        double valorKWH = 0;
        
        System.out.println("Informe o tipo de cliente (residencia, comercio, industria): ");
        tipoCliente = leitor.next();
        System.out.println("Informe o consumo: ");
        consumo = leitor.nextDouble();
        
        switch(tipoCliente){
            case "residencia":
                valorKWH = 0.6;
                break;
            case "comercio":
                valorKWH = 0.48;
                break;
            case "industria":
                valorKWH = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inv�lido.");
        }
        
        valorConta = consumo * valorKWH;
        
        System.out.println("O valor da conta � de R$" + String.format("%,.2f", valorConta));
    }
}
