/*
 Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�velApasse a 
possuir ovalor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A.Apresentar osvalores 
trocados; 
 */
package Exercicio6;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int aux = 0;
        
        System.out.print("Informe o valor de A: ");
        int A = leitor.nextInt();
        System.out.print("Informe o valor de B: ");
        int B = leitor.nextInt();
        
        aux = B;
        B = A;
        A = aux;
        
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        
        
    }
}
