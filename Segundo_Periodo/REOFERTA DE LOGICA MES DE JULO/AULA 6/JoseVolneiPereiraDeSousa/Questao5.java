/*Codifique um algoritmo em Java que resolva o seguinte problema:
O usuário deverá informar dois números inteiros e o algoritmo deverá
realizar o cálculo do resto da divisão desses números e exibir o
resultado na tela
para o usuário.
 */
import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite primeiro numero");
        int n1 = sc.nextInt();
        System.out.println(" Digite segundo numero");
        int n2 = sc.nextInt();

        int resto = (n1 % n2);
        System.out.println("O resto da divisao de  " + n1 + " / " + n2 + " e " + resto);

        sc.close();
    }
}
