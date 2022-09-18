/*
Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos;
 */
package Exercicio2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int num1, num2;
        int soma = 0;
        int subtracao = 0;
        int multiplicacao = 0;
        float divisao = 0.0f;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = leitor.nextInt();
        
        soma = num1 + num2;
        
        subtracao = num1 - num2;
        
        multiplicacao = num1 * num2;
        
        divisao = num1 / num2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        
    }
}
