/*
 A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os seus ve�culos com desconto. Fa�a 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de v�rios carros. O 
desconto dever� ser calculado de acordo com o ano do ve�culo. At� 2000 - 12% e acima de 2000 - 7%. O 
sistema dever� perguntar se deseja continuar calculando desconto at� que a resposta seja: �(N) N�o�. 
Informar total de carros com ano at� 2000 e total geral
 */
package Exercicio20;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        char continua = 'S';
        int anoFabricacao = 0;
        double preco = 0;
        double percentualDesconto = 0;
        double valorDoDesconto = 0;
        double valorComDesconto = 0;
        int totalAte2000 = 0;
        int totalGeral = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        while(continua == 'S' || continua == 's'){
            System.out.println("Informe o ano de fabrica��o do carro: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Informe o pre�o: ");
            preco = leitor.nextDouble();
            totalGeral += 1;
            if (anoFabricacao <= 2000){
                percentualDesconto = 0.12;
                valorDoDesconto = preco * percentualDesconto;
                valorComDesconto = preco - valorDoDesconto;
                System.out.printf("Valor do desconto: \n %s \n valor com desconto: \n %s\n", String.format("%,.2f", valorDoDesconto),String.format("%,.2f", valorComDesconto));
                totalAte2000 += 1;
            } else {
                percentualDesconto = 0.07;
                valorDoDesconto = preco * percentualDesconto;
                valorComDesconto = preco - valorDoDesconto;
                System.out.printf("Valor do desconto: \n %s \n valor com desconto: \n %s\n", String.format("%,.2f", valorDoDesconto),String.format("%,.2f", valorComDesconto));
            }
            System.out.println("Continua? ");
            continua = leitor.next().charAt(0);
        }
        System.out.println("Total de carros at� 2000: " + totalAte2000);
        System.out.println("Total geral: " + totalGeral);
    }
}
