/*
Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, subtra��o, multiplica��o e a divis�o 
dos dois n�meros lidos;
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
        
        System.out.print("Informe o primeiro n�mero: ");
        num1 = leitor.nextInt();
        System.out.print("Informe o segundo n�mero: ");
        num2 = leitor.nextInt();
        
        soma = num1 + num2;
        
        subtracao = num1 - num2;
        
        multiplicacao = num1 * num2;
        
        divisao = num1 / num2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtra��o: " + subtracao);
        System.out.println("Multiplica��o: " + multiplicacao);
        System.out.println("Divis�o: " + divisao);
        
    }
}
