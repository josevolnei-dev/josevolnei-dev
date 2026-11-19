import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

private String nome;
private String endereco;

// Recursos de acessibilidade
private boolean rampa;
private boolean entradaSemDegraus;
private boolean banheiroAdaptado;
private boolean vagasReservadas;
private boolean pisoTatil;
private boolean sinalizacaoBraille;
private boolean atendimentoAcessivel;
private boolean espacoCadeiraRodas;

private List<Avaliacao> avaliacoes = new ArrayList<>();

public Estabelecimento(
        String nome,
        String endereco,
        boolean rampa,
        boolean entradaSemDegraus,
        boolean banheiroAdaptado,
        boolean vagasReservadas,
        boolean pisoTatil,
        boolean sinalizacaoBraille,
        boolean atendimentoAcessivel,
        boolean espacoCadeiraRodas) {

    this.nome = nome;
    this.endereco = endereco;
    this.rampa = rampa;
    this.entradaSemDegraus = entradaSemDegraus;
    this.banheiroAdaptado = banheiroAdaptado;
    this.vagasReservadas = vagasReservadas;
    this.pisoTatil = pisoTatil;
    this.sinalizacaoBraille = sinalizacaoBraille;
    this.atendimentoAcessivel = atendimentoAcessivel;
    this.espacoCadeiraRodas = espacoCadeiraRodas;
}

public String getNome() {
    return nome;
}

public void adicionarAvaliacao(Avaliacao avaliacao) {
    avaliacoes.add(avaliacao);
}

public void listarAvaliacoes() {

    if (avaliacoes.isEmpty()) {
        System.out.println("Nenhuma avaliação cadastrada.");
        return;
    }

    for (Avaliacao a : avaliacoes) {
        System.out.println("Usuário: " + a.getUsuario().getNome());
        System.out.println("Nota: " + a.getNota() + " estrelas");
        System.out.println("Comentário: " + a.getComentario());
        System.out.println("-------------------------");
    }
}

public void mostrarDados() {

    System.out.println("Nome: " + nome);
    System.out.println("Endereço: " + endereco);

    System.out.println("\n--- ACESSIBILIDADE ---");
    System.out.println("Rampa de acesso: " + (rampa ? "Sim" : "Não"));
    System.out.println("Entrada sem degraus: " + (entradaSemDegraus ? "Sim" : "Não"));
    System.out.println("Banheiro adaptado: " + (banheiroAdaptado ? "Sim" : "Não"));
    System.out.println("Vagas reservadas: " + (vagasReservadas ? "Sim" : "Não"));
    System.out.println("Piso tátil: " + (pisoTatil ? "Sim" : "Não"));
    System.out.println("Sinalização em Braille: " + (sinalizacaoBraille ? "Sim" : "Não"));
    System.out.println("Atendimento acessível: " + (atendimentoAcessivel ? "Sim" : "Não"));
    System.out.println("Espaço para cadeira de rodas: " + (espacoCadeiraRodas ? "Sim" : "Não"));
}

}


