/*
 Fa�a um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento ap�s um 
m�s.Considere fixo o juro da poupan�a em 0,07% a. m
 */
package Exercicio9;

import java.util.Scanner;
import java.lang.Math;

public class App {
    

    public static void main(String[] args) {
        double montanteJuros = 0;
        double taxaMontante = 1.0007;
        int periodo = 5;
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor depositado: ");
        double deposito = leitor.nextDouble();
        montanteJuros = deposito * Math.pow(taxaMontante, periodo);
        
        System.out.print("Montante ap�s o per�odo: " + String.format("%,.2f", montanteJuros));
        
    }
}
