import java.util.Scanner;

public class Ecommerce {

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor total da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Digite a quantidade de itens: ");
        int quantidadeItens = entrada.nextInt();

        System.out.print("Cliente VIP? (true/false): ");
        boolean vip = entrada.nextBoolean();

        // Chamando funções
        double desconto = calcularDesconto(valorCompra);

        double frete = calcularFrete(quantidadeItens, vip);

        double valorFinal = calcularValorFinal(valorCompra, desconto, frete);

        // Exibindo resultados
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Frete: R$ " + frete);
        System.out.println("Valor final da compra: R$ " + valorFinal);

        entrada.close();
    }

    // Função para calcular desconto
    public static double calcularDesconto(double valorCompra) {

        if (valorCompra > 200) {
            return valorCompra * 0.10;
        }

        else if (valorCompra > 100) {
            return valorCompra * 0.05;
        }

        else {
            return 0;
        }
    }

    // Função para calcular frete
    public static double calcularFrete(int quantidadeItens, boolean vip) {

        if (vip == true) {
            return 0;
        }

        else {

            if (quantidadeItens <= 5) {
                return 10;
            }

            else {
                return 20;
            }
        }
    }

    // Função para calcular valor final
    public static double calcularValorFinal(double valorCompra, double desconto, double frete) {

        return valorCompra - desconto + frete;
    }
}