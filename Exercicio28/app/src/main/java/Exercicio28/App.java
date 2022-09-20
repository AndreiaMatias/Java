/*
 Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.
Curso de Lógica para Programação III
Instrutor: Marcio Michelluzzi
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto a empresa 
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
        
        System.out.println("Informe o valor do salário mínimo: ");
        salarioMinimo = leitor.nextDouble();
        
        for(int i = 0; i < qtdeFuncionarios; i++){
            System.out.println("Informe o nome do funcionário: ");
            nomeFuncionario = leitor.next();
            System.out.println("Informe o salário: ");
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
            System.out.printf("O funcionário %s teve reajuste de %s e seu salário passou a ser %s.\n", 
                    nomeFuncionario, String.format("%,.2f",reajuste), 
                    String.format("%,.2f", novoSalario));
        }
        aumentoFolhaPagamento = totalFolhaPagamentoNova - totalFolhaPagamento;
        System.out.println("A folha de pagamento aumentou em R$" + String.format("%,.2f",aumentoFolhaPagamento));
    }
}
