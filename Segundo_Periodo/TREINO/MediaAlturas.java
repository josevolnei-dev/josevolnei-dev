import java.util.Scanner;

public class MediaAlturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura;
        double soma = 0;
        double media;

        // Laço para ler as 5 alturas
        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite a altura do aluno " + i + ": ");
            altura = sc.nextDouble();

            soma = soma + altura;
        }

        media = soma / 5;

        System.out.println("Média das alturas = " + media);

        sc.close();
    }
}