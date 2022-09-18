/*
 Faça um algoritmo que receba "N" números e mostre positivo,
negativo ou zero para cada número.
*/

package com.mycompany.exercicio24;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        char continua = 'S';
        
        
        while(continua == 'S' || 's' == continua){
            System.out.println("Informe um número: ");
            int numero = leitor.nextInt();
            if(numero > 0){
                System.out.println("Positivo");
            }else if (numero == 0){
                System.out.println("Zero");
            }else{
                System.out.println("Negativo");
            }
           System.out.println("Continua? (S/N)");
           continua = leitor.next().charAt(0);
        }
        
    }
}
