/*
Escreva um algoritmo para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia 
total percorrida pelo autom�vel e o total de combust�vel gasto
 */
package Exercicio3;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        float distancia = 0.0f;
        float combustivelGasto = 0.0f;
        float consumoMedio = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a dist�ncia total percorrida: ");
        distancia = leitor.nextFloat();
        System.out.println("Informe o total de combust�vel gasto: ");
        combustivelGasto = leitor.nextFloat();
        
        consumoMedio = combustivelGasto / distancia;
        
        System.out.println("O consumo m�dio foi de " + consumoMedio);
    }
}
