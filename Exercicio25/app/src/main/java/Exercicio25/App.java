/*
Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles s�o iguais. Caso sejam diferentes, informe qual n�mero � o 
maior, e uma mensagem que s�o diferentes;
 */
package Exercicio25;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro n�mero: ");
        int num1 = leitor.nextInt();
        System.out.println("Informe o segundo n�mero: ");
        int num2 = leitor.nextInt();
        
        if(num1 == num2){
            System.out.println("Os n�meros s�o iguais.");
        }else{
            System.out.println("Os n�meros s�o diferentes.");
            if(num1 > num2){
                System.out.printf("%d � maior do que %d", num1, num2);
            }else{
                System.out.printf("%d � maior do que %d", num2, num1);
            }
        }
    }
}
