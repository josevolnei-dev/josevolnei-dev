import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    ArrayList<Estabelecimento> estabelecimentos = new ArrayList<>();

    int opcao;

    do {
        System.out.println("\n===== ROTA ACESSÍVEL =====");
        System.out.println("1 - Cadastrar estabelecimento");
        System.out.println("2 - Listar estabelecimentos");
        System.out.println("3 - Fazer avaliação");
        System.out.println("4 - Consultar avaliações");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = Integer.parseInt(entrada.nextLine());

        switch (opcao) {

            case 1:
  System.out.print("Nome do estabelecimento: ");
String nome = entrada.nextLine();

System.out.print("Endereço: ");
String endereco = entrada.nextLine();

System.out.println("\n=== RECURSOS DE ACESSIBILIDADE ===");

System.out.print("Possui rampa de acesso? (S/N): ");
boolean rampa = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui entrada sem degraus? (S/N): ");
boolean entradaSemDegraus = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui banheiro adaptado? (S/N): ");
boolean banheiroAdaptado = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui vagas reservadas? (S/N): ");
boolean vagasReservadas = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui piso tátil? (S/N): ");
boolean pisoTatil = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui sinalização em Braille? (S/N): ");
boolean sinalizacaoBraille = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui atendimento acessível? (S/N): ");
boolean atendimentoAcessivel = entrada.nextLine().equalsIgnoreCase("S");

System.out.print("Possui espaço para cadeira de rodas? (S/N): ");
boolean espacoCadeiraRodas = entrada.nextLine().equalsIgnoreCase("S");

Estabelecimento novo = new Estabelecimento(
        nome,
        endereco,
        rampa,
        entradaSemDegraus,
        banheiroAdaptado,
        vagasReservadas,
        pisoTatil,
        sinalizacaoBraille,
        atendimentoAcessivel,
        espacoCadeiraRodas
);

                estabelecimentos.add(novo);

                System.out.println("Estabelecimento cadastrado!");
                break;

            case 2:
                if (estabelecimentos.isEmpty()) {
                    System.out.println("Nenhum estabelecimento cadastrado.");
                } else {
                    for (int i = 0; i < estabelecimentos.size(); i++) {
                        System.out.println("\nID: " + (i + 1));
                        estabelecimentos.get(i).mostrarDados();
                    }
                }
                break;

            case 3:
                if (estabelecimentos.isEmpty()) {
                    System.out.println("Cadastre um estabelecimento primeiro.");
                    break;
                }

                System.out.print("Nome do usuário: ");
                String nomeUsuario = entrada.nextLine();

                Usuario usuario = new Usuario(nomeUsuario);

                System.out.println("Escolha o estabelecimento:");

                for (int i = 0; i < estabelecimentos.size(); i++) {
                    System.out.println((i + 1) + " - "
                            + estabelecimentos.get(i).getNome());
                }

                int escolha = Integer.parseInt(entrada.nextLine());

                if (escolha < 1 || escolha > estabelecimentos.size()) {
                    System.out.println("Estabelecimento inválido!");
                    break;
                }

                System.out.print("Nota de 1 a 5: ");
                int nota = Integer.parseInt(entrada.nextLine());

                if (nota < 1 || nota > 5) {
                    System.out.println("Nota inválida!");
                    break;
                }

                System.out.print("Comentário: ");
                String comentario = entrada.nextLine();

                Avaliacao avaliacao = new Avaliacao(
                        usuario, nota, comentario);

                estabelecimentos.get(escolha - 1)
                        .adicionarAvaliacao(avaliacao);

                System.out.println("Avaliação cadastrada!");
                break;

            case 4:
                if (estabelecimentos.isEmpty()) {
                    System.out.println("Nenhum estabelecimento cadastrado.");
                    break;
                }

                System.out.println("Escolha o estabelecimento:");

                for (int i = 0; i < estabelecimentos.size(); i++) {
                    System.out.println((i + 1) + " - "
                            + estabelecimentos.get(i).getNome());
                }

                int consulta = Integer.parseInt(entrada.nextLine());

                if (consulta < 1 || consulta > estabelecimentos.size()) {
                    System.out.println("Estabelecimento inválido!");
                } else {
                    estabelecimentos.get(consulta - 1).listarAvaliacoes();
                }
                break;

            case 0:
                System.out.println("Encerrando o Rota Acessível...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 0);

    entrada.close();
}

}

