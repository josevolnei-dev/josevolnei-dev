import java.util.Scanner;

public class Velocidade{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double velocidade;

        System.out.print("Digite a velocidade do veículo: ");
        velocidade = teclado.nextDouble();

        if (velocidade > 60) {
            System.out.println("ACIMA DO LIMITE PERMITIDO");
        } else {
            System.out.println("DENTRO DO LIMITE PERMITIDO");
        }

        teclado.close();
    }
}
