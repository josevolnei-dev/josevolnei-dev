public class Estabelecimento {
    private int id;
    private String nome;
    private String categoria;
    private String endereco;
    private boolean possuiRampa;
    private boolean possuiBanheiroAdaptado;
    private boolean possuiElevador;

    public Estabelecimento(int id, String nome, String categoria, String endereco, boolean possuiRampa, boolean possuiBanheiroAdaptado, boolean possuiElevador) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.endereco = endereco;
        this.possuiRampa = possuiRampa;
        this.possuiBanheiroAdaptado = possuiBanheiroAdaptado;
        this.possuiElevador = possuiElevador;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Estabelecimento ---");
        System.out.println("Nome: " + nome + " | Categoria: " + categoria);
        System.out.println("Endereço: " + endereco);
        System.out.println("Acessibilidade:");
        System.out.println(" - Rampa de acesso: " + (possuiRampa ? "Sim" : "Não"));
        System.out.println(" - Banheiro adaptado: " + (possuiBanheiroAdaptado ? "Sim" : "Não"));
        System.out.println(" - Elevador: " + (possuiElevador ? "Sim" : "Não"));
    }

    public String getNome() {
        return nome;
    }
}