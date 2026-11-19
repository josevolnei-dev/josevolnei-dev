import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n;
        int primeiro = 0;
        int segundo = 1;
        int proximo;

        System.out.print("Digite a quantidade de termos: ");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        ler.close();
    }
}