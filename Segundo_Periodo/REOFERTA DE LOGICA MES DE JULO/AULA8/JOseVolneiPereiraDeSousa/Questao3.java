import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valor, valorFinal;
        String pagamento;

        System.out.print("Digite o valor da compra: R$ ");
        valor = ler.nextDouble();

        ler.nextLine();

        System.out.print("Pagamento à vista ou prazo? ");
        pagamento = ler.nextLine();

        valorFinal = valor;

        if (pagamento.equalsIgnoreCase("avista") || pagamento.equalsIgnoreCase("à vista")) {

            if (valor < 100) {
                valorFinal = valor;
            } else if (valor <= 500) {
                valorFinal = valor - (valor * 0.05);
            } else {
                valorFinal = valor - (valor * 0.10);
            }

            System.out.print("Pagamento em dinheiro? (sim/nao): ");
            String dinheiro = ler.nextLine();

            if (dinheiro.equalsIgnoreCase("sim")) {
                valorFinal = valorFinal - (valorFinal * 0.02);
            }

        }

        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        ler.close();
    }
}