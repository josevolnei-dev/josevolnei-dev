
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita n1");
        double n1 = sc.nextDouble();
        System.out.println("Digite n2");
        double n2 = sc.nextDouble();
        System.out.println("Digita n3");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");

            sc.close();
        }

    }
}
