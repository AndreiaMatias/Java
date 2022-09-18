/*
 Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês
 */
package Exercicio_4;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        String nomeVendedor;
        double salarioFixo;
        double vendas;
        double salarioFinal = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o nome do vendedor: ");
        nomeVendedor = leitor.next();
        System.out.print("Informe o salário fixo do vendedor: ");
        salarioFixo = leitor.nextFloat();
        System.out.print("Informe o total de vendas do vendedor em reais: ");
        vendas = leitor.nextFloat();
        
        salarioFinal = salarioFixo + (vendas * 0.15);
        
        System.out.println("Nome do vendedor: " + nomeVendedor + " - salário fixo: " + salarioFixo + " - salário final: " + salarioFinal);
    }
}