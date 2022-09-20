/*
Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
outros dois lados. 
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele; 
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes
 */
package Exercicio32;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int lado1, lado2, lado3;
        
        System.out.println("Informe um número: ");
        lado1 = leitor.nextInt();
        System.out.println("Informe um número: ");
        lado2 = leitor.nextInt();
        System.out.println("Informe um número: ");
        lado3 = leitor.nextInt();
        
        if((lado1 < (lado2 + lado3))&&(lado2 < (lado1 + lado3)) && (lado3 < (lado1 + lado2))){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo isósceles.");
            }else{
                System.out.println("Triângulo escaleno.");
            }
        }else{
            System.out.println("Não é triângulo.");
        }
    }
}
