import java.util.Scanner;

public class CompraDesconto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double valorCompra;
        double desconto;
        double valorFinal;
        String formaPagamento;

        System.out.print("Digite o valor da compra: ");
        valorCompra = teclado.nextDouble();

        teclado.nextLine();

        System.out.print("Forma de pagamento (avista ou prazo): ");
        formaPagamento = teclado.nextLine();

        if (valorCompra < 100) {
            desconto = 0;
        } else if (valorCompra <= 500) {
            desconto = valorCompra * 0.05;
        } else {
            desconto = valorCompra * 0.10;
        }

        valorFinal = valorCompra - desconto;

        if (formaPagamento.equalsIgnoreCase("avista")) {
            valorFinal = valorFinal - (valorFinal * 0.02);
        }

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Valor final: R$ " + valorFinal);

        teclado.close();
    }
}
