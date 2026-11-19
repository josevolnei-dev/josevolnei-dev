import java.util.Scanner;

public class Desconto{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nomeProduto;
        double valorUnitario;
        int quantidade;
        double valorTotal;
        double desconto;
        double valorFinal;

        System.out.print("Nome do produto: ");
        nomeProduto = teclado.nextLine();

        System.out.print("Valor unitário: ");
        valorUnitario = teclado.nextDouble();

        System.out.print("Quantidade: ");
        quantidade = teclado.nextInt();

        valorTotal = valorUnitario * quantidade;

        if (valorTotal > 200) {
            desconto = valorTotal * 0.02;
        } else {
            desconto = 0;
        }

        valorFinal = valorTotal - desconto;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor Final: R$ " + valorFinal);

        teclado.close();
    }
}
