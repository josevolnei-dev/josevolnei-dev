import java.util.Scanner;

public class MaiorMenor {

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];

        // Entrada dos valores
        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
        }

        // Chamada do procedimento
        verificarValores(vetor);

        entrada.close();
    }

    // Procedimento para verificar maior e menor
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

        // Exibe os resultados
        System.out.println("Maior valor: " + maior  );
        System.out.println("Menor valor: " + menor);
        
    }
    
}