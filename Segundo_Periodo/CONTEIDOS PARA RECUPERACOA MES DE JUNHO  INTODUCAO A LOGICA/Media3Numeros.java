import java.util.Scanner;

public class Media3Numeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double primeiroNumero;
        double segundoNumero;
        double terceiroNumero;
        double media;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        segundoNumero = teclado.nextDouble();

        System.out.print("Digite o terceiro número: ");
        terceiroNumero = teclado.nextDouble();

        media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.println("Média: " + media);

        teclado.close();
    }
}