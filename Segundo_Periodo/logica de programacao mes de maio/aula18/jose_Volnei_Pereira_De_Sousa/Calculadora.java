import java.util.Scanner;

public class Calculadora {

    public static int menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha uma das opções acima: ");
        return sc.nextInt();
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        int opcao = menu();

        switch (opcao) {

            case 1:
                System.out.println("Resultado: " + soma(n1, n2));
                break;

            case 2:
                System.out.println("Resultado: " + subtracao(n1, n2));
                break;

            case 3:
                System.out.println("Resultado: " + multiplicacao(n1, n2));
                break;

            case 4:
                System.out.println("Resultado: " + divisao(n1, n2));
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}