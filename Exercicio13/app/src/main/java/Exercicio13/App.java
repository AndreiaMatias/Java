/*
 Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package Exercicio13;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int numero = leitor.nextInt();
        
        if (numero > 10){
            System.out.println("Número maior que 10.");
        }
        
    }
}
