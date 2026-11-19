/*  Aula 7 : Questão 2: Codifique um algoritmo em Java que leia um número inteiro 
*   e diga se ele é par ou ímpar. 
*   Para saber se o número é par ou ímpar, 
*   você deve utilizar o operador de resto da divisão e caso o resto da divisão seja 0,
*   significa que o número é par, caso contrário, o número é ímpar.
*/

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo");
        int numero = sc.nextInt();
        if( numero % 2 == 0){
            System.out.println(" numero par ");

        }else{
            System.out.println(" numero impar ");
        }

        sc.close();
    }
}
