/*
30. Escreva um algoritmo que leia tr�s valores inteiros distintos e os escreva em ordem crescente;
*/
package Exercicio30;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        int a, b, c;
        int aux = 0;
        
        System.out.println("Informe o n�mero: ");
        a = leitor.nextInt();
        System.out.println("Informe o n�mero: ");
        b = leitor.nextInt();
        System.out.println("Informe o n�mero: ");
        c = leitor.nextInt();

        
        if(a > c && a > b){
            aux = c;
            c = a;
            a = aux;
        }else if(b < a){
            aux = a;
            a = b;
            b = aux;
        }else{
            aux = b;
            b = a;
            a = aux;
        }
        
        System.out.println(a + " " + b + " " + c);
    }
}
