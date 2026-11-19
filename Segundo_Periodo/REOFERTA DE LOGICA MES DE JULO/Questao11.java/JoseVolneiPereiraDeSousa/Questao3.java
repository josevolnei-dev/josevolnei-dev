/*Em aplicações que envolvem cálculos vetoriais, como
controle de estoque ou processamento de dados, é comum
realizar operações entre conjuntos de valores. Desenvolva
um algoritmo em Java que solicite ao usuário a entrada de 5
números inteiros positivos para dois vetores distintos. Em seguida,
o programa deve realizar a soma dos valores correspondentes de cada
vetor, armazenando o resultado em um terceiro vetor. Ao final,
exiba os valores do vetor resultante.

*/import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] resultado = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite valor do vetor A: ");
            vetorA[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite valor do vetor B: ");
            vetorB[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            resultado[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor resultado:");

        for (int i = 0; i < 5; i++) {
            System.out.print(resultado[i] + " ");
        }

        ler.close();
    }
}