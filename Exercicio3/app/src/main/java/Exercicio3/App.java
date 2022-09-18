/*
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto
 */
package Exercicio3;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        float distancia = 0.0f;
        float combustivelGasto = 0.0f;
        float consumoMedio = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a distância total percorrida: ");
        distancia = leitor.nextFloat();
        System.out.println("Informe o total de combustível gasto: ");
        combustivelGasto = leitor.nextFloat();
        
        consumoMedio = combustivelGasto / distancia;
        
        System.out.println("O consumo médio foi de " + consumoMedio);
    }
}
