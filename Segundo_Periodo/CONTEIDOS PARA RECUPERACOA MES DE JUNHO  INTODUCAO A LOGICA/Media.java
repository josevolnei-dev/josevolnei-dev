import java.util.Scanner;

public class Media{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a1, a2, media;

        System.out.print("Digite a nota A1: ");
        a1 = teclado.nextDouble();

        System.out.print("Digite a nota A2: ");
        a2 = teclado.nextDouble();

        media = (a1 + a2) / 2;

        if (media >= 6) {
            System.out.println("Aluno APROVADO");
        } else {
            System.out.println("Aluno REPROVADO");
        }

        teclado.close();
    }
}
