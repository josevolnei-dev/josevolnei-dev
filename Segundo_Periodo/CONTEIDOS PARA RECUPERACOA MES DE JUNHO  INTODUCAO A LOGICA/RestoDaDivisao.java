import java.util.Scanner;

public class RestoDaDivisao{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dividendo;
        int divisor;
        int resto;

        System.out.print("Digite o dividendo: ");
        dividendo = teclado.nextInt();

        System.out.print("Digite o divisor: ");
        divisor = teclado.nextInt();

        resto = dividendo % divisor;

        System.out.println("Resto da divisão = " + resto);

        teclado.close();
    }
}