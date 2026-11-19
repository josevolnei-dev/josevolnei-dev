import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a1, a2, media;

        System.out.print("Digite A1: ");
        a1 = teclado.nextDouble();

        System.out.print("Digite A2: ");
        a2 = teclado.nextDouble();

        media = (a1 + a2) / 2;

        if (media >= 6) {
            System.out.println("APROVADO");
        } else if (media >= 4) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }

        teclado.close();
    }
}
