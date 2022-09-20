/*
Escreva um algoritmo que leia tr�s valores inteiros e verifique se eles podem ser os lados de um tri�ngulo. 
Se forem, informar qual o tipo de tri�ngulo que eles formam: equil�tero, is�scele ou escaleno. 
Propriedade: o comprimento de cada lado de um tri�ngulo � menor do que a soma dos comprimentos dos 
outros dois lados. 
a. Tri�ngulo Equil�tero: aquele que tem os comprimentos dos tr�s lados iguais; 
b. Tri�ngulo Is�scele: aquele que tem os comprimentos de dois lados iguais.
c. Tri�ngulo equil�tero � tamb�m is�scele; 
d. Tri�ngulo Escaleno: aquele que tem os comprimentos de seus tr�s lados diferentes
 */
package Exercicio32;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int lado1, lado2, lado3;
        
        System.out.println("Informe um n�mero: ");
        lado1 = leitor.nextInt();
        System.out.println("Informe um n�mero: ");
        lado2 = leitor.nextInt();
        System.out.println("Informe um n�mero: ");
        lado3 = leitor.nextInt();
        
        if((lado1 < (lado2 + lado3))&&(lado2 < (lado1 + lado3)) && (lado3 < (lado1 + lado2))){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Tri�ngulo equil�tero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Tri�ngulo is�sceles.");
            }else{
                System.out.println("Tri�ngulo escaleno.");
            }
        }else{
            System.out.println("N�o � tri�ngulo.");
        }
    }
}
