/*
Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 80, 
menor que 25 ou igual a 40
 */
package Exercicio23;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        System.out.println("Informe um n�mero inteiro: ");
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        if (numero > 80 || numero < 25 || numero == 40){
            System.out.println("O n�mero atende os crit�rios");
        }
        
    }
}
