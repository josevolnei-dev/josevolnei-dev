/*codifique um algoritimo que leia dois numeros inteiro
*verifica se o primeiro e positivo = a 0 se for positivo verifica se e par ou impar
*mostre a mensage de todos os resultados se e positivo se e par ou impar se e igual a 0 se  e negativo
* faca verificacao para o segundo numero se 
* se apenas imprima amenssgem se o numero e positivo negativo igual a 0 */
import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro positivo");
        int n1 = sc.nextInt();

        System.out.println("digite um numero inteiro positivo");
        int n2 = sc.nextInt();

        if (n1 == 0) {
            System.out.println("Igual zero");
        } else if (n1 > 0) {
            System.out.println("Positivo");

            if (n1 % 2 == 0) {
                System.out.println(" Par ");

            } else {
                System.out.println("Impar");
            }

        } else {
            System.out.println("Negativo");

        }
        System.out.println("Resultado do segundo numero");
        if (n2 == 0) {
            System.out.println(" Igual  zero");

        } else if (n2 > 0) {
            System.out.println("Positivo");

            if (n2 % 2 == 0) {
                System.out.println(" Par ");

            } else {
                System.out.println(" Impar ");

            }
        } else {

            System.out.println(" Negativo");
        }
        sc.close();
    }

}
