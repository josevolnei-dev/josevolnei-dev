import java.util.Scanner;

class Livro {
    int codigo;
    String titulo;
    String autor;
    int ano;
    boolean disponivel = true;
}

class Aluno {
    String nome;
    String curso;
    int matricula;
}

class Emprestimo {
    int codigoLivro;
    int matriculaAluno;
    String data;
}

public class Questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Livro[] livros = new Livro[4];
        Aluno[] alunos = new Aluno[5];
        Emprestimo[] emprestimos = new Emprestimo[4];

        // Cadastro dos livros
        System.out.println("===== CADASTRO DOS LIVROS =====");

        for (int i = 0; i < livros.length; i++) {

            livros[i] = new Livro();

            System.out.print("Código: ");
            livros[i].codigo = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Título: ");
            livros[i].titulo = entrada.nextLine();

            System.out.print("Autor: ");
            livros[i].autor = entrada.nextLine();

            System.out.print("Ano: ");
            livros[i].ano = entrada.nextInt();
            entrada.nextLine();

            System.out.println();
        }

        // Cadastro dos alunos
        System.out.println("===== CADASTRO DOS ALUNOS =====");

        for (int i = 0; i < alunos.length; i++) {

            alunos[i] = new Aluno();

            System.out.print("Nome: ");
            alunos[i].nome = entrada.nextLine();

            System.out.print("Curso: ");
            alunos[i].curso = entrada.nextLine();

            System.out.print("Matrícula: ");
            alunos[i].matricula = entrada.nextInt();
            entrada.nextLine();

            System.out.println();
        }

        // Empréstimos
        System.out.println("===== EMPRÉSTIMOS =====");

        for (int i = 0; i < livros.length; i++) {

            System.out.print("Deseja emprestar o livro \"" + livros[i].titulo + "\"? (s/n): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("s") && livros[i].disponivel) {

                emprestimos[i] = new Emprestimo();

                emprestimos[i].codigoLivro = livros[i].codigo;

                System.out.print("Informe a matrícula do aluno: ");
                emprestimos[i].matriculaAluno = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Data do empréstimo: ");
                emprestimos[i].data = entrada.nextLine();

                livros[i].disponivel = false;
            }
        }

        // Livros disponíveis
        System.out.println("\n===== LIVROS DISPONÍVEIS =====");

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].disponivel) {
                System.out.println(livros[i].titulo);
            }
        }

        // Livros emprestados
        System.out.println("\n===== LIVROS EMPRESTADOS =====");

        for (int i = 0; i < livros.length; i++) {

            if (!livros[i].disponivel) {
                System.out.println(livros[i].titulo);
            }
        }

        // Relação dos empréstimos
        System.out.println("\n===== RELAÇÃO DOS EMPRÉSTIMOS =====");

        for (int i = 0; i < emprestimos.length; i++) {

            if (emprestimos[i] != null) {

                String titulo = "";

                for (int j = 0; j < livros.length; j++) {

                    if (livros[j].codigo == emprestimos[i].codigoLivro) {
                        titulo = livros[j].titulo;
                    }
                }

                System.out.println("Título: " + titulo);
                System.out.println("Matrícula: " + emprestimos[i].matriculaAluno);
                System.out.println("Data: " + emprestimos[i].data);
                System.out.println();
            }
        }

        entrada.close();
    }
}