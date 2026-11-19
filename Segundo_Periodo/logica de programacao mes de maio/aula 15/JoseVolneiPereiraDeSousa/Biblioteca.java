import java.util.Scanner;

// Classe Livro
class Livro {

    int codigo;
    String titulo;
    String autor;
    int ano;
    boolean disponivel;
}

// Classe Aluno
class Aluno {

    String nome;
    String curso;
    int matricula;
}

// Classe Emprestimo
class Emprestimo {

    int codigoLivro;
    int matriculaAluno;
    String data;
}

public class Biblioteca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Vetores
        Livro[] livros = new Livro[4];
        Aluno[] alunos = new Aluno[5];
        Emprestimo[] emprestimos = new Emprestimo[4];

        // CADASTRO DOS LIVROS
        for (int i = 0; i < livros.length; i++) {

            livros[i] = new Livro();

            System.out.println("CADASTRO DO LIVRO " + (i + 1));

            System.out.print("Código: ");
            livros[i].codigo = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Título: ");
            livros[i].titulo = entrada.nextLine();

            System.out.print("Autor: ");
            livros[i].autor = entrada.nextLine();

            System.out.print("Ano de publicação: ");
            livros[i].ano = entrada.nextInt();

            livros[i].disponivel = true;

            entrada.nextLine();

            System.out.println();
        }

        // CADASTRO DOS ALUNOS
        for (int i = 0; i < alunos.length; i++) {

            alunos[i] = new Aluno();

            System.out.println("CADASTRO DO ALUNO " + (i + 1));

            System.out.print("Nome: ");
            alunos[i].nome = entrada.nextLine();

            System.out.print("Curso: ");
            alunos[i].curso = entrada.nextLine();

            System.out.print("Matrícula: ");
            alunos[i].matricula = entrada.nextInt();

            entrada.nextLine();

            System.out.println();
        }

        // REALIZAÇÃO DOS EMPRÉSTIMOS
        for (int i = 0; i < emprestimos.length; i++) {

            emprestimos[i] = new Emprestimo();

            System.out.println("EMPRÉSTIMO " + (i + 1));

            System.out.print("Código do livro: ");
            int codigoLivro = entrada.nextInt();

            boolean encontrado = false;

            // Procura livro
            for (int j = 0; j < livros.length; j++) {

                if (livros[j].codigo == codigoLivro && livros[j].disponivel == true) {

                    emprestimos[i].codigoLivro = codigoLivro;

                    System.out.print("Matrícula do aluno: ");
                    emprestimos[i].matriculaAluno = entrada.nextInt();

                    entrada.nextLine();

                    System.out.print("Data do empréstimo: ");
                    emprestimos[i].data = entrada.nextLine();

                    // Livro fica indisponível
                    livros[j].disponivel = false;

                    encontrado = true;

                    System.out.println("Empréstimo realizado!");

                    break;
                }
            }

            if (encontrado == false) {

                System.out.println("Livro indisponível ou não encontrado.");
            }

            System.out.println();
        }

        // LIVROS DISPONÍVEIS
        System.out.println("LIVROS DISPONÍVEIS");

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].disponivel == true) {

                System.out.println(livros[i].titulo);
            }
        }

        System.out.println();

        // LIVROS EMPRESTADOS
        System.out.println("LIVROS EMPRESTADOS");

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].disponivel == false) {

                System.out.println(livros[i].titulo);
            }
        }

        System.out.println();

        // RELATÓRIO DE EMPRÉSTIMOS
        System.out.println("RELATÓRIO DE EMPRÉSTIMOS");

        for (int i = 0; i < emprestimos.length; i++) {

            if (emprestimos[i] != null) {

                String tituloLivro = "";

                // Procura título do livro
                for (int j = 0; j < livros.length; j++) {

                    if (livros[j].codigo == emprestimos[i].codigoLivro) {

                        tituloLivro = livros[j].titulo;
                    }
                }

                System.out.println("Livro: " + tituloLivro);

                System.out.println("Matrícula: " + emprestimos[i].matriculaAluno);

                System.out.println("Data: " + emprestimos[i].data);

                System.out.println("----------------------");
            }
        }

        entrada.close();
    }
}
