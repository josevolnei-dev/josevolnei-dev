import java.util.Scanner;

public class Fatorial {

    // Função que calcula o fatorial
    public static int calcularFatorial(int numero) {

        int fatorial = 1;

        // Multiplica os números
        for (int i = 1; i <= numero; i++) {

            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        // Chama a função
        int resultado = calcularFatorial(numero);

        // Exibe o resultado
        System.out.println("Fatorial de " + numero + " = " + resultado);

        entrada.close();
    }
}
