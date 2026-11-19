/*
 Enunciado

Implemente um programa em Java que simule um sistema de
 cadastro de um livro, utilizando obrigatoriamente o laço
  do-while para manter o menu em execução até que o usuário
   escolha a opção de sair.
Requisitos

O programa deve exibir repetidamente o seguinte menu:

==== MENU ====
1 - Cadastrar livro
2 - Exibir livro cadastrado
0 - Sair

    O menu deve funcionar com o laço do-while, repetindo 
    até o usuário digitar 0.
    O sistema deve armazenar apenas um livro por vez, utilizando
     variáveis simples para título e autor.
    As informações cadastradas devem ser exibidas quando o 
    usuário escolher a opção 2.

Exemplo de execução

==== MENU ====
1 - Cadastrar livro
2 - Exibir livro cadastrado
0 - Sair
Opção: 1

Digite o título do livro: Java para Iniciantes
Digite o autor: João Silva

==== MENU ====
1 - Cadastrar livro
2 - Exibir livro cadastrado
0 - Sair
Opção: 2

Livro: Java para Iniciantes | Autor: João Silva

==== MENU ====
1 - Cadastrar livro
2 - Exibir livro cadastrado
0 - Sair
Opção: 0

Encerrando o programa...

*/

import java.util.Scanner;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String titulo = "";
        String autor = "";
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Exibir livro cadastrado");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o título do livro: ");
                    titulo = scanner.nextLine();

                    System.out.print("Digite o autor: ");
                    autor = scanner.nextLine();

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    if (titulo.equals("")) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        System.out.println(
                                "Livro: " + titulo + " | Autor: " + autor);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}