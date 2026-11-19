import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Digite um número: ");
        numero = ler.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);

        ler.close();
    }
}