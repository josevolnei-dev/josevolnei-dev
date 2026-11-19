import java.util.Scanner;

public class SomaDeDoisNumerosInteiro{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int soma;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        segundoNumero = teclado.nextInt();

        soma = primeiroNumero + segundoNumero;

        System.out.println("Resultado da soma: " + soma);

        teclado.close();
    }
}