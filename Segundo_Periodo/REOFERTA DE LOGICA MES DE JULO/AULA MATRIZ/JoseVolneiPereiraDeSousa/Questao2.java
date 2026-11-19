import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        // Preencher a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        // Somar os elementos
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                soma += matriz[linha][coluna];
            }
        }

        System.out.println("Soma dos elementos: " + soma);

        entrada.close();
    }
}