/*
 Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 10;
 */
package Exercicio13;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um n�mero inteiro: ");
        int numero = leitor.nextInt();
        
        if (numero > 10){
            System.out.println("N�mero maior que 10.");
        }
        
    }
}
