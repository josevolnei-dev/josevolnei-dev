import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mercado{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lista.add(sc.nextInt());
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.removeIf(n -> n < 50);

        Collections.sort(lista);

        System.out.println(lista);

        int maior = Collections.max(lista);
        int menor = Collections.min(lista);

        int soma = 0;
        for (int n : lista) {
            soma += n;
        }

        double media = (double) soma / lista.size();

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media);
    }


}

