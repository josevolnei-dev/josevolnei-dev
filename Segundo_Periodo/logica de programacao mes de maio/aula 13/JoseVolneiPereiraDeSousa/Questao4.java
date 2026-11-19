
import java.util.Arrays;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[6];

        // Entrada dos números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite um número: ");
            numeros[i] = leia.nextInt();
        }

        // Ordenando
        Arrays.sort(numeros);

        // Exibindo
        System.out.println("Vetor em ordem crescente:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
        }
    }
}
