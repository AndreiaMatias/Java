/*
 Leia uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. Af�rmula de 
convers�o �:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
 */
package Exercicio7;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em graus Celsius: ");
        
        double C = leitor.nextDouble();
        double F = 0;
        
        F = (9 * C + 160) / 5;
        
        System.out.println("A temperatura em Fahrenheit �: " + String.format("%,.2f", F));
    }
}
