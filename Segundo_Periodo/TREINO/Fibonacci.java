import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int primeiro = 0;
        int segundo = 1;
        int proximo;

        System.out.print("Digite a quantidade de termos: ");
        numero = sc.nextInt();

        // Exibe a sequência
        for (int i = 0; i < numero; i++) {

            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        sc.close();
    }
}