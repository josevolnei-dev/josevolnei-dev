import java.util.Scanner;

public class PesoNormalImc{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura;
        double peso;
        double imc;

        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();

        System.out.print("Digite o peso: ");
        peso = teclado.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Normal");
        } else {
            System.out.println("Fora do Peso Normal");
        }

        teclado.close();
    }
}
