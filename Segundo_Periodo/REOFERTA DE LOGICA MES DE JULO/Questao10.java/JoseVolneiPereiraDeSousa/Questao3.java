import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = ler.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.print(i + " ");
        }

        ler.close();
    }
}