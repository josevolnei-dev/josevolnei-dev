import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[6];

        for (int i = 0; i < 6; i++) {
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        for (int i = 0; i < 6; i++) {
            System.out.println(v[i]);
        }
        sc.close();
    }
}