/*
 Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

 */
package Exercicio18;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i < 75; i++){
            System.out.println("Informe o nome: ");
            String nome = leitor.next();
            System.out.println("informe a idade: ");
            int idade = leitor.nextInt();
            if(idade >= 18){
                System.out.println("Maior de idade.");
            }else{
                System.out.println("Menor de idade.");
            }
        }
    }
}
