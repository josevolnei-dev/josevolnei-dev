import java.util.Scanner;

public class MaiorMenor {

    // Procedimento para encontrar maior e menor
    public static void verificarValores(int vetor[]) {

        int maior = vetor[0];
        int menor = vetor[0];

        // Percorre o vetor
        for (int i = 0; i < vetor.length; i++) {

            // Verifica maior
            if (vetor[i] > maior) {

                maior = vetor[i];
            }

            // Verifica menor
            if (vetor[i] < menor) {

                menor = vetor[i];
            }
        }

        // Exibe resultados
        System.out.println("Maior valor: " + maior);

        System.out.println("Menor valor: " + menor);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];

        // Entrada dos números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite o número " + (i + 1) + ": ");

            numeros[i] = entrada.nextInt();
        }

        // Chama o procedimento
        verificarValores(numeros);

        entrada.close();
    }
}