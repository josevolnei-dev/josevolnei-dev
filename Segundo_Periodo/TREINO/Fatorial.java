import java.util.Scanner;

public class Fatorial {

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);

        entrada.close();
    }

    // Função para calcular o fatorial
    public static long calcularFatorial(int n) {

        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }
}