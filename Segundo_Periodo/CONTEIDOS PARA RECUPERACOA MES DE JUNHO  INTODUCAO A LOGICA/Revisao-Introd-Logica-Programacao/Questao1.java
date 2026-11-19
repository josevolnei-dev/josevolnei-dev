/* Questão 1: Codifique um algoritmo em Java que resolva o seguinte problema:
*   O usuário deverá informar dois números inteiros e
*    o algoritmo deverá realizar a soma desses números e
*    exibir o resultado na tela para o usuário.
*
*/

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro  posito");
        int n1 = sc.nextInt();


System.out.println("Digite um numero inteiro positivo");

int n2 = sc.nextInt();

int soma = n1+n2;
System.out.println("a soma" + n1 +  "+" +  n2 + "=" + soma );









    }


}
