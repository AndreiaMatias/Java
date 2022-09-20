/*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, 
menor que 25 ou igual a 40
 */
package Exercicio23;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        System.out.println("Informe um número inteiro: ");
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        if (numero > 80 || numero < 25 || numero == 40){
            System.out.println("O número atende os critérios");
        }
        
    }
}
