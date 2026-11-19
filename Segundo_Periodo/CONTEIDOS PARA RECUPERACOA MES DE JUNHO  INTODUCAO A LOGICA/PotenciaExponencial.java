import java.util.Scanner;

public class PotenciaExponencial{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double base;
        double expoente;
        double resultado;

        System.out.print("Digite a base: ");
        base = teclado.nextDouble();

        System.out.print("Digite o expoente: ");
        expoente = teclado.nextDouble();

        resultado = Math.pow(base, expoente);

        System.out.println("Resultado = " + resultado);

        teclado.close();
    }
}
