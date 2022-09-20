/*
 A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
 */
package Exercicio33;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int nivel;
        int qtdeHoras;
        double valorHoraAula = 0;
        double salario = 0;
        
        System.out.println("Informe o nível do professor (1, 2 ou 3): ");
        nivel = leitor.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        qtdeHoras = leitor.nextInt();
        
        switch(nivel){
            case 1:
                valorHoraAula = 12;
                break;
            case 2:
                valorHoraAula = 17;
                break;
            case 3:
                valorHoraAula = 25;
                break;
            default:
                System.out.println("Nível inválido.");
        }
        salario = qtdeHoras * valorHoraAula;
        System.out.println("Salário: " + String.format("%,.2f", salario));
    }
}
