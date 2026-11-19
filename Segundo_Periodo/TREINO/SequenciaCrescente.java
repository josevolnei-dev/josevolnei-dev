import java.util.Scanner;

public class SequenciaCrescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        // Sequência crescente
        for (int i = 0; i <= numero; i++) {

            System.out.print(i + " ");
        }

        sc.close();
    }
}