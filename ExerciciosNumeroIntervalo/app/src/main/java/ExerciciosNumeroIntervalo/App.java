/*
 Fa�a um algoritmo que receba um n�mero e diga se 
este n�mero est� no intervalo entre 100 e 200
 */
package ExerciciosNumeroIntervalo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um n�mero: ");
        int num1 = leitor.nextInt();
        
        if (num1 >= 100 && num1 <= 200){
            System.out.println("O n�mero est� entre 100 e 200.");
        }else{
            System.out.println("O n�mero n�o est� entre 100 e 200.");
        }
        
    }
}
