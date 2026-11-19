public class Livro {

    String titulo;
    String autor;
    int anoPublicacao;


    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Java para Iniciantes";
        livro.autor = "João Silva";
        livro.anoPublicacao = 2025;

        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de publicação: " + livro.anoPublicacao);
    }

}