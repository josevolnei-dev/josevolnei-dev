import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarrinhoDeCompras {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> valores = new ArrayList<>();

        // Inserindo valores
        for (int i = 0; i < 5; i++) {

            System.out.print("Digite um valor: ");
            valores.add(leia.nextInt());
        }

        // Exibindo valores
        System.out.println("Valores digitados:");
        System.out.println(valores);

        // Removendo menores que 50
        valores.removeIf(numero -> numero < 50);

        // Ordenando
        Collections.sort(valores);

        // Exibindo lista atualizada
        System.out.println("Lista atualizada:");
        System.out.println(valores);

        // Maior valor
        int maior = Collections.max(valores);

        // Menor valor
        int menor = Collections.min(valores);

        // Média
        double soma = 0;

        for (int numero : valores) {

            soma += numero;
        }

        double media = soma / valores.size();

        // Resultados
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);
    }
}
