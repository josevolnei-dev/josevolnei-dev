import java.util.Scanner;

public class Fa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        // Cálculo do fatorial
        for (int i = 1; i <= numero; i++) {

            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);

        sc.close();
    }
}