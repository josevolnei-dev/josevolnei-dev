import java.util.Scanner;

public class Questao3 {

    public static double calcularDesconto(double valorCompra) {

        if (valorCompra > 200) {
            return valorCompra * 0.10;
        } else if (valorCompra > 100) {
            return valorCompra * 0.05;
        } else {
            return 0;
        }
    }

    public static double calcularFrete(int quantidadeItens, boolean vip) {

        if (vip) {
            return 0;
        } else {

            if (quantidadeItens <= 5) {
                return 10;
            } else {
                return 20;
            }
        }
    }

    public static double calcularValorFinal(double valorCompra, double desconto, double frete) {

        return valorCompra - desconto + frete;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Quantidade de itens: ");
        int quantidadeItens = entrada.nextInt();

        System.out.print("Cliente VIP (true ou false): ");
        boolean vip = entrada.nextBoolean();

        double desconto = calcularDesconto(valorCompra);

        double frete = calcularFrete(quantidadeItens, vip);

        double valorFinal = calcularValorFinal(valorCompra, desconto, frete);

        System.out.println("\nDesconto: R$ " + desconto);
        System.out.println("Frete: R$ " + frete);
        System.out.println("Valor final: R$ " + valorFinal);

        entrada.close();
    }
}