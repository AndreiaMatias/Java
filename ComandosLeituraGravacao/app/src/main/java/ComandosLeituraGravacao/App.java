package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {
    
    public static void main (String[] args){
        //Comandos de entrada
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int idade = leitor.nextInt();
        System.out.print("Informe a cotação do dólar: ");
        float cotacaoDolar = leitor.nextFloat();
        System.out.print("Informe a cotação do euro: ");
        double cotacaoEuro = leitor.nextDouble();
        System.out.print("Informe o seu nome: ");
        String nome = leitor.nextLine();
        System.out.print("Informe o código da rua: ");
        String codigoRua = leitor.next();
        
        //Comandos de saída
        
        //pula para próxima linha
        System.out.println("Texto que será exibido no console");
        
        //mantém na mesma linha
        System.out.print("Texto 2");
        
        
        
    }
    
}
