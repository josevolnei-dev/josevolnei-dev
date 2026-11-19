import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = ler.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.print(i + " ");
        }

        ler.close();
    }
}