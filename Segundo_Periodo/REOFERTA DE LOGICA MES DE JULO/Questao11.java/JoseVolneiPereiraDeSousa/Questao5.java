/*Uma loja virtual precisa de um sistema simples para gerenciar o carrinho de
compras de um cliente. Os produtos adicionados ao carrinho são representados 
apenas por seus preços (valores inteiros). Devido à natureza dinâmica do carrinho, 
a estrutura escolhida para armazenar os dados foi um ArrayList<Integer>. Assim,
desenvolva um programa em Java que:

    Crie um ArrayList<Integer> para armazenar os preços dos produtos
    Permita inserir 5 valores inteiros informados pelo usuário
    Exiba todos os valores inseridos
    Remova todos os produtos com valor menor que 50
    Ordene os valores restantes em ordem crescente
    Após executar as tarefas acima, exiba:
        A lista atualizada dos valores;
        O maior valor;
        O menor valor;
        A média dos valores;

*/import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> produtos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o preço do produto: ");
            produtos.add(ler.nextInt());

        }

        System.out.println("Valores inseridos:");
        System.out.println(produtos);


        produtos.removeIf(valor -> valor < 50);


        Collections.sort(produtos);


        System.out.println("Lista atualizada:");
        System.out.println(produtos);


        if (produtos.size() > 0) {

            int maior = Collections.max(produtos);
            int menor = Collections.min(produtos);

            int soma = 0;

            for (int valor : produtos) {
                soma += valor;
            }

            double media = (double) soma / produtos.size();

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Média: " + media);

        } else {

            System.out.println("Não existem valores na lista.");

        }

        ler.close();
    }
}