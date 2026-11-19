/*A ordenação de dados é uma operação fundamental em 
diversos sistemas computacionais, como rankings, relatórios
e análises. Desenvolva um algoritmo em Java que receba 6 
números inteiros positivos em ordem aleatória, armazenando-os
em um vetor. Em seguida, o programa deve ordenar os valores
em ordem crescente e exibi-los na tela.

*/import java.util.Arrays;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] valores = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            valores[i] = ler.nextInt();
        }

        Arrays.sort(valores);

        System.out.println("Valores ordenados:");

        for (int i = 0; i < 6; i++) {
            System.out.print(valores[i] + " ");
        }

        ler.close();
    }
}