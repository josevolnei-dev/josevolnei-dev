import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();

        // Verificação do primeiro número
        if (num1 > 0) {
            if (num1 % 2 == 0) {
                System.out.println("O primeiro número é positivo e par.");
            } else {
                System.out.println("O primeiro número é positivo e ímpar.");
            }
        } else if (num1 == 0) {
            System.out.println("O primeiro número é igual a zero.");
        } else {
            System.out.println("O primeiro número é negativo.");
        }

        // Verificação do segundo número
        if (num2 > 0) {
            System.out.println("O segundo número é positivo.");
        } else if (num2 == 0) {
            System.out.println("O segundo número é igual a zero.");
        } else {
            System.out.println("O segundo número é negativo.");
        }

        ler.close();
    }
}