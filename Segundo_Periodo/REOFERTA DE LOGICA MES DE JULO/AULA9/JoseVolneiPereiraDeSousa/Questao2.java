import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite um número positivo (negativo para sair): ");
            numero = ler.nextInt();

            if (numero >= 0) {
                soma += numero;
                quantidade++;
            }

        } while (numero >= 0);

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Média = " + media);
        } else {
            System.out.println("Nenhum número válido foi informado.");
        }

        ler.close();
    }
}
