/*
 Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas 
por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas 
efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s
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
        System.out.print("Informe o sal�rio fixo do vendedor: ");
        salarioFixo = leitor.nextFloat();
        System.out.print("Informe o total de vendas do vendedor em reais: ");
        vendas = leitor.nextFloat();
        
        salarioFinal = salarioFixo + (vendas * 0.15);
        
        System.out.println("Nome do vendedor: " + nomeVendedor + " - sal�rio fixo: " + salarioFixo + " - sal�rio final: " + salarioFinal);
    }
}