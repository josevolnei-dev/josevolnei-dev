import java.util.ArrayList;
import java.util.Scanner;

public class LojaEletronicos{

    
    static class Venda{
        int codigo;
        String nomeProduto;
        String categoria;
        int quantidade;
        double valorUnitario;
    }

    
    static ArrayList<Venda> vendas = new ArrayList<Venda>();

    static Scanner scanner = new Scanner(System.in);

        
    
    public static void exibirMenu() {
        System.out.println("\n===== LOJA DE ELETRONICOS =====");
        System.out.println("1 - Cadastrar venda");
        System.out.println("2 - Listar vendas realizadas");
        System.out.println("3 - Exibir relatorio geral");
        System.out.println("4 - Encerrar sistema");
        System.out.println("===============================");
    }
    
    
    public static void cadastrarVenda() {
        Venda novaVenda = new Venda();

        System.out.print("Digite o codigo da venda: ");
        novaVenda.codigo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome do produto: ");
        novaVenda.nomeProduto = scanner.nextLine();
        
        System.out.print("Categoria do produto: ");
        novaVenda.categoria = scanner.nextLine();
        
        System.out.print("Quantidade vendida: ");
        novaVenda.quantidade = scanner.nextInt();
        
        System.out.print("Valor unitario: ");
        novaVenda.valorUnitario = scanner.nextDouble();
        
        vendas.add(novaVenda);
        
        System.out.println("Venda cadastrada com sucesso!");
    }
    
    
    public static void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada ainda.");
            return;
        }
        
        System.out.println("\n--- LISTAGEM DE VENDAS ---");
        for (Venda v : vendas) {
            double valorTotal = calcularValorVenda(v.quantidade, v.valorUnitario); // FUNÇÃO 1
            System.out.println("Codigo: " + v.codigo);
            System.out.println("Produto: " + v.nomeProduto);
            System.out.println("Categoria: " + v.categoria);
            System.out.println("Quantidade: " + v.quantidade);
            System.out.println("Valor unitario: R$ " + v.valorUnitario);
            System.out.println("Valor total da venda: R$ " + valorTotal);
            System.out.println("-------------------------");
        }
    }
    
    
    public static double calcularValorVenda(int qtd, double valorUnit) {
        return qtd * valorUnit;
    }
    
    
    public static double calcularFaturamentoTotal() {
        double total = 0;
        for (Venda v : vendas) {
            total += calcularValorVenda(v.quantidade, v.valorUnitario);
        }
        return total;
    }
    
    
    public static String obterClassificacao(double faturamento) {
        if (faturamento <= 1000.00) {
            return "Baixo";
        } else if (faturamento <= 5000.00) {
            return "Medio";
        } else {
            return "Alto";
        }
    }
    
    public static void exibirRelatorioGeral() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada.");
            return;
        }
        
        int qtdTotalVendas = vendas.size();
        double faturamentoTotal = calcularFaturamentoTotal();
        
        // Produto mais vendido
        String produtoMaisVendido = "";
        int maiorQtd = 0;
        for (Venda v : vendas) {
            if (v.quantidade > maiorQtd) {
                maiorQtd = v.quantidade;
                produtoMaisVendido = v.nomeProduto;
            }
        }
        
        // Quantidade total de itens
        int qtdTotalItens = 0;
        for (Venda v : vendas) {
            qtdTotalItens += v.quantidade;
        }
        
        double mediaVendas = faturamentoTotal / qtdTotalVendas;
        String classificacao = obterClassificacao(faturamentoTotal); // FUNÇÃO 3
        
        System.out.println("\n--- RELATORIO GERAL ---");
        System.out.println("Quantidade total de vendas: " + qtdTotalVendas);
        System.out.println("Faturamento total da loja: R$ " + faturamentoTotal);
        System.out.println("Produto mais vendido: " + produtoMaisVendido + " com " + maiorQtd + " unidades");
        System.out.println("Quantidade total de itens vendidos: " + qtdTotalItens);
        System.out.println("Media de valor das vendas: R$ " + mediaVendas);
        System.out.println("Classificacao do desempenho: " + classificacao);
    }

    public static void main(String[] args) {
        int opcao = 0;
        
        do {
            exibirMenu();
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    cadastrarVenda();
                    break;
                case 2:
                    listarVendas();
                    break;
                case 3:
                    exibirRelatorioGeral();
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
            
        } while (opcao != 4);
        
        scanner.close();
    }

}