mport java.util.ArrayList;
import java.util.Scanner;

class Venda {

    int codigo;
    String nomeProduto;
    String categoria;
    int quantidade;
    double valorUnitario;

    public Venda(int codigo, String nomeProduto, String categoria, int quantidade, double valorUnitario) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
}
public class SistemaVendas {

    static Scanner sc = new Scanner(System.in);

    // Estrutura homogênea
    static ArrayList<Venda> vendas = new ArrayList<>();


    public static void main(String[] args) {

        int opcao;

        do {

            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:
                    cadastrarVenda();
                    break;

                case 2:
                    listarVendas();
                    break;

                case 3:
                    exibirRelatorio();
                    break;

                case 4:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while(opcao != 4);

    }


    // PROCEDIMENTO 1
    public static void exibirMenu(){

        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("1 - Cadastrar venda");
        System.out.println("2 - Listar vendas");
        System.out.println("3 - Relatório geral");
        System.out.println("4 - Encerrar sistema");
        System.out.print("Escolha: ");

    }


    // PROCEDIMENTO 2
    public static void cadastrarVenda(){

        System.out.println("\n=== Cadastro de Venda ===");

        System.out.print("Código da venda: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        System.out.print("Quantidade vendida: ");
        int quantidade = sc.nextInt();

        System.out.print("Valor unitário: ");
        double valor = sc.nextDouble();


        Venda venda = new Venda(codigo, nome, categoria, quantidade, valor);


        vendas.add(venda);


        System.out.println("Venda cadastrada com sucesso!");

    }



    // PROCEDIMENTO 3
    public static void listarVendas(){

        System.out.println("\n===== LISTA DE VENDAS =====");


        if(vendas.size() == 0){

            System.out.println("Nenhuma venda cadastrada!");

        }else{


            for(Venda v : vendas){

                System.out.println("-------------------");

                System.out.println("Código: " + v.codigo);
                System.out.println("Produto: " + v.nomeProduto);
                System.out.println("Categoria: " + v.categoria);
                System.out.println("Quantidade: " + v.quantidade);
                System.out.println("Valor unitário: R$ " + v.valorUnitario);

                System.out.println("Valor total: R$ " 
                + calcularValorVenda(v));

            }

        }

    }



    // FUNÇÃO 1
    public static double calcularValorVenda(Venda v){

        return v.quantidade * v.valorUnitario;

    }



    // FUNÇÃO 2
    public static double calcularFaturamentoTotal(){

        double total = 0;


        for(Venda v : vendas){

            total += calcularValorVenda(v);

        }


        return total;

    }



    // FUNÇÃO 3
    public static String obterClassificacao(double faturamento){


        if(faturamento <= 1000){

            return "Baixo";

        }else if(faturamento <= 5000){

            ret…Médio";

        }else{

            return "Alto";

        }

    }



    public static void exibirRelatorio(){


        System.out.println("\n===== RELATÓRIO GERAL =====");


        int totalVendas = vendas.size();

        double faturamento = calcularFaturamentoTotal();


        int totalItens = 0;


        Venda maisVendido = null;


        double somaValores = 0;



        for(Venda v : vendas){


            totalItens += v.quantidade;

            somaValores += v.valorUnitario;



            if(maisVendido == null || 
               v.quantidade > maisVendido.quantidade){

                maisVendido = v;

            }

        }



        double media = 0;


        if(totalVendas > 0){

            media = somaValores / totalVendas;

        }



        System.out.println("Quantidade de vendas: " + totalVendas);

        System.out.println("Faturamento total: R$ " + faturamento);

        System.out.println("Quantidade total de itens: " + totalItens);

        System.out.println("Média de valor dos produtos: R$ " + media);



        if(maisVendido != null){

            System.out.println("Produto mais vendido: "
            + maisVendido.nomeProduto);

        }



        System.out.println("Desempenho da loja: "
        + obterClassificacao(faturamento));


    }

}