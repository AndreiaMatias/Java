/*
 Fa�a um algoritmo que receba dois n�meros e exiba o resultado da sua soma
 */
package Exercicio1;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int num1, num2;
        int soma = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o primeiro n�mero: ");
        num1 = leitor.nextInt();
        System.out.print("Informe o segundo n�mero: ");
        num2 = leitor.nextInt();
        System.out.print("Resultado: ");
        soma = num1 + num2;
        
        System.out.println(soma);
    }
}
