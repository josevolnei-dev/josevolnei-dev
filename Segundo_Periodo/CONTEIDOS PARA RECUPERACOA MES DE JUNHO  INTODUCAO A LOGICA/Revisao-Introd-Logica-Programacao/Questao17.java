
/*Codifique um algoritmo em Java que leia três números inteiros e verifique se
        * eles formam um triângulo (para formar um triângulo, cada lado deve ser menor 
        * que a soma dos outros dois lados – a < b + c). Se formarem, indique se é um triângulo 
         *equilátero (lados iguais), isósceles (um lado igual a um dos outros dois lados) ou escaleno 
         *(todos os lados possuem medidas distintas
 */
import java.util.Scanner;

public class Questao17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero ");
        int n3 = sc.nextInt();
        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) {

            if (n1 == n2 && n2 == n3) {

                System.out.println("Triangulo equilatero");

            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                System.out.println(" Tringulo esoceles");
            } else {
                System.out.println("Triangulo escaleno");

            }
        } else {
            System.out.println(" Os valores nao sao um triangulo");
        }
        sc.close();
    }
}
