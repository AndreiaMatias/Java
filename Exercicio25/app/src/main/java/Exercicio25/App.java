/*
Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;
 */
package Exercicio25;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = leitor.nextInt();
        
        if(num1 == num2){
            System.out.println("Os números são iguais.");
        }else{
            System.out.println("Os números são diferentes.");
            if(num1 > num2){
                System.out.printf("%d é maior do que %d", num1, num2);
            }else{
                System.out.printf("%d é maior do que %d", num2, num1);
            }
        }
    }
}
