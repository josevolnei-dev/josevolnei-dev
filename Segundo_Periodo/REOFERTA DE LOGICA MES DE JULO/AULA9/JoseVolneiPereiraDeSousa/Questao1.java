import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero, contador = 1;

        System.out.print("Digite um número: ");
        numero = ler.nextInt();

        do {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        } while (contador <= 10);

        ler.close();
    }
}