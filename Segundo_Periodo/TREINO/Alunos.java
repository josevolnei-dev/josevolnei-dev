
import java.util.Scanner;

public class Alunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        double medias[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = sc.nextLine();
            System.out.println("Digite n1");
            double n1 = sc.nextDouble();
            System.out.println("Digite n2");
            double n2 = sc.nextDouble();
            System.out.println("Digite n3");
            double n3 = sc.nextDouble();
            sc.nextLine();

            medias[i] = (n1 + n2 + n3) / 3;
        }
        System.out.println("Digite o nome que busca");

        String busca = sc.nextLine();
        boolean achou = false;
        for (int i = 0; i < 3; i++) {
            System.out.println(" Comparando " +  nomes[i] +  "'com'" + busca + '"');
            if (nomes[i].equals(busca)) {

                System.out.println("Aluno "  +  nomes[i]);
                System.out.println("Medias " +  medias[i]);

                if (medias[i] >= 7) {

                    System.out.println("aprovado");

                } else {
                    System.out.println("Reprovado");
                }
                achou = true;

            }

        }
        if (!achou) {

            System.out.println("Aluno nao encontrado");

            sc.close();

        }
    }
}
