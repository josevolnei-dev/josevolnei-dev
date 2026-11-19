/*faco um algoritimo que peca o usurio para digitar dois numeros inteiro
*  e soma ,depois mostre o resultado na tela */
import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro  numero inteiro");
        int n1 = sc.nextInt();
        System.out.println("Digite  o segundo Snumero inteiro ");
        int n2 = sc.nextInt();

int soma = ( n1 + n2);
System.out.println("soma" + n1 + " = " + n2 + " = " + soma);

        sc.close();
    }
}