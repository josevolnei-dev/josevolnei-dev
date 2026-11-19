import java.util.Scanner; // Importa Scanner

// Classe Livro
class Livro {

    int codigo; // Código do livro
    String titulo; // Título do livro
    String autor; // Autor
    int ano; // Ano de publicação
    boolean disponivel; // Status do livro
}

// Classe Aluno
class Aluno {

    String nome; // Nome do aluno
    String curso; // Curso
    int matricula; // Matrícula
}

// Classe Emprestimo
class Emprestimo {

    int codigoLivro; // Código do livro emprestado
    int matriculaAluno; // Matrícula do aluno
    String data; // Data do empréstimo
}

public class Livros {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in); // Entrada de dados

        Livro[] livros = new Livro[4]; // Vetor de livros

        Aluno[] alunos = new Aluno[5]; // Vetor de alunos

        Emprestimo[] emprestimos = new Emprestimo[4]; // Vetor de empréstimos

        // Cadastro dos livros
        for (int i = 0; i < livros.length; i++) {

            livros[i] = new Livro(); // Cria objeto livro

            System.out.println("Cadastro do livro " + (i + 1));

            System.out.print("Codigo: ");
            livros[i].codigo = leia.nextInt();

            leia.nextLine(); // Limpa ENTER

            System.out.print("Titulo: ");
            livros[i].titulo = leia.nextLine();

            System.out.print("Autor: ");
            livros[i].autor = leia.nextLine();

            System.out.print("Ano: ");
            livros[i].ano = leia.nextInt();

            livros[i].disponivel = true; // Livro começa disponível

            leia.nextLine(); // Limpa ENTER

            System.out.println();
        }

        // Cadastro dos alunos
        for (int i = 0; i < alunos.length; i++) {

            alunos[i] = new Aluno(); // Cria objeto aluno

            System.out.println("Cadastro do aluno " + (i + 1));

            System.out.print("Nome: ");
            alunos[i].nome = leia.nextLine();

            System.out.print("Curso: ");
            alunos[i].curso = leia.nextLine();

            System.out.print("Matricula: ");
            alunos[i].matricula = leia.nextInt();

            leia.nextLine(); // Limpa ENTER

            System.out.println();
        }

        // Realização dos empréstimos
        for (int i = 0; i < emprestimos.length; i++) {

            emprestimos[i] = new Emprestimo(); // Cria objeto empréstimo

            System.out.println("Emprestimo " + (i + 1));

            System.out.print("Digite o codigo do livro: ");
            int codigoBusca = leia.nextInt();

            boolean encontrado = false; // Verifica se encontrou livro

            // Procura o livro
            for (int j = 0; j < livros.length; j++) {

                // Verifica código e disponibilidade
                if (livros[j].codigo == codigoBusca && livros[j].disponivel == true) {

                    emprestimos[i].codigoLivro = codigoBusca; // Guarda código

                    System.out.print("Digite a matricula do aluno: ");
                    emprestimos[i].matriculaAluno = leia.nextInt();

                    leia.nextLine(); // Limpa ENTER

                    System.out.print("Digite a data do emprestimo: ");
                    emprestimos[i].data = leia.nextLine();

                    livros[j].disponivel = false; // Livro fica emprestado

                    encontrado = true; // Livro encontrado

                    break; // Sai do FOR
                }
            }import java.util.Scanner;

public class MediaAlturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double altura;

        // Laço para ler 5 alturas
        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite a altura do aluno " + i + ": ");
            altura = sc.nextDouble();

            soma = soma + altura;
        }

        double media = soma / 5;

        System.out.println("Média das alturas = " + media);

        sc.close();
    }
}
Questão 2 — Sequência crescente
import java.util.Scanner;

public class SequenciaCrescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        // Sequência de 0 até o número digitado
        for (int i = 0; i <= numero; i++) {

            System.out.print(i + " ");
        }

        sc.close();
    }
}
Questão 3 — Contagem regressiva
import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        // Contagem regressiva
        for (int i = numero; i >= 0; i--) {

            System.out.print(i + " ");
        }

        sc.close();
    }
}
Questã

            // Caso o livro não esteja disponível
            if (encontrado == false) {

                System.out.println("Livro indisponivel ou nao encontrado.");
            }

            System.out.println();
        }

        // Lista de livros disponíveis
        System.out.println("===== LIVROS DISPONIVEIS =====");

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].disponivel == true) {

                System.out.println(livros[i].titulo);
            }
        }

        // Lista de livros emprestados
        System.out.println("\n===== LIVROS EMPRESTADOS =====");

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].disponivel == false) {

                System.out.println(livros[i].titulo);
            }
        }

        // Mostrar empréstimos
        System.out.println("\n===== RELATORIO DE EMPRESTIMOS =====");

        for (int i = 0; i < emprestimos.length; i++) {

            if (emprestimos[i] != null) {

                String tituloLivro = ""; // Guarda o título

                // Busca o título pelo código
                for (int j = 0; j < livros.length; j++) {

                    if (livros[j].codigo == emprestimos[i].codigoLivro) {

                        tituloLivro = livros[j].titulo;
                    }
                }

                System.out.println("Titulo: " + tituloLivro);

                System.out.println("Matricula: " + emprestimos[i].matriculaAluno);

                System.out.println("Data: " + emprestimos[i].data);

                System.out.println();
            }
        }

        leia.close(); // Fecha Scanner
    }
}
