import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;
}

public class Questao1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Produto[] produtos = new Produto[5];

        for (int i = 0; i < produtos.length; i++) {

            produtos[i] = new Produto();

            System.out.println("Produto " + (i + 1));

            System.out.print("Nome: ");
            produtos[i].nome = entrada.nextLine();

            System.out.print("Preço: ");
            produtos[i].preco = entrada.nextDouble();

            System.out.print("Quantidade em estoque: ");
            produtos[i].quantidade = entrada.nextInt();
            entrada.nextLine();

            System.out.println();
        }

        System.out.println("===== PRODUTOS CADASTRADOS =====");

        for (int i = 0; i < produtos.length; i++) {

            System.out.println("Produto " + (i + 1));
            System.out.println("Nome: " + produtos[i].nome);
            System.out.println("Preço: R$ " + produtos[i].preco);
            System.out.println("Quantidade: " + produtos[i].quantidade);
            System.out.println();
        }

        entrada.close();
    }
}