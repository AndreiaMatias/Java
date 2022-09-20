/*
 A escola �APRENDER� faz o pagamento de seus professores por hora/aula. Fa�a um algoritmo que 
calcule e exiba o sal�rio de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor N�vel 1 R$12,00 por hora/aula;
b. Professor N�vel 2 R$17,00 por hora/aula;
c. Professor N�vel 3 R$25,00 por hora/aula.
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
        
        System.out.println("Informe o n�vel do professor (1, 2 ou 3): ");
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
                System.out.println("N�vel inv�lido.");
        }
        salario = qtdeHoras * valorHoraAula;
        System.out.println("Sal�rio: " + String.format("%,.2f", salario));
    }
}
