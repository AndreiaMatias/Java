/*
29. Fa�a um algoritmo que receba o n�mero do m�s e mostre o m�s correspondente. Valide m�s inv�lido;
*/
package Exercicio29;
import java.util.Scanner;

public class App {
    
    Scanner leitor = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mes;
        String mesExtenso = "";
        
        System.out.println("Informe o m�s no formato n�mero: ");
        mesExtenso = leitor.nextLine();
        
        switch(mesExtenso){
            case "1":
                System.out.println("janeiro");
                break;
            case "2":
                System.out.println("fevereiro");
                break;
            case "3":
                System.out.println("mar�o");
                break;
            case "4":
                System.out.println("abril");
                break;
            case "5":
                System.out.println("maio");
                break;
            case "6":
                System.out.println("junho");
                break;
            case "7":
                System.out.println("julho");
                break;
            case "8":
                System.out.println("agosto");
                break;
            case "9":
                System.out.println("setembro");
                break;
            case "10":
                System.out.println("outubro");
                break;
            case "11":
                System.out.println("novembro");
                break;
            case "12":
                System.out.println("dezembro");
                break;
            default:
                System.out.println("m�s inv�lido");
        }
    }
}
