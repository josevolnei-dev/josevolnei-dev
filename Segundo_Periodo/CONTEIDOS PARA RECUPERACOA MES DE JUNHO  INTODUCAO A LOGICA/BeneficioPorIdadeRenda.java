import java.util.Scanner;

public class BeneficioPorIdadeRenda {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;
        double renda;

        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        System.out.print("Digite a renda: ");
        renda = teclado.nextDouble();

        if (idade < 18) {

            System.out.println(
                "Usuário menor de idade. Não elegível para benefício."
            );

        } else {

            if (renda < 2000) {

                System.out.println(
                    "Usuário tem direito ao BENEFÍCIO BÁSICO."
                );

            } else {

                System.out.println(
                    "Usuário tem direito ao BENEFÍCIO PARCIAL."
                );

            }
        }

        teclado.close();
    }
}
