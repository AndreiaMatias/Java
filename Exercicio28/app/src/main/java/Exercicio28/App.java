/*
 Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcion�rios de acordo 
com os seguintes crit�rios: 
a. 50% para aqueles que ganham menos do que tr�s sal�rios m�nimos;
b. 20% para aqueles que ganham entre tr�s at� dez sal�rios m�nimos; 
c. 15% para aqueles que ganham acima de dez at� vinte sal�rios m�nimos; 
d. 10% para os demais funcion�rios.
Curso de L�gica para Programa��o III
Instrutor: Marcio Michelluzzi
Leia o nome do funcion�rio, seu sal�rio e o valor do sal�rio m�nimo. Calcule o seu novo sal�rio 
reajustado. Escrever o nome do funcion�rio, o reajuste e seu novo sal�rio. Calcule quanto a empresa 
vai aumentar sua folha de pagamento
 */
package Exercicio28;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdeFuncionarios = 5;
        String nomeFuncionario;
        double salario;
        double salarioMinimo;
        int qtdeSalariosMinimos;
        double percentualReajuste = 0;
        double reajuste = 0;
        double novoSalario;
        double totalFolhaPagamento = 0;
        double totalFolhaPagamentoNova = 0;
        double aumentoFolhaPagamento = 0;
        
        System.out.println("Informe o valor do sal�rio m�nimo: ");
        salarioMinimo = leitor.nextDouble();
        
        for(int i = 0; i < qtdeFuncionarios; i++){
            System.out.println("Informe o nome do funcion�rio: ");
            nomeFuncionario = leitor.next();
            System.out.println("Informe o sal�rio: ");
            salario = leitor.nextDouble();
            qtdeSalariosMinimos = (int)(salario / salarioMinimo);
            if (qtdeSalariosMinimos < 3){
                percentualReajuste = 0.5; 
            }else if(qtdeSalariosMinimos >= 3 && qtdeSalariosMinimos <= 10){
                percentualReajuste = 0.2;
            }else if(qtdeSalariosMinimos > 10 && qtdeSalariosMinimos <= 20){
                percentualReajuste = 0.15;
            }else{
                percentualReajuste = 0.1;
            }
            reajuste = salario * percentualReajuste;
            novoSalario = salario + reajuste;
            totalFolhaPagamento += salario;
            totalFolhaPagamentoNova += novoSalario;
            System.out.printf("O funcion�rio %s teve reajuste de %s e seu sal�rio passou a ser %s.\n", 
                    nomeFuncionario, String.format("%,.2f",reajuste), 
                    String.format("%,.2f", novoSalario));
        }
        aumentoFolhaPagamento = totalFolhaPagamentoNova - totalFolhaPagamento;
        System.out.println("A folha de pagamento aumentou em R$" + String.format("%,.2f",aumentoFolhaPagamento));
    }
}
