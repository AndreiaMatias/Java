/*
 Escreva um algoritmo que leia dois valores inteiro distintos e informe qual � o maior
 */
package Exercicio14;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro n�mero: ");
        int num1 = leitor.nextInt();
        System.out.println("Informe o segundo n�mero: ");
        int num2 = leitor.nextInt();
        
        if(num1 > num2){
            System.out.printf("O primeiro n�mero, %d, � maior que o segundo, %d.", num1, num2);
        }else{
            System.out.printf("O segundo n�mero, %d, � maior que o primeiro, %d", num2, num1);
        }
       
    }
}
