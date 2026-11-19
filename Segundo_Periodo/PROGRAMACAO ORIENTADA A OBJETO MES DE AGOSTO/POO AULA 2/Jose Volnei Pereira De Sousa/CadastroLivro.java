/*







*/






import java.util.Scanner;

public class CadastroLivro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        String titulo = "";
        String autor = "";

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Exibir livro cadastrado");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o título do livro: ");
                titulo = sc.nextLine();

                System.out.print("Digite o autor: ");
                autor = sc.nextLine();

                System.out.println("Livro cadastrado com sucesso!");

            } else if (opcao == 2) {

                if (!titulo.isEmpty() && !autor.isEmpty()) {
                    System.out.println("Livro: " + titulo + " | Autor: " + autor);
                } else {
                    System.out.println("Nenhum livro cadastrado.");
                }

            } else if (opcao == 0) {

                System.out.println("Encerrando o programa...");

            } else {

                System.out.println("Opção inválida!");

            }

        } while (opcao != 0);
        sc.close();
    }
}