/*
Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. S�nior = 18 - 25 anos.
Apresentar mensagem �idade fora da faixa et�ria� quando for outro ano n�o contemplado;
 */
package Exercicio34;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Informe a idade do nadador: ");
        idade = leitor.nextInt();
        
        if (idade >= 5 && idade < 8){
            System.out.println("Infantil A");
        }else if (idade >= 8 && idade < 11){
            System.out.println("Infantil B");
        }else if (idade >= 11 && idade < 14){
            System.out.println("Juvenil A");
        }else if (idade >= 14 && idade < 18){
            System.out.println("Juvenil B");
        }else if (idade >= 18 && idade <= 25){
            System.out.println("S�nio");
        }else{
            System.out.println("Idade fora da faixa et�ria.");
        }
    }
}
