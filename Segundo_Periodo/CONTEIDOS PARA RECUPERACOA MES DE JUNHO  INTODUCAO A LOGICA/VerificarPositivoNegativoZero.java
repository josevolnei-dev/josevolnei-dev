import java.util.Scanner;

public class VerificarPositivoNegativoZero{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        segundoNumero = teclado.nextInt();

        if (primeiroNumero > 0) {

            if (primeiroNumero % 2 == 0) {
                System.out.println("Primeiro número é POSITIVO e PAR.");
            } else {
                System.out.println("Primeiro número é POSITIVO e ÍMPAR.");
            }

        } else if (primeiroNumero < 0) {
            System.out.println("Primeiro número é NEGATIVO.");
        } else {
            System.out.println("Primeiro número é ZERO.");
        }

        if (segundoNumero > 0) {
            System.out.println("Segundo número é POSITIVO.");
        } else if (segundoNumero < 0) {
            System.out.println("Segundo número é NEGATIVO.");
        } else {
            System.out.println("Segundo número é ZERO.");
        }

        teclado.close();
    }
}
