/*
. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o 
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser 
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
*/
package Exercicio31;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double a, b;
        char c;
        double resultado = 0;
        
        System.out.println("Informe um número real: ");
        a = leitor.nextDouble();
        System.out.println("Informe outro número real: ");
        b = leitor.nextDouble();
        System.out.println("Informe um operador:");
        c = leitor.next().charAt(0);
        
        switch(c){
            case '+':
                resultado = a + b;
                System.out.printf("%s + %s = %s", 
                        String.format("%,.2f",a), 
                        String.format("%,.2f",b), 
                        String.format("%,.2f",resultado));
                break;
            case '-':
                resultado = a - b;
                System.out.printf("%s - %s = %s", 
                        String.format("%,.2f",a), 
                        String.format("%,.2f",b), 
                        String.format("%,.2f",resultado));
                break;
            case '*':
                resultado = a * b;
                System.out.printf("%s * %s = %s", 
                        String.format("%,.2f",a), 
                        String.format("%,.2f",b), 
                        String.format("%,.2f",resultado));
                break;
            case '/':
                if (b > 0){
                    resultado = a / b;
                    System.out.printf("%s / %s = %s", 
                        String.format("%,.2f",a), 
                        String.format("%,.2f",b), 
                        String.format("%,.2f",resultado));
                }else{
                    System.out.println("Não é possível dividir por 0");
                }
                break;
            default:
                System.out.println("Operador não definido.");
        }
    }
}
