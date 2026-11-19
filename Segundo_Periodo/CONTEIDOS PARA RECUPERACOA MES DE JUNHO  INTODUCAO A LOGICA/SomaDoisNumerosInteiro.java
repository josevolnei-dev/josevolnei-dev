import java.util.Scanner;

public class SomaDoisNumerosInteiro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.print("Digite o primeiro número: ");
        numero1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = teclado.nextInt();

        soma = numero1 + numero2;

        System.out.println("Soma = " + soma);

        teclado.close();
    }
}
