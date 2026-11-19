import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Preencher a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        // Mostrar a matriz
        System.out.println("\nMatriz:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        entrada.close();
    }
}