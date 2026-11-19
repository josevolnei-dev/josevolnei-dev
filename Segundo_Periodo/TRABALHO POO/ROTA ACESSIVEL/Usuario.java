public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String tipoUsuario;

    public Usuario(int id, String nome, String email, String tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }

    public void exibirInfo() {
        System.out.println("Usuário: " + nome + " (" + tipoUsuario + ")");
    }

    public String getNome() {
        return nome;
    }
}