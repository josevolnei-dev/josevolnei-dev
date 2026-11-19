import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número PAR");
        } else {
            System.out.println("Número ÍMPAR");
        }

        teclado.close();
    }
}