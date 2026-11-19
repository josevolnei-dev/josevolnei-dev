
import java.util.Scanner;

public class Produtos {

    String nome;
    double preco;
    int quantidade;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos[] produtos = new Produtos[5];
        sc.nextLine();
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Cadastro do produto" + (i + 1));
            produtos[i] = new Produtos();
            System.out.println("Digite o nome ");
            produtos[i].nome = sc.nextLine();
            System.out.println("Digite o preco");
            produtos[i].preco = sc.nextDouble();
            System.out.println("Digite a quantidade");
            produtos[i].quantidade = sc.nextInt();
            sc.nextLine();

        }

        System.out.println("produtos cadastrados");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("produto " + (i + 1));
            System.out.println("nome " + produtos[i].nome);
            System.out.println("preco  R$ " + produtos[i].preco);
            System.out.println("quantidade " + produtos[i].quantidade);
            System.out.println();

        }

        sc.close();
    }
}
