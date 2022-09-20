/*
Escreva um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante o semestre. Calcular a 
sua m�dia (aritm�tica), informar o nome e sua men��o aprovado (media >= 7), Reprovado (media <= 5) e 
Recupera��o (media entre 5.1 a 6.9)
 */
package Exercicio16;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[3];
        double somaNotas = 0;
        double media = 0;
        
        
        System.out.println("Informe o nome do aluno: ");
        String nomeAluno = leitor.next();
        
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Informe a nota %d: ", (i+1));
            notas[i]= leitor.nextDouble();
            somaNotas += notas[i];
        }
        
        
        media = somaNotas / notas.length;
        
        if (media >= 7){
            System.out.printf("M�dia: %s - Aprovado", String.format("%,.2f", media));
        }else if (media <= 5){
            System.out.printf("M�dia: %s - Reprovado", String.format("%,.2f", media));
        }else{
            System.out.printf("M�dia: %s - Recupera��o", String.format("%,.2f", media));
        }
        
    }
}
