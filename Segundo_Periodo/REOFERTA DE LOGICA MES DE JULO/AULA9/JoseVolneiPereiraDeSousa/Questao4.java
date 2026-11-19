import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double deposito;
        double soma = 0;
        double maior = 0;

        int quantidade = 0;
        int opcao;

        do {

            System.out.print("Digite o valor do depósito: ");

            deposito = ler.nextDouble();

            if (deposito >= 0) {

                soma += deposito;
                quantidade++;

                if (quantidade == 1 || deposito > maior) {
                    maior = deposito;
                }

            } else {
                System.out.println("Valor inválido.");
            }

            System.out.print("Deseja informar outro depósito? (1-Sim / 0-Não): ");
            opcao = ler.nextInt();

        } while (opcao == 1);

        double media = 0;
        int contador = 0;

        while (contador < 1) {

            if (quantidade > 0) {
                media = soma / quantidade;
            }

            contador++;
        }

        System.out.println("Total depositado: R$ " + soma);
        System.out.println("Quantidade de depósitos: " + quantidade);
        System.out.println("Maior depósito: R$ " + maior);
        System.out.println("Média dos depósitos: R$ " + media);

        ler.close();
    }
}