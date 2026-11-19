import java.util.Scanner;

public class Ecommerce {

    // Função para calcular desconto
    public static double calcularDesconto(double valorCompra) {

        double desconto = 0;

        // Regras do desconto
        if (valorCompra > 200) {

            desconto = valorCompra * 0.10;

        } else if (valorCompra > 100) {

            desconto = valorCompra * 0.05;
        }

        return desconto;
    }

    // Função para calcular frete
    public static double calcularFrete(int quantidadeItens, boolean vip) {

        double frete = 0;

        // Cliente VIP
        if (vip == true) {

            frete = 0;

        } else {

            // Cliente comum
            if (quantidadeItens <= 5) {

                frete = 10;

            } else {

                frete = 20;
            }
        }

        return frete;
    }

    // Função para calcular valor final
    public static double calcularValorFinal(double valorCompra,
            double desconto,
            double frete) {

        double valorFinal;

        valorFinal = valorCompra - desconto + frete;

        return valorFinal;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Valor da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Quantidade de itens: ");
        int quantidadeItens = entrada.nextInt();

        System.out.print("Cliente VIP (true/false): ");
        boolean vip = entrada.nextBoolean();

        // Chamando funções
        double desconto = calcularDesconto(valorCompra);

        double frete = calcularFrete(quantidadeItens, vip);

        double valorFinal = calcularValorFinal(valorCompra, desconto, frete);

        // Exibição
        System.out.println("Desconto: R$ " + desconto);

        System.out.println("Frete: R$ " + frete);

        System.out.println("Valor final: R$ " + valorFinal);

        entrada.close();
    }
}
