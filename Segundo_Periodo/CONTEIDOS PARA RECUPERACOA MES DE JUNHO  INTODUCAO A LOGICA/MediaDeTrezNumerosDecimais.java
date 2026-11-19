import java.util.Scanner;

public class MediaDeTrezNumerosDecimais{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;
        double media;

        System.out.print("Digite o primeiro número: ");
        numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = teclado.nextDouble();

        System.out.print("Digite o terceiro número: ");
        numero3 = teclado.nextDouble();

        media = (numero1 + numero2 + numero3) / 3;

        System.out.println("Média = " + media);

        teclado.close();
    }
}