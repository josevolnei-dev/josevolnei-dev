import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;
        double renda;

        System.out.print("Digite a idade: ");
        idade = ler.nextInt();

        System.out.print("Digite a renda: R$ ");
        renda = ler.nextDouble();

        if (idade < 18) {

            System.out.println("Usuário é menor de idade e não é elegível para receber o benefício.");

        } else {

            if (renda < 2000) {

                System.out.println("Usuário tem direito ao benefício básico.");

            } else if (renda >= 2000) {

                System.out.println("Usuário tem direito ao benefício parcial.");

            } else {

                System.out.println("Usuário não é elegível para receber benefício.");

            }

        }

        ler.close();
    }
}