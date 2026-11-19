/*Implemente, em Java, um programa  que simule o cálculo 
da média de um aluno. O sistema deve:

    Solicitar ao usuário a nota da A1 e da A2.

    Calcular a média das duas avaliações.

    Exibir:

        “Aprovado” se a média for maior ou igual a 6.0.

        “Exame final” se a média for maior ou igual a 4.0
        e menor que 6.0.

        “Reprovado direto” se a média for menor que 4.0.

*/





import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A1, A2, media;

        System.out.print("Digite a nota da A1: ");
        A1 = sc.nextDouble();

        System.out.print("Digite a nota da A2: ");
        A2 = sc.nextDouble();

        media = (A1 + A2) / 2;

        System.out.println("Média: " + media);

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Exame final");
        } else {
            System.out.println("Reprovado direto");
        }

        sc.close();
    }
}
