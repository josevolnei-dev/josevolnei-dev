import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] soma = new int[5];

        for (int i = 0; i < 5; i++) {
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma[i] = v1[i] + v2[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(soma[i]);
        }
        sc.close();
    }
}