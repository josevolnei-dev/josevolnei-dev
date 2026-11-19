/*  Aula 7 Questão 1: Codifique um algoritmo em Java que leia 3 números inteiros
*   e diga qual o maior e o menor deles.
 */

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite unm numero imteiro positivo ");
        int n1 = sc.nextInt();

        System.out.println(" Digite unm numero imteiro positivo ");
        int n2 = sc.nextInt();

        System.out.println(" Digite unm numero imteiro positivo ");
        int n3 = sc.nextInt();
        int maior = n1;
        int menor = n1;

        if (n2 > maior) {
            maior = n2;

        }

        if (n3 > maior) {
            maior = n3;

        }
        if (n2 < menor) {
            menor = n2;

        }
        if (n3 < menor) {
            menor = n3;

        }
        System.out.println(" maior numero " + maior);
        System.out.println(" menor numero  " + menor);

        sc.close();
    }
}
