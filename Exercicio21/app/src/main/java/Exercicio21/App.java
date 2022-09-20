/*
 Escreva um algoritmo que leia os dados de �N� pessoas (nome, sexo, idade e sa�de) e informe se est� apta 
ou n�o para cumprir o servi�o militar obrigat�rio. Informe os totais
 */
package Exercicio21;

import java.util.Scanner;

public class App {
    


    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pessoas: ");
        int qtdePessoas = leitor.nextInt();
        int aptos = 0;
        int total = 0;
        
        
        for (int i = 0; i < qtdePessoas; i++){
            System.out.println("Informe o nome: ");
            String nome = leitor.next();
            System.out.println("");
            System.out.println("informe o sexo (F/M): ");
            char sexo = leitor.next().toUpperCase().charAt(0);
            System.out.println("Informe a idade: ");
            int idade = leitor.nextInt();
            System.out.println("Informe a sa�de (boa/ruim): ");
            String saude = leitor.next().toUpperCase();
            System.out.println("");
            
            if(idade >= 18 && sexo == 'M' && saude.equals("BOA")){
                aptos++;
            }
            total++;
        }
        System.out.printf("Do total de %d, %d s�o aptos para o servi�o militar obrigat�rio", total, aptos);
    }
}
