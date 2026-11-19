public abstract class Assinatura {
    protected String nome;
    protected double valorMensal;

    public Assinatura(String nome, double valorMensal) {
        this.nome = nome;
        this.valorMensal = valorMensal;
    }

    public abstract double calcularValor();

    public void exibirDados() {
        System.out.println("Plano: " + nome);
        System.out.printf("Valor mensal: R$ %.2f%n", calcularValor());
    }
}