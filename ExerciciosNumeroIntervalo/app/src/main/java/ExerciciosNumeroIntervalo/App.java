/*
 Faça um algoritmo que receba um número e diga se 
este número está no intervalo entre 100 e 200
 */
package ExerciciosNumeroIntervalo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1 = leitor.nextInt();
        
        if (num1 >= 100 && num1 <= 200){
            System.out.println("O número está entre 100 e 200.");
        }else{
            System.out.println("O número não está entre 100 e 200.");
        }
        
    }
}
