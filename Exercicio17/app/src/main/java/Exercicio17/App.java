/*
Leia 80 n�meros e ao final informar quantos n�mero(s) est(�)�o no intervalo entre 10 (inclusive) e 150 
(inclusive);

 */
package Exercicio17;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int[] numeros = new int[80];
        int numero;
        int contador = 0;
        
        for(int i = 0; i < 80; i++){
            System.out.printf("Informe o %d � n�mero: ", (i + 1));
            numero = leitor.nextInt();
            if(numero >= 10 && numero <= 150){
                contador += 1;
                numeros[i] = numero; 
            }
        }
        
        System.out.printf("Quantidade de n�meros entre 10 e 150: %d", contador);
    }
}
