import java.util.Scanner;

public class FiltraPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[8];

        for (int i = 0; i < 8; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (v[i] % 2 == 0) {
                System.out.print(v[i]);

            
            }
        }


        sc.close();
    }
}