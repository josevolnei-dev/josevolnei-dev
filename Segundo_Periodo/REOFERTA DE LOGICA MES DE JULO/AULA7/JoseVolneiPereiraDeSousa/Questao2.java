/*Codifique um algoritmo em Java que leia um número inteiro
 e diga se ele é par ou ímpar. Para saber se o número é par 
 ou ímpar, você deve utilizar o operador de resto da divisão
  e caso o resto da divisão seja 0, significa que o número é 
  par, caso contrário, o número é ímpar.

*/
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num = sc.nextInt();

        System.out.println("Motrar se o numero for par ou impar");
        
        if(num % 2 ==0){
        System.out.println("o numero e par");
        }else{
            System.out.println("o numero e impar");
        }


        sc.close();
    }
}