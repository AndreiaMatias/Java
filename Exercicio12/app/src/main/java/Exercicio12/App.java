/*
 O custo de um carro novo ao consumidor � a soma do custo de f�brica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos s�o aplicados sobre o custo de f�brica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de f�brica de um carro e informe o custo ao consumidor do 
mesmo
 */
package Exercicio12;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
       
        double percentualDistribuidor = 0.28;
        double impostos = 0.45;
        double custoAoConsumidor = 0;
        
        Scanner leitor = new Scanner(System.in);
           
        System.out.print("Informe o pre�o de custo do carro: ");
        double custoFabrica = leitor.nextDouble();
        
        custoAoConsumidor = (custoFabrica * (1 + impostos)) * (1 + percentualDistribuidor);
        
        System.out.print("Custo ao consumidor: " + String.format("%,.2f", custoAoConsumidor));
        
        
    }
}
