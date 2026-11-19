import java.util.Scanner;

public class ClassificacaoDeTriangulo{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ladoA;
        int ladoB;
        int ladoC;

        System.out.print("Digite o lado A: ");
        ladoA = teclado.nextInt();

        System.out.print("Digite o lado B: ");
        ladoB = teclado.nextInt();

        System.out.print("Digite o lado C: ");
        ladoC = teclado.nextInt();

        if (ladoA < ladoB + ladoC &&
            ladoB < ladoA + ladoC &&
            ladoC < ladoA + ladoB) {

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo EQUILÁTERO.");
            } else if (ladoA == ladoB ||
                    ladoA == ladoC ||
                    ladoB == ladoC) {
                System.out.println("Triângulo ISÓSCELES.");
            } else {
                System.out.println("Triângulo ESCALENO.");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        teclado.close();
    }
}
