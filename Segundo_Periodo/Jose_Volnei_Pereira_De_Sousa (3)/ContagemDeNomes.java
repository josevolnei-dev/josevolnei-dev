import java.util.Scanner;

public class ContagemDeNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[8];
        int contador = 0;

        for (int i = 0; i < 8; i++) {
            nomes[i] = sc.nextLine();
        }

        String busca = sc.nextLine();

        for (int i = 0; i < 8; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();

    }
}