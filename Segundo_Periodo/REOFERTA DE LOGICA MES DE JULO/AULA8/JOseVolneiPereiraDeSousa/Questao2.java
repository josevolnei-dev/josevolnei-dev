import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite o primeiro lado: ");
        a = ler.nextInt();

        System.out.print("Digite o segundo lado: ");
        b = ler.nextInt();

        System.out.print("Digite o terceiro lado: ");
        c = ler.nextInt();

        if (a < b + c && b < a + c && c < a + b) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        ler.close();
    }
}