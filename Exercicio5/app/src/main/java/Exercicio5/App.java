/*
 Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No finalinformar o nome do aluno e a sua média (aritmética);
 */
package Exercicio5;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        String aluno;
        double[] notas;
        notas = new double[3];
        double somaNotas = 0;
        double media = 0;
       
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: ");
        aluno = leitor.next();
        
        for (int i = 0; i < notas.length; i++){
            System.out.print("Informe a "+ (i+1) + " ª nota: ");
            notas[i] = leitor.nextInt();
            somaNotas += notas[i];
        }
        
        media = somaNotas / notas.length;
        
        System.out.println("O aluno " + aluno + " teve média "+ String.format("%, .2f", media));
        
    }
}
