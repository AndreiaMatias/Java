/*
. Dados tr�s valores A, B e C, em que A e B s�o n�meros reais e C � um caractere, pede-se para imprimir o 
resultado da opera��o de A por B se C for um s�mbolo de operador aritm�tico; caso contr�rio deve ser 
impressa uma mensagem de operador n�o definido. Tratar erro de divis�o por zero;
*/
package Exercicio31;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double a, b;
        char c;
        double resultado = 0;
        
        System.out.println("Informe um n�mero real: ");
        a = leitor.nextDouble();
        System.out.println("Informe outro n�mero real: ");
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
                    System.out.println("N�o � poss�vel dividir por 0");
                }
                break;
            default:
                System.out.println("Operador n�o definido.");
        }
    }
}
