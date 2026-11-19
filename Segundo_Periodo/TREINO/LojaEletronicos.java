import java.util.Scanner; // Importa a classe Scanner para entrada de dados

// Classe Produto -> estrutura heterogênea
class Produto {

    String nome; // Guarda o nome do produto
    double preco; // Guarda o preço do produto
    int quantidade; // Guarda a quantidade em estoque
}

public class LojaEletronicos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in); // Cria o objeto para ler dados

        Produto[] produtos = new Produto[5]; // Vetor para guardar 5 produtos

        // FOR para cadastrar os produtos
        for (int i = 0; i < produtos.length; i++) {

            produtos[i] = new Produto(); // Cria espaço do objeto no vetor

            System.out.println("Cadastro do produto " + (i + 1));

            System.out.print("Digite o nome do produto: ");
            produtos[i].nome = leia.nextLine(); // Lê o nome

            System.out.print("Digite o preco: ");
            produtos[i].preco = leia.nextDouble(); // Lê o preço

            System.out.print("Digite a quantidade em estoque: ");
            produtos[i].quantidade = leia.nextInt(); // Lê a quantidade

            leia.nextLine(); // Limpa o ENTER do teclado

            System.out.println(); // Pula linha
        }

        // Exibe os produtos cadastrados
        System.out.println("===== PRODUTOS CADASTRADOS =====");

        // FOR para mostrar os produtos
        for (int i = 0; i < produtos.length; i++) {

            System.out.println("Produto " + (i + 1));

            System.out.println("Nome: " + produtos[i].nome);

            System.out.println("Preco: R$ " + produtos[i].preco);

            System.out.println("Quantidade em estoque: " + produtos[i].quantidade);

            System.out.println(); // Pula linha
        }

        leia.close(); // Fecha o Scanner
    }
}