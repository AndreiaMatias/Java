
package EstruturaRepeticaoEnquanto;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        int totalAlunos = 10;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        while (totalAlunos > 0){
            System.out.println("Informe o nome do aluno: ");
            String nomeAluno = leitorScanner.next();
            System.out.println("Informe a idade do aluno: ");
            int idadeAluno = leitorScanner.nextInt();
            
            System.out.println("O nome do aluno é " + nomeAluno + " e sua idade é " + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
            
        }
        
    }
}
