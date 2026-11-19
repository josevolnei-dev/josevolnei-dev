public class Avaliacao {
    private int id;
    private Usuario usuario;
    private Estabelecimento estabelecimento;
    private int notaAcessibilidade; // De 1 a 5
    private String comentario;

    public Avaliacao(int id, Usuario usuario, Estabelecimento estabelecimento, int notaAcessibilidade, String comentario) {
        this.id = id;
        this.usuario = usuario;
        this.estabelecimento = estabelecimento;
        this.notaAcessibilidade = notaAcessibilidade;
        this.comentario = comentario;
    }

    public void exibirAvaliacao() {
        System.out.println("\n[Nova Avaliação Registrada]");
        System.out.println("Local: " + estabelecimento.getNome());
        System.out.println("Autor: " + usuario.getNome());
        System.out.println("Nota de Acessibilidade: " + notaAcessibilidade + "/5");
        System.out.println("Comentário: \"" + comentario + "\"");
    }
}