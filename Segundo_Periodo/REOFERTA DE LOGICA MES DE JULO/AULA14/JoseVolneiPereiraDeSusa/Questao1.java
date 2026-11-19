import java.util.Scanner;

public class Questao1 {

    public static long fatorial(int numero) {

        long fat = 1;

        for (int i = 1; i <= numero; i++) {
            fat *= i;
        }

        return fat;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        long resultado = fatorial(numero);

        System.out.println("Fatorial de " + numero + " = " + resultado);

        entrada.close();
    }
}
