/*Durante o processamento de dados em um sistema financeiro,
é comum filtrar valores com base em determinadas características.
Desenvolva um algoritmo em Java que receba 8 números inteiros positivos
informados pelo usuário e os armazene em um vetor. Ao final, o programa

deve exibir apenas os valores pares informados.

*/import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número positivo: ");
            numeros[i] = ler.nextInt();
        }

        System.out.println("Números pares:");

        for (int i = 0; i < 8; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        ler.close();
    }
}