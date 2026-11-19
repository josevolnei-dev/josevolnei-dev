
import java.util.Scanner;

public class SomaDeVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[5];
        int soma[] = new int[5];

        System.out.println("Digite os  5 numeros do vetor1");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("vetor1[" + i + ":]");
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os 5 numeros do vetor2");
        for (int i = 0; i < vetor1.length; i++) {

            System.out.print("vetor2[" + i + ":]");
            vetor2[i] = sc.nextInt();

        }
        System.out.println("Digite os 5 numeros do vetor3");
        for (int i = 0; i < vetor3.length; i++) {

            System.out.println("vetor3[" + i + ":]");
            vetor3[i] = sc.nextInt();

        }
        System.out.println("/nResultado dasoma");
        for (int i = 0; i < soma.length; i++) {
            soma[i] = vetor1[i] + vetor2[i] + vetor3[i];

            System.out.println(soma[i] + "=" + vetor1[i] + "+" + vetor2[i] + "+" + vetor3[i]);

        }
        sc.close();
    }

}
