/*
 Fa�a um algoritmo que leia um n�mero de 1 a 5 e escreva por extenso. Caso o usu�rio digite um n�mero 
que n�o esteja neste intervalo, exibir a seguinte mensagem: n�mero inv�lido
 */
package Exercicio26;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um n�mero de 1 a 5");
        numero = leitor.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tr�s");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            default:
                System.out.println("n�mero inv�lido");
        }
        
    }
}
