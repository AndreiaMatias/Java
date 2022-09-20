/*
 Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
 */
package Exercicio19;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        int homens = 0;
        int mulheres = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i < 56; i++){
            System.out.println("Informe o nome");
            String nome = leitor.next();
            System.out.println("Informe o sexo (F/M)");
            char sexo = leitor.next().charAt(0);
            if(sexo == 'M' || sexo == 'm'){
                homens +=1;
            }else if (sexo == 'F' || sexo == 'f'){
                mulheres +=1;
            }
        }
        System.out.println("Total de homens: " + homens);
        System.out.println("Total de mulheres: " + mulheres);
    }
}
