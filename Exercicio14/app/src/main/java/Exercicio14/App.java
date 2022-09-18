/*
 Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior
 */
package Exercicio14;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = leitor.nextInt();
        
        if(num1 > num2){
            System.out.printf("O primeiro número, %d, é maior que o segundo, %d.", num1, num2);
        }else{
            System.out.printf("O segundo número, %d, é maior que o primeiro, %d", num2, num1);
        }
       
    }
}
