import java.util.Scanner;

public class MaiorMenorDeTrezNumeros{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int maior;
        int menor;

        System.out.print("Digite o primeiro número: ");
        numero1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = teclado.nextInt();

        maior = numero1;
        menor = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        teclado.close();
    }
}
