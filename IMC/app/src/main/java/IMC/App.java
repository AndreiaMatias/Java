/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package IMC;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    

    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC: " + objetoPessoa.calcularIMC());
        
        
    }
}
