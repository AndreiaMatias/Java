package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {
    
    public static void main (String[] args){
        //Comandos de entrada
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int idade = leitor.nextInt();
        System.out.print("Informe a cota��o do d�lar: ");
        float cotacaoDolar = leitor.nextFloat();
        System.out.print("Informe a cota��o do euro: ");
        double cotacaoEuro = leitor.nextDouble();
        System.out.print("Informe o seu nome: ");
        String nome = leitor.nextLine();
        System.out.print("Informe o c�digo da rua: ");
        String codigoRua = leitor.next();
        
        //Comandos de sa�da
        
        //pula para pr�xima linha
        System.out.println("Texto que ser� exibido no console");
        
        //mant�m na mesma linha
        System.out.print("Texto 2");
        
        
        
    }
    
}
