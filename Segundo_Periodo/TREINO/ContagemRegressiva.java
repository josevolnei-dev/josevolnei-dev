import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        // Contagem regressiva
        for (int i = numero; i >= 0; i--) {

            System.out.print(i + " ");
        }

        sc.close();
    }
}